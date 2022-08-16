package edu.kit.ipd.sdq.kamp4aps.core;

import edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.DeploymentContextFactory;
import edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.DeploymentContextRepository;

import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureVersion.ArchitectureVersionParams;
import quality.as_foaa.CalibrationSpecification;
import quality.as_foaa.DocumentationSpecification;
import quality.as_foaa.ECADSpecification;
import quality.as_foaa.FieldOfActivityAnnotationRepository;
import quality.as_foaa.AS_foaaFactory;
import quality.as_foaa.HMISpecification;
import quality.as_foaa.StaffSpecification;
import quality.as_foaa.StockSpecification;
import quality.as_foaa.TestSpecification;
import edu.kit.ipd.sdq.kamp4iec.core.IECArchitectureModelFactoryFacade;
import quality.as_mm.KAMP4aPSModificationRepository;
import paradigm.modificationmarks.SeedModifications;
import paradigm.modificationmarks.ModificationmarksFactory;

/**
 * This class loads the structural and non-structural models
 * as well as the aPS specific correspondence model.
 * More information to the correspondence model can be found
 * in the link below.
 * 
 * @author Sandro Koch
 * @see <a href="https://sdqweb.ipd.kit.edu/publications/pdfs/koch2017a.pdf">koch2017a<\a>
 * 
 */

public class APSArchitectureModelFactoryFacade {
	
	private static ArchitectureVersionParams archParams = new ArchitectureVersionParams();
	
	public static APSArchitectureVersion createEmptyModel(String name) {
		archParams.name = name;
		archParams.fieldOfActivityRepository = APSArchitectureModelFactoryFacade.createFieldOfActivityAnnotationsRepository();
		archParams.modificationMarkRepository = APSArchitectureModelFactoryFacade.createKAMP4aPSModificationMarkRepository();
		archParams.deploymentContextRepository = APSArchitectureModelFactoryFacade.createDeploymentContextRepository();
		return new APSArchitectureVersion(archParams);
	}
	
	public static KAMP4aPSModificationRepository createKAMP4aPSModificationMarkRepository() {
		KAMP4aPSModificationRepository repository = KAMP4aPSModificationmarksFactory.eINSTANCE.createKAMP4aPSModificationRepository();

		KAMP4aPSSeedModifications seedModifications = KAMP4aPSModificationmarksFactory.eINSTANCE.createKAMP4aPSSeedModifications();
		repository.setSeedModifications(seedModifications);
		
		return repository;
	}
	
	public static DeploymentContextRepository createDeploymentContextRepository() {
		DeploymentContextRepository repository = DeploymentContextFactory.eINSTANCE.createDeploymentContextRepository();
		return repository;
	}

	public static FieldOfActivityAnnotationRepository createFieldOfActivityAnnotationsRepository() {
		FieldOfActivityAnnotationRepository repository =  KAMP4aPSFieldofactivityannotationsFactory.eINSTANCE.createFieldOfActivityAnnotationRepository();
		
		TestSpecification testSpec = KAMP4aPSFieldofactivityannotationsFactory.eINSTANCE.createTestSpecification();
		repository.setTestSpecification(testSpec);
		
		StockSpecification stockSpec = KAMP4aPSFieldofactivityannotationsFactory.eINSTANCE.createStockSpecification();
		repository.setStockSpecification(stockSpec);
		
		HMISpecification hmiSpec = KAMP4aPSFieldofactivityannotationsFactory.eINSTANCE.createHMISpecification();
		repository.setHmiSpecification(hmiSpec);
		
		ECADSpecification ecadSpec = KAMP4aPSFieldofactivityannotationsFactory.eINSTANCE.createECADSpecification();
		repository.setEcadSpecification(ecadSpec);
		
		DocumentationSpecification docSpec = KAMP4aPSFieldofactivityannotationsFactory.eINSTANCE.createDocumentationSpecification();
		repository.setDocumentationSpecification(docSpec);

		StaffSpecification staffSpec = KAMP4aPSFieldofactivityannotationsFactory.eINSTANCE.createStaffSpecification();
		repository.setStaffSpecification(staffSpec);
		staffSpec.setPersonList(KAMP4aPSFieldofactivityannotationsFactory.eINSTANCE.createPersonList());
		staffSpec.setRoleList(KAMP4aPSFieldofactivityannotationsFactory.eINSTANCE.createRoleList());
		
		CalibrationSpecification calSpec = KAMP4aPSFieldofactivityannotationsFactory.eINSTANCE.createCalibrationSpecification();
		repository.setCalibrationSpecification(calSpec);
		
		return repository;
	}

}
