/**
 */
package domain.ppu.ppumodules.impl;

import domain.aps.buscomponents.BuscomponentsPackage;

import domain.aps.components.ComponentsPackage;

import domain.aps.electroniccomponents.ElectroniccomponentsPackage;

import domain.aps.interfaces.InterfacesPackage;

import domain.aps.mechanicalcomponents.MechanicalcomponentsPackage;

import domain.aps.structures.StructuresPackage;

import domain.as.AsPackage;

import domain.as.ModuleRepository.ModuleRepositoryPackage;

import domain.ppu.ppubuscomponents.PpubuscomponentsPackage;

import domain.ppu.ppubuscomponents.impl.PpubuscomponentsPackageImpl;

import domain.ppu.ppucomponents.PpucomponentsPackage;

import domain.ppu.ppucomponents.impl.PpucomponentsPackageImpl;

import domain.ppu.ppuinterfaces.PpuinterfacesPackage;

import domain.ppu.ppuinterfaces.impl.PpuinterfacesPackageImpl;

import domain.ppu.ppumechanicalcomponents.PpumechanicalcomponentsPackage;

import domain.ppu.ppumechanicalcomponents.impl.PpumechanicalcomponentsPackageImpl;

import domain.ppu.ppumodules.ConveyorBeltModule;
import domain.ppu.ppumodules.InductiveSensorModule;
import domain.ppu.ppumodules.MicroswitchModule;
import domain.ppu.ppumodules.MonostableCylinderModule;
import domain.ppu.ppumodules.MotorModule;
import domain.ppu.ppumodules.OpticalSensorModule;
import domain.ppu.ppumodules.PotentiometerModule;
import domain.ppu.ppumodules.PpumodulesFactory;
import domain.ppu.ppumodules.PpumodulesPackage;
import domain.ppu.ppumodules.PresenceSensorModule;
import domain.ppu.ppumodules.PressureSensorModule;
import domain.ppu.ppumodules.PusherModule;
import domain.ppu.ppumodules.RampModule;
import domain.ppu.ppumodules.SensorModule;
import domain.ppu.ppumodules.VacuumGripperModule;

import domain.ppu.ppustructures.PpustructuresPackage;

import domain.ppu.ppustructures.impl.PpustructuresPackageImpl;

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
public class PpumodulesPackageImpl extends EPackageImpl implements PpumodulesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass potentiometerModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inductiveSensorModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pressureSensorModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pusherModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rampModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass microswitchModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass motorModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monostableCylinderModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vacuumGripperModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass presenceSensorModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opticalSensorModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conveyorBeltModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorModuleEClass = null;

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
	 * @see domain.ppu.ppumodules.PpumodulesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PpumodulesPackageImpl() {
		super(eNS_URI, PpumodulesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PpumodulesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PpumodulesPackage init() {
		if (isInited) return (PpumodulesPackage)EPackage.Registry.INSTANCE.getEPackage(PpumodulesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPpumodulesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PpumodulesPackageImpl thePpumodulesPackage = registeredPpumodulesPackage instanceof PpumodulesPackageImpl ? (PpumodulesPackageImpl)registeredPpumodulesPackage : new PpumodulesPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ComponentsPackage.eINSTANCE.eClass();
		BuscomponentsPackage.eINSTANCE.eClass();
		ElectroniccomponentsPackage.eINSTANCE.eClass();
		MechanicalcomponentsPackage.eINSTANCE.eClass();
		StructuresPackage.eINSTANCE.eClass();
		InterfacesPackage.eINSTANCE.eClass();
		AsPackage.eINSTANCE.eClass();
		BasicPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PpucomponentsPackage.eNS_URI);
		PpucomponentsPackageImpl thePpucomponentsPackage = (PpucomponentsPackageImpl)(registeredPackage instanceof PpucomponentsPackageImpl ? registeredPackage : PpucomponentsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PpubuscomponentsPackage.eNS_URI);
		PpubuscomponentsPackageImpl thePpubuscomponentsPackage = (PpubuscomponentsPackageImpl)(registeredPackage instanceof PpubuscomponentsPackageImpl ? registeredPackage : PpubuscomponentsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PpumechanicalcomponentsPackage.eNS_URI);
		PpumechanicalcomponentsPackageImpl thePpumechanicalcomponentsPackage = (PpumechanicalcomponentsPackageImpl)(registeredPackage instanceof PpumechanicalcomponentsPackageImpl ? registeredPackage : PpumechanicalcomponentsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PpustructuresPackage.eNS_URI);
		PpustructuresPackageImpl thePpustructuresPackage = (PpustructuresPackageImpl)(registeredPackage instanceof PpustructuresPackageImpl ? registeredPackage : PpustructuresPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PpuinterfacesPackage.eNS_URI);
		PpuinterfacesPackageImpl thePpuinterfacesPackage = (PpuinterfacesPackageImpl)(registeredPackage instanceof PpuinterfacesPackageImpl ? registeredPackage : PpuinterfacesPackage.eINSTANCE);

		// Create package meta-data objects
		thePpumodulesPackage.createPackageContents();
		thePpucomponentsPackage.createPackageContents();
		thePpubuscomponentsPackage.createPackageContents();
		thePpumechanicalcomponentsPackage.createPackageContents();
		thePpustructuresPackage.createPackageContents();
		thePpuinterfacesPackage.createPackageContents();

		// Initialize created meta-data
		thePpumodulesPackage.initializePackageContents();
		thePpucomponentsPackage.initializePackageContents();
		thePpubuscomponentsPackage.initializePackageContents();
		thePpumechanicalcomponentsPackage.initializePackageContents();
		thePpustructuresPackage.initializePackageContents();
		thePpuinterfacesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePpumodulesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PpumodulesPackage.eNS_URI, thePpumodulesPackage);
		return thePpumodulesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPotentiometerModule() {
		return potentiometerModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPotentiometerModule_Poti() {
		return (EReference)potentiometerModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInductiveSensorModule() {
		return inductiveSensorModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInductiveSensorModule_InductiveSensor() {
		return (EReference)inductiveSensorModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInductiveSensorModule_BusSlave() {
		return (EReference)inductiveSensorModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPressureSensorModule() {
		return pressureSensorModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPusherModule() {
		return pusherModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRampModule() {
		return rampModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMicroswitchModule() {
		return microswitchModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMicroswitchModule_BusSlave() {
		return (EReference)microswitchModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMicroswitchModule_Switch() {
		return (EReference)microswitchModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMicroswitchModule_Turningtable() {
		return (EReference)microswitchModuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMotorModule() {
		return motorModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMotorModule_SimpleMotor() {
		return (EReference)motorModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMotorModule_BusSlave() {
		return (EReference)motorModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMotorModule_BusBox() {
		return (EReference)motorModuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMotorModule_BusCable() {
		return (EReference)motorModuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMonostableCylinderModule() {
		return monostableCylinderModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVacuumGripperModule() {
		return vacuumGripperModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPresenceSensorModule() {
		return presenceSensorModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPresenceSensorModule_PresenceSensor() {
		return (EReference)presenceSensorModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPresenceSensorModule_BusSlave() {
		return (EReference)presenceSensorModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpticalSensorModule() {
		return opticalSensorModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpticalSensorModule_OpticalSensor() {
		return (EReference)opticalSensorModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpticalSensorModule_BusSlave() {
		return (EReference)opticalSensorModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConveyorBeltModule() {
		return conveyorBeltModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConveyorBeltModule_RubberBand() {
		return (EReference)conveyorBeltModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConveyorBeltModule_Frame() {
		return (EReference)conveyorBeltModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensorModule() {
		return sensorModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PpumodulesFactory getPpumodulesFactory() {
		return (PpumodulesFactory)getEFactoryInstance();
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
		potentiometerModuleEClass = createEClass(POTENTIOMETER_MODULE);
		createEReference(potentiometerModuleEClass, POTENTIOMETER_MODULE__POTI);

		inductiveSensorModuleEClass = createEClass(INDUCTIVE_SENSOR_MODULE);
		createEReference(inductiveSensorModuleEClass, INDUCTIVE_SENSOR_MODULE__INDUCTIVE_SENSOR);
		createEReference(inductiveSensorModuleEClass, INDUCTIVE_SENSOR_MODULE__BUS_SLAVE);

		pressureSensorModuleEClass = createEClass(PRESSURE_SENSOR_MODULE);

		pusherModuleEClass = createEClass(PUSHER_MODULE);

		rampModuleEClass = createEClass(RAMP_MODULE);

		microswitchModuleEClass = createEClass(MICROSWITCH_MODULE);
		createEReference(microswitchModuleEClass, MICROSWITCH_MODULE__BUS_SLAVE);
		createEReference(microswitchModuleEClass, MICROSWITCH_MODULE__SWITCH);
		createEReference(microswitchModuleEClass, MICROSWITCH_MODULE__TURNINGTABLE);

		motorModuleEClass = createEClass(MOTOR_MODULE);
		createEReference(motorModuleEClass, MOTOR_MODULE__SIMPLE_MOTOR);
		createEReference(motorModuleEClass, MOTOR_MODULE__BUS_SLAVE);
		createEReference(motorModuleEClass, MOTOR_MODULE__BUS_BOX);
		createEReference(motorModuleEClass, MOTOR_MODULE__BUS_CABLE);

		monostableCylinderModuleEClass = createEClass(MONOSTABLE_CYLINDER_MODULE);

		vacuumGripperModuleEClass = createEClass(VACUUM_GRIPPER_MODULE);

		presenceSensorModuleEClass = createEClass(PRESENCE_SENSOR_MODULE);
		createEReference(presenceSensorModuleEClass, PRESENCE_SENSOR_MODULE__PRESENCE_SENSOR);
		createEReference(presenceSensorModuleEClass, PRESENCE_SENSOR_MODULE__BUS_SLAVE);

		opticalSensorModuleEClass = createEClass(OPTICAL_SENSOR_MODULE);
		createEReference(opticalSensorModuleEClass, OPTICAL_SENSOR_MODULE__OPTICAL_SENSOR);
		createEReference(opticalSensorModuleEClass, OPTICAL_SENSOR_MODULE__BUS_SLAVE);

		conveyorBeltModuleEClass = createEClass(CONVEYOR_BELT_MODULE);
		createEReference(conveyorBeltModuleEClass, CONVEYOR_BELT_MODULE__RUBBER_BAND);
		createEReference(conveyorBeltModuleEClass, CONVEYOR_BELT_MODULE__FRAME);

		sensorModuleEClass = createEClass(SENSOR_MODULE);
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
		ModuleRepositoryPackage theModuleRepositoryPackage = (ModuleRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(ModuleRepositoryPackage.eNS_URI);
		ElectroniccomponentsPackage theElectroniccomponentsPackage = (ElectroniccomponentsPackage)EPackage.Registry.INSTANCE.getEPackage(ElectroniccomponentsPackage.eNS_URI);
		PpucomponentsPackage thePpucomponentsPackage = (PpucomponentsPackage)EPackage.Registry.INSTANCE.getEPackage(PpucomponentsPackage.eNS_URI);
		BuscomponentsPackage theBuscomponentsPackage = (BuscomponentsPackage)EPackage.Registry.INSTANCE.getEPackage(BuscomponentsPackage.eNS_URI);
		ComponentsPackage theComponentsPackage = (ComponentsPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentsPackage.eNS_URI);
		MechanicalcomponentsPackage theMechanicalcomponentsPackage = (MechanicalcomponentsPackage)EPackage.Registry.INSTANCE.getEPackage(MechanicalcomponentsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		potentiometerModuleEClass.getESuperTypes().add(theModuleRepositoryPackage.getModule());
		inductiveSensorModuleEClass.getESuperTypes().add(theModuleRepositoryPackage.getModule());
		pressureSensorModuleEClass.getESuperTypes().add(theModuleRepositoryPackage.getModule());
		pusherModuleEClass.getESuperTypes().add(theModuleRepositoryPackage.getModule());
		rampModuleEClass.getESuperTypes().add(theModuleRepositoryPackage.getModule());
		microswitchModuleEClass.getESuperTypes().add(theModuleRepositoryPackage.getModule());
		motorModuleEClass.getESuperTypes().add(theModuleRepositoryPackage.getModule());
		monostableCylinderModuleEClass.getESuperTypes().add(theModuleRepositoryPackage.getModule());
		vacuumGripperModuleEClass.getESuperTypes().add(theModuleRepositoryPackage.getModule());
		presenceSensorModuleEClass.getESuperTypes().add(theModuleRepositoryPackage.getModule());
		opticalSensorModuleEClass.getESuperTypes().add(theModuleRepositoryPackage.getModule());
		conveyorBeltModuleEClass.getESuperTypes().add(theModuleRepositoryPackage.getModule());
		sensorModuleEClass.getESuperTypes().add(theModuleRepositoryPackage.getModule());

		// Initialize classes, features, and operations; add parameters
		initEClass(potentiometerModuleEClass, PotentiometerModule.class, "PotentiometerModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPotentiometerModule_Poti(), theElectroniccomponentsPackage.getPotentiometer(), null, "poti", null, 1, 1, PotentiometerModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inductiveSensorModuleEClass, InductiveSensorModule.class, "InductiveSensorModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInductiveSensorModule_InductiveSensor(), thePpucomponentsPackage.getInductiveSensor(), null, "inductiveSensor", null, 1, -1, InductiveSensorModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInductiveSensorModule_BusSlave(), theBuscomponentsPackage.getBusSlave(), null, "busSlave", null, 1, -1, InductiveSensorModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pressureSensorModuleEClass, PressureSensorModule.class, "PressureSensorModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pusherModuleEClass, PusherModule.class, "PusherModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rampModuleEClass, RampModule.class, "RampModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(microswitchModuleEClass, MicroswitchModule.class, "MicroswitchModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMicroswitchModule_BusSlave(), theBuscomponentsPackage.getBusSlave(), null, "busSlave", null, 1, -1, MicroswitchModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMicroswitchModule_Switch(), theElectroniccomponentsPackage.getMicroSwitch(), null, "switch", null, 1, 1, MicroswitchModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMicroswitchModule_Turningtable(), theComponentsPackage.getTurningTable(), null, "turningtable", null, 0, 1, MicroswitchModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(motorModuleEClass, MotorModule.class, "MotorModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMotorModule_SimpleMotor(), theComponentsPackage.getSimpleMotor(), null, "simpleMotor", null, 1, -1, MotorModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMotorModule_BusSlave(), theBuscomponentsPackage.getBusSlave(), null, "busSlave", null, 1, -1, MotorModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMotorModule_BusBox(), theBuscomponentsPackage.getBusBox(), null, "busBox", null, 1, 1, MotorModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMotorModule_BusCable(), theBuscomponentsPackage.getBusCable(), null, "busCable", null, 1, -1, MotorModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(monostableCylinderModuleEClass, MonostableCylinderModule.class, "MonostableCylinderModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vacuumGripperModuleEClass, VacuumGripperModule.class, "VacuumGripperModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(presenceSensorModuleEClass, PresenceSensorModule.class, "PresenceSensorModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPresenceSensorModule_PresenceSensor(), thePpucomponentsPackage.getPresenceSensor(), null, "presenceSensor", null, 1, -1, PresenceSensorModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPresenceSensorModule_BusSlave(), theBuscomponentsPackage.getBusSlave(), null, "busSlave", null, 1, -1, PresenceSensorModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(opticalSensorModuleEClass, OpticalSensorModule.class, "OpticalSensorModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOpticalSensorModule_OpticalSensor(), thePpucomponentsPackage.getOpticalSensor(), null, "opticalSensor", null, 1, -1, OpticalSensorModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOpticalSensorModule_BusSlave(), theBuscomponentsPackage.getBusSlave(), null, "busSlave", null, 1, -1, OpticalSensorModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conveyorBeltModuleEClass, ConveyorBeltModule.class, "ConveyorBeltModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConveyorBeltModule_RubberBand(), theMechanicalcomponentsPackage.getRubberBand(), null, "rubberBand", null, 1, 1, ConveyorBeltModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConveyorBeltModule_Frame(), thePpucomponentsPackage.getFrame(), null, "frame", null, 1, 1, ConveyorBeltModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sensorModuleEClass, SensorModule.class, "SensorModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //PpumodulesPackageImpl
