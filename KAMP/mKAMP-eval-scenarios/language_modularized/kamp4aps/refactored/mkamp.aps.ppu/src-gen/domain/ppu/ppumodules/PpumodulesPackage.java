/**
 */
package domain.ppu.ppumodules;

import domain.as.ModuleRepository.ModuleRepositoryPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see domain.ppu.ppumodules.PpumodulesFactory
 * @model kind="package"
 * @generated
 */
public interface PpumodulesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ppumodules";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ppumodules";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ppumodules";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PpumodulesPackage eINSTANCE = domain.ppu.ppumodules.impl.PpumodulesPackageImpl.init();

	/**
	 * The meta object id for the '{@link domain.ppu.ppumodules.impl.PotentiometerModuleImpl <em>Potentiometer Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.ppu.ppumodules.impl.PotentiometerModuleImpl
	 * @see domain.ppu.ppumodules.impl.PpumodulesPackageImpl#getPotentiometerModule()
	 * @generated
	 */
	int POTENTIOMETER_MODULE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIOMETER_MODULE__ID = ModuleRepositoryPackage.MODULE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIOMETER_MODULE__NAME = ModuleRepositoryPackage.MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIOMETER_MODULE__PARENT_ENTITY = ModuleRepositoryPackage.MODULE__PARENT_ENTITY;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIOMETER_MODULE__MODULES = ModuleRepositoryPackage.MODULE__MODULES;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIOMETER_MODULE__COMPONENTS = ModuleRepositoryPackage.MODULE__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIOMETER_MODULE__INTERFACES = ModuleRepositoryPackage.MODULE__INTERFACES;

	/**
	 * The feature id for the '<em><b>Poti</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIOMETER_MODULE__POTI = ModuleRepositoryPackage.MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Potentiometer Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIOMETER_MODULE_FEATURE_COUNT = ModuleRepositoryPackage.MODULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Potentiometer Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIOMETER_MODULE_OPERATION_COUNT = ModuleRepositoryPackage.MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.ppu.ppumodules.impl.InductiveSensorModuleImpl <em>Inductive Sensor Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.ppu.ppumodules.impl.InductiveSensorModuleImpl
	 * @see domain.ppu.ppumodules.impl.PpumodulesPackageImpl#getInductiveSensorModule()
	 * @generated
	 */
	int INDUCTIVE_SENSOR_MODULE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTIVE_SENSOR_MODULE__ID = ModuleRepositoryPackage.MODULE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTIVE_SENSOR_MODULE__NAME = ModuleRepositoryPackage.MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTIVE_SENSOR_MODULE__PARENT_ENTITY = ModuleRepositoryPackage.MODULE__PARENT_ENTITY;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTIVE_SENSOR_MODULE__MODULES = ModuleRepositoryPackage.MODULE__MODULES;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTIVE_SENSOR_MODULE__COMPONENTS = ModuleRepositoryPackage.MODULE__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTIVE_SENSOR_MODULE__INTERFACES = ModuleRepositoryPackage.MODULE__INTERFACES;

	/**
	 * The feature id for the '<em><b>Inductive Sensor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTIVE_SENSOR_MODULE__INDUCTIVE_SENSOR = ModuleRepositoryPackage.MODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bus Slave</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTIVE_SENSOR_MODULE__BUS_SLAVE = ModuleRepositoryPackage.MODULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Inductive Sensor Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTIVE_SENSOR_MODULE_FEATURE_COUNT = ModuleRepositoryPackage.MODULE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Inductive Sensor Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTIVE_SENSOR_MODULE_OPERATION_COUNT = ModuleRepositoryPackage.MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.ppu.ppumodules.impl.PressureSensorModuleImpl <em>Pressure Sensor Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.ppu.ppumodules.impl.PressureSensorModuleImpl
	 * @see domain.ppu.ppumodules.impl.PpumodulesPackageImpl#getPressureSensorModule()
	 * @generated
	 */
	int PRESSURE_SENSOR_MODULE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR_MODULE__ID = ModuleRepositoryPackage.MODULE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR_MODULE__NAME = ModuleRepositoryPackage.MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR_MODULE__PARENT_ENTITY = ModuleRepositoryPackage.MODULE__PARENT_ENTITY;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR_MODULE__MODULES = ModuleRepositoryPackage.MODULE__MODULES;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR_MODULE__COMPONENTS = ModuleRepositoryPackage.MODULE__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR_MODULE__INTERFACES = ModuleRepositoryPackage.MODULE__INTERFACES;

	/**
	 * The number of structural features of the '<em>Pressure Sensor Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR_MODULE_FEATURE_COUNT = ModuleRepositoryPackage.MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pressure Sensor Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR_MODULE_OPERATION_COUNT = ModuleRepositoryPackage.MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.ppu.ppumodules.impl.PusherModuleImpl <em>Pusher Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.ppu.ppumodules.impl.PusherModuleImpl
	 * @see domain.ppu.ppumodules.impl.PpumodulesPackageImpl#getPusherModule()
	 * @generated
	 */
	int PUSHER_MODULE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHER_MODULE__ID = ModuleRepositoryPackage.MODULE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHER_MODULE__NAME = ModuleRepositoryPackage.MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHER_MODULE__PARENT_ENTITY = ModuleRepositoryPackage.MODULE__PARENT_ENTITY;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHER_MODULE__MODULES = ModuleRepositoryPackage.MODULE__MODULES;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHER_MODULE__COMPONENTS = ModuleRepositoryPackage.MODULE__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHER_MODULE__INTERFACES = ModuleRepositoryPackage.MODULE__INTERFACES;

	/**
	 * The number of structural features of the '<em>Pusher Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHER_MODULE_FEATURE_COUNT = ModuleRepositoryPackage.MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pusher Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHER_MODULE_OPERATION_COUNT = ModuleRepositoryPackage.MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.ppu.ppumodules.impl.RampModuleImpl <em>Ramp Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.ppu.ppumodules.impl.RampModuleImpl
	 * @see domain.ppu.ppumodules.impl.PpumodulesPackageImpl#getRampModule()
	 * @generated
	 */
	int RAMP_MODULE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_MODULE__ID = ModuleRepositoryPackage.MODULE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_MODULE__NAME = ModuleRepositoryPackage.MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_MODULE__PARENT_ENTITY = ModuleRepositoryPackage.MODULE__PARENT_ENTITY;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_MODULE__MODULES = ModuleRepositoryPackage.MODULE__MODULES;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_MODULE__COMPONENTS = ModuleRepositoryPackage.MODULE__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_MODULE__INTERFACES = ModuleRepositoryPackage.MODULE__INTERFACES;

	/**
	 * The number of structural features of the '<em>Ramp Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_MODULE_FEATURE_COUNT = ModuleRepositoryPackage.MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ramp Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_MODULE_OPERATION_COUNT = ModuleRepositoryPackage.MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.ppu.ppumodules.impl.MicroswitchModuleImpl <em>Microswitch Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.ppu.ppumodules.impl.MicroswitchModuleImpl
	 * @see domain.ppu.ppumodules.impl.PpumodulesPackageImpl#getMicroswitchModule()
	 * @generated
	 */
	int MICROSWITCH_MODULE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSWITCH_MODULE__ID = ModuleRepositoryPackage.MODULE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSWITCH_MODULE__NAME = ModuleRepositoryPackage.MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSWITCH_MODULE__PARENT_ENTITY = ModuleRepositoryPackage.MODULE__PARENT_ENTITY;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSWITCH_MODULE__MODULES = ModuleRepositoryPackage.MODULE__MODULES;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSWITCH_MODULE__COMPONENTS = ModuleRepositoryPackage.MODULE__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSWITCH_MODULE__INTERFACES = ModuleRepositoryPackage.MODULE__INTERFACES;

	/**
	 * The feature id for the '<em><b>Bus Slave</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSWITCH_MODULE__BUS_SLAVE = ModuleRepositoryPackage.MODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Switch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSWITCH_MODULE__SWITCH = ModuleRepositoryPackage.MODULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Turningtable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSWITCH_MODULE__TURNINGTABLE = ModuleRepositoryPackage.MODULE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Microswitch Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSWITCH_MODULE_FEATURE_COUNT = ModuleRepositoryPackage.MODULE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Microswitch Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSWITCH_MODULE_OPERATION_COUNT = ModuleRepositoryPackage.MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.ppu.ppumodules.impl.MotorModuleImpl <em>Motor Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.ppu.ppumodules.impl.MotorModuleImpl
	 * @see domain.ppu.ppumodules.impl.PpumodulesPackageImpl#getMotorModule()
	 * @generated
	 */
	int MOTOR_MODULE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_MODULE__ID = ModuleRepositoryPackage.MODULE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_MODULE__NAME = ModuleRepositoryPackage.MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_MODULE__PARENT_ENTITY = ModuleRepositoryPackage.MODULE__PARENT_ENTITY;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_MODULE__MODULES = ModuleRepositoryPackage.MODULE__MODULES;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_MODULE__COMPONENTS = ModuleRepositoryPackage.MODULE__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_MODULE__INTERFACES = ModuleRepositoryPackage.MODULE__INTERFACES;

	/**
	 * The feature id for the '<em><b>Simple Motor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_MODULE__SIMPLE_MOTOR = ModuleRepositoryPackage.MODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bus Slave</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_MODULE__BUS_SLAVE = ModuleRepositoryPackage.MODULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bus Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_MODULE__BUS_BOX = ModuleRepositoryPackage.MODULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bus Cable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_MODULE__BUS_CABLE = ModuleRepositoryPackage.MODULE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Motor Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_MODULE_FEATURE_COUNT = ModuleRepositoryPackage.MODULE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Motor Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_MODULE_OPERATION_COUNT = ModuleRepositoryPackage.MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.ppu.ppumodules.impl.MonostableCylinderModuleImpl <em>Monostable Cylinder Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.ppu.ppumodules.impl.MonostableCylinderModuleImpl
	 * @see domain.ppu.ppumodules.impl.PpumodulesPackageImpl#getMonostableCylinderModule()
	 * @generated
	 */
	int MONOSTABLE_CYLINDER_MODULE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOSTABLE_CYLINDER_MODULE__ID = ModuleRepositoryPackage.MODULE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOSTABLE_CYLINDER_MODULE__NAME = ModuleRepositoryPackage.MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOSTABLE_CYLINDER_MODULE__PARENT_ENTITY = ModuleRepositoryPackage.MODULE__PARENT_ENTITY;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOSTABLE_CYLINDER_MODULE__MODULES = ModuleRepositoryPackage.MODULE__MODULES;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOSTABLE_CYLINDER_MODULE__COMPONENTS = ModuleRepositoryPackage.MODULE__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOSTABLE_CYLINDER_MODULE__INTERFACES = ModuleRepositoryPackage.MODULE__INTERFACES;

	/**
	 * The number of structural features of the '<em>Monostable Cylinder Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOSTABLE_CYLINDER_MODULE_FEATURE_COUNT = ModuleRepositoryPackage.MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Monostable Cylinder Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOSTABLE_CYLINDER_MODULE_OPERATION_COUNT = ModuleRepositoryPackage.MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.ppu.ppumodules.impl.VacuumGripperModuleImpl <em>Vacuum Gripper Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.ppu.ppumodules.impl.VacuumGripperModuleImpl
	 * @see domain.ppu.ppumodules.impl.PpumodulesPackageImpl#getVacuumGripperModule()
	 * @generated
	 */
	int VACUUM_GRIPPER_MODULE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACUUM_GRIPPER_MODULE__ID = ModuleRepositoryPackage.MODULE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACUUM_GRIPPER_MODULE__NAME = ModuleRepositoryPackage.MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACUUM_GRIPPER_MODULE__PARENT_ENTITY = ModuleRepositoryPackage.MODULE__PARENT_ENTITY;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACUUM_GRIPPER_MODULE__MODULES = ModuleRepositoryPackage.MODULE__MODULES;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACUUM_GRIPPER_MODULE__COMPONENTS = ModuleRepositoryPackage.MODULE__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACUUM_GRIPPER_MODULE__INTERFACES = ModuleRepositoryPackage.MODULE__INTERFACES;

	/**
	 * The number of structural features of the '<em>Vacuum Gripper Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACUUM_GRIPPER_MODULE_FEATURE_COUNT = ModuleRepositoryPackage.MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Vacuum Gripper Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACUUM_GRIPPER_MODULE_OPERATION_COUNT = ModuleRepositoryPackage.MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.ppu.ppumodules.impl.PresenceSensorModuleImpl <em>Presence Sensor Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.ppu.ppumodules.impl.PresenceSensorModuleImpl
	 * @see domain.ppu.ppumodules.impl.PpumodulesPackageImpl#getPresenceSensorModule()
	 * @generated
	 */
	int PRESENCE_SENSOR_MODULE = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENCE_SENSOR_MODULE__ID = ModuleRepositoryPackage.MODULE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENCE_SENSOR_MODULE__NAME = ModuleRepositoryPackage.MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENCE_SENSOR_MODULE__PARENT_ENTITY = ModuleRepositoryPackage.MODULE__PARENT_ENTITY;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENCE_SENSOR_MODULE__MODULES = ModuleRepositoryPackage.MODULE__MODULES;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENCE_SENSOR_MODULE__COMPONENTS = ModuleRepositoryPackage.MODULE__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENCE_SENSOR_MODULE__INTERFACES = ModuleRepositoryPackage.MODULE__INTERFACES;

	/**
	 * The feature id for the '<em><b>Presence Sensor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENCE_SENSOR_MODULE__PRESENCE_SENSOR = ModuleRepositoryPackage.MODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bus Slave</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENCE_SENSOR_MODULE__BUS_SLAVE = ModuleRepositoryPackage.MODULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Presence Sensor Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENCE_SENSOR_MODULE_FEATURE_COUNT = ModuleRepositoryPackage.MODULE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Presence Sensor Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENCE_SENSOR_MODULE_OPERATION_COUNT = ModuleRepositoryPackage.MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.ppu.ppumodules.impl.OpticalSensorModuleImpl <em>Optical Sensor Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.ppu.ppumodules.impl.OpticalSensorModuleImpl
	 * @see domain.ppu.ppumodules.impl.PpumodulesPackageImpl#getOpticalSensorModule()
	 * @generated
	 */
	int OPTICAL_SENSOR_MODULE = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTICAL_SENSOR_MODULE__ID = ModuleRepositoryPackage.MODULE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTICAL_SENSOR_MODULE__NAME = ModuleRepositoryPackage.MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTICAL_SENSOR_MODULE__PARENT_ENTITY = ModuleRepositoryPackage.MODULE__PARENT_ENTITY;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTICAL_SENSOR_MODULE__MODULES = ModuleRepositoryPackage.MODULE__MODULES;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTICAL_SENSOR_MODULE__COMPONENTS = ModuleRepositoryPackage.MODULE__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTICAL_SENSOR_MODULE__INTERFACES = ModuleRepositoryPackage.MODULE__INTERFACES;

	/**
	 * The feature id for the '<em><b>Optical Sensor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTICAL_SENSOR_MODULE__OPTICAL_SENSOR = ModuleRepositoryPackage.MODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bus Slave</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTICAL_SENSOR_MODULE__BUS_SLAVE = ModuleRepositoryPackage.MODULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Optical Sensor Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTICAL_SENSOR_MODULE_FEATURE_COUNT = ModuleRepositoryPackage.MODULE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Optical Sensor Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTICAL_SENSOR_MODULE_OPERATION_COUNT = ModuleRepositoryPackage.MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.ppu.ppumodules.impl.ConveyorBeltModuleImpl <em>Conveyor Belt Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.ppu.ppumodules.impl.ConveyorBeltModuleImpl
	 * @see domain.ppu.ppumodules.impl.PpumodulesPackageImpl#getConveyorBeltModule()
	 * @generated
	 */
	int CONVEYOR_BELT_MODULE = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT_MODULE__ID = ModuleRepositoryPackage.MODULE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT_MODULE__NAME = ModuleRepositoryPackage.MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT_MODULE__PARENT_ENTITY = ModuleRepositoryPackage.MODULE__PARENT_ENTITY;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT_MODULE__MODULES = ModuleRepositoryPackage.MODULE__MODULES;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT_MODULE__COMPONENTS = ModuleRepositoryPackage.MODULE__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT_MODULE__INTERFACES = ModuleRepositoryPackage.MODULE__INTERFACES;

	/**
	 * The feature id for the '<em><b>Rubber Band</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT_MODULE__RUBBER_BAND = ModuleRepositoryPackage.MODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT_MODULE__FRAME = ModuleRepositoryPackage.MODULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Conveyor Belt Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT_MODULE_FEATURE_COUNT = ModuleRepositoryPackage.MODULE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Conveyor Belt Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT_MODULE_OPERATION_COUNT = ModuleRepositoryPackage.MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.ppu.ppumodules.impl.SensorModuleImpl <em>Sensor Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.ppu.ppumodules.impl.SensorModuleImpl
	 * @see domain.ppu.ppumodules.impl.PpumodulesPackageImpl#getSensorModule()
	 * @generated
	 */
	int SENSOR_MODULE = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_MODULE__ID = ModuleRepositoryPackage.MODULE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_MODULE__NAME = ModuleRepositoryPackage.MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_MODULE__PARENT_ENTITY = ModuleRepositoryPackage.MODULE__PARENT_ENTITY;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_MODULE__MODULES = ModuleRepositoryPackage.MODULE__MODULES;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_MODULE__COMPONENTS = ModuleRepositoryPackage.MODULE__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_MODULE__INTERFACES = ModuleRepositoryPackage.MODULE__INTERFACES;

	/**
	 * The number of structural features of the '<em>Sensor Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_MODULE_FEATURE_COUNT = ModuleRepositoryPackage.MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sensor Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_MODULE_OPERATION_COUNT = ModuleRepositoryPackage.MODULE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link domain.ppu.ppumodules.PotentiometerModule <em>Potentiometer Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Potentiometer Module</em>'.
	 * @see domain.ppu.ppumodules.PotentiometerModule
	 * @generated
	 */
	EClass getPotentiometerModule();

	/**
	 * Returns the meta object for the containment reference '{@link domain.ppu.ppumodules.PotentiometerModule#getPoti <em>Poti</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Poti</em>'.
	 * @see domain.ppu.ppumodules.PotentiometerModule#getPoti()
	 * @see #getPotentiometerModule()
	 * @generated
	 */
	EReference getPotentiometerModule_Poti();

	/**
	 * Returns the meta object for class '{@link domain.ppu.ppumodules.InductiveSensorModule <em>Inductive Sensor Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inductive Sensor Module</em>'.
	 * @see domain.ppu.ppumodules.InductiveSensorModule
	 * @generated
	 */
	EClass getInductiveSensorModule();

	/**
	 * Returns the meta object for the containment reference list '{@link domain.ppu.ppumodules.InductiveSensorModule#getInductiveSensor <em>Inductive Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inductive Sensor</em>'.
	 * @see domain.ppu.ppumodules.InductiveSensorModule#getInductiveSensor()
	 * @see #getInductiveSensorModule()
	 * @generated
	 */
	EReference getInductiveSensorModule_InductiveSensor();

	/**
	 * Returns the meta object for the containment reference list '{@link domain.ppu.ppumodules.InductiveSensorModule#getBusSlave <em>Bus Slave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bus Slave</em>'.
	 * @see domain.ppu.ppumodules.InductiveSensorModule#getBusSlave()
	 * @see #getInductiveSensorModule()
	 * @generated
	 */
	EReference getInductiveSensorModule_BusSlave();

	/**
	 * Returns the meta object for class '{@link domain.ppu.ppumodules.PressureSensorModule <em>Pressure Sensor Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pressure Sensor Module</em>'.
	 * @see domain.ppu.ppumodules.PressureSensorModule
	 * @generated
	 */
	EClass getPressureSensorModule();

	/**
	 * Returns the meta object for class '{@link domain.ppu.ppumodules.PusherModule <em>Pusher Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pusher Module</em>'.
	 * @see domain.ppu.ppumodules.PusherModule
	 * @generated
	 */
	EClass getPusherModule();

	/**
	 * Returns the meta object for class '{@link domain.ppu.ppumodules.RampModule <em>Ramp Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ramp Module</em>'.
	 * @see domain.ppu.ppumodules.RampModule
	 * @generated
	 */
	EClass getRampModule();

	/**
	 * Returns the meta object for class '{@link domain.ppu.ppumodules.MicroswitchModule <em>Microswitch Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Microswitch Module</em>'.
	 * @see domain.ppu.ppumodules.MicroswitchModule
	 * @generated
	 */
	EClass getMicroswitchModule();

	/**
	 * Returns the meta object for the containment reference list '{@link domain.ppu.ppumodules.MicroswitchModule#getBusSlave <em>Bus Slave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bus Slave</em>'.
	 * @see domain.ppu.ppumodules.MicroswitchModule#getBusSlave()
	 * @see #getMicroswitchModule()
	 * @generated
	 */
	EReference getMicroswitchModule_BusSlave();

	/**
	 * Returns the meta object for the containment reference '{@link domain.ppu.ppumodules.MicroswitchModule#getSwitch <em>Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Switch</em>'.
	 * @see domain.ppu.ppumodules.MicroswitchModule#getSwitch()
	 * @see #getMicroswitchModule()
	 * @generated
	 */
	EReference getMicroswitchModule_Switch();

	/**
	 * Returns the meta object for the reference '{@link domain.ppu.ppumodules.MicroswitchModule#getTurningtable <em>Turningtable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Turningtable</em>'.
	 * @see domain.ppu.ppumodules.MicroswitchModule#getTurningtable()
	 * @see #getMicroswitchModule()
	 * @generated
	 */
	EReference getMicroswitchModule_Turningtable();

	/**
	 * Returns the meta object for class '{@link domain.ppu.ppumodules.MotorModule <em>Motor Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Motor Module</em>'.
	 * @see domain.ppu.ppumodules.MotorModule
	 * @generated
	 */
	EClass getMotorModule();

	/**
	 * Returns the meta object for the containment reference list '{@link domain.ppu.ppumodules.MotorModule#getSimpleMotor <em>Simple Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Simple Motor</em>'.
	 * @see domain.ppu.ppumodules.MotorModule#getSimpleMotor()
	 * @see #getMotorModule()
	 * @generated
	 */
	EReference getMotorModule_SimpleMotor();

	/**
	 * Returns the meta object for the containment reference list '{@link domain.ppu.ppumodules.MotorModule#getBusSlave <em>Bus Slave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bus Slave</em>'.
	 * @see domain.ppu.ppumodules.MotorModule#getBusSlave()
	 * @see #getMotorModule()
	 * @generated
	 */
	EReference getMotorModule_BusSlave();

	/**
	 * Returns the meta object for the containment reference '{@link domain.ppu.ppumodules.MotorModule#getBusBox <em>Bus Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bus Box</em>'.
	 * @see domain.ppu.ppumodules.MotorModule#getBusBox()
	 * @see #getMotorModule()
	 * @generated
	 */
	EReference getMotorModule_BusBox();

	/**
	 * Returns the meta object for the containment reference list '{@link domain.ppu.ppumodules.MotorModule#getBusCable <em>Bus Cable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bus Cable</em>'.
	 * @see domain.ppu.ppumodules.MotorModule#getBusCable()
	 * @see #getMotorModule()
	 * @generated
	 */
	EReference getMotorModule_BusCable();

	/**
	 * Returns the meta object for class '{@link domain.ppu.ppumodules.MonostableCylinderModule <em>Monostable Cylinder Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monostable Cylinder Module</em>'.
	 * @see domain.ppu.ppumodules.MonostableCylinderModule
	 * @generated
	 */
	EClass getMonostableCylinderModule();

	/**
	 * Returns the meta object for class '{@link domain.ppu.ppumodules.VacuumGripperModule <em>Vacuum Gripper Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vacuum Gripper Module</em>'.
	 * @see domain.ppu.ppumodules.VacuumGripperModule
	 * @generated
	 */
	EClass getVacuumGripperModule();

	/**
	 * Returns the meta object for class '{@link domain.ppu.ppumodules.PresenceSensorModule <em>Presence Sensor Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Presence Sensor Module</em>'.
	 * @see domain.ppu.ppumodules.PresenceSensorModule
	 * @generated
	 */
	EClass getPresenceSensorModule();

	/**
	 * Returns the meta object for the containment reference list '{@link domain.ppu.ppumodules.PresenceSensorModule#getPresenceSensor <em>Presence Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Presence Sensor</em>'.
	 * @see domain.ppu.ppumodules.PresenceSensorModule#getPresenceSensor()
	 * @see #getPresenceSensorModule()
	 * @generated
	 */
	EReference getPresenceSensorModule_PresenceSensor();

	/**
	 * Returns the meta object for the containment reference list '{@link domain.ppu.ppumodules.PresenceSensorModule#getBusSlave <em>Bus Slave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bus Slave</em>'.
	 * @see domain.ppu.ppumodules.PresenceSensorModule#getBusSlave()
	 * @see #getPresenceSensorModule()
	 * @generated
	 */
	EReference getPresenceSensorModule_BusSlave();

	/**
	 * Returns the meta object for class '{@link domain.ppu.ppumodules.OpticalSensorModule <em>Optical Sensor Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Optical Sensor Module</em>'.
	 * @see domain.ppu.ppumodules.OpticalSensorModule
	 * @generated
	 */
	EClass getOpticalSensorModule();

	/**
	 * Returns the meta object for the containment reference list '{@link domain.ppu.ppumodules.OpticalSensorModule#getOpticalSensor <em>Optical Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Optical Sensor</em>'.
	 * @see domain.ppu.ppumodules.OpticalSensorModule#getOpticalSensor()
	 * @see #getOpticalSensorModule()
	 * @generated
	 */
	EReference getOpticalSensorModule_OpticalSensor();

	/**
	 * Returns the meta object for the containment reference list '{@link domain.ppu.ppumodules.OpticalSensorModule#getBusSlave <em>Bus Slave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bus Slave</em>'.
	 * @see domain.ppu.ppumodules.OpticalSensorModule#getBusSlave()
	 * @see #getOpticalSensorModule()
	 * @generated
	 */
	EReference getOpticalSensorModule_BusSlave();

	/**
	 * Returns the meta object for class '{@link domain.ppu.ppumodules.ConveyorBeltModule <em>Conveyor Belt Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conveyor Belt Module</em>'.
	 * @see domain.ppu.ppumodules.ConveyorBeltModule
	 * @generated
	 */
	EClass getConveyorBeltModule();

	/**
	 * Returns the meta object for the containment reference '{@link domain.ppu.ppumodules.ConveyorBeltModule#getRubberBand <em>Rubber Band</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rubber Band</em>'.
	 * @see domain.ppu.ppumodules.ConveyorBeltModule#getRubberBand()
	 * @see #getConveyorBeltModule()
	 * @generated
	 */
	EReference getConveyorBeltModule_RubberBand();

	/**
	 * Returns the meta object for the containment reference '{@link domain.ppu.ppumodules.ConveyorBeltModule#getFrame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Frame</em>'.
	 * @see domain.ppu.ppumodules.ConveyorBeltModule#getFrame()
	 * @see #getConveyorBeltModule()
	 * @generated
	 */
	EReference getConveyorBeltModule_Frame();

	/**
	 * Returns the meta object for class '{@link domain.ppu.ppumodules.SensorModule <em>Sensor Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor Module</em>'.
	 * @see domain.ppu.ppumodules.SensorModule
	 * @generated
	 */
	EClass getSensorModule();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PpumodulesFactory getPpumodulesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link domain.ppu.ppumodules.impl.PotentiometerModuleImpl <em>Potentiometer Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.ppu.ppumodules.impl.PotentiometerModuleImpl
		 * @see domain.ppu.ppumodules.impl.PpumodulesPackageImpl#getPotentiometerModule()
		 * @generated
		 */
		EClass POTENTIOMETER_MODULE = eINSTANCE.getPotentiometerModule();

		/**
		 * The meta object literal for the '<em><b>Poti</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POTENTIOMETER_MODULE__POTI = eINSTANCE.getPotentiometerModule_Poti();

		/**
		 * The meta object literal for the '{@link domain.ppu.ppumodules.impl.InductiveSensorModuleImpl <em>Inductive Sensor Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.ppu.ppumodules.impl.InductiveSensorModuleImpl
		 * @see domain.ppu.ppumodules.impl.PpumodulesPackageImpl#getInductiveSensorModule()
		 * @generated
		 */
		EClass INDUCTIVE_SENSOR_MODULE = eINSTANCE.getInductiveSensorModule();

		/**
		 * The meta object literal for the '<em><b>Inductive Sensor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDUCTIVE_SENSOR_MODULE__INDUCTIVE_SENSOR = eINSTANCE.getInductiveSensorModule_InductiveSensor();

		/**
		 * The meta object literal for the '<em><b>Bus Slave</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDUCTIVE_SENSOR_MODULE__BUS_SLAVE = eINSTANCE.getInductiveSensorModule_BusSlave();

		/**
		 * The meta object literal for the '{@link domain.ppu.ppumodules.impl.PressureSensorModuleImpl <em>Pressure Sensor Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.ppu.ppumodules.impl.PressureSensorModuleImpl
		 * @see domain.ppu.ppumodules.impl.PpumodulesPackageImpl#getPressureSensorModule()
		 * @generated
		 */
		EClass PRESSURE_SENSOR_MODULE = eINSTANCE.getPressureSensorModule();

		/**
		 * The meta object literal for the '{@link domain.ppu.ppumodules.impl.PusherModuleImpl <em>Pusher Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.ppu.ppumodules.impl.PusherModuleImpl
		 * @see domain.ppu.ppumodules.impl.PpumodulesPackageImpl#getPusherModule()
		 * @generated
		 */
		EClass PUSHER_MODULE = eINSTANCE.getPusherModule();

		/**
		 * The meta object literal for the '{@link domain.ppu.ppumodules.impl.RampModuleImpl <em>Ramp Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.ppu.ppumodules.impl.RampModuleImpl
		 * @see domain.ppu.ppumodules.impl.PpumodulesPackageImpl#getRampModule()
		 * @generated
		 */
		EClass RAMP_MODULE = eINSTANCE.getRampModule();

		/**
		 * The meta object literal for the '{@link domain.ppu.ppumodules.impl.MicroswitchModuleImpl <em>Microswitch Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.ppu.ppumodules.impl.MicroswitchModuleImpl
		 * @see domain.ppu.ppumodules.impl.PpumodulesPackageImpl#getMicroswitchModule()
		 * @generated
		 */
		EClass MICROSWITCH_MODULE = eINSTANCE.getMicroswitchModule();

		/**
		 * The meta object literal for the '<em><b>Bus Slave</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSWITCH_MODULE__BUS_SLAVE = eINSTANCE.getMicroswitchModule_BusSlave();

		/**
		 * The meta object literal for the '<em><b>Switch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSWITCH_MODULE__SWITCH = eINSTANCE.getMicroswitchModule_Switch();

		/**
		 * The meta object literal for the '<em><b>Turningtable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSWITCH_MODULE__TURNINGTABLE = eINSTANCE.getMicroswitchModule_Turningtable();

		/**
		 * The meta object literal for the '{@link domain.ppu.ppumodules.impl.MotorModuleImpl <em>Motor Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.ppu.ppumodules.impl.MotorModuleImpl
		 * @see domain.ppu.ppumodules.impl.PpumodulesPackageImpl#getMotorModule()
		 * @generated
		 */
		EClass MOTOR_MODULE = eINSTANCE.getMotorModule();

		/**
		 * The meta object literal for the '<em><b>Simple Motor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOTOR_MODULE__SIMPLE_MOTOR = eINSTANCE.getMotorModule_SimpleMotor();

		/**
		 * The meta object literal for the '<em><b>Bus Slave</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOTOR_MODULE__BUS_SLAVE = eINSTANCE.getMotorModule_BusSlave();

		/**
		 * The meta object literal for the '<em><b>Bus Box</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOTOR_MODULE__BUS_BOX = eINSTANCE.getMotorModule_BusBox();

		/**
		 * The meta object literal for the '<em><b>Bus Cable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOTOR_MODULE__BUS_CABLE = eINSTANCE.getMotorModule_BusCable();

		/**
		 * The meta object literal for the '{@link domain.ppu.ppumodules.impl.MonostableCylinderModuleImpl <em>Monostable Cylinder Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.ppu.ppumodules.impl.MonostableCylinderModuleImpl
		 * @see domain.ppu.ppumodules.impl.PpumodulesPackageImpl#getMonostableCylinderModule()
		 * @generated
		 */
		EClass MONOSTABLE_CYLINDER_MODULE = eINSTANCE.getMonostableCylinderModule();

		/**
		 * The meta object literal for the '{@link domain.ppu.ppumodules.impl.VacuumGripperModuleImpl <em>Vacuum Gripper Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.ppu.ppumodules.impl.VacuumGripperModuleImpl
		 * @see domain.ppu.ppumodules.impl.PpumodulesPackageImpl#getVacuumGripperModule()
		 * @generated
		 */
		EClass VACUUM_GRIPPER_MODULE = eINSTANCE.getVacuumGripperModule();

		/**
		 * The meta object literal for the '{@link domain.ppu.ppumodules.impl.PresenceSensorModuleImpl <em>Presence Sensor Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.ppu.ppumodules.impl.PresenceSensorModuleImpl
		 * @see domain.ppu.ppumodules.impl.PpumodulesPackageImpl#getPresenceSensorModule()
		 * @generated
		 */
		EClass PRESENCE_SENSOR_MODULE = eINSTANCE.getPresenceSensorModule();

		/**
		 * The meta object literal for the '<em><b>Presence Sensor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESENCE_SENSOR_MODULE__PRESENCE_SENSOR = eINSTANCE.getPresenceSensorModule_PresenceSensor();

		/**
		 * The meta object literal for the '<em><b>Bus Slave</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESENCE_SENSOR_MODULE__BUS_SLAVE = eINSTANCE.getPresenceSensorModule_BusSlave();

		/**
		 * The meta object literal for the '{@link domain.ppu.ppumodules.impl.OpticalSensorModuleImpl <em>Optical Sensor Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.ppu.ppumodules.impl.OpticalSensorModuleImpl
		 * @see domain.ppu.ppumodules.impl.PpumodulesPackageImpl#getOpticalSensorModule()
		 * @generated
		 */
		EClass OPTICAL_SENSOR_MODULE = eINSTANCE.getOpticalSensorModule();

		/**
		 * The meta object literal for the '<em><b>Optical Sensor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTICAL_SENSOR_MODULE__OPTICAL_SENSOR = eINSTANCE.getOpticalSensorModule_OpticalSensor();

		/**
		 * The meta object literal for the '<em><b>Bus Slave</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTICAL_SENSOR_MODULE__BUS_SLAVE = eINSTANCE.getOpticalSensorModule_BusSlave();

		/**
		 * The meta object literal for the '{@link domain.ppu.ppumodules.impl.ConveyorBeltModuleImpl <em>Conveyor Belt Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.ppu.ppumodules.impl.ConveyorBeltModuleImpl
		 * @see domain.ppu.ppumodules.impl.PpumodulesPackageImpl#getConveyorBeltModule()
		 * @generated
		 */
		EClass CONVEYOR_BELT_MODULE = eINSTANCE.getConveyorBeltModule();

		/**
		 * The meta object literal for the '<em><b>Rubber Band</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVEYOR_BELT_MODULE__RUBBER_BAND = eINSTANCE.getConveyorBeltModule_RubberBand();

		/**
		 * The meta object literal for the '<em><b>Frame</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVEYOR_BELT_MODULE__FRAME = eINSTANCE.getConveyorBeltModule_Frame();

		/**
		 * The meta object literal for the '{@link domain.ppu.ppumodules.impl.SensorModuleImpl <em>Sensor Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.ppu.ppumodules.impl.SensorModuleImpl
		 * @see domain.ppu.ppumodules.impl.PpumodulesPackageImpl#getSensorModule()
		 * @generated
		 */
		EClass SENSOR_MODULE = eINSTANCE.getSensorModule();

	}

} //PpumodulesPackage
