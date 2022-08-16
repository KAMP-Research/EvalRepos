package edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.editor;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.PlatformUI;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModificationRepository;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.editor.AbstractArchitectureBasedWorkplanDerivationAction;
import edu.kit.ipd.sdq.kamp.workplan.Activity;
import edu.kit.ipd.sdq.kamp.workplan.WorkplanDuplicateRemoval;
import edu.kit.ipd.sdq.kamp.workplan.WorkplanSorter;
import edu.kit.ipd.sdq.kamp4aps.core.APSActivityElementType;
import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp4aps.core.derivation.APSDifferenceCalculation;
import edu.kit.ipd.sdq.kamp4aps.core.derivation.APSEnrichedWorkplanDerivation;
import edu.kit.ipd.sdq.kamp4iec.core.IECActivityElementType;
import edu.kit.ipd.sdq.kamp4iec.core.IECArchitectureVersion;
import edu.kit.ipd.sdq.kamp4iec.core.IECArchitectureVersion.ArchitectureVersionParams;
import edu.kit.ipd.sdq.kamp4iec.core.derivation.IECEnrichedWorkplanDerivation;

public class ArchitectureBasedWorkplanDerivationAction extends AbstractArchitectureBasedWorkplanDerivationAction<APSArchitectureVersion> {
	
	public ArchitectureBasedWorkplanDerivationAction() {
		setWorkplanDerivation(new APSDifferenceCalculation());
		setEnrichedWorkplanDerivation(new APSEnrichedWorkplanDerivation());
		setArchitectureVersionPersistency(new APSArchitectureVersionPersistency());
	}
	
	@Override
	public void run(IAction action) {
		Object selectedElement = null;
		if (this.getSelection() instanceof IStructuredSelection) {
			if (((IStructuredSelection)this.getSelection()).size()==1) {
				selectedElement = ((IStructuredSelection)this.getSelection()).getFirstElement();
			}
		}
		
		if (selectedElement != null) {
			if (selectedElement instanceof AbstractModificationRepository) {
				URI resourceURI = ((AbstractModificationRepository<?,?>)selectedElement).eResource().getURI();
				String nameOfTargetVersionFolder = resourceURI.trimSegments(1).lastSegment();
				String targetFolderPathString = resourceURI.trimSegments(1).toPlatformString(false);
				IFile currentFile = ResourcesPlugin.getWorkspace().getRoot().getFile(
						new Path(resourceURI.toPlatformString(false)));
				IContainer targetFolder = currentFile.getParent();
				IContainer baseFolder = targetFolder.getParent();
				
				APSArchitectureVersion targetversion = loadVersion(targetFolder, "target");	
				APSArchitectureVersion baseversion = loadVersion(baseFolder, "base");
				
				if ((baseversion != null) && (targetversion != null)) {
					String username = System.getProperty("user.name");
					String usernameSuffix = (username != null) ? username : "";
					
					List<Activity> baseActivityList = this.getWorkplanDerivation().
							deriveWorkplan(baseversion, targetversion);
					baseActivityList = WorkplanDuplicateRemoval.removeModificationDuplicates(baseActivityList);

					List<Activity> apsActivities = new ArrayList<>();
					List<Activity> iecActivities = new ArrayList<>();
					
					for(Activity activity : baseActivityList) {
						if(activity.getElementType() instanceof APSActivityElementType) {
							apsActivities.add(activity);
						} else if (activity.getElementType() instanceof IECActivityElementType) {
							iecActivities.add(activity);
						}
					}
					
					IECEnrichedWorkplanDerivation iecDerivation = new IECEnrichedWorkplanDerivation();

					List<Activity> enrichedapsActivityList = this.getEnrichedWorkplanDerivation().deriveEnrichedWorkplan(baseversion, targetversion, apsActivities);
					WorkplanSorter.sortWorkplanActivities(apsActivities);
					List<Activity> enrichediecActivityList = iecDerivation.deriveEnrichedWorkplan(extractIECArchitecture(baseversion), extractIECArchitecture(targetversion), iecActivities);
					WorkplanSorter.sortWorkplanActivities(iecActivities);
					
					List<Activity> enrichedActivityList = new ArrayList<>();
					enrichedActivityList.addAll(enrichedapsActivityList);
					enrichedActivityList.addAll(enrichediecActivityList);					
					
					this.getArchitectureVersionPersistency().saveActivityListToExcelFile(
							targetFolderPathString, "activitylist-" + usernameSuffix + "-"
							+ nameOfTargetVersionFolder, enrichedActivityList);
					
					showMessage("Activity list has been calculated.");
					PlatformUI.getWorkbench().saveAllEditors(false);				
					refreshAllProjectsInWorkspace();
				} 
				if (baseversion == null) {
					showMessage("Activity list could not be calculated, as the base version was not found.");
				}
				if (targetversion == null) {
					showMessage("Activity list could not be calculated, as the target version was not found.");
				}
			}
		}
	}
	
	protected APSArchitectureVersion loadVersion(IContainer folder, String versionName) {
		APSArchitectureVersion result = null;
		if (folder != null) {
			result = ((APSArchitectureVersionPersistency)this.getArchitectureVersionPersistency()).load(folder, versionName);
		}
		return result;
	}

	private IECArchitectureVersion extractIECArchitecture(APSArchitectureVersion apsArchitectureVersion) {
		IECArchitectureVersion iecVersion = new IECArchitectureVersion(new ArchitectureVersionParams());
		iecVersion.setFieldOfActivityRepository(apsArchitectureVersion.getIECFieldOfActivityRepository());
		iecVersion.setIECRepository(apsArchitectureVersion.getIECRepository());
		iecVersion.setKonfiguration(apsArchitectureVersion.getConfiguration());
		iecVersion.setModificationMarkRepository(apsArchitectureVersion.getIECModificationMarkRepository());
		iecVersion.setName(apsArchitectureVersion.getName());
		return iecVersion;
	}
	
}