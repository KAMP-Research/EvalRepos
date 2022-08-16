package edu.kit.ipd.sdq.kamp4aps.core;

import java.io.IOException;

import org.eclipse.core.resources.IContainer;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp.util.FileAndFolderManagement;
import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureVersion.ArchitectureVersionParams;
import edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.DeploymentContextRepository;
import quality.as_mm.KAMP4aPSModificationRepository;
import domain.as.Plant;
import quality.as_foaa.FieldOfActivityAnnotationRepository;
import edu.kit.ipd.sdq.kamp4hmi.model.HMIModificationmarks.HMIModificationMarksRepository;
import edu.kit.ipd.sdq.kamp4iec.core.AbstractKAMP4IECArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsRepository;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.Configuration;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.AbstractKAMP4IECModificationRepository;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModificationRepository;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Repository;

/**
 * 
 * This class provides the loading and saving of 
 * the aPS specific models.
 * 
 * @author Sandro Koch
 *
 */
public class APSArchitectureVersionPersistency extends AbstractArchitectureVersionPersistency<APSArchitectureVersion> {

	private ArchitectureVersionParams archParams = new ArchitectureVersionParams();
	public static final String FILEEXTENSION_REPOSITORY = "repository";
	public static final String FILEEXTENSION_SYSTEM = "system";
	public static final String FILEEXTENSION_FIELDOFACTIVITYANNOTATIONS = "fieldofactivityannotations";
	public static final String FILEEXTENSION_APS = "aps";
	public static final String FILEEXTENSION_MODIFICATIONMARKS = "modificationmarks";
	public static final String FILEEXTENSION_DEPLOYMENTCONTEXT = "deploymentcontext";
	public static final String FILEEXTENSION_HMI = "kamp4hmimodel";
	public static final String FILEEXTENSION_HMI_MODIFICATIONMARKS = "hmimodificationmarks";

	@Override
	public APSArchitectureVersion load(String folderpath, String filename, String versionname) {
		ResourceSet loadResourceSet = new ResourceSetImpl();
		String fieldOfActivityRepositoryFilePath = filename + "." + FILEEXTENSION_FIELDOFACTIVITYANNOTATIONS;
		String internalModFilePath = filename + "." + FILEEXTENSION_MODIFICATIONMARKS;
		String xppufilePath = filename + "." + FILEEXTENSION_APS;

		String internalIECFieldOfActivityFilePath = filename + "." + AbstractKAMP4IECArchitectureVersionPersistency.FILEEXTENSION_FIELDOFACTIVITYANNOTATIONS;
		String internalIecRepositoryFilePath = filename + "." + AbstractKAMP4IECArchitectureVersionPersistency.FILEEXTENSION_REPOSITORY;
		String internalConfigurationFilePath = filename + "." + AbstractKAMP4IECArchitectureVersionPersistency.FILEEXTENSION_CONFIGURATION;
		String internalIECModFilePath = filename + "." + AbstractKAMP4IECArchitectureVersionPersistency.FILEEXTENSION_MODIFICATIONMARK;
		
		String internalHMIPath = filename + "." + FILEEXTENSION_HMI;
		String internalHMIModificationsPath = filename + "." + FILEEXTENSION_HMI_MODIFICATIONMARKS;

		archParams.name = versionname;
		archParams.fieldOfActivityRepository = (FieldOfActivityAnnotationRepository) loadEmfModelFromResource(
				folderpath, fieldOfActivityRepositoryFilePath, loadResourceSet);
		archParams.modificationMarkRepository = (KAMP4aPSModificationRepository) loadEmfModelFromResource(
				folderpath, internalModFilePath, loadResourceSet);
		archParams.aPSPlant = (Plant) loadEmfModelFromResource(folderpath, xppufilePath, loadResourceSet);
		archParams.deploymentContextRepository = (DeploymentContextRepository) loadEmfModelFromResource(folderpath,
				internalModFilePath, loadResourceSet);

		archParams.iecFieldOfActivityRepository = (IECFieldOfActivityAnnotationsRepository)loadEmfModelFromResource(folderpath, internalIECFieldOfActivityFilePath, loadResourceSet);
		archParams.iecRepository = (Repository)loadEmfModelFromResource(folderpath, internalIecRepositoryFilePath, loadResourceSet);
		archParams.configuration = (Configuration)loadEmfModelFromResource(folderpath, internalConfigurationFilePath, loadResourceSet);
		archParams.iecModificationMarkRepository = (IECModificationRepository)loadEmfModelFromResource(folderpath, internalIECModFilePath, loadResourceSet);
		
		archParams.hmiRepository = (edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Repository)loadEmfModelFromResource(folderpath, internalHMIPath, loadResourceSet);
		archParams.hmiModificationMarksRepository = (HMIModificationMarksRepository)loadEmfModelFromResource(folderpath, internalHMIModificationsPath, loadResourceSet);

		return new APSArchitectureVersion(archParams);
	}

	@Override
	public APSArchitectureVersion load(IContainer folder, String versionname) {
		ResourceSet loadResourceSet = new ResourceSetImpl();
		IFile fieldOfActivityRepositoryFile = FileAndFolderManagement.retrieveFileWithExtension(folder,
				FILEEXTENSION_FIELDOFACTIVITYANNOTATIONS);
		IFile internalModFile = FileAndFolderManagement.retrieveFileWithExtension(folder,
				FILEEXTENSION_MODIFICATIONMARKS);
		IFile xppufile = FileAndFolderManagement.retrieveFileWithExtension(folder, FILEEXTENSION_APS);
		IFile deploymentContextFile = FileAndFolderManagement.retrieveFileWithExtension(folder,
				FILEEXTENSION_DEPLOYMENTCONTEXT);

		archParams.fieldOfActivityRepository = null;
		archParams.modificationMarkRepository = null;
		archParams.aPSPlant = null;
		archParams.deploymentContextRepository = null;

		archParams.name = versionname;
		if (fieldOfActivityRepositoryFile != null && fieldOfActivityRepositoryFile.exists())
			archParams.fieldOfActivityRepository = (FieldOfActivityAnnotationRepository) loadEmfModelFromResource(
					fieldOfActivityRepositoryFile.getFullPath().toString(), null, loadResourceSet);
		if (internalModFile != null && internalModFile.exists())
			archParams.modificationMarkRepository = (KAMP4aPSModificationRepository) loadEmfModelFromResource(
					internalModFile.getFullPath().toString(), null, loadResourceSet);
		if (xppufile != null && xppufile.exists())
			archParams.aPSPlant = (Plant) loadEmfModelFromResource(xppufile.getFullPath().toString(), null,
					loadResourceSet);
		if (deploymentContextFile != null && deploymentContextFile.exists())
			archParams.deploymentContextRepository = (DeploymentContextRepository) loadEmfModelFromResource(
					deploymentContextFile.getFullPath().toString(), null, loadResourceSet);		

		IFile internalIECFieldOfActivityFile = FileAndFolderManagement.retrieveFileWithExtension(folder, AbstractKAMP4IECArchitectureVersionPersistency.FILEEXTENSION_FIELDOFACTIVITYANNOTATIONS);
		IFile internalIECRepositoryFile = FileAndFolderManagement.retrieveFileWithExtension(folder, AbstractKAMP4IECArchitectureVersionPersistency.FILEEXTENSION_REPOSITORY);
		IFile internalConfigurationFile = FileAndFolderManagement.retrieveFileWithExtension(folder, AbstractKAMP4IECArchitectureVersionPersistency.FILEEXTENSION_CONFIGURATION);
		IFile internalIECModFile = FileAndFolderManagement.retrieveFileWithExtension(folder, AbstractKAMP4IECArchitectureVersionPersistency.FILEEXTENSION_MODIFICATIONMARK);
		IFile internalHMIFile = FileAndFolderManagement.retrieveFileWithExtension(folder, FILEEXTENSION_HMI);
		IFile internalHMIModificationsFile = FileAndFolderManagement.retrieveFileWithExtension(folder, FILEEXTENSION_HMI_MODIFICATIONMARKS);
		
		archParams.iecFieldOfActivityRepository = null;
		archParams.iecRepository = null;
		archParams.configuration = null;
		archParams.iecModificationMarkRepository = null;
		archParams.hmiRepository = null;
		archParams.hmiModificationMarksRepository = null;
		
		if (internalIECFieldOfActivityFile != null && internalIECFieldOfActivityFile.exists())
			archParams.iecFieldOfActivityRepository = (IECFieldOfActivityAnnotationsRepository) loadEmfModelFromResource(internalIECFieldOfActivityFile.getFullPath().toString(), null, loadResourceSet);
		if (internalIECRepositoryFile != null && internalIECRepositoryFile.exists())
			archParams.iecRepository = (Repository)loadEmfModelFromResource(internalIECRepositoryFile.getFullPath().toString(), null, loadResourceSet);
		if (internalConfigurationFile != null && internalConfigurationFile.exists())
			archParams.configuration = (Configuration)loadEmfModelFromResource(internalConfigurationFile.getFullPath().toString(), null, loadResourceSet);
		if (internalIECModFile != null && internalIECModFile.exists())
			archParams.iecModificationMarkRepository = (IECModificationRepository) loadEmfModelFromResource(internalIECModFile.getFullPath().toString(), null, loadResourceSet);

		if (internalHMIFile != null && internalHMIFile.exists())
			archParams.hmiRepository = (edu.kit.ipd.sdq.kamp4hmi.model.Kamp4hmiModel.Repository)loadEmfModelFromResource(internalHMIFile.getFullPath().toString(), null, loadResourceSet);
		if (internalHMIModificationsFile != null && internalHMIModificationsFile.exists())
			archParams.hmiModificationMarksRepository = (HMIModificationMarksRepository)loadEmfModelFromResource(internalHMIModificationsFile.getFullPath().toString(), null, loadResourceSet);

		return new APSArchitectureVersion(archParams);
	}

