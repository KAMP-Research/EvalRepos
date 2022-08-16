/**
 */
package domain.aps.buscomponents.impl;

import domain.aps.buscomponents.BusBox;
import domain.aps.buscomponents.BusCable;
import domain.aps.buscomponents.BusMaster;
import domain.aps.buscomponents.BusSlave;
import domain.aps.buscomponents.BuscomponentsFactory;
import domain.aps.buscomponents.BuscomponentsPackage;

import domain.aps.components.ComponentsPackage;

import domain.aps.components.impl.ComponentsPackageImpl;

import domain.aps.electroniccomponents.ElectroniccomponentsPackage;

import domain.aps.electroniccomponents.impl.ElectroniccomponentsPackageImpl;

import domain.aps.interfaces.InterfacesPackage;

import domain.aps.interfaces.impl.InterfacesPackageImpl;

import domain.aps.mechanicalcomponents.MechanicalcomponentsPackage;

import domain.aps.mechanicalcomponents.impl.MechanicalcomponentsPackageImpl;

import domain.aps.structures.StructuresPackage;

import domain.aps.structures.impl.StructuresPackageImpl;

import domain.as.AsPackage;

import domain.as.ComponentRepository.ComponentRepositoryPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import paradigm.basic.BasicPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BuscomponentsPackageImpl extends EPackageImpl implements BuscomponentsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass busMasterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass busBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass busSlaveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass busCableEClass = null;

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
	 * @see domain.aps.buscomponents.BuscomponentsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BuscomponentsPackageImpl() {
		super(eNS_URI, BuscomponentsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BuscomponentsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BuscomponentsPackage init() {
		if (isInited) return (BuscomponentsPackage)EPackage.Registry.INSTANCE.getEPackage(BuscomponentsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBuscomponentsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BuscomponentsPackageImpl theBuscomponentsPackage = registeredBuscomponentsPackage instanceof BuscomponentsPackageImpl ? (BuscomponentsPackageImpl)registeredBuscomponentsPackage : new BuscomponentsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		AsPackage.eINSTANCE.eClass();
		BasicPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ComponentsPackage.eNS_URI);
		ComponentsPackageImpl theComponentsPackage = (ComponentsPackageImpl)(registeredPackage instanceof ComponentsPackageImpl ? registeredPackage : ComponentsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ElectroniccomponentsPackage.eNS_URI);
		ElectroniccomponentsPackageImpl theElectroniccomponentsPackage = (ElectroniccomponentsPackageImpl)(registeredPackage instanceof ElectroniccomponentsPackageImpl ? registeredPackage : ElectroniccomponentsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MechanicalcomponentsPackage.eNS_URI);
		MechanicalcomponentsPackageImpl theMechanicalcomponentsPackage = (MechanicalcomponentsPackageImpl)(registeredPackage instanceof MechanicalcomponentsPackageImpl ? registeredPackage : MechanicalcomponentsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StructuresPackage.eNS_URI);
		StructuresPackageImpl theStructuresPackage = (StructuresPackageImpl)(registeredPackage instanceof StructuresPackageImpl ? registeredPackage : StructuresPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(InterfacesPackage.eNS_URI);
		InterfacesPackageImpl theInterfacesPackage = (InterfacesPackageImpl)(registeredPackage instanceof InterfacesPackageImpl ? registeredPackage : InterfacesPackage.eINSTANCE);

		// Create package meta-data objects
		theBuscomponentsPackage.createPackageContents();
		theComponentsPackage.createPackageContents();
		theElectroniccomponentsPackage.createPackageContents();
		theMechanicalcomponentsPackage.createPackageContents();
		theStructuresPackage.createPackageContents();
		theInterfacesPackage.createPackageContents();

		// Initialize created meta-data
		theBuscomponentsPackage.initializePackageContents();
		theComponentsPackage.initializePackageContents();
		theElectroniccomponentsPackage.initializePackageContents();
		theMechanicalcomponentsPackage.initializePackageContents();
		theStructuresPackage.initializePackageContents();
		theInterfacesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBuscomponentsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BuscomponentsPackage.eNS_URI, theBuscomponentsPackage);
		return theBuscomponentsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusMaster() {
		return busMasterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusMaster_Signalinterfaces() {
		return (EReference)busMasterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusMaster_Signalinterface_controller() {
		return (EReference)busMasterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusBox() {
		return busBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusBox_Signalinterfaces() {
		return (EReference)busBoxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusBox_Signalinterface_master() {
		return (EReference)busBoxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusBox_Signalinterface_box() {
		return (EReference)busBoxEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusBox_Powersupply() {
		return (EReference)busBoxEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusSlave() {
		return busSlaveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusSlave_Signalinterface_master() {
		return (EReference)busSlaveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusSlave_Signalinterface_slave() {
		return (EReference)busSlaveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusCable() {
		return busCableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusCable_SignalPlug1() {
		return (EReference)busCableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusCable_SignalPlug2() {
		return (EReference)busCableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuscomponentsFactory getBuscomponentsFactory() {
		return (BuscomponentsFactory)getEFactoryInstance();
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
		busMasterEClass = createEClass(BUS_MASTER);
		createEReference(busMasterEClass, BUS_MASTER__SIGNALINTERFACES);
		createEReference(busMasterEClass, BUS_MASTER__SIGNALINTERFACE_CONTROLLER);

		busBoxEClass = createEClass(BUS_BOX);
		createEReference(busBoxEClass, BUS_BOX__SIGNALINTERFACES);
		createEReference(busBoxEClass, BUS_BOX__SIGNALINTERFACE_MASTER);
		createEReference(busBoxEClass, BUS_BOX__SIGNALINTERFACE_BOX);
		createEReference(busBoxEClass, BUS_BOX__POWERSUPPLY);

		busSlaveEClass = createEClass(BUS_SLAVE);
		createEReference(busSlaveEClass, BUS_SLAVE__SIGNALINTERFACE_MASTER);
		createEReference(busSlaveEClass, BUS_SLAVE__SIGNALINTERFACE_SLAVE);

		busCableEClass = createEClass(BUS_CABLE);
		createEReference(busCableEClass, BUS_CABLE__SIGNAL_PLUG1);
		createEReference(busCableEClass, BUS_CABLE__SIGNAL_PLUG2);
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
		ComponentRepositoryPackage theComponentRepositoryPackage = (ComponentRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentRepositoryPackage.eNS_URI);
		InterfacesPackage theInterfacesPackage = (InterfacesPackage)EPackage.Registry.INSTANCE.getEPackage(InterfacesPackage.eNS_URI);
		ComponentsPackage theComponentsPackage = (ComponentsPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		busMasterEClass.getESuperTypes().add(theComponentRepositoryPackage.getComponent());
		busBoxEClass.getESuperTypes().add(theComponentRepositoryPackage.getComponent());
		busSlaveEClass.getESuperTypes().add(theComponentRepositoryPackage.getComponent());
		busCableEClass.getESuperTypes().add(theComponentsPackage.getCable());

		// Initialize classes, features, and operations; add parameters
		initEClass(busMasterEClass, BusMaster.class, "BusMaster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusMaster_Signalinterfaces(), theInterfacesPackage.getSignalInterface(), null, "signalinterfaces", null, 0, -1, BusMaster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusMaster_Signalinterface_controller(), theInterfacesPackage.getSignalInterface(), null, "signalinterface_controller", null, 1, 1, BusMaster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(busBoxEClass, BusBox.class, "BusBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusBox_Signalinterfaces(), theInterfacesPackage.getSignalInterface(), null, "signalinterfaces", null, 0, -1, BusBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusBox_Signalinterface_master(), theInterfacesPackage.getSignalInterface(), null, "signalinterface_master", null, 1, 1, BusBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusBox_Signalinterface_box(), theInterfacesPackage.getSignalInterface(), null, "signalinterface_box", null, 1, 1, BusBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusBox_Powersupply(), theComponentsPackage.getPowerSupply(), null, "powersupply", null, 1, 1, BusBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(busSlaveEClass, BusSlave.class, "BusSlave", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusSlave_Signalinterface_master(), theInterfacesPackage.getSignalInterface(), null, "signalinterface_master", null, 1, 1, BusSlave.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusSlave_Signalinterface_slave(), theInterfacesPackage.getSignalInterface(), null, "signalinterface_slave", null, 1, 1, BusSlave.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(busCableEClass, BusCable.class, "BusCable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusCable_SignalPlug1(), theInterfacesPackage.getSignalInterface(), null, "SignalPlug1", null, 0, 1, BusCable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusCable_SignalPlug2(), theInterfacesPackage.getSignalInterface(), null, "SignalPlug2", null, 0, 1, BusCable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //BuscomponentsPackageImpl
