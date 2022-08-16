/**
 */
package domain.ppu.ppumodules.impl;

import domain.ppu.ppumodules.*;

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
public class PpumodulesFactoryImpl extends EFactoryImpl implements PpumodulesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PpumodulesFactory init() {
		try {
			PpumodulesFactory thePpumodulesFactory = (PpumodulesFactory)EPackage.Registry.INSTANCE.getEFactory(PpumodulesPackage.eNS_URI);
			if (thePpumodulesFactory != null) {
				return thePpumodulesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PpumodulesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PpumodulesFactoryImpl() {
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
			case PpumodulesPackage.POTENTIOMETER_MODULE: return createPotentiometerModule();
			case PpumodulesPackage.INDUCTIVE_SENSOR_MODULE: return createInductiveSensorModule();
			case PpumodulesPackage.PRESSURE_SENSOR_MODULE: return createPressureSensorModule();
			case PpumodulesPackage.PUSHER_MODULE: return createPusherModule();
			case PpumodulesPackage.RAMP_MODULE: return createRampModule();
			case PpumodulesPackage.MICROSWITCH_MODULE: return createMicroswitchModule();
			case PpumodulesPackage.MOTOR_MODULE: return createMotorModule();
			case PpumodulesPackage.MONOSTABLE_CYLINDER_MODULE: return createMonostableCylinderModule();
			case PpumodulesPackage.VACUUM_GRIPPER_MODULE: return createVacuumGripperModule();
			case PpumodulesPackage.PRESENCE_SENSOR_MODULE: return createPresenceSensorModule();
			case PpumodulesPackage.OPTICAL_SENSOR_MODULE: return createOpticalSensorModule();
			case PpumodulesPackage.CONVEYOR_BELT_MODULE: return createConveyorBeltModule();
			case PpumodulesPackage.SENSOR_MODULE: return createSensorModule();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PotentiometerModule createPotentiometerModule() {
		PotentiometerModuleImpl potentiometerModule = new PotentiometerModuleImpl();
		return potentiometerModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InductiveSensorModule createInductiveSensorModule() {
		InductiveSensorModuleImpl inductiveSensorModule = new InductiveSensorModuleImpl();
		return inductiveSensorModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PressureSensorModule createPressureSensorModule() {
		PressureSensorModuleImpl pressureSensorModule = new PressureSensorModuleImpl();
		return pressureSensorModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PusherModule createPusherModule() {
		PusherModuleImpl pusherModule = new PusherModuleImpl();
		return pusherModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RampModule createRampModule() {
		RampModuleImpl rampModule = new RampModuleImpl();
		return rampModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicroswitchModule createMicroswitchModule() {
		MicroswitchModuleImpl microswitchModule = new MicroswitchModuleImpl();
		return microswitchModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MotorModule createMotorModule() {
		MotorModuleImpl motorModule = new MotorModuleImpl();
		return motorModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonostableCylinderModule createMonostableCylinderModule() {
		MonostableCylinderModuleImpl monostableCylinderModule = new MonostableCylinderModuleImpl();
		return monostableCylinderModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VacuumGripperModule createVacuumGripperModule() {
		VacuumGripperModuleImpl vacuumGripperModule = new VacuumGripperModuleImpl();
		return vacuumGripperModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresenceSensorModule createPresenceSensorModule() {
		PresenceSensorModuleImpl presenceSensorModule = new PresenceSensorModuleImpl();
		return presenceSensorModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpticalSensorModule createOpticalSensorModule() {
		OpticalSensorModuleImpl opticalSensorModule = new OpticalSensorModuleImpl();
		return opticalSensorModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConveyorBeltModule createConveyorBeltModule() {
		ConveyorBeltModuleImpl conveyorBeltModule = new ConveyorBeltModuleImpl();
		return conveyorBeltModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorModule createSensorModule() {
		SensorModuleImpl sensorModule = new SensorModuleImpl();
		return sensorModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PpumodulesPackage getPpumodulesPackage() {
		return (PpumodulesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PpumodulesPackage getPackage() {
		return PpumodulesPackage.eINSTANCE;
	}

} //PpumodulesFactoryImpl