	@Override
	public void save(String targetDirectoryPath, String filename, APSArchitectureVersion version) {
		savePCMAndKAMP4APSModels(targetDirectoryPath, filename, version);
	}
	
	@Override
	public void saveModificationMarkFile(String targetDirectoryPath, String filename, APSArchitectureVersion version)
			throws IOException {
		ResourceSet resourceSet = new ResourceSetImpl();
		String internalModFilePath = filename + "." + FILEEXTENSION_MODIFICATIONMARK;	
		if (version.getModificationMarkRepository()!=null)
			saveEmfModelToResource(version.getModificationMarkRepository(), targetDirectoryPath, internalModFilePath, resourceSet);	
		String internalIECModFilePath = filename + "." + AbstractKAMP4IECArchitectureVersionPersistency.FILEEXTENSION_MODIFICATIONMARK;	
		if (version.getIECModificationMarkRepository()!=null)
			saveEmfModelToResource(version.getIECModificationMarkRepository(), targetDirectoryPath, internalIECModFilePath, resourceSet);	
		String internalHMIModFilePath = filename + "." + FILEEXTENSION_HMI_MODIFICATIONMARKS;	
		if (version.getHmiModificationRepository()!=null)
			saveEmfModelToResource(version.getHmiModificationRepository(), targetDirectoryPath, internalHMIModFilePath, resourceSet);		
		
	}

	public static void savePCMAndKAMP4APSModels(String targetDirectoryPath, String filename, APSArchitectureVersion version) {
		ResourceSet resourceSet = new ResourceSetImpl();
		String internalModFilePath = filename + "." + FILEEXTENSION_MODIFICATIONMARKS;
		String fieldOfActivityRepositoryFilePath = filename + "." + FILEEXTENSION_FIELDOFACTIVITYANNOTATIONS;
		String programsFilePath = filename + "." + FILEEXTENSION_DEPLOYMENTCONTEXT;
		String xppuFilePath = filename + "." + FILEEXTENSION_APS;
		String hmiRepositoryFilePath = filename + "."+ FILEEXTENSION_HMI;
		String hmiModificationMarksFilePath = filename + "."+ FILEEXTENSION_HMI_MODIFICATIONMARKS;

		if (version.getModificationMarkRepository() != null)
			saveEmfModelToResource(version.getModificationMarkRepository(), targetDirectoryPath, internalModFilePath,
					resourceSet);
		if (version.getFieldOfActivityRepository() != null)
			saveEmfModelToResource(version.getFieldOfActivityRepository(), targetDirectoryPath,
					fieldOfActivityRepositoryFilePath, resourceSet);
		if (version.getDeploymentContextRepository() != null)
			saveEmfModelToResource(version.getDeploymentContextRepository(), targetDirectoryPath, programsFilePath,
					resourceSet);
		if (version.getAPSPlant() != null)
			saveEmfModelToResource(version.getAPSPlant(), targetDirectoryPath, xppuFilePath,
					resourceSet);
		
		String repositoryfilePath = filename + "."+ AbstractKAMP4IECArchitectureVersionPersistency.FILEEXTENSION_REPOSITORY;
		String configurationFilePath = filename + "."+ AbstractKAMP4IECArchitectureVersionPersistency.FILEEXTENSION_CONFIGURATION;
		String internalIECModFilePath = filename + "." + AbstractKAMP4IECArchitectureVersionPersistency.FILEEXTENSION_MODIFICATIONMARK;
		String iecFieldOfActivityRepositoryFilePath = filename + "."+ AbstractKAMP4IECArchitectureVersionPersistency.FILEEXTENSION_FIELDOFACTIVITYANNOTATIONS;
		
		if (version.getIECRepository()!=null)
			saveEmfModelToResource(version.getIECRepository(), targetDirectoryPath, repositoryfilePath, resourceSet);		
		if (version.getConfiguration()!=null)
			saveEmfModelToResource(version.getConfiguration(), targetDirectoryPath, configurationFilePath, resourceSet);		
		if (version.getModificationMarkRepository()!=null)
			saveEmfModelToResource(version.getModificationMarkRepository(), targetDirectoryPath, internalIECModFilePath, resourceSet);		
		if (version.getFieldOfActivityRepository()!=null)
			saveEmfModelToResource(version.getFieldOfActivityRepository(), targetDirectoryPath, iecFieldOfActivityRepositoryFilePath, resourceSet);
		if (version.getHmiRepository()!=null)
			saveEmfModelToResource(version.getHmiRepository(), targetDirectoryPath, hmiRepositoryFilePath, resourceSet);
		if (version.getHmiModificationRepository()!=null)
			saveEmfModelToResource(version.getHmiModificationRepository(), targetDirectoryPath, hmiModificationMarksFilePath, resourceSet);
	}

}
