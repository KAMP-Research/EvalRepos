/**
 */
package domain.aps.components.impl;

import domain.aps.buscomponents.BuscomponentsPackage;

import domain.aps.buscomponents.impl.BuscomponentsPackageImpl;

import domain.aps.components.Cable;
import domain.aps.components.ComponentsFactory;
import domain.aps.components.ComponentsPackage;
import domain.aps.components.Compressor;
import domain.aps.components.ConveyorBelt;
import domain.aps.components.Corner;
import domain.aps.components.Cylinder;
import domain.aps.components.CylinderPart;
import domain.aps.components.Dispenser;
import domain.aps.components.Fixture;
import domain.aps.components.MechanicalAssembly;
import domain.aps.components.Motor;
import domain.aps.components.Panel;
import domain.aps.components.Pipe;
import domain.aps.components.PowerSupply;
import domain.aps.components.Pusher;
import domain.aps.components.Rack;
import domain.aps.components.RegularRamp;
import domain.aps.components.Sensor;
import domain.aps.components.SimpleMotor;
import domain.aps.components.Splitter;
import domain.aps.components.Tank;
import domain.aps.components.TurningTable;
import domain.aps.components.Valve;

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

import domain.as.InterfaceRepository.InterfaceRepositoryPackage;

import domain.as.ModuleRepository.ModuleRepositoryPackage;

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
public class ComponentsPackageImpl extends EPackageImpl implements ComponentsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerSupplyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conveyorBeltEClass = null;

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
	private EClass pipeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cylinderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dispenserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass splitterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass motorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tankEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pusherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cornerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compressorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass panelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regularRampEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass turningTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cylinderPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mechanicalAssemblyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleMotorEClass = null;

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
	 * @see domain.aps.components.ComponentsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ComponentsPackageImpl() {
		super(eNS_URI, ComponentsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ComponentsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ComponentsPackage init() {
		if (isInited) return (ComponentsPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredComponentsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ComponentsPackageImpl theComponentsPackage = registeredComponentsPackage instanceof ComponentsPackageImpl ? (ComponentsPackageImpl)registeredComponentsPackage : new ComponentsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		AsPackage.eINSTANCE.eClass();
		BasicPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BuscomponentsPackage.eNS_URI);
		BuscomponentsPackageImpl theBuscomponentsPackage = (BuscomponentsPackageImpl)(registeredPackage instanceof BuscomponentsPackageImpl ? registeredPackage : BuscomponentsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ElectroniccomponentsPackage.eNS_URI);
		ElectroniccomponentsPackageImpl theElectroniccomponentsPackage = (ElectroniccomponentsPackageImpl)(registeredPackage instanceof ElectroniccomponentsPackageImpl ? registeredPackage : ElectroniccomponentsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MechanicalcomponentsPackage.eNS_URI);
		MechanicalcomponentsPackageImpl theMechanicalcomponentsPackage = (MechanicalcomponentsPackageImpl)(registeredPackage instanceof MechanicalcomponentsPackageImpl ? registeredPackage : MechanicalcomponentsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StructuresPackage.eNS_URI);
		StructuresPackageImpl theStructuresPackage = (StructuresPackageImpl)(registeredPackage instanceof StructuresPackageImpl ? registeredPackage : StructuresPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(InterfacesPackage.eNS_URI);
		InterfacesPackageImpl theInterfacesPackage = (InterfacesPackageImpl)(registeredPackage instanceof InterfacesPackageImpl ? registeredPackage : InterfacesPackage.eINSTANCE);

		// Create package meta-data objects
		theComponentsPackage.createPackageContents();
		theBuscomponentsPackage.createPackageContents();
		theElectroniccomponentsPackage.createPackageContents();
		theMechanicalcomponentsPackage.createPackageContents();
		theStructuresPackage.createPackageContents();
		theInterfacesPackage.createPackageContents();

		// Initialize created meta-data
		theComponentsPackage.initializePackageContents();
		theBuscomponentsPackage.initializePackageContents();
		theElectroniccomponentsPackage.initializePackageContents();
		theMechanicalcomponentsPackage.initializePackageContents();
		theStructuresPackage.initializePackageContents();
		theInterfacesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theComponentsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ComponentsPackage.eNS_URI, theComponentsPackage);
		return theComponentsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPowerSupply() {
		return powerSupplyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConveyorBelt() {
		return conveyorBeltEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConveyorBelt_RubberBand() {
		return (EReference)conveyorBeltEClass.getEStructuralFeatures().get(0);
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
	public EClass getPipe() {
		return pipeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPipe_Plugs() {
		return (EReference)pipeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensor() {
		return sensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensor_Physicalconnection() {
		return (EReference)sensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensor_Signalinterface() {
		return (EReference)sensorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensor_Powersupply() {
		return (EReference)sensorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCylinder() {
		return cylinderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCylinder_Pneumaticsupply() {
		return (EReference)cylinderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCylinder_SignalInterface() {
		return (EReference)cylinderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDispenser() {
		return dispenserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSplitter() {
		return splitterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSplitter_Screwing() {
		return (EReference)splitterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMotor() {
		return motorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMotor_Gearing() {
		return (EReference)motorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMotor_Screwing() {
		return (EReference)motorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMotor_Powersupply() {
		return (EReference)motorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCable() {
		return cableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValve() {
		return valveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValve_Pneumaticsupply() {
		return (EReference)valveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValve_Powersupply() {
		return (EReference)valveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValve_Signalinterface() {
		return (EReference)valveEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTank() {
		return tankEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTank_Watersupply() {
		return (EReference)tankEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTank_Screwing() {
		return (EReference)tankEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPusher() {
		return pusherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPusher_ComponentsRepository() {
		return (EReference)pusherEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPusher_FixtureCylinder() {
		return (EReference)pusherEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPusher_BusBox() {
		return (EReference)pusherEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPusher_BusCable() {
		return (EReference)pusherEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCorner() {
		return cornerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRack() {
		return rackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRack_Screwing_to_base() {
		return (EReference)rackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompressor() {
		return compressorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompressor_Powersupply() {
		return (EReference)compressorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompressor_Pneumaticsupply() {
		return (EReference)compressorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompressor_Pins() {
		return (EReference)compressorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompressor_Screwing() {
		return (EReference)compressorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompressor_Switch() {
		return (EReference)compressorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPanel() {
		return panelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPanel_ComponentRepository() {
		return (EReference)panelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegularRamp() {
		return regularRampEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTurningTable() {
		return turningTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTurningTable_Rack_for_turningtable() {
		return (EReference)turningTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTurningTable_Table_to_stand_on() {
		return (EReference)turningTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTurningTable_Motor_to_drive() {
		return (EReference)turningTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTurningTable_BusSlave() {
		return (EReference)turningTableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTurningTable_BusBox() {
		return (EReference)turningTableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTurningTable_BusCable() {
		return (EReference)turningTableEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTurningTable_Potentiometer() {
		return (EReference)turningTableEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCylinderPart() {
		return cylinderPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMechanicalAssembly() {
		return mechanicalAssemblyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleMotor() {
		return simpleMotorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentsFactory getComponentsFactory() {
		return (ComponentsFactory)getEFactoryInstance();
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
		powerSupplyEClass = createEClass(POWER_SUPPLY);

		conveyorBeltEClass = createEClass(CONVEYOR_BELT);
		createEReference(conveyorBeltEClass, CONVEYOR_BELT__RUBBER_BAND);

		fixtureEClass = createEClass(FIXTURE);

		pipeEClass = createEClass(PIPE);
		createEReference(pipeEClass, PIPE__PLUGS);

		sensorEClass = createEClass(SENSOR);
		createEReference(sensorEClass, SENSOR__PHYSICALCONNECTION);
		createEReference(sensorEClass, SENSOR__SIGNALINTERFACE);
		createEReference(sensorEClass, SENSOR__POWERSUPPLY);

		cylinderEClass = createEClass(CYLINDER);
		createEReference(cylinderEClass, CYLINDER__PNEUMATICSUPPLY);
		createEReference(cylinderEClass, CYLINDER__SIGNAL_INTERFACE);

		dispenserEClass = createEClass(DISPENSER);

		splitterEClass = createEClass(SPLITTER);
		createEReference(splitterEClass, SPLITTER__SCREWING);

		motorEClass = createEClass(MOTOR);
		createEReference(motorEClass, MOTOR__GEARING);
		createEReference(motorEClass, MOTOR__SCREWING);
		createEReference(motorEClass, MOTOR__POWERSUPPLY);

		cableEClass = createEClass(CABLE);

		valveEClass = createEClass(VALVE);
		createEReference(valveEClass, VALVE__PNEUMATICSUPPLY);
		createEReference(valveEClass, VALVE__POWERSUPPLY);
		createEReference(valveEClass, VALVE__SIGNALINTERFACE);

		tankEClass = createEClass(TANK);
		createEReference(tankEClass, TANK__WATERSUPPLY);
		createEReference(tankEClass, TANK__SCREWING);

		pusherEClass = createEClass(PUSHER);
		createEReference(pusherEClass, PUSHER__COMPONENTS_REPOSITORY);
		createEReference(pusherEClass, PUSHER__FIXTURE_CYLINDER);
		createEReference(pusherEClass, PUSHER__BUS_BOX);
		createEReference(pusherEClass, PUSHER__BUS_CABLE);

		cornerEClass = createEClass(CORNER);

		rackEClass = createEClass(RACK);
		createEReference(rackEClass, RACK__SCREWING_TO_BASE);

		compressorEClass = createEClass(COMPRESSOR);
		createEReference(compressorEClass, COMPRESSOR__POWERSUPPLY);
		createEReference(compressorEClass, COMPRESSOR__PNEUMATICSUPPLY);
		createEReference(compressorEClass, COMPRESSOR__PINS);
		createEReference(compressorEClass, COMPRESSOR__SCREWING);
		createEReference(compressorEClass, COMPRESSOR__SWITCH);

		panelEClass = createEClass(PANEL);
		createEReference(panelEClass, PANEL__COMPONENT_REPOSITORY);

		regularRampEClass = createEClass(REGULAR_RAMP);

		turningTableEClass = createEClass(TURNING_TABLE);
		createEReference(turningTableEClass, TURNING_TABLE__RACK_FOR_TURNINGTABLE);
		createEReference(turningTableEClass, TURNING_TABLE__TABLE_TO_STAND_ON);
		createEReference(turningTableEClass, TURNING_TABLE__MOTOR_TO_DRIVE);
		createEReference(turningTableEClass, TURNING_TABLE__BUS_SLAVE);
		createEReference(turningTableEClass, TURNING_TABLE__BUS_BOX);
		createEReference(turningTableEClass, TURNING_TABLE__BUS_CABLE);
		createEReference(turningTableEClass, TURNING_TABLE__POTENTIOMETER);

		cylinderPartEClass = createEClass(CYLINDER_PART);

		mechanicalAssemblyEClass = createEClass(MECHANICAL_ASSEMBLY);

		simpleMotorEClass = createEClass(SIMPLE_MOTOR);
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
		InterfaceRepositoryPackage theInterfaceRepositoryPackage = (InterfaceRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(InterfaceRepositoryPackage.eNS_URI);
		MechanicalcomponentsPackage theMechanicalcomponentsPackage = (MechanicalcomponentsPackage)EPackage.Registry.INSTANCE.getEPackage(MechanicalcomponentsPackage.eNS_URI);
		InterfacesPackage theInterfacesPackage = (InterfacesPackage)EPackage.Registry.INSTANCE.getEPackage(InterfacesPackage.eNS_URI);
		BuscomponentsPackage theBuscomponentsPackage = (BuscomponentsPackage)EPackage.Registry.INSTANCE.getEPackage(BuscomponentsPackage.eNS_URI);
		ElectroniccomponentsPackage theElectroniccomponentsPackage = (ElectroniccomponentsPackage)EPackage.Registry.INSTANCE.getEPackage(ElectroniccomponentsPackage.eNS_URI);
		ModuleRepositoryPackage theModuleRepositoryPackage = (ModuleRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(ModuleRepositoryPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		powerSupplyEClass.getESuperTypes().add(theComponentRepositoryPackage.getComponent());
		powerSupplyEClass.getESuperTypes().add(theInterfaceRepositoryPackage.getInterface());
		conveyorBeltEClass.getESuperTypes().add(theComponentRepositoryPackage.getComponent());
		fixtureEClass.getESuperTypes().add(theComponentRepositoryPackage.getComponent());
		pipeEClass.getESuperTypes().add(theComponentRepositoryPackage.getComponent());
		sensorEClass.getESuperTypes().add(theComponentRepositoryPackage.getComponent());
		cylinderEClass.getESuperTypes().add(theComponentRepositoryPackage.getComponent());
		dispenserEClass.getESuperTypes().add(theComponentRepositoryPackage.getComponent());
		splitterEClass.getESuperTypes().add(theComponentRepositoryPackage.getComponent());
		motorEClass.getESuperTypes().add(theComponentRepositoryPackage.getComponent());
		cableEClass.getESuperTypes().add(theComponentRepositoryPackage.getComponent());
		valveEClass.getESuperTypes().add(theComponentRepositoryPackage.getComponent());
		tankEClass.getESuperTypes().add(theComponentRepositoryPackage.getComponent());
		pusherEClass.getESuperTypes().add(theComponentRepositoryPackage.getComponent());
		cornerEClass.getESuperTypes().add(theComponentRepositoryPackage.getComponent());
		rackEClass.getESuperTypes().add(theComponentRepositoryPackage.getComponent());
		compressorEClass.getESuperTypes().add(theComponentRepositoryPackage.getComponent());
		panelEClass.getESuperTypes().add(theComponentRepositoryPackage.getComponent());
		regularRampEClass.getESuperTypes().add(theMechanicalcomponentsPackage.getRamp());
		turningTableEClass.getESuperTypes().add(theModuleRepositoryPackage.getModule());
		cylinderPartEClass.getESuperTypes().add(theMechanicalcomponentsPackage.getMechanicalPart());
		mechanicalAssemblyEClass.getESuperTypes().add(theComponentRepositoryPackage.getComponent());
		simpleMotorEClass.getESuperTypes().add(this.getMotor());

		// Initialize classes, features, and operations; add parameters
		initEClass(powerSupplyEClass, PowerSupply.class, "PowerSupply", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conveyorBeltEClass, ConveyorBelt.class, "ConveyorBelt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConveyorBelt_RubberBand(), theMechanicalcomponentsPackage.getRubberBand(), null, "rubberBand", null, 1, 1, ConveyorBelt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fixtureEClass, Fixture.class, "Fixture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pipeEClass, Pipe.class, "Pipe", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPipe_Plugs(), theInterfacesPackage.getPneumaticSupply(), null, "plugs", null, 0, 1, Pipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sensorEClass, Sensor.class, "Sensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSensor_Physicalconnection(), theInterfacesPackage.getPhysicalConnection(), null, "physicalconnection", null, 1, 1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSensor_Signalinterface(), theInterfacesPackage.getSignalInterface(), null, "signalinterface", null, 1, 1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSensor_Powersupply(), this.getPowerSupply(), null, "powersupply", null, 1, 1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cylinderEClass, Cylinder.class, "Cylinder", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCylinder_Pneumaticsupply(), theInterfacesPackage.getPneumaticSupply(), null, "pneumaticsupply", null, 1, 1, Cylinder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCylinder_SignalInterface(), theInterfacesPackage.getSignalInterface(), null, "SignalInterface", null, 1, 1, Cylinder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dispenserEClass, Dispenser.class, "Dispenser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(splitterEClass, Splitter.class, "Splitter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSplitter_Screwing(), theInterfacesPackage.getScrewing(), null, "screwing", null, 1, 1, Splitter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(motorEClass, Motor.class, "Motor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMotor_Gearing(), theInterfacesPackage.getGearing(), null, "gearing", null, 1, 1, Motor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMotor_Screwing(), theInterfacesPackage.getScrewing(), null, "screwing", null, 1, 1, Motor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMotor_Powersupply(), this.getPowerSupply(), null, "powersupply", null, 1, 1, Motor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cableEClass, Cable.class, "Cable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(valveEClass, Valve.class, "Valve", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValve_Pneumaticsupply(), theInterfacesPackage.getPneumaticSupply(), null, "pneumaticsupply", null, 1, 1, Valve.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValve_Powersupply(), this.getPowerSupply(), null, "powersupply", null, 1, 1, Valve.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValve_Signalinterface(), theInterfacesPackage.getSignalInterface(), null, "signalinterface", null, 1, 1, Valve.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tankEClass, Tank.class, "Tank", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTank_Watersupply(), theInterfacesPackage.getWaterSupply(), null, "watersupply", null, 1, 1, Tank.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTank_Screwing(), theInterfacesPackage.getScrewing(), null, "screwing", null, 1, 1, Tank.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pusherEClass, Pusher.class, "Pusher", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPusher_ComponentsRepository(), theComponentRepositoryPackage.getComponent(), null, "componentsRepository", null, 1, 1, Pusher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPusher_FixtureCylinder(), theInterfacesPackage.getPhysicalConnection(), null, "fixtureCylinder", null, 1, 1, Pusher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPusher_BusBox(), theBuscomponentsPackage.getBusBox(), null, "busBox", null, 1, 1, Pusher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPusher_BusCable(), theBuscomponentsPackage.getBusCable(), null, "busCable", null, 1, -1, Pusher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cornerEClass, Corner.class, "Corner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rackEClass, Rack.class, "Rack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRack_Screwing_to_base(), theInterfacesPackage.getScrewing(), null, "screwing_to_base", null, 1, 1, Rack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compressorEClass, Compressor.class, "Compressor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompressor_Powersupply(), this.getPowerSupply(), null, "powersupply", null, 1, 1, Compressor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompressor_Pneumaticsupply(), theInterfacesPackage.getPneumaticSupply(), null, "pneumaticsupply", null, 0, -1, Compressor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompressor_Pins(), theInterfacesPackage.getSignalInterface(), null, "pins", null, 2, 2, Compressor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompressor_Screwing(), theInterfacesPackage.getScrewing(), null, "screwing", null, 1, 1, Compressor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompressor_Switch(), theElectroniccomponentsPackage.getSwitch(), null, "switch", null, 1, 1, Compressor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(panelEClass, Panel.class, "Panel", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPanel_ComponentRepository(), theComponentRepositoryPackage.getComponent(), null, "componentRepository", null, 1, 1, Panel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regularRampEClass, RegularRamp.class, "RegularRamp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(turningTableEClass, TurningTable.class, "TurningTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTurningTable_Rack_for_turningtable(), this.getRack(), null, "rack_for_turningtable", null, 1, 1, TurningTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTurningTable_Table_to_stand_on(), theMechanicalcomponentsPackage.getTable(), null, "table_to_stand_on", null, 1, 1, TurningTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTurningTable_Motor_to_drive(), this.getSimpleMotor(), null, "motor_to_drive", null, 1, 1, TurningTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTurningTable_BusSlave(), theBuscomponentsPackage.getBusSlave(), null, "busSlave", null, 1, 1, TurningTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTurningTable_BusBox(), theBuscomponentsPackage.getBusBox(), null, "busBox", null, 1, 1, TurningTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTurningTable_BusCable(), theBuscomponentsPackage.getBusCable(), null, "busCable", null, 1, -1, TurningTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTurningTable_Potentiometer(), theElectroniccomponentsPackage.getPotentiometer(), null, "potentiometer", null, 1, -1, TurningTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cylinderPartEClass, CylinderPart.class, "CylinderPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mechanicalAssemblyEClass, MechanicalAssembly.class, "MechanicalAssembly", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleMotorEClass, SimpleMotor.class, "SimpleMotor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ComponentsPackageImpl
