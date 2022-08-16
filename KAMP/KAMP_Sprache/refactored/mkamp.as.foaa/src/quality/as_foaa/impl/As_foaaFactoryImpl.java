/**
 */
package quality.as_foaa.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import quality.as_foaa.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class As_foaaFactoryImpl extends EFactoryImpl implements As_foaaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static As_foaaFactory init() {
		try {
			As_foaaFactory theAs_foaaFactory = (As_foaaFactory)EPackage.Registry.INSTANCE.getEFactory(As_foaaPackage.eNS_URI);
			if (theAs_foaaFactory != null) {
				return theAs_foaaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new As_foaaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As_foaaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY: return createFieldOfActivityAnnotationRepository();
			case As_foaaPackage.TEST_SPECIFICATION: return createTestSpecification();
			case As_foaaPackage.STOCK_SPECIFICATION: return createStockSpecification();
			case As_foaaPackage.HMI_SPECIFICATION: return createHMISpecification();
			case As_foaaPackage.ECAD_SPECIFICATION: return createECADSpecification();
			case As_foaaPackage.DOCUMENTATION_SPECIFICATION: return createDocumentationSpecification();
			case As_foaaPackage.STAFF_SPECIFICATION: return createStaffSpecification();
			case As_foaaPackage.CALIBRATION_SPECIFICATION: return createCalibrationSpecification();
			case As_foaaPackage.CALIBRATION_CONFIGURATION: return createCalibrationConfiguration();
			case As_foaaPackage.HMI_CONFIGURATION: return createHMIConfiguration();
			case As_foaaPackage.PERSON_LIST: return createPersonList();
			case As_foaaPackage.PERSON: return createPerson();
			case As_foaaPackage.ROLE_LIST: return createRoleList();
			case As_foaaPackage.SYSTEM_TEST: return createSystemTest();
			case As_foaaPackage.ENGINEER: return createEngineer();
			case As_foaaPackage.PURCHASER: return createPurchaser();
			case As_foaaPackage.MECHANIC: return createMechanic();
			case As_foaaPackage.DOCUMENTATION: return createDocumentation();
			case As_foaaPackage.DRAWING: return createDrawing();
			case As_foaaPackage.COMPONENT_DRAWING: return createComponentDrawing();
			case As_foaaPackage.MODULE_DRAWING: return createModuleDrawing();
			case As_foaaPackage.INTERFACE_DRAWING: return createInterfaceDrawing();
			case As_foaaPackage.STRUCTURE_DRAWING: return createStructureDrawing();
			case As_foaaPackage.MAINTENEANCE_DOCUMENTATION: return createMainteneanceDocumentation();
			case As_foaaPackage.OPERATOR_INSTRUCTIONS: return createOperatorInstructions();
			case As_foaaPackage.TRAINING_DOC_INTERN: return createTrainingDocIntern();
			case As_foaaPackage.TRAINING_DOC_EXTERNAL: return createTrainingDocExternal();
			case As_foaaPackage.COMPONENT_DOCUMENTATION_FILES: return createComponentDocumentationFiles();
			case As_foaaPackage.MODULE_DOCUMENTATION_FILES: return createModuleDocumentationFiles();
			case As_foaaPackage.INTERFACE_DOCUMENTATION_FILES: return createInterfaceDocumentationFiles();
			case As_foaaPackage.STRUCTURE_DOCUMENTATION_FILES: return createStructureDocumentationFiles();
			case As_foaaPackage.STOCK_LIST: return createStockList();
			case As_foaaPackage.COMPONENT_STOCK_LIST: return createComponentStockList();
			case As_foaaPackage.INTERFACE_STOCK_LIST: return createInterfaceStockList();
			case As_foaaPackage.MODULE_STOCK_LIST: return createModuleStockList();
			case As_foaaPackage.STRUCTURE_STOCK_LIST: return createStructureStockList();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldOfActivityAnnotationRepository createFieldOfActivityAnnotationRepository() {
		FieldOfActivityAnnotationRepositoryImpl fieldOfActivityAnnotationRepository = new FieldOfActivityAnnotationRepositoryImpl();
		return fieldOfActivityAnnotationRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestSpecification createTestSpecification() {
		TestSpecificationImpl testSpecification = new TestSpecificationImpl();
		return testSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StockSpecification createStockSpecification() {
		StockSpecificationImpl stockSpecification = new StockSpecificationImpl();
		return stockSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMISpecification createHMISpecification() {
		HMISpecificationImpl hmiSpecification = new HMISpecificationImpl();
		return hmiSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECADSpecification createECADSpecification() {
		ECADSpecificationImpl ecadSpecification = new ECADSpecificationImpl();
		return ecadSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentationSpecification createDocumentationSpecification() {
		DocumentationSpecificationImpl documentationSpecification = new DocumentationSpecificationImpl();
		return documentationSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffSpecification createStaffSpecification() {
		StaffSpecificationImpl staffSpecification = new StaffSpecificationImpl();
		return staffSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalibrationSpecification createCalibrationSpecification() {
		CalibrationSpecificationImpl calibrationSpecification = new CalibrationSpecificationImpl();
		return calibrationSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalibrationConfiguration createCalibrationConfiguration() {
		CalibrationConfigurationImpl calibrationConfiguration = new CalibrationConfigurationImpl();
		return calibrationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMIConfiguration createHMIConfiguration() {
		HMIConfigurationImpl hmiConfiguration = new HMIConfigurationImpl();
		return hmiConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonList createPersonList() {
		PersonListImpl personList = new PersonListImpl();
		return personList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleList createRoleList() {
		RoleListImpl roleList = new RoleListImpl();
		return roleList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemTest createSystemTest() {
		SystemTestImpl systemTest = new SystemTestImpl();
		return systemTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Engineer createEngineer() {
		EngineerImpl engineer = new EngineerImpl();
		return engineer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Purchaser createPurchaser() {
		PurchaserImpl purchaser = new PurchaserImpl();
		return purchaser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mechanic createMechanic() {
		MechanicImpl mechanic = new MechanicImpl();
		return mechanic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Documentation createDocumentation() {
		DocumentationImpl documentation = new DocumentationImpl();
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Drawing createDrawing() {
		DrawingImpl drawing = new DrawingImpl();
		return drawing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentDrawing createComponentDrawing() {
		ComponentDrawingImpl componentDrawing = new ComponentDrawingImpl();
		return componentDrawing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleDrawing createModuleDrawing() {
		ModuleDrawingImpl moduleDrawing = new ModuleDrawingImpl();
		return moduleDrawing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceDrawing createInterfaceDrawing() {
		InterfaceDrawingImpl interfaceDrawing = new InterfaceDrawingImpl();
		return interfaceDrawing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDrawing createStructureDrawing() {
		StructureDrawingImpl structureDrawing = new StructureDrawingImpl();
		return structureDrawing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainteneanceDocumentation createMainteneanceDocumentation() {
		MainteneanceDocumentationImpl mainteneanceDocumentation = new MainteneanceDocumentationImpl();
		return mainteneanceDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorInstructions createOperatorInstructions() {
		OperatorInstructionsImpl operatorInstructions = new OperatorInstructionsImpl();
		return operatorInstructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainingDocIntern createTrainingDocIntern() {
		TrainingDocInternImpl trainingDocIntern = new TrainingDocInternImpl();
		return trainingDocIntern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainingDocExternal createTrainingDocExternal() {
		TrainingDocExternalImpl trainingDocExternal = new TrainingDocExternalImpl();
		return trainingDocExternal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentDocumentationFiles createComponentDocumentationFiles() {
		ComponentDocumentationFilesImpl componentDocumentationFiles = new ComponentDocumentationFilesImpl();
		return componentDocumentationFiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleDocumentationFiles createModuleDocumentationFiles() {
		ModuleDocumentationFilesImpl moduleDocumentationFiles = new ModuleDocumentationFilesImpl();
		return moduleDocumentationFiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceDocumentationFiles createInterfaceDocumentationFiles() {
		InterfaceDocumentationFilesImpl interfaceDocumentationFiles = new InterfaceDocumentationFilesImpl();
		return interfaceDocumentationFiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDocumentationFiles createStructureDocumentationFiles() {
		StructureDocumentationFilesImpl structureDocumentationFiles = new StructureDocumentationFilesImpl();
		return structureDocumentationFiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StockList createStockList() {
		StockListImpl stockList = new StockListImpl();
		return stockList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentStockList createComponentStockList() {
		ComponentStockListImpl componentStockList = new ComponentStockListImpl();
		return componentStockList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceStockList createInterfaceStockList() {
		InterfaceStockListImpl interfaceStockList = new InterfaceStockListImpl();
		return interfaceStockList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleStockList createModuleStockList() {
		ModuleStockListImpl moduleStockList = new ModuleStockListImpl();
		return moduleStockList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureStockList createStructureStockList() {
		StructureStockListImpl structureStockList = new StructureStockListImpl();
		return structureStockList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As_foaaPackage getAs_foaaPackage() {
		return (As_foaaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static As_foaaPackage getPackage() {
		return As_foaaPackage.eINSTANCE;
	}

} //As_foaaFactoryImpl
