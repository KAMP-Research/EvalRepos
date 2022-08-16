package edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.editor;


import java.io.IOException;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.PlatformUI;

import edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModificationRepository;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.editor.AbstractChangePropagationAction;
import edu.kit.ipd.sdq.kamp.propagation.AbstractChangePropagationAnalysis;
import edu.kit.ipd.sdq.kamp.ui.AbstractDeriveWorkplanAction;
import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp4aps.core.APSChangePropagationAnalysis;

public class ChangePropagationAction extends AbstractChangePropagationAction<APSArchitectureVersion> {

	private ISelection selection;

	@Override
	protected AbstractChangePropagationAnalysis<APSArchitectureVersion> createChangePropagationAnalysis() {
		return new APSChangePropagationAnalysis();
	}

	@Override
	protected AbstractArchitectureVersionPersistency<APSArchitectureVersion> createArchitectureVersionPersistency() {
		return new APSArchitectureVersionPersistency();
	}
	
	@Override
	public void run(IAction action) {

		PlatformUI.getWorkbench().saveAllEditors(false);
		AbstractArchitectureVersionPersistency<APSArchitectureVersion> architectureVersionPersistency = this.createArchitectureVersionPersistency();
		
		Object selectedElement = null;
		if (selection instanceof IStructuredSelection) {
			if (((IStructuredSelection)selection).size()==1) {
				selectedElement = ((IStructuredSelection)selection).getFirstElement();
			}
		}
		
		if (selectedElement != null) {
			if (selectedElement instanceof AbstractModificationRepository) {
				URI resourceURI = ((AbstractModificationRepository<?,?>)selectedElement).eResource().getURI();
				String fileName = resourceURI.trimFileExtension().lastSegment();
				String folderPathString = resourceURI.trimSegments(1).toPlatformString(false);
				IFolder folder = ResourcesPlugin.getWorkspace().getRoot().getFolder(new Path(folderPathString));

				APSArchitectureVersion targetversion = null;
				if (folderPathString != null) {
					targetversion = ((APSArchitectureVersionPersistency) architectureVersionPersistency).load(folder, "target");
				}
				
				if (targetversion != null) {
					//Clear results of previous run and start new run
					targetversion.getModificationMarkRepository().getChangePropagationSteps().clear();
					this.createChangePropagationAnalysis().runChangePropagationAnalysis(targetversion);
					try {
						architectureVersionPersistency.saveModificationMarkFile(folderPathString, fileName, targetversion);
					} catch (IOException e) {
						throw new RuntimeException(e);
					}
				}
				
				if (!targetversion.getModificationMarkRepository().getChangePropagationSteps().isEmpty()) {
					AbstractDeriveWorkplanAction.showMessage("Propagation steps have been added to the tree.");
				} else {
					AbstractDeriveWorkplanAction.showMessage("No propagation steps could be found.");
				}
				
				PlatformUI.getWorkbench().saveAllEditors(false);
			}
		}	
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
	}

}