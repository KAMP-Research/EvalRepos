/**
 */
package domain.ppu.ppucomponents.impl;

import domain.aps.buscomponents.BuscomponentsPackage;

import domain.aps.components.ComponentsPackage;

import domain.aps.electroniccomponents.ElectroniccomponentsPackage;

import domain.aps.interfaces.InterfacesPackage;

import domain.aps.mechanicalcomponents.MechanicalcomponentsPackage;

import domain.aps.structures.StructuresPackage;

import domain.as.AsPackage;

import domain.as.ComponentRepository.ComponentRepositoryPackage;

import domain.ppu.ppubuscomponents.PpubuscomponentsPackage;

import domain.ppu.ppubuscomponents.impl.PpubuscomponentsPackageImpl;

import domain.ppu.ppucomponents.BistableCylinder;
import domain.ppu.ppucomponents.BottleSeperator;
import domain.ppu.ppucomponents.Controller;
import domain.ppu.ppucomponents.Frame;
import domain.ppu.ppucomponents.InductiveSensor;
import domain.ppu.ppucomponents.MonostableCylinder;
import domain.ppu.ppucomponents.OperationPanel;
import domain.ppu.ppucomponents.OpticalSensor;
import domain.ppu.ppucomponents.PneumaticPipe;
import domain.ppu.ppucomponents.PneumaticSplitter;
import domain.ppu.ppucomponents.PowerCable;
import domain.ppu.ppucomponents.PowerSplitter;
import domain.ppu.ppucomponents.PpucomponentsFactory;
import domain.ppu.ppucomponents.PpucomponentsPackage;
import domain.ppu.ppucomponents.PresenceSensor;
import domain.ppu.ppucomponents.PressureSensor;
import domain.ppu.ppucomponents.ProportionalCylinder;
import domain.ppu.ppucomponents.ReedSwitch;
import domain.ppu.ppucomponents.RegularValve;
import domain.ppu.ppucomponents.VacuumSwitch;
import domain.ppu.ppucomponents.WaterSplitter;

import domain.ppu.ppuinterfaces.PpuinterfacesPackage;

import domain.ppu.ppuinterfaces.impl.PpuinterfacesPackageImpl;

import domain.ppu.ppumechanicalcomponents.PpumechanicalcomponentsPackage;

import domain.ppu.ppumechanicalcomponents.impl.PpumechanicalcomponentsPackageImpl;

import domain.ppu.ppumodules.PpumodulesPackage;

