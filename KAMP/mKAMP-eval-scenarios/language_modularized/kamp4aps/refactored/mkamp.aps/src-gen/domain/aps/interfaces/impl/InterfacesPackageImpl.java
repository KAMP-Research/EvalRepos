/**
 */
package domain.aps.interfaces.impl;

import domain.aps.buscomponents.BuscomponentsPackage;

import domain.aps.buscomponents.impl.BuscomponentsPackageImpl;

import domain.aps.components.ComponentsPackage;

import domain.aps.components.impl.ComponentsPackageImpl;

import domain.aps.electroniccomponents.ElectroniccomponentsPackage;

import domain.aps.electroniccomponents.impl.ElectroniccomponentsPackageImpl;

import domain.aps.interfaces.Clamping;
import domain.aps.interfaces.Fixture;
import domain.aps.interfaces.Gearing;
import domain.aps.interfaces.InterfacesFactory;
import domain.aps.interfaces.InterfacesPackage;
import domain.aps.interfaces.PhysicalConnection;
import domain.aps.interfaces.PneumaticSupply;
import domain.aps.interfaces.Screwing;
import domain.aps.interfaces.SignalInterface;
import domain.aps.interfaces.Suspension;
import domain.aps.interfaces.TransportConnection;
import domain.aps.interfaces.WaterSupply;

import domain.aps.mechanicalcomponents.MechanicalcomponentsPackage;

import domain.aps.mechanicalcomponents.impl.MechanicalcomponentsPackageImpl;

import domain.aps.structures.StructuresPackage;

import domain.aps.structures.impl.StructuresPackageImpl;

import domain.as.AsPackage;

import domain.as.InterfaceRepository.InterfaceRepositoryPackage;

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
public class InterfacesPackageImpl extends EPackageImpl implements InterfacesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixtureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass waterSupplyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass suspensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transportConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clampingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gearingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass screwingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pneumaticSupplyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalInterfaceEClass = null;

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
	 * @see domain.aps.interfaces.InterfacesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InterfacesPackageImpl() {
		super(eNS_URI, InterfacesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link InterfacesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InterfacesPackage init() {
		if (isInited) return (InterfacesPackage)EPackage.Registry.INSTANCE.getEPackage(InterfacesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredInterfacesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		InterfacesPackageImpl theInterfacesPackage = registeredInterfacesPackage instanceof InterfacesPackageImpl ? (InterfacesPackageImpl)registeredInterfacesPackage : new InterfacesPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StructuresPackage.eNS_URI);
		StructuresPackageImpl theStructuresPackage = (StructuresPackageImpl)(registeredPackage instanceof StructuresPackageImpl ? registeredPackage : StructuresPackage.eINSTANCE);

		// Create package meta-data objects
		theInterfacesPackage.createPackageContents();
		theComponentsPackage.createPackageContents();
		theBuscomponentsPackage.createPackageContents();
		theElectroniccomponentsPackage.createPackageContents();
		theMechanicalcomponentsPackage.createPackageContents();
		theStructuresPackage.createPackageContents();

		// Initialize created meta-data
		theInterfacesPackage.initializePackageContents();
		theComponentsPackage.initializePackageContents();
		theBuscomponentsPackage.initializePackageContents();
		theElectroniccomponentsPackage.initializePackageContents();
		theMechanicalcomponentsPackage.initializePackageContents();
		theStructuresPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theInterfacesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InterfacesPackage.eNS_URI, theInterfacesPackage);
		return theInterfacesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFixture() {
		return fixtureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWaterSupply() {
		return waterSupplyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalConnection() {
		return physicalConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuspension() {
		return suspensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransportConnection() {
		return transportConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClamping() {
		return clampingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGearing() {
		return gearingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScrewing() {
		return screwingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPneumaticSupply() {
		return pneumaticSupplyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignalInterface() {
		return signalInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfacesFactory getInterfacesFactory() {
		return (InterfacesFactory)getEFactoryInstance();
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
		fixtureEClass = createEClass(FIXTURE);

		waterSupplyEClass = createEClass(WATER_SUPPLY);

		physicalConnectionEClass = createEClass(PHYSICAL_CONNECTION);

		suspensionEClass = createEClass(SUSPENSION);

		transportConnectionEClass = createEClass(TRANSPORT_CONNECTION);

		clampingEClass = createEClass(CLAMPING);

		gearingEClass = createEClass(GEARING);

		screwingEClass = createEClass(SCREWING);

		pneumaticSupplyEClass = createEClass(PNEUMATIC_SUPPLY);

		signalInterfaceEClass = createEClass(SIGNAL_INTERFACE);
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
		InterfaceRepositoryPackage theInterfaceRepositoryPackage = (InterfaceRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(InterfaceRepositoryPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		fixtureEClass.getESuperTypes().add(theInterfaceRepositoryPackage.getInterface());
		waterSupplyEClass.getESuperTypes().add(theInterfaceRepositoryPackage.getInterface());
		physicalConnectionEClass.getESuperTypes().add(theInterfaceRepositoryPackage.getInterface());
		suspensionEClass.getESuperTypes().add(theInterfaceRepositoryPackage.getInterface());
		transportConnectionEClass.getESuperTypes().add(theInterfaceRepositoryPackage.getInterface());
		clampingEClass.getESuperTypes().add(theInterfaceRepositoryPackage.getInterface());
		gearingEClass.getESuperTypes().add(theInterfaceRepositoryPackage.getInterface());
		screwingEClass.getESuperTypes().add(theInterfaceRepositoryPackage.getInterface());
		pneumaticSupplyEClass.getESuperTypes().add(theInterfaceRepositoryPackage.getInterface());
		signalInterfaceEClass.getESuperTypes().add(theInterfaceRepositoryPackage.getInterface());

		// Initialize classes, features, and operations; add parameters
		initEClass(fixtureEClass, Fixture.class, "Fixture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(waterSupplyEClass, WaterSupply.class, "WaterSupply", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(physicalConnectionEClass, PhysicalConnection.class, "PhysicalConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(suspensionEClass, Suspension.class, "Suspension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transportConnectionEClass, TransportConnection.class, "TransportConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(clampingEClass, Clamping.class, "Clamping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gearingEClass, Gearing.class, "Gearing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(screwingEClass, Screwing.class, "Screwing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pneumaticSupplyEClass, PneumaticSupply.class, "PneumaticSupply", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(signalInterfaceEClass, SignalInterface.class, "SignalInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //InterfacesPackageImpl
