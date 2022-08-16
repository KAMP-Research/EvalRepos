/**
 */
package domain.aps.structures.impl;

import domain.aps.buscomponents.BuscomponentsPackage;

import domain.aps.buscomponents.impl.BuscomponentsPackageImpl;

import domain.aps.components.ComponentsPackage;

import domain.aps.components.impl.ComponentsPackageImpl;

import domain.aps.electroniccomponents.ElectroniccomponentsPackage;

import domain.aps.electroniccomponents.impl.ElectroniccomponentsPackageImpl;

import domain.aps.interfaces.InterfacesPackage;

import domain.aps.interfaces.impl.InterfacesPackageImpl;

import domain.aps.mechanicalcomponents.MechanicalcomponentsPackage;

import domain.aps.mechanicalcomponents.impl.MechanicalcomponentsPackageImpl;

import domain.aps.structures.ControlCabinet;
import domain.aps.structures.StructuresFactory;
import domain.aps.structures.StructuresPackage;

import domain.as.AsPackage;

import domain.as.StructureRepository.StructureRepositoryPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import paradigm.basic.BasicPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StructuresPackageImpl extends EPackageImpl implements StructuresPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlCabinetEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see domain.aps.structures.StructuresPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StructuresPackageImpl() {
		super(eNS_URI, StructuresFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link StructuresPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StructuresPackage init() {
		if (isInited) return (StructuresPackage)EPackage.Registry.INSTANCE.getEPackage(StructuresPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredStructuresPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		StructuresPackageImpl theStructuresPackage = registeredStructuresPackage instanceof StructuresPackageImpl ? (StructuresPackageImpl)registeredStructuresPackage : new StructuresPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		AsPackage.eINSTANCE.eClass();
		BasicPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ComponentsPackage.eNS_URI);
		ComponentsPackageImpl theComponentsPackage = (ComponentsPackageImpl)(registeredPackage instanceof ComponentsPackageImpl ? registeredPackage : ComponentsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BuscomponentsPackage.eNS_URI);
		BuscomponentsPackageImpl theBuscomponentsPackage = (BuscomponentsPackageImpl)(registeredPackage instanceof BuscomponentsPackageImpl ? registeredPackage : BuscomponentsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ElectroniccomponentsPackage.eNS_URI);
		ElectroniccomponentsPackageImpl theElectroniccomponentsPackage = (ElectroniccomponentsPackageImpl)(registeredPackage instanceof ElectroniccomponentsPackageImpl ? registeredPackage : ElectroniccomponentsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MechanicalcomponentsPackage.eNS_URI);
		MechanicalcomponentsPackageImpl theMechanicalcomponentsPackage = (MechanicalcomponentsPackageImpl)(registeredPackage instanceof MechanicalcomponentsPackageImpl ? registeredPackage : MechanicalcomponentsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(InterfacesPackage.eNS_URI);
		InterfacesPackageImpl theInterfacesPackage = (InterfacesPackageImpl)(registeredPackage instanceof InterfacesPackageImpl ? registeredPackage : InterfacesPackage.eINSTANCE);

		// Create package meta-data objects
		theStructuresPackage.createPackageContents();
		theComponentsPackage.createPackageContents();
		theBuscomponentsPackage.createPackageContents();
		theElectroniccomponentsPackage.createPackageContents();
		theMechanicalcomponentsPackage.createPackageContents();
		theInterfacesPackage.createPackageContents();

		// Initialize created meta-data
		theStructuresPackage.initializePackageContents();
		theComponentsPackage.initializePackageContents();
		theBuscomponentsPackage.initializePackageContents();
		theElectroniccomponentsPackage.initializePackageContents();
		theMechanicalcomponentsPackage.initializePackageContents();
		theInterfacesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStructuresPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StructuresPackage.eNS_URI, theStructuresPackage);
		return theStructuresPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlCabinet() {
		return controlCabinetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuresFactory getStructuresFactory() {
		return (StructuresFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		controlCabinetEClass = createEClass(CONTROL_CABINET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		StructureRepositoryPackage theStructureRepositoryPackage = (StructureRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(StructureRepositoryPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		controlCabinetEClass.getESuperTypes().add(theStructureRepositoryPackage.getStructure());

		// Initialize classes, features, and operations; add parameters
		initEClass(controlCabinetEClass, ControlCabinet.class, "ControlCabinet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //StructuresPackageImpl