import domain.ppu.ppumodules.impl.PpumodulesPackageImpl;

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
public class PpucomponentsPackageImpl extends EPackageImpl implements PpucomponentsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerSplitterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opticalSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pneumaticPipeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pneumaticSplitterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monostableCylinderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass presenceSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regularValveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inductiveSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reedSwitchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vacuumSwitchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proportionalCylinderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bistableCylinderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass waterSplitterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationPanelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerCableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pressureSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bottleSeperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllerEClass = null;

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
	 * @see domain.ppu.ppucomponents.PpucomponentsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PpucomponentsPackageImpl() {
		super(eNS_URI, PpucomponentsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PpucomponentsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PpucomponentsPackage init() {
		if (isInited) return (PpucomponentsPackage)EPackage.Registry.INSTANCE.getEPackage(PpucomponentsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPpucomponentsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PpucomponentsPackageImpl thePpucomponentsPackage = registeredPpucomponentsPackage instanceof PpucomponentsPackageImpl ? (PpucomponentsPackageImpl)registeredPpucomponentsPackage : new PpucomponentsPackageImpl();

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
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PpubuscomponentsPackage.eNS_URI);
		PpubuscomponentsPackageImpl thePpubuscomponentsPackage = (PpubuscomponentsPackageImpl)(registeredPackage instanceof PpubuscomponentsPackageImpl ? registeredPackage : PpubuscomponentsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PpumechanicalcomponentsPackage.eNS_URI);
		PpumechanicalcomponentsPackageImpl thePpumechanicalcomponentsPackage = (PpumechanicalcomponentsPackageImpl)(registeredPackage instanceof PpumechanicalcomponentsPackageImpl ? registeredPackage : PpumechanicalcomponentsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PpustructuresPackage.eNS_URI);
		PpustructuresPackageImpl thePpustructuresPackage = (PpustructuresPackageImpl)(registeredPackage instanceof PpustructuresPackageImpl ? registeredPackage : PpustructuresPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PpumodulesPackage.eNS_URI);
		PpumodulesPackageImpl thePpumodulesPackage = (PpumodulesPackageImpl)(registeredPackage instanceof PpumodulesPackageImpl ? registeredPackage : PpumodulesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PpuinterfacesPackage.eNS_URI);
		PpuinterfacesPackageImpl thePpuinterfacesPackage = (PpuinterfacesPackageImpl)(registeredPackage instanceof PpuinterfacesPackageImpl ? registeredPackage : PpuinterfacesPackage.eINSTANCE);

		// Create package meta-data objects
		thePpucomponentsPackage.createPackageContents();
		thePpubuscomponentsPackage.createPackageContents();
		thePpumechanicalcomponentsPackage.createPackageContents();
		thePpustructuresPackage.createPackageContents();
		thePpumodulesPackage.createPackageContents();
		thePpuinterfacesPackage.createPackageContents();

		// Initialize created meta-data
		thePpucomponentsPackage.initializePackageContents();
		thePpubuscomponentsPackage.initializePackageContents();
		thePpumechanicalcomponentsPackage.initializePackageContents();
		thePpustructuresPackage.initializePackageContents();
		thePpumodulesPackage.initializePackageContents();
		thePpuinterfacesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePpucomponentsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PpucomponentsPackage.eNS_URI, thePpucomponentsPackage);
		return thePpucomponentsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPowerSplitter() {
		return powerSplitterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPowerSplitter_Powersupply() {
		return (EReference)powerSplitterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpticalSensor() {
		return opticalSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPneumaticPipe() {
		return pneumaticPipeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPneumaticSplitter() {
		return pneumaticSplitterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPneumaticSplitter_Pneumaticsupply() {
		return (EReference)pneumaticSplitterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMonostableCylinder() {
		return monostableCylinderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonostableCylinder_Housing() {
		return (EReference)monostableCylinderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonostableCylinder_Spring() {
		return (EReference)monostableCylinderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonostableCylinder_ReedSwitches() {
		return (EReference)monostableCylinderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonostableCylinder_CylinderPart() {
		return (EReference)monostableCylinderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonostableCylinder_Valve() {
		return (EReference)monostableCylinderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonostableCylinder_BusSlave() {
		return (EReference)monostableCylinderEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonostableCylinder_Pusher() {
		return (EReference)monostableCylinderEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPresenceSensor() {
		return presenceSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegularValve() {
		return regularValveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFrame() {
		return frameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFrame_Conveyorbelt() {
		return (EReference)frameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInductiveSensor() {
		return inductiveSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReedSwitch() {
		return reedSwitchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVacuumSwitch() {
		return vacuumSwitchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProportionalCylinder() {
		return proportionalCylinderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBistableCylinder() {
		return bistableCylinderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWaterSplitter() {
		return waterSplitterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWaterSplitter_Watersupply() {
		return (EReference)waterSplitterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationPanel() {
		return operationPanelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationPanel_Screwing_rack() {
		return (EReference)operationPanelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationPanel_Leds() {
		return (EReference)operationPanelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationPanel_Buttons() {
		return (EReference)operationPanelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPowerCable() {
		return powerCableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPressureSensor() {
		return pressureSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBottleSeperator() {
		return bottleSeperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBottleSeperator_Signalinterface() {
		return (EReference)bottleSeperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBottleSeperator_Pneumaticsupply() {
		return (EReference)bottleSeperatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBottleSeperator_Powersupply() {
		return (EReference)bottleSeperatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBottleSeperator_Screwing_to_rack() {
		return (EReference)bottleSeperatorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getController() {
		return controllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getController_Powersupply() {
		return (EReference)controllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getController_ControllerOf() {
		return (EReference)controllerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PpucomponentsFactory getPpucomponentsFactory() {
		return (PpucomponentsFactory)getEFactoryInstance();
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
		powerSplitterEClass = createEClass(POWER_SPLITTER);
		createEReference(powerSplitterEClass, POWER_SPLITTER__POWERSUPPLY);

		opticalSensorEClass = createEClass(OPTICAL_SENSOR);

		pneumaticPipeEClass = createEClass(PNEUMATIC_PIPE);

		pneumaticSplitterEClass = createEClass(PNEUMATIC_SPLITTER);
		createEReference(pneumaticSplitterEClass, PNEUMATIC_SPLITTER__PNEUMATICSUPPLY);

		monostableCylinderEClass = createEClass(MONOSTABLE_CYLINDER);
		createEReference(monostableCylinderEClass, MONOSTABLE_CYLINDER__HOUSING);
		createEReference(monostableCylinderEClass, MONOSTABLE_CYLINDER__SPRING);
		createEReference(monostableCylinderEClass, MONOSTABLE_CYLINDER__REED_SWITCHES);
		createEReference(monostableCylinderEClass, MONOSTABLE_CYLINDER__CYLINDER_PART);
		createEReference(monostableCylinderEClass, MONOSTABLE_CYLINDER__VALVE);
		createEReference(monostableCylinderEClass, MONOSTABLE_CYLINDER__BUS_SLAVE);
		createEReference(monostableCylinderEClass, MONOSTABLE_CYLINDER__PUSHER);

		presenceSensorEClass = createEClass(PRESENCE_SENSOR);

		regularValveEClass = createEClass(REGULAR_VALVE);

		frameEClass = createEClass(FRAME);
		createEReference(frameEClass, FRAME__CONVEYORBELT);

		inductiveSensorEClass = createEClass(INDUCTIVE_SENSOR);

		reedSwitchEClass = createEClass(REED_SWITCH);

		vacuumSwitchEClass = createEClass(VACUUM_SWITCH);

		proportionalCylinderEClass = createEClass(PROPORTIONAL_CYLINDER);

		bistableCylinderEClass = createEClass(BISTABLE_CYLINDER);

		waterSplitterEClass = createEClass(WATER_SPLITTER);
		createEReference(waterSplitterEClass, WATER_SPLITTER__WATERSUPPLY);

		operationPanelEClass = createEClass(OPERATION_PANEL);
		createEReference(operationPanelEClass, OPERATION_PANEL__SCREWING_RACK);
		createEReference(operationPanelEClass, OPERATION_PANEL__LEDS);
		createEReference(operationPanelEClass, OPERATION_PANEL__BUTTONS);

		powerCableEClass = createEClass(POWER_CABLE);

		pressureSensorEClass = createEClass(PRESSURE_SENSOR);

		bottleSeperatorEClass = createEClass(BOTTLE_SEPERATOR);
		createEReference(bottleSeperatorEClass, BOTTLE_SEPERATOR__SIGNALINTERFACE);
		createEReference(bottleSeperatorEClass, BOTTLE_SEPERATOR__PNEUMATICSUPPLY);
		createEReference(bottleSeperatorEClass, BOTTLE_SEPERATOR__POWERSUPPLY);
		createEReference(bottleSeperatorEClass, BOTTLE_SEPERATOR__SCREWING_TO_RACK);

		controllerEClass = createEClass(CONTROLLER);
		createEReference(controllerEClass, CONTROLLER__POWERSUPPLY);
		createEReference(controllerEClass, CONTROLLER__CONTROLLER_OF);
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
		ComponentsPackage theComponentsPackage = (ComponentsPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentsPackage.eNS_URI);
		InterfacesPackage theInterfacesPackage = (InterfacesPackage)EPackage.Registry.INSTANCE.getEPackage(InterfacesPackage.eNS_URI);
		PpumechanicalcomponentsPackage thePpumechanicalcomponentsPackage = (PpumechanicalcomponentsPackage)EPackage.Registry.INSTANCE.getEPackage(PpumechanicalcomponentsPackage.eNS_URI);
		MechanicalcomponentsPackage theMechanicalcomponentsPackage = (MechanicalcomponentsPackage)EPackage.Registry.INSTANCE.getEPackage(MechanicalcomponentsPackage.eNS_URI);
		PpubuscomponentsPackage thePpubuscomponentsPackage = (PpubuscomponentsPackage)EPackage.Registry.INSTANCE.getEPackage(PpubuscomponentsPackage.eNS_URI);
		ElectroniccomponentsPackage theElectroniccomponentsPackage = (ElectroniccomponentsPackage)EPackage.Registry.INSTANCE.getEPackage(ElectroniccomponentsPackage.eNS_URI);
		ComponentRepositoryPackage theComponentRepositoryPackage = (ComponentRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentRepositoryPackage.eNS_URI);
		StructuresPackage theStructuresPackage = (StructuresPackage)EPackage.Registry.INSTANCE.getEPackage(StructuresPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		powerSplitterEClass.getESuperTypes().add(theComponentsPackage.getSplitter());
		opticalSensorEClass.getESuperTypes().add(theComponentsPackage.getSensor());
		pneumaticPipeEClass.getESuperTypes().add(theComponentsPackage.getPipe());
		pneumaticSplitterEClass.getESuperTypes().add(theComponentsPackage.getSplitter());
		monostableCylinderEClass.getESuperTypes().add(theComponentsPackage.getCylinder());
		presenceSensorEClass.getESuperTypes().add(theComponentsPackage.getSensor());
		regularValveEClass.getESuperTypes().add(theComponentsPackage.getValve());
		frameEClass.getESuperTypes().add(theComponentsPackage.getMechanicalAssembly());
		inductiveSensorEClass.getESuperTypes().add(theComponentsPackage.getSensor());
		reedSwitchEClass.getESuperTypes().add(theElectroniccomponentsPackage.getSwitch());
		vacuumSwitchEClass.getESuperTypes().add(theElectroniccomponentsPackage.getSwitch());
		proportionalCylinderEClass.getESuperTypes().add(theComponentsPackage.getCylinder());
		bistableCylinderEClass.getESuperTypes().add(theComponentsPackage.getCylinder());
		waterSplitterEClass.getESuperTypes().add(theComponentsPackage.getSplitter());
		operationPanelEClass.getESuperTypes().add(theComponentsPackage.getPanel());
		powerCableEClass.getESuperTypes().add(theComponentsPackage.getCable());
		pressureSensorEClass.getESuperTypes().add(theComponentsPackage.getSensor());
		bottleSeperatorEClass.getESuperTypes().add(theComponentRepositoryPackage.getComponent());
		controllerEClass.getESuperTypes().add(theComponentRepositoryPackage.getComponent());

		// Initialize classes, features, and operations; add parameters
		initEClass(powerSplitterEClass, PowerSplitter.class, "PowerSplitter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPowerSplitter_Powersupply(), theComponentsPackage.getPowerSupply(), null, "powersupply", null, 1, 1, PowerSplitter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(opticalSensorEClass, OpticalSensor.class, "OpticalSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pneumaticPipeEClass, PneumaticPipe.class, "PneumaticPipe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pneumaticSplitterEClass, PneumaticSplitter.class, "PneumaticSplitter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPneumaticSplitter_Pneumaticsupply(), theInterfacesPackage.getPneumaticSupply(), null, "pneumaticsupply", null, 0, 1, PneumaticSplitter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(monostableCylinderEClass, MonostableCylinder.class, "MonostableCylinder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMonostableCylinder_Housing(), thePpumechanicalcomponentsPackage.getHousing(), null, "housing", null, 1, 1, MonostableCylinder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMonostableCylinder_Spring(), theMechanicalcomponentsPackage.getReturnSpring(), null, "spring", null, 1, 1, MonostableCylinder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMonostableCylinder_ReedSwitches(), this.getReedSwitch(), null, "reedSwitches", null, 1, -1, MonostableCylinder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMonostableCylinder_CylinderPart(), theComponentsPackage.getCylinderPart(), null, "cylinderPart", null, 1, -1, MonostableCylinder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMonostableCylinder_Valve(), this.getRegularValve(), null, "valve", null, 1, -1, MonostableCylinder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMonostableCylinder_BusSlave(), thePpubuscomponentsPackage.getProfibusDPSlave(), null, "busSlave", null, 1, -1, MonostableCylinder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMonostableCylinder_Pusher(), theComponentsPackage.getPusher(), null, "pusher", null, 0, 1, MonostableCylinder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(presenceSensorEClass, PresenceSensor.class, "PresenceSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(regularValveEClass, RegularValve.class, "RegularValve", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(frameEClass, Frame.class, "Frame", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFrame_Conveyorbelt(), theComponentsPackage.getConveyorBelt(), null, "conveyorbelt", null, 0, -1, Frame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inductiveSensorEClass, InductiveSensor.class, "InductiveSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reedSwitchEClass, ReedSwitch.class, "ReedSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vacuumSwitchEClass, VacuumSwitch.class, "VacuumSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(proportionalCylinderEClass, ProportionalCylinder.class, "ProportionalCylinder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bistableCylinderEClass, BistableCylinder.class, "BistableCylinder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(waterSplitterEClass, WaterSplitter.class, "WaterSplitter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWaterSplitter_Watersupply(), theInterfacesPackage.getWaterSupply(), null, "watersupply", null, 1, 1, WaterSplitter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationPanelEClass, OperationPanel.class, "OperationPanel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationPanel_Screwing_rack(), theInterfacesPackage.getScrewing(), null, "screwing_rack", null, 1, 1, OperationPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationPanel_Leds(), theElectroniccomponentsPackage.getLED(), null, "leds", null, 0, -1, OperationPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationPanel_Buttons(), theElectroniccomponentsPackage.getButton(), null, "buttons", null, 0, -1, OperationPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(powerCableEClass, PowerCable.class, "PowerCable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pressureSensorEClass, PressureSensor.class, "PressureSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bottleSeperatorEClass, BottleSeperator.class, "BottleSeperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBottleSeperator_Signalinterface(), theInterfacesPackage.getSignalInterface(), null, "signalinterface", null, 1, 1, BottleSeperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBottleSeperator_Pneumaticsupply(), theInterfacesPackage.getPneumaticSupply(), null, "pneumaticsupply", null, 1, 1, BottleSeperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBottleSeperator_Powersupply(), theComponentsPackage.getPowerSupply(), null, "powersupply", null, 1, 1, BottleSeperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBottleSeperator_Screwing_to_rack(), theInterfacesPackage.getScrewing(), null, "screwing_to_rack", null, 1, 1, BottleSeperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controllerEClass, Controller.class, "Controller", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getController_Powersupply(), theComponentsPackage.getPowerSupply(), null, "powersupply", null, 1, 1, Controller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getController_ControllerOf(), theStructuresPackage.getControlCabinet(), null, "controllerOf", null, 1, 1, Controller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PpucomponentsPackageImpl
