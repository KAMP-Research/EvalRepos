/**
 */
package domain.ppu.ppucomponents;

import domain.aps.components.ComponentsPackage;

import domain.aps.electroniccomponents.ElectroniccomponentsPackage;

import domain.as.ComponentRepository.ComponentRepositoryPackage;

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
 * @see domain.ppu.ppucomponents.PpucomponentsFactory
 * @model kind="package"
 * @generated
 */
public interface PpucomponentsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ppucomponents";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ppucomponents";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ppucomponents";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PpucomponentsPackage eINSTANCE = domain.ppu.ppucomponents.impl.PpucomponentsPackageImpl.init();

	/**
	 * The meta object id for the '{@link domain.ppu.ppucomponents.impl.PowerSplitterImpl <em>Power Splitter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.ppu.ppucomponents.impl.PowerSplitterImpl
	 * @see domain.ppu.ppucomponents.impl.PpucomponentsPackageImpl#getPowerSplitter()
	 * @generated
	 */
	int POWER_SPLITTER = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SPLITTER__ID = ComponentsPackage.SPLITTER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SPLITTER__NAME = ComponentsPackage.SPLITTER__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SPLITTER__CONNECTED_INTERFACES = ComponentsPackage.SPLITTER__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SPLITTER__PARENT = ComponentsPackage.SPLITTER__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SPLITTER__PARENT_MODULE = ComponentsPackage.SPLITTER__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Screwing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SPLITTER__SCREWING = ComponentsPackage.SPLITTER__SCREWING;

	/**
	 * The feature id for the '<em><b>Powersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SPLITTER__POWERSUPPLY = ComponentsPackage.SPLITTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Power Splitter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SPLITTER_FEATURE_COUNT = ComponentsPackage.SPLITTER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Power Splitter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SPLITTER_OPERATION_COUNT = ComponentsPackage.SPLITTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.ppu.ppucomponents.impl.OpticalSensorImpl <em>Optical Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.ppu.ppucomponents.impl.OpticalSensorImpl
	 * @see domain.ppu.ppucomponents.impl.PpucomponentsPackageImpl#getOpticalSensor()
	 * @generated
	 */
	int OPTICAL_SENSOR = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTICAL_SENSOR__ID = ComponentsPackage.SENSOR__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTICAL_SENSOR__NAME = ComponentsPackage.SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTICAL_SENSOR__CONNECTED_INTERFACES = ComponentsPackage.SENSOR__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTICAL_SENSOR__PARENT = ComponentsPackage.SENSOR__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTICAL_SENSOR__PARENT_MODULE = ComponentsPackage.SENSOR__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Physicalconnection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTICAL_SENSOR__PHYSICALCONNECTION = ComponentsPackage.SENSOR__PHYSICALCONNECTION;

	/**
	 * The feature id for the '<em><b>Signalinterface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTICAL_SENSOR__SIGNALINTERFACE = ComponentsPackage.SENSOR__SIGNALINTERFACE;

	/**
	 * The feature id for the '<em><b>Powersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTICAL_SENSOR__POWERSUPPLY = ComponentsPackage.SENSOR__POWERSUPPLY;

	/**
	 * The number of structural features of the '<em>Optical Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTICAL_SENSOR_FEATURE_COUNT = ComponentsPackage.SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Optical Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTICAL_SENSOR_OPERATION_COUNT = ComponentsPackage.SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.ppu.ppucomponents.impl.PneumaticPipeImpl <em>Pneumatic Pipe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.ppu.ppucomponents.impl.PneumaticPipeImpl
	 * @see domain.ppu.ppucomponents.impl.PpucomponentsPackageImpl#getPneumaticPipe()
	 * @generated
	 */
	int PNEUMATIC_PIPE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_PIPE__ID = ComponentsPackage.PIPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_PIPE__NAME = ComponentsPackage.PIPE__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_PIPE__CONNECTED_INTERFACES = ComponentsPackage.PIPE__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_PIPE__PARENT = ComponentsPackage.PIPE__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_PIPE__PARENT_MODULE = ComponentsPackage.PIPE__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Plugs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_PIPE__PLUGS = ComponentsPackage.PIPE__PLUGS;

	/**
	 * The number of structural features of the '<em>Pneumatic Pipe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_PIPE_FEATURE_COUNT = ComponentsPackage.PIPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pneumatic Pipe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_PIPE_OPERATION_COUNT = ComponentsPackage.PIPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.ppu.ppucomponents.impl.PneumaticSplitterImpl <em>Pneumatic Splitter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.ppu.ppucomponents.impl.PneumaticSplitterImpl
	 * @see domain.ppu.ppucomponents.impl.PpucomponentsPackageImpl#getPneumaticSplitter()
	 * @generated
	 */
	int PNEUMATIC_SPLITTER = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_SPLITTER__ID = ComponentsPackage.SPLITTER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_SPLITTER__NAME = ComponentsPackage.SPLITTER__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_SPLITTER__CONNECTED_INTERFACES = ComponentsPackage.SPLITTER__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_SPLITTER__PARENT = ComponentsPackage.SPLITTER__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_SPLITTER__PARENT_MODULE = ComponentsPackage.SPLITTER__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Screwing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_SPLITTER__SCREWING = ComponentsPackage.SPLITTER__SCREWING;

	/**
	 * The feature id for the '<em><b>Pneumaticsupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_SPLITTER__PNEUMATICSUPPLY = ComponentsPackage.SPLITTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pneumatic Splitter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_SPLITTER_FEATURE_COUNT = ComponentsPackage.SPLITTER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pneumatic Splitter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_SPLITTER_OPERATION_COUNT = ComponentsPackage.SPLITTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.ppu.ppucomponents.impl.MonostableCylinderImpl <em>Monostable Cylinder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.ppu.ppucomponents.impl.MonostableCylinderImpl
	 * @see domain.ppu.ppucomponents.impl.PpucomponentsPackageImpl#getMonostableCylinder()
	 * @generated
	 */
	int MONOSTABLE_CYLINDER = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOSTABLE_CYLINDER__ID = ComponentsPackage.CYLINDER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOSTABLE_CYLINDER__NAME = ComponentsPackage.CYLINDER__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOSTABLE_CYLINDER__CONNECTED_INTERFACES = ComponentsPackage.CYLINDER__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOSTABLE_CYLINDER__PARENT = ComponentsPackage.CYLINDER__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOSTABLE_CYLINDER__PARENT_MODULE = ComponentsPackage.CYLINDER__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Pneumaticsupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOSTABLE_CYLINDER__PNEUMATICSUPPLY = ComponentsPackage.CYLINDER__PNEUMATICSUPPLY;

	/**
	 * The feature id for the '<em><b>Signal Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOSTABLE_CYLINDER__SIGNAL_INTERFACE = ComponentsPackage.CYLINDER__SIGNAL_INTERFACE;

	/**
	 * The feature id for the '<em><b>Housing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOSTABLE_CYLINDER__HOUSING = ComponentsPackage.CYLINDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Spring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOSTABLE_CYLINDER__SPRING = ComponentsPackage.CYLINDER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reed Switches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOSTABLE_CYLINDER__REED_SWITCHES = ComponentsPackage.CYLINDER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cylinder Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOSTABLE_CYLINDER__CYLINDER_PART = ComponentsPackage.CYLINDER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Valve</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOSTABLE_CYLINDER__VALVE = ComponentsPackage.CYLINDER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Bus Slave</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOSTABLE_CYLINDER__BUS_SLAVE = ComponentsPackage.CYLINDER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Pusher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOSTABLE_CYLINDER__PUSHER = ComponentsPackage.CYLINDER_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Monostable Cylinder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOSTABLE_CYLINDER_FEATURE_COUNT = ComponentsPackage.CYLINDER_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Monostable Cylinder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOSTABLE_CYLINDER_OPERATION_COUNT = ComponentsPackage.CYLINDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.ppu.ppucomponents.impl.PresenceSensorImpl <em>Presence Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.ppu.ppucomponents.impl.PresenceSensorImpl
	 * @see domain.ppu.ppucomponents.impl.PpucomponentsPackageImpl#getPresenceSensor()
	 * @generated
	 */
	int PRESENCE_SENSOR = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENCE_SENSOR__ID = ComponentsPackage.SENSOR__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENCE_SENSOR__NAME = ComponentsPackage.SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENCE_SENSOR__CONNECTED_INTERFACES = ComponentsPackage.SENSOR__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENCE_SENSOR__PARENT = ComponentsPackage.SENSOR__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENCE_SENSOR__PARENT_MODULE = ComponentsPackage.SENSOR__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Physicalconnection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENCE_SENSOR__PHYSICALCONNECTION = ComponentsPackage.SENSOR__PHYSICALCONNECTION;

	/**
	 * The feature id for the '<em><b>Signalinterface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENCE_SENSOR__SIGNALINTERFACE = ComponentsPackage.SENSOR__SIGNALINTERFACE;

	/**
	 * The feature id for the '<em><b>Powersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENCE_SENSOR__POWERSUPPLY = ComponentsPackage.SENSOR__POWERSUPPLY;

	/**
	 * The number of structural features of the '<em>Presence Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENCE_SENSOR_FEATURE_COUNT = ComponentsPackage.SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Presence Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENCE_SENSOR_OPERATION_COUNT = ComponentsPackage.SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.ppu.ppucomponents.impl.RegularValveImpl <em>Regular Valve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.ppu.ppucomponents.impl.RegularValveImpl
	 * @see domain.ppu.ppucomponents.impl.PpucomponentsPackageImpl#getRegularValve()
	 * @generated
	 */
	int REGULAR_VALVE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_VALVE__ID = ComponentsPackage.VALVE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_VALVE__NAME = ComponentsPackage.VALVE__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_VALVE__CONNECTED_INTERFACES = ComponentsPackage.VALVE__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_VALVE__PARENT = ComponentsPackage.VALVE__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_VALVE__PARENT_MODULE = ComponentsPackage.VALVE__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Pneumaticsupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_VALVE__PNEUMATICSUPPLY = ComponentsPackage.VALVE__PNEUMATICSUPPLY;

	/**
	 * The feature id for the '<em><b>Powersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_VALVE__POWERSUPPLY = ComponentsPackage.VALVE__POWERSUPPLY;

	/**
	 * The feature id for the '<em><b>Signalinterface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_VALVE__SIGNALINTERFACE = ComponentsPackage.VALVE__SIGNALINTERFACE;

	/**
	 * The number of structural features of the '<em>Regular Valve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_VALVE_FEATURE_COUNT = ComponentsPackage.VALVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Regular Valve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_VALVE_OPERATION_COUNT = ComponentsPackage.VALVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.ppu.ppucomponents.impl.FrameImpl <em>Frame</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.ppu.ppucomponents.impl.FrameImpl
	 * @see domain.ppu.ppucomponents.impl.PpucomponentsPackageImpl#getFrame()
	 * @generated
	 */
	int FRAME = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__ID = ComponentsPackage.MECHANICAL_ASSEMBLY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__NAME = ComponentsPackage.MECHANICAL_ASSEMBLY__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__CONNECTED_INTERFACES = ComponentsPackage.MECHANICAL_ASSEMBLY__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__PARENT = ComponentsPackage.MECHANICAL_ASSEMBLY__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__PARENT_MODULE = ComponentsPackage.MECHANICAL_ASSEMBLY__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Conveyorbelt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__CONVEYORBELT = ComponentsPackage.MECHANICAL_ASSEMBLY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_FEATURE_COUNT = ComponentsPackage.MECHANICAL_ASSEMBLY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_OPERATION_COUNT = ComponentsPackage.MECHANICAL_ASSEMBLY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.ppu.ppucomponents.impl.InductiveSensorImpl <em>Inductive Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.ppu.ppucomponents.impl.InductiveSensorImpl
	 * @see domain.ppu.ppucomponents.impl.PpucomponentsPackageImpl#getInductiveSensor()
	 * @generated
	 */
	int INDUCTIVE_SENSOR = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTIVE_SENSOR__ID = ComponentsPackage.SENSOR__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTIVE_SENSOR__NAME = ComponentsPackage.SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTIVE_SENSOR__CONNECTED_INTERFACES = ComponentsPackage.SENSOR__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTIVE_SENSOR__PARENT = ComponentsPackage.SENSOR__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTIVE_SENSOR__PARENT_MODULE = ComponentsPackage.SENSOR__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Physicalconnection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTIVE_SENSOR__PHYSICALCONNECTION = ComponentsPackage.SENSOR__PHYSICALCONNECTION;

	/**
	 * The feature id for the '<em><b>Signalinterface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTIVE_SENSOR__SIGNALINTERFACE = ComponentsPackage.SENSOR__SIGNALINTERFACE;

	/**
	 * The feature id for the '<em><b>Powersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTIVE_SENSOR__POWERSUPPLY = ComponentsPackage.SENSOR__POWERSUPPLY;

	/**
	 * The number of structural features of the '<em>Inductive Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTIVE_SENSOR_FEATURE_COUNT = ComponentsPackage.SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Inductive Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTIVE_SENSOR_OPERATION_COUNT = ComponentsPackage.SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.ppu.ppucomponents.impl.ReedSwitchImpl <em>Reed Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.ppu.ppucomponents.impl.ReedSwitchImpl
	 * @see domain.ppu.ppucomponents.impl.PpucomponentsPackageImpl#getReedSwitch()
	 * @generated
	 */
	int REED_SWITCH = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REED_SWITCH__ID = ElectroniccomponentsPackage.SWITCH__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REED_SWITCH__NAME = ElectroniccomponentsPackage.SWITCH__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REED_SWITCH__CONNECTED_INTERFACES = ElectroniccomponentsPackage.SWITCH__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REED_SWITCH__PARENT = ElectroniccomponentsPackage.SWITCH__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REED_SWITCH__PARENT_MODULE = ElectroniccomponentsPackage.SWITCH__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REED_SWITCH__PIN = ElectroniccomponentsPackage.SWITCH__PIN;

	/**
	 * The feature id for the '<em><b>Physicalconnection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REED_SWITCH__PHYSICALCONNECTION = ElectroniccomponentsPackage.SWITCH__PHYSICALCONNECTION;

	/**
	 * The number of structural features of the '<em>Reed Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REED_SWITCH_FEATURE_COUNT = ElectroniccomponentsPackage.SWITCH_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Reed Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REED_SWITCH_OPERATION_COUNT = ElectroniccomponentsPackage.SWITCH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.ppu.ppucomponents.impl.VacuumSwitchImpl <em>Vacuum Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.ppu.ppucomponents.impl.VacuumSwitchImpl
	 * @see domain.ppu.ppucomponents.impl.PpucomponentsPackageImpl#getVacuumSwitch()
	 * @generated
	 */
	int VACUUM_SWITCH = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACUUM_SWITCH__ID = ElectroniccomponentsPackage.SWITCH__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACUUM_SWITCH__NAME = ElectroniccomponentsPackage.SWITCH__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACUUM_SWITCH__CONNECTED_INTERFACES = ElectroniccomponentsPackage.SWITCH__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACUUM_SWITCH__PARENT = ElectroniccomponentsPackage.SWITCH__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACUUM_SWITCH__PARENT_MODULE = ElectroniccomponentsPackage.SWITCH__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACUUM_SWITCH__PIN = ElectroniccomponentsPackage.SWITCH__PIN;

	/**
	 * The feature id for the '<em><b>Physicalconnection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACUUM_SWITCH__PHYSICALCONNECTION = ElectroniccomponentsPackage.SWITCH__PHYSICALCONNECTION;

	/**
	 * The number of structural features of the '<em>Vacuum Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACUUM_SWITCH_FEATURE_COUNT = ElectroniccomponentsPackage.SWITCH_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Vacuum Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VACUUM_SWITCH_OPERATION_COUNT = ElectroniccomponentsPackage.SWITCH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.ppu.ppucomponents.impl.ProportionalCylinderImpl <em>Proportional Cylinder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.ppu.ppucomponents.impl.ProportionalCylinderImpl
	 * @see domain.ppu.ppucomponents.impl.PpucomponentsPackageImpl#getProportionalCylinder()
	 * @generated
	 */
	int PROPORTIONAL_CYLINDER = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPORTIONAL_CYLINDER__ID = ComponentsPackage.CYLINDER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPORTIONAL_CYLINDER__NAME = ComponentsPackage.CYLINDER__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPORTIONAL_CYLINDER__CONNECTED_INTERFACES = ComponentsPackage.CYLINDER__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPORTIONAL_CYLINDER__PARENT = ComponentsPackage.CYLINDER__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPORTIONAL_CYLINDER__PARENT_MODULE = ComponentsPackage.CYLINDER__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Pneumaticsupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPORTIONAL_CYLINDER__PNEUMATICSUPPLY = ComponentsPackage.CYLINDER__PNEUMATICSUPPLY;

	/**
	 * The feature id for the '<em><b>Signal Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPORTIONAL_CYLINDER__SIGNAL_INTERFACE = ComponentsPackage.CYLINDER__SIGNAL_INTERFACE;

	/**
	 * The number of structural features of the '<em>Proportional Cylinder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPORTIONAL_CYLINDER_FEATURE_COUNT = ComponentsPackage.CYLINDER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Proportional Cylinder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPORTIONAL_CYLINDER_OPERATION_COUNT = ComponentsPackage.CYLINDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.ppu.ppucomponents.impl.BistableCylinderImpl <em>Bistable Cylinder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.ppu.ppucomponents.impl.BistableCylinderImpl
	 * @see domain.ppu.ppucomponents.impl.PpucomponentsPackageImpl#getBistableCylinder()
	 * @generated
	 */
	int BISTABLE_CYLINDER = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BISTABLE_CYLINDER__ID = ComponentsPackage.CYLINDER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BISTABLE_CYLINDER__NAME = ComponentsPackage.CYLINDER__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BISTABLE_CYLINDER__CONNECTED_INTERFACES = ComponentsPackage.CYLINDER__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BISTABLE_CYLINDER__PARENT = ComponentsPackage.CYLINDER__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BISTABLE_CYLINDER__PARENT_MODULE = ComponentsPackage.CYLINDER__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Pneumaticsupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BISTABLE_CYLINDER__PNEUMATICSUPPLY = ComponentsPackage.CYLINDER__PNEUMATICSUPPLY;

	/**
	 * The feature id for the '<em><b>Signal Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BISTABLE_CYLINDER__SIGNAL_INTERFACE = ComponentsPackage.CYLINDER__SIGNAL_INTERFACE;

	/**
	 * The number of structural features of the '<em>Bistable Cylinder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BISTABLE_CYLINDER_FEATURE_COUNT = ComponentsPackage.CYLINDER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bistable Cylinder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BISTABLE_CYLINDER_OPERATION_COUNT = ComponentsPackage.CYLINDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.ppu.ppucomponents.impl.WaterSplitterImpl <em>Water Splitter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.ppu.ppucomponents.impl.WaterSplitterImpl
	 * @see domain.ppu.ppucomponents.impl.PpucomponentsPackageImpl#getWaterSplitter()
	 * @generated
	 */
	int WATER_SPLITTER = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SPLITTER__ID = ComponentsPackage.SPLITTER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SPLITTER__NAME = ComponentsPackage.SPLITTER__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SPLITTER__CONNECTED_INTERFACES = ComponentsPackage.SPLITTER__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SPLITTER__PARENT = ComponentsPackage.SPLITTER__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SPLITTER__PARENT_MODULE = ComponentsPackage.SPLITTER__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Screwing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SPLITTER__SCREWING = ComponentsPackage.SPLITTER__SCREWING;

	/**
	 * The feature id for the '<em><b>Watersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SPLITTER__WATERSUPPLY = ComponentsPackage.SPLITTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Water Splitter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SPLITTER_FEATURE_COUNT = ComponentsPackage.SPLITTER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Water Splitter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SPLITTER_OPERATION_COUNT = ComponentsPackage.SPLITTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.ppu.ppucomponents.impl.OperationPanelImpl <em>Operation Panel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.ppu.ppucomponents.impl.OperationPanelImpl
	 * @see domain.ppu.ppucomponents.impl.PpucomponentsPackageImpl#getOperationPanel()
	 * @generated
	 */
	int OPERATION_PANEL = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PANEL__ID = ComponentsPackage.PANEL__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PANEL__NAME = ComponentsPackage.PANEL__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PANEL__CONNECTED_INTERFACES = ComponentsPackage.PANEL__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PANEL__PARENT = ComponentsPackage.PANEL__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PANEL__PARENT_MODULE = ComponentsPackage.PANEL__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Component Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PANEL__COMPONENT_REPOSITORY = ComponentsPackage.PANEL__COMPONENT_REPOSITORY;

	/**
	 * The feature id for the '<em><b>Screwing rack</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PANEL__SCREWING_RACK = ComponentsPackage.PANEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Leds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PANEL__LEDS = ComponentsPackage.PANEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Buttons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PANEL__BUTTONS = ComponentsPackage.PANEL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Operation Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PANEL_FEATURE_COUNT = ComponentsPackage.PANEL_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Operation Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PANEL_OPERATION_COUNT = ComponentsPackage.PANEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.ppu.ppucomponents.impl.PowerCableImpl <em>Power Cable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.ppu.ppucomponents.impl.PowerCableImpl
	 * @see domain.ppu.ppucomponents.impl.PpucomponentsPackageImpl#getPowerCable()
	 * @generated
	 */
	int POWER_CABLE = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CABLE__ID = ComponentsPackage.CABLE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CABLE__NAME = ComponentsPackage.CABLE__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CABLE__CONNECTED_INTERFACES = ComponentsPackage.CABLE__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CABLE__PARENT = ComponentsPackage.CABLE__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CABLE__PARENT_MODULE = ComponentsPackage.CABLE__PARENT_MODULE;

	/**
	 * The number of structural features of the '<em>Power Cable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CABLE_FEATURE_COUNT = ComponentsPackage.CABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Power Cable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CABLE_OPERATION_COUNT = ComponentsPackage.CABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.ppu.ppucomponents.impl.PressureSensorImpl <em>Pressure Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.ppu.ppucomponents.impl.PressureSensorImpl
	 * @see domain.ppu.ppucomponents.impl.PpucomponentsPackageImpl#getPressureSensor()
	 * @generated
	 */
	int PRESSURE_SENSOR = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR__ID = ComponentsPackage.SENSOR__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR__NAME = ComponentsPackage.SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR__CONNECTED_INTERFACES = ComponentsPackage.SENSOR__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR__PARENT = ComponentsPackage.SENSOR__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR__PARENT_MODULE = ComponentsPackage.SENSOR__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Physicalconnection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR__PHYSICALCONNECTION = ComponentsPackage.SENSOR__PHYSICALCONNECTION;

	/**
	 * The feature id for the '<em><b>Signalinterface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR__SIGNALINTERFACE = ComponentsPackage.SENSOR__SIGNALINTERFACE;

	/**
	 * The feature id for the '<em><b>Powersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR__POWERSUPPLY = ComponentsPackage.SENSOR__POWERSUPPLY;

	/**
	 * The number of structural features of the '<em>Pressure Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR_FEATURE_COUNT = ComponentsPackage.SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pressure Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR_OPERATION_COUNT = ComponentsPackage.SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.ppu.ppucomponents.impl.BottleSeperatorImpl <em>Bottle Seperator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.ppu.ppucomponents.impl.BottleSeperatorImpl
	 * @see domain.ppu.ppucomponents.impl.PpucomponentsPackageImpl#getBottleSeperator()
	 * @generated
	 */
	int BOTTLE_SEPERATOR = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTTLE_SEPERATOR__ID = ComponentRepositoryPackage.COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTTLE_SEPERATOR__NAME = ComponentRepositoryPackage.COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTTLE_SEPERATOR__CONNECTED_INTERFACES = ComponentRepositoryPackage.COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTTLE_SEPERATOR__PARENT = ComponentRepositoryPackage.COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTTLE_SEPERATOR__PARENT_MODULE = ComponentRepositoryPackage.COMPONENT__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Signalinterface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTTLE_SEPERATOR__SIGNALINTERFACE = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pneumaticsupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTTLE_SEPERATOR__PNEUMATICSUPPLY = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Powersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTTLE_SEPERATOR__POWERSUPPLY = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Screwing to rack</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTTLE_SEPERATOR__SCREWING_TO_RACK = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Bottle Seperator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTTLE_SEPERATOR_FEATURE_COUNT = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Bottle Seperator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTTLE_SEPERATOR_OPERATION_COUNT = ComponentRepositoryPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.ppu.ppucomponents.impl.ControllerImpl <em>Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.ppu.ppucomponents.impl.ControllerImpl
	 * @see domain.ppu.ppucomponents.impl.PpucomponentsPackageImpl#getController()
	 * @generated
	 */
	int CONTROLLER = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__ID = ComponentRepositoryPackage.COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__NAME = ComponentRepositoryPackage.COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__CONNECTED_INTERFACES = ComponentRepositoryPackage.COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__PARENT = ComponentRepositoryPackage.COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__PARENT_MODULE = ComponentRepositoryPackage.COMPONENT__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Powersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__POWERSUPPLY = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Controller Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__CONTROLLER_OF = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_FEATURE_COUNT = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_OPERATION_COUNT = ComponentRepositoryPackage.COMPONENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link domain.ppu.ppucomponents.PowerSplitter <em>Power Splitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Splitter</em>'.
	 * @see domain.ppu.ppucomponents.PowerSplitter
	 * @generated
	 */
	EClass getPowerSplitter();

	/**
	 * Returns the meta object for the reference '{@link domain.ppu.ppucomponents.PowerSplitter#getPowersupply <em>Powersupply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Powersupply</em>'.
	 * @see domain.ppu.ppucomponents.PowerSplitter#getPowersupply()
	 * @see #getPowerSplitter()
	 * @generated
	 */
	EReference getPowerSplitter_Powersupply();

	/**
	 * Returns the meta object for class '{@link domain.ppu.ppucomponents.OpticalSensor <em>Optical Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Optical Sensor</em>'.
	 * @see domain.ppu.ppucomponents.OpticalSensor
	 * @generated
	 */
	EClass getOpticalSensor();

	/**
	 * Returns the meta object for class '{@link domain.ppu.ppucomponents.PneumaticPipe <em>Pneumatic Pipe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pneumatic Pipe</em>'.
	 * @see domain.ppu.ppucomponents.PneumaticPipe
	 * @generated
	 */
	EClass getPneumaticPipe();

	/**
	 * Returns the meta object for class '{@link domain.ppu.ppucomponents.PneumaticSplitter <em>Pneumatic Splitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pneumatic Splitter</em>'.
	 * @see domain.ppu.ppucomponents.PneumaticSplitter
	 * @generated
	 */
	EClass getPneumaticSplitter();

	/**
	 * Returns the meta object for the reference '{@link domain.ppu.ppucomponents.PneumaticSplitter#getPneumaticsupply <em>Pneumaticsupply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pneumaticsupply</em>'.
	 * @see domain.ppu.ppucomponents.PneumaticSplitter#getPneumaticsupply()
	 * @see #getPneumaticSplitter()
	 * @generated
	 */
	EReference getPneumaticSplitter_Pneumaticsupply();

	/**
	 * Returns the meta object for class '{@link domain.ppu.ppucomponents.MonostableCylinder <em>Monostable Cylinder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monostable Cylinder</em>'.
	 * @see domain.ppu.ppucomponents.MonostableCylinder
	 * @generated
	 */
	EClass getMonostableCylinder();

	/**
	 * Returns the meta object for the containment reference '{@link domain.ppu.ppucomponents.MonostableCylinder#getHousing <em>Housing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Housing</em>'.
	 * @see domain.ppu.ppucomponents.MonostableCylinder#getHousing()
	 * @see #getMonostableCylinder()
	 * @generated
	 */
	EReference getMonostableCylinder_Housing();

	/**
	 * Returns the meta object for the containment reference '{@link domain.ppu.ppucomponents.MonostableCylinder#getSpring <em>Spring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Spring</em>'.
	 * @see domain.ppu.ppucomponents.MonostableCylinder#getSpring()
	 * @see #getMonostableCylinder()
	 * @generated
	 */
	EReference getMonostableCylinder_Spring();

	/**
	 * Returns the meta object for the containment reference list '{@link domain.ppu.ppucomponents.MonostableCylinder#getReedSwitches <em>Reed Switches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reed Switches</em>'.
	 * @see domain.ppu.ppucomponents.MonostableCylinder#getReedSwitches()
	 * @see #getMonostableCylinder()
	 * @generated
	 */
	EReference getMonostableCylinder_ReedSwitches();

	/**
	 * Returns the meta object for the containment reference list '{@link domain.ppu.ppucomponents.MonostableCylinder#getCylinderPart <em>Cylinder Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cylinder Part</em>'.
	 * @see domain.ppu.ppucomponents.MonostableCylinder#getCylinderPart()
	 * @see #getMonostableCylinder()
	 * @generated
	 */
	EReference getMonostableCylinder_CylinderPart();

	/**
	 * Returns the meta object for the containment reference list '{@link domain.ppu.ppucomponents.MonostableCylinder#getValve <em>Valve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Valve</em>'.
	 * @see domain.ppu.ppucomponents.MonostableCylinder#getValve()
	 * @see #getMonostableCylinder()
	 * @generated
	 */
	EReference getMonostableCylinder_Valve();

	/**
	 * Returns the meta object for the containment reference list '{@link domain.ppu.ppucomponents.MonostableCylinder#getBusSlave <em>Bus Slave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bus Slave</em>'.
	 * @see domain.ppu.ppucomponents.MonostableCylinder#getBusSlave()
	 * @see #getMonostableCylinder()
	 * @generated
	 */
	EReference getMonostableCylinder_BusSlave();

	/**
	 * Returns the meta object for the containment reference '{@link domain.ppu.ppucomponents.MonostableCylinder#getPusher <em>Pusher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pusher</em>'.
	 * @see domain.ppu.ppucomponents.MonostableCylinder#getPusher()
	 * @see #getMonostableCylinder()
	 * @generated
	 */
	EReference getMonostableCylinder_Pusher();

	/**
	 * Returns the meta object for class '{@link domain.ppu.ppucomponents.PresenceSensor <em>Presence Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Presence Sensor</em>'.
	 * @see domain.ppu.ppucomponents.PresenceSensor
	 * @generated
	 */
	EClass getPresenceSensor();

	/**
	 * Returns the meta object for class '{@link domain.ppu.ppucomponents.RegularValve <em>Regular Valve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regular Valve</em>'.
	 * @see domain.ppu.ppucomponents.RegularValve
	 * @generated
	 */
	EClass getRegularValve();

	/**
	 * Returns the meta object for class '{@link domain.ppu.ppucomponents.Frame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Frame</em>'.
	 * @see domain.ppu.ppucomponents.Frame
	 * @generated
	 */
	EClass getFrame();

	/**
	 * Returns the meta object for the containment reference list '{@link domain.ppu.ppucomponents.Frame#getConveyorbelt <em>Conveyorbelt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conveyorbelt</em>'.
	 * @see domain.ppu.ppucomponents.Frame#getConveyorbelt()
	 * @see #getFrame()
	 * @generated
	 */
	EReference getFrame_Conveyorbelt();

	/**
	 * Returns the meta object for class '{@link domain.ppu.ppucomponents.InductiveSensor <em>Inductive Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inductive Sensor</em>'.
	 * @see domain.ppu.ppucomponents.InductiveSensor
	 * @generated
	 */
	EClass getInductiveSensor();

	/**
	 * Returns the meta object for class '{@link domain.ppu.ppucomponents.ReedSwitch <em>Reed Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reed Switch</em>'.
	 * @see domain.ppu.ppucomponents.ReedSwitch
	 * @generated
	 */
	EClass getReedSwitch();

	/**
	 * Returns the meta object for class '{@link domain.ppu.ppucomponents.VacuumSwitch <em>Vacuum Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vacuum Switch</em>'.
	 * @see domain.ppu.ppucomponents.VacuumSwitch
	 * @generated
	 */
	EClass getVacuumSwitch();

	/**
	 * Returns the meta object for class '{@link domain.ppu.ppucomponents.ProportionalCylinder <em>Proportional Cylinder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proportional Cylinder</em>'.
	 * @see domain.ppu.ppucomponents.ProportionalCylinder
	 * @generated
	 */
	EClass getProportionalCylinder();

	/**
	 * Returns the meta object for class '{@link domain.ppu.ppucomponents.BistableCylinder <em>Bistable Cylinder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bistable Cylinder</em>'.
	 * @see domain.ppu.ppucomponents.BistableCylinder
	 * @generated
	 */
	EClass getBistableCylinder();

	/**
	 * Returns the meta object for class '{@link domain.ppu.ppucomponents.WaterSplitter <em>Water Splitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Water Splitter</em>'.
	 * @see domain.ppu.ppucomponents.WaterSplitter
	 * @generated
	 */
	EClass getWaterSplitter();

	/**
	 * Returns the meta object for the reference '{@link domain.ppu.ppucomponents.WaterSplitter#getWatersupply <em>Watersupply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Watersupply</em>'.
	 * @see domain.ppu.ppucomponents.WaterSplitter#getWatersupply()
	 * @see #getWaterSplitter()
	 * @generated
	 */
	EReference getWaterSplitter_Watersupply();

	/**
	 * Returns the meta object for class '{@link domain.ppu.ppucomponents.OperationPanel <em>Operation Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Panel</em>'.
	 * @see domain.ppu.ppucomponents.OperationPanel
	 * @generated
	 */
	EClass getOperationPanel();

	/**
	 * Returns the meta object for the reference '{@link domain.ppu.ppucomponents.OperationPanel#getScrewing_rack <em>Screwing rack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Screwing rack</em>'.
	 * @see domain.ppu.ppucomponents.OperationPanel#getScrewing_rack()
	 * @see #getOperationPanel()
	 * @generated
	 */
	EReference getOperationPanel_Screwing_rack();

	/**
	 * Returns the meta object for the reference list '{@link domain.ppu.ppucomponents.OperationPanel#getLeds <em>Leds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Leds</em>'.
	 * @see domain.ppu.ppucomponents.OperationPanel#getLeds()
	 * @see #getOperationPanel()
	 * @generated
	 */
	EReference getOperationPanel_Leds();

	/**
	 * Returns the meta object for the reference list '{@link domain.ppu.ppucomponents.OperationPanel#getButtons <em>Buttons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Buttons</em>'.
	 * @see domain.ppu.ppucomponents.OperationPanel#getButtons()
	 * @see #getOperationPanel()
	 * @generated
	 */
	EReference getOperationPanel_Buttons();

	/**
	 * Returns the meta object for class '{@link domain.ppu.ppucomponents.PowerCable <em>Power Cable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Cable</em>'.
	 * @see domain.ppu.ppucomponents.PowerCable
	 * @generated
	 */
	EClass getPowerCable();

	/**
	 * Returns the meta object for class '{@link domain.ppu.ppucomponents.PressureSensor <em>Pressure Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pressure Sensor</em>'.
	 * @see domain.ppu.ppucomponents.PressureSensor
	 * @generated
	 */
	EClass getPressureSensor();

	/**
	 * Returns the meta object for class '{@link domain.ppu.ppucomponents.BottleSeperator <em>Bottle Seperator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bottle Seperator</em>'.
	 * @see domain.ppu.ppucomponents.BottleSeperator
	 * @generated
	 */
	EClass getBottleSeperator();

	/**
	 * Returns the meta object for the reference '{@link domain.ppu.ppucomponents.BottleSeperator#getSignalinterface <em>Signalinterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signalinterface</em>'.
	 * @see domain.ppu.ppucomponents.BottleSeperator#getSignalinterface()
	 * @see #getBottleSeperator()
	 * @generated
	 */
	EReference getBottleSeperator_Signalinterface();

	/**
	 * Returns the meta object for the reference '{@link domain.ppu.ppucomponents.BottleSeperator#getPneumaticsupply <em>Pneumaticsupply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pneumaticsupply</em>'.
	 * @see domain.ppu.ppucomponents.BottleSeperator#getPneumaticsupply()
	 * @see #getBottleSeperator()
	 * @generated
	 */
	EReference getBottleSeperator_Pneumaticsupply();

	/**
	 * Returns the meta object for the reference '{@link domain.ppu.ppucomponents.BottleSeperator#getPowersupply <em>Powersupply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Powersupply</em>'.
	 * @see domain.ppu.ppucomponents.BottleSeperator#getPowersupply()
	 * @see #getBottleSeperator()
	 * @generated
	 */
	EReference getBottleSeperator_Powersupply();

	/**
	 * Returns the meta object for the reference '{@link domain.ppu.ppucomponents.BottleSeperator#getScrewing_to_rack <em>Screwing to rack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Screwing to rack</em>'.
	 * @see domain.ppu.ppucomponents.BottleSeperator#getScrewing_to_rack()
	 * @see #getBottleSeperator()
	 * @generated
	 */
	EReference getBottleSeperator_Screwing_to_rack();

	/**
	 * Returns the meta object for class '{@link domain.ppu.ppucomponents.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller</em>'.
	 * @see domain.ppu.ppucomponents.Controller
	 * @generated
	 */
	EClass getController();

	/**
	 * Returns the meta object for the reference '{@link domain.ppu.ppucomponents.Controller#getPowersupply <em>Powersupply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Powersupply</em>'.
	 * @see domain.ppu.ppucomponents.Controller#getPowersupply()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_Powersupply();

	/**
	 * Returns the meta object for the reference '{@link domain.ppu.ppucomponents.Controller#getControllerOf <em>Controller Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Controller Of</em>'.
	 * @see domain.ppu.ppucomponents.Controller#getControllerOf()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_ControllerOf();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PpucomponentsFactory getPpucomponentsFactory();

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
		 * The meta object literal for the '{@link domain.ppu.ppucomponents.impl.PowerSplitterImpl <em>Power Splitter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.ppu.ppucomponents.impl.PowerSplitterImpl
		 * @see domain.ppu.ppucomponents.impl.PpucomponentsPackageImpl#getPowerSplitter()
		 * @generated
		 */
		EClass POWER_SPLITTER = eINSTANCE.getPowerSplitter();

		/**
		 * The meta object literal for the '<em><b>Powersupply</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_SPLITTER__POWERSUPPLY = eINSTANCE.getPowerSplitter_Powersupply();

		/**
		 * The meta object literal for the '{@link domain.ppu.ppucomponents.impl.OpticalSensorImpl <em>Optical Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.ppu.ppucomponents.impl.OpticalSensorImpl
		 * @see domain.ppu.ppucomponents.impl.PpucomponentsPackageImpl#getOpticalSensor()
		 * @generated
		 */
		EClass OPTICAL_SENSOR = eINSTANCE.getOpticalSensor();

		/**
		 * The meta object literal for the '{@link domain.ppu.ppucomponents.impl.PneumaticPipeImpl <em>Pneumatic Pipe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.ppu.ppucomponents.impl.PneumaticPipeImpl
		 * @see domain.ppu.ppucomponents.impl.PpucomponentsPackageImpl#getPneumaticPipe()
		 * @generated
		 */
		EClass PNEUMATIC_PIPE = eINSTANCE.getPneumaticPipe();

		/**
		 * The meta object literal for the '{@link domain.ppu.ppucomponents.impl.PneumaticSplitterImpl <em>Pneumatic Splitter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.ppu.ppucomponents.impl.PneumaticSplitterImpl
		 * @see domain.ppu.ppucomponents.impl.PpucomponentsPackageImpl#getPneumaticSplitter()
		 * @generated
		 */
		EClass PNEUMATIC_SPLITTER = eINSTANCE.getPneumaticSplitter();

		/**
		 * The meta object literal for the '<em><b>Pneumaticsupply</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PNEUMATIC_SPLITTER__PNEUMATICSUPPLY = eINSTANCE.getPneumaticSplitter_Pneumaticsupply();

		/**
		 * The meta object literal for the '{@link domain.ppu.ppucomponents.impl.MonostableCylinderImpl <em>Monostable Cylinder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.ppu.ppucomponents.impl.MonostableCylinderImpl
		 * @see domain.ppu.ppucomponents.impl.PpucomponentsPackageImpl#getMonostableCylinder()
		 * @generated
		 */
		EClass MONOSTABLE_CYLINDER = eINSTANCE.getMonostableCylinder();

		/**
		 * The meta object literal for the '<em><b>Housing</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONOSTABLE_CYLINDER__HOUSING = eINSTANCE.getMonostableCylinder_Housing();

		/**
		 * The meta object literal for the '<em><b>Spring</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONOSTABLE_CYLINDER__SPRING = eINSTANCE.getMonostableCylinder_Spring();

		/**
		 * The meta object literal for the '<em><b>Reed Switches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONOSTABLE_CYLINDER__REED_SWITCHES = eINSTANCE.getMonostableCylinder_ReedSwitches();

		/**
		 * The meta object literal for the '<em><b>Cylinder Part</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONOSTABLE_CYLINDER__CYLINDER_PART = eINSTANCE.getMonostableCylinder_CylinderPart();

		/**
		 * The meta object literal for the '<em><b>Valve</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONOSTABLE_CYLINDER__VALVE = eINSTANCE.getMonostableCylinder_Valve();

		/**
		 * The meta object literal for the '<em><b>Bus Slave</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONOSTABLE_CYLINDER__BUS_SLAVE = eINSTANCE.getMonostableCylinder_BusSlave();

		/**
		 * The meta object literal for the '<em><b>Pusher</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONOSTABLE_CYLINDER__PUSHER = eINSTANCE.getMonostableCylinder_Pusher();

		/**
		 * The meta object literal for the '{@link domain.ppu.ppucomponents.impl.PresenceSensorImpl <em>Presence Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.ppu.ppucomponents.impl.PresenceSensorImpl
		 * @see domain.ppu.ppucomponents.impl.PpucomponentsPackageImpl#getPresenceSensor()
		 * @generated
		 */
		EClass PRESENCE_SENSOR = eINSTANCE.getPresenceSensor();

		/**
		 * The meta object literal for the '{@link domain.ppu.ppucomponents.impl.RegularValveImpl <em>Regular Valve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.ppu.ppucomponents.impl.RegularValveImpl
		 * @see domain.ppu.ppucomponents.impl.PpucomponentsPackageImpl#getRegularValve()
		 * @generated
		 */
		EClass REGULAR_VALVE = eINSTANCE.getRegularValve();

		/**
		 * The meta object literal for the '{@link domain.ppu.ppucomponents.impl.FrameImpl <em>Frame</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.ppu.ppucomponents.impl.FrameImpl
		 * @see domain.ppu.ppucomponents.impl.PpucomponentsPackageImpl#getFrame()
		 * @generated
		 */
		EClass FRAME = eINSTANCE.getFrame();

		/**
		 * The meta object literal for the '<em><b>Conveyorbelt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAME__CONVEYORBELT = eINSTANCE.getFrame_Conveyorbelt();

		/**
		 * The meta object literal for the '{@link domain.ppu.ppucomponents.impl.InductiveSensorImpl <em>Inductive Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.ppu.ppucomponents.impl.InductiveSensorImpl
		 * @see domain.ppu.ppucomponents.impl.PpucomponentsPackageImpl#getInductiveSensor()
		 * @generated
		 */
		EClass INDUCTIVE_SENSOR = eINSTANCE.getInductiveSensor();

		/**
		 * The meta object literal for the '{@link domain.ppu.ppucomponents.impl.ReedSwitchImpl <em>Reed Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.ppu.ppucomponents.impl.ReedSwitchImpl
		 * @see domain.ppu.ppucomponents.impl.PpucomponentsPackageImpl#getReedSwitch()
		 * @generated
		 */
		EClass REED_SWITCH = eINSTANCE.getReedSwitch();

		/**
		 * The meta object literal for the '{@link domain.ppu.ppucomponents.impl.VacuumSwitchImpl <em>Vacuum Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.ppu.ppucomponents.impl.VacuumSwitchImpl
		 * @see domain.ppu.ppucomponents.impl.PpucomponentsPackageImpl#getVacuumSwitch()
		 * @generated
		 */
		EClass VACUUM_SWITCH = eINSTANCE.getVacuumSwitch();

		/**
		 * The meta object literal for the '{@link domain.ppu.ppucomponents.impl.ProportionalCylinderImpl <em>Proportional Cylinder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.ppu.ppucomponents.impl.ProportionalCylinderImpl
		 * @see domain.ppu.ppucomponents.impl.PpucomponentsPackageImpl#getProportionalCylinder()
		 * @generated
		 */
		EClass PROPORTIONAL_CYLINDER = eINSTANCE.getProportionalCylinder();

		/**
		 * The meta object literal for the '{@link domain.ppu.ppucomponents.impl.BistableCylinderImpl <em>Bistable Cylinder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.ppu.ppucomponents.impl.BistableCylinderImpl
		 * @see domain.ppu.ppucomponents.impl.PpucomponentsPackageImpl#getBistableCylinder()
		 * @generated
		 */
		EClass BISTABLE_CYLINDER = eINSTANCE.getBistableCylinder();

		/**
		 * The meta object literal for the '{@link domain.ppu.ppucomponents.impl.WaterSplitterImpl <em>Water Splitter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.ppu.ppucomponents.impl.WaterSplitterImpl
		 * @see domain.ppu.ppucomponents.impl.PpucomponentsPackageImpl#getWaterSplitter()
		 * @generated
		 */
		EClass WATER_SPLITTER = eINSTANCE.getWaterSplitter();

		/**
		 * The meta object literal for the '<em><b>Watersupply</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WATER_SPLITTER__WATERSUPPLY = eINSTANCE.getWaterSplitter_Watersupply();

		/**
		 * The meta object literal for the '{@link domain.ppu.ppucomponents.impl.OperationPanelImpl <em>Operation Panel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.ppu.ppucomponents.impl.OperationPanelImpl
		 * @see domain.ppu.ppucomponents.impl.PpucomponentsPackageImpl#getOperationPanel()
		 * @generated
		 */
		EClass OPERATION_PANEL = eINSTANCE.getOperationPanel();

		/**
		 * The meta object literal for the '<em><b>Screwing rack</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_PANEL__SCREWING_RACK = eINSTANCE.getOperationPanel_Screwing_rack();

		/**
		 * The meta object literal for the '<em><b>Leds</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_PANEL__LEDS = eINSTANCE.getOperationPanel_Leds();

		/**
		 * The meta object literal for the '<em><b>Buttons</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_PANEL__BUTTONS = eINSTANCE.getOperationPanel_Buttons();

		/**
		 * The meta object literal for the '{@link domain.ppu.ppucomponents.impl.PowerCableImpl <em>Power Cable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.ppu.ppucomponents.impl.PowerCableImpl
		 * @see domain.ppu.ppucomponents.impl.PpucomponentsPackageImpl#getPowerCable()
		 * @generated
		 */
		EClass POWER_CABLE = eINSTANCE.getPowerCable();

		/**
		 * The meta object literal for the '{@link domain.ppu.ppucomponents.impl.PressureSensorImpl <em>Pressure Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.ppu.ppucomponents.impl.PressureSensorImpl
		 * @see domain.ppu.ppucomponents.impl.PpucomponentsPackageImpl#getPressureSensor()
		 * @generated
		 */
		EClass PRESSURE_SENSOR = eINSTANCE.getPressureSensor();

		/**
		 * The meta object literal for the '{@link domain.ppu.ppucomponents.impl.BottleSeperatorImpl <em>Bottle Seperator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.ppu.ppucomponents.impl.BottleSeperatorImpl
		 * @see domain.ppu.ppucomponents.impl.PpucomponentsPackageImpl#getBottleSeperator()
		 * @generated
		 */
		EClass BOTTLE_SEPERATOR = eINSTANCE.getBottleSeperator();

		/**
		 * The meta object literal for the '<em><b>Signalinterface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOTTLE_SEPERATOR__SIGNALINTERFACE = eINSTANCE.getBottleSeperator_Signalinterface();

		/**
		 * The meta object literal for the '<em><b>Pneumaticsupply</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOTTLE_SEPERATOR__PNEUMATICSUPPLY = eINSTANCE.getBottleSeperator_Pneumaticsupply();

		/**
		 * The meta object literal for the '<em><b>Powersupply</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOTTLE_SEPERATOR__POWERSUPPLY = eINSTANCE.getBottleSeperator_Powersupply();

		/**
		 * The meta object literal for the '<em><b>Screwing to rack</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOTTLE_SEPERATOR__SCREWING_TO_RACK = eINSTANCE.getBottleSeperator_Screwing_to_rack();

		/**
		 * The meta object literal for the '{@link domain.ppu.ppucomponents.impl.ControllerImpl <em>Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.ppu.ppucomponents.impl.ControllerImpl
		 * @see domain.ppu.ppucomponents.impl.PpucomponentsPackageImpl#getController()
		 * @generated
		 */
		EClass CONTROLLER = eINSTANCE.getController();

		/**
		 * The meta object literal for the '<em><b>Powersupply</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__POWERSUPPLY = eINSTANCE.getController_Powersupply();

		/**
		 * The meta object literal for the '<em><b>Controller Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__CONTROLLER_OF = eINSTANCE.getController_ControllerOf();

	}

} //PpucomponentsPackage
