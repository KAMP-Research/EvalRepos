/**
 */
package domain.aps.components.impl;

import domain.aps.components.*;

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
public class ComponentsFactoryImpl extends EFactoryImpl implements ComponentsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComponentsFactory init() {
		try {
			ComponentsFactory theComponentsFactory = (ComponentsFactory)EPackage.Registry.INSTANCE.getEFactory(ComponentsPackage.eNS_URI);
			if (theComponentsFactory != null) {
				return theComponentsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ComponentsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentsFactoryImpl() {
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
			case ComponentsPackage.POWER_SUPPLY: return createPowerSupply();
			case ComponentsPackage.CONVEYOR_BELT: return createConveyorBelt();
			case ComponentsPackage.FIXTURE: return createFixture();
			case ComponentsPackage.SENSOR: return createSensor();
			case ComponentsPackage.DISPENSER: return createDispenser();
			case ComponentsPackage.TANK: return createTank();
			case ComponentsPackage.PUSHER: return createPusher();
			case ComponentsPackage.CORNER: return createCorner();
			case ComponentsPackage.RACK: return createRack();
			case ComponentsPackage.COMPRESSOR: return createCompressor();
			case ComponentsPackage.REGULAR_RAMP: return createRegularRamp();
			case ComponentsPackage.TURNING_TABLE: return createTurningTable();
			case ComponentsPackage.CYLINDER_PART: return createCylinderPart();
			case ComponentsPackage.SIMPLE_MOTOR: return createSimpleMotor();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerSupply createPowerSupply() {
		PowerSupplyImpl powerSupply = new PowerSupplyImpl();
		return powerSupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConveyorBelt createConveyorBelt() {
		ConveyorBeltImpl conveyorBelt = new ConveyorBeltImpl();
		return conveyorBelt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fixture createFixture() {
		FixtureImpl fixture = new FixtureImpl();
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensor createSensor() {
		SensorImpl sensor = new SensorImpl();
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dispenser createDispenser() {
		DispenserImpl dispenser = new DispenserImpl();
		return dispenser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tank createTank() {
		TankImpl tank = new TankImpl();
		return tank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pusher createPusher() {
		PusherImpl pusher = new PusherImpl();
		return pusher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Corner createCorner() {
		CornerImpl corner = new CornerImpl();
		return corner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rack createRack() {
		RackImpl rack = new RackImpl();
		return rack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compressor createCompressor() {
		CompressorImpl compressor = new CompressorImpl();
		return compressor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegularRamp createRegularRamp() {
		RegularRampImpl regularRamp = new RegularRampImpl();
		return regularRamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurningTable createTurningTable() {
		TurningTableImpl turningTable = new TurningTableImpl();
		return turningTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CylinderPart createCylinderPart() {
		CylinderPartImpl cylinderPart = new CylinderPartImpl();
		return cylinderPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleMotor createSimpleMotor() {
		SimpleMotorImpl simpleMotor = new SimpleMotorImpl();
		return simpleMotor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentsPackage getComponentsPackage() {
		return (ComponentsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ComponentsPackage getPackage() {
		return ComponentsPackage.eINSTANCE;
	}

} //ComponentsFactoryImpl
