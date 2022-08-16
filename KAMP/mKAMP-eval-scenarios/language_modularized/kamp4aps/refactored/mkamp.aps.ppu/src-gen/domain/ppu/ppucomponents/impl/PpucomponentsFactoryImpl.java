/**
 */
package domain.ppu.ppucomponents.impl;

import domain.ppu.ppucomponents.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PpucomponentsFactoryImpl extends EFactoryImpl implements PpucomponentsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PpucomponentsFactory init() {
		try {
			PpucomponentsFactory thePpucomponentsFactory = (PpucomponentsFactory)EPackage.Registry.INSTANCE.getEFactory(PpucomponentsPackage.eNS_URI);
			if (thePpucomponentsFactory != null) {
				return thePpucomponentsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PpucomponentsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PpucomponentsFactoryImpl() {
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
			case PpucomponentsPackage.POWER_SPLITTER: return createPowerSplitter();
			case PpucomponentsPackage.OPTICAL_SENSOR: return createOpticalSensor();
			case PpucomponentsPackage.PNEUMATIC_PIPE: return createPneumaticPipe();
			case PpucomponentsPackage.PNEUMATIC_SPLITTER: return createPneumaticSplitter();
			case PpucomponentsPackage.MONOSTABLE_CYLINDER: return createMonostableCylinder();
			case PpucomponentsPackage.PRESENCE_SENSOR: return createPresenceSensor();
			case PpucomponentsPackage.REGULAR_VALVE: return createRegularValve();
			case PpucomponentsPackage.FRAME: return createFrame();
			case PpucomponentsPackage.INDUCTIVE_SENSOR: return createInductiveSensor();
			case PpucomponentsPackage.REED_SWITCH: return createReedSwitch();
			case PpucomponentsPackage.VACUUM_SWITCH: return createVacuumSwitch();
			case PpucomponentsPackage.PROPORTIONAL_CYLINDER: return createProportionalCylinder();
			case PpucomponentsPackage.BISTABLE_CYLINDER: return createBistableCylinder();
			case PpucomponentsPackage.WATER_SPLITTER: return createWaterSplitter();
			case PpucomponentsPackage.OPERATION_PANEL: return createOperationPanel();
			case PpucomponentsPackage.POWER_CABLE: return createPowerCable();
			case PpucomponentsPackage.PRESSURE_SENSOR: return createPressureSensor();
			case PpucomponentsPackage.BOTTLE_SEPERATOR: return createBottleSeperator();
			case PpucomponentsPackage.CONTROLLER: return createController();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerSplitter createPowerSplitter() {
		PowerSplitterImpl powerSplitter = new PowerSplitterImpl();
		return powerSplitter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpticalSensor createOpticalSensor() {
		OpticalSensorImpl opticalSensor = new OpticalSensorImpl();
		return opticalSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PneumaticPipe createPneumaticPipe() {
		PneumaticPipeImpl pneumaticPipe = new PneumaticPipeImpl();
		return pneumaticPipe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PneumaticSplitter createPneumaticSplitter() {
		PneumaticSplitterImpl pneumaticSplitter = new PneumaticSplitterImpl();
		return pneumaticSplitter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonostableCylinder createMonostableCylinder() {
		MonostableCylinderImpl monostableCylinder = new MonostableCylinderImpl();
		return monostableCylinder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresenceSensor createPresenceSensor() {
		PresenceSensorImpl presenceSensor = new PresenceSensorImpl();
		return presenceSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegularValve createRegularValve() {
		RegularValveImpl regularValve = new RegularValveImpl();
		return regularValve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Frame createFrame() {
		FrameImpl frame = new FrameImpl();
		return frame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InductiveSensor createInductiveSensor() {
		InductiveSensorImpl inductiveSensor = new InductiveSensorImpl();
		return inductiveSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReedSwitch createReedSwitch() {
		ReedSwitchImpl reedSwitch = new ReedSwitchImpl();
		return reedSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VacuumSwitch createVacuumSwitch() {
		VacuumSwitchImpl vacuumSwitch = new VacuumSwitchImpl();
		return vacuumSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProportionalCylinder createProportionalCylinder() {
		ProportionalCylinderImpl proportionalCylinder = new ProportionalCylinderImpl();
		return proportionalCylinder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BistableCylinder createBistableCylinder() {
		BistableCylinderImpl bistableCylinder = new BistableCylinderImpl();
		return bistableCylinder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaterSplitter createWaterSplitter() {
		WaterSplitterImpl waterSplitter = new WaterSplitterImpl();
		return waterSplitter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationPanel createOperationPanel() {
		OperationPanelImpl operationPanel = new OperationPanelImpl();
		return operationPanel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerCable createPowerCable() {
		PowerCableImpl powerCable = new PowerCableImpl();
		return powerCable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PressureSensor createPressureSensor() {
		PressureSensorImpl pressureSensor = new PressureSensorImpl();
		return pressureSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BottleSeperator createBottleSeperator() {
		BottleSeperatorImpl bottleSeperator = new BottleSeperatorImpl();
		return bottleSeperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controller createController() {
		ControllerImpl controller = new ControllerImpl();
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PpucomponentsPackage getPpucomponentsPackage() {
		return (PpucomponentsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PpucomponentsPackage getPackage() {
		return PpucomponentsPackage.eINSTANCE;
	}

} //PpucomponentsFactoryImpl
