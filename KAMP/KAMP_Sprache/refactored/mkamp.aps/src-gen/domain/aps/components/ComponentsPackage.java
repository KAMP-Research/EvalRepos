/**
 */
package domain.aps.components;

import domain.aps.mechanicalcomponents.MechanicalcomponentsPackage;

import domain.as.ComponentRepository.ComponentRepositoryPackage;

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
 * @see domain.aps.components.ComponentsFactory
 * @model kind="package"
 * @generated
 */
public interface ComponentsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "components";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "components";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "components";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentsPackage eINSTANCE = domain.aps.components.impl.ComponentsPackageImpl.init();

	/**
	 * The meta object id for the '{@link domain.aps.components.impl.PowerSupplyImpl <em>Power Supply</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.aps.components.impl.PowerSupplyImpl
	 * @see domain.aps.components.impl.ComponentsPackageImpl#getPowerSupply()
	 * @generated
	 */
	int POWER_SUPPLY = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SUPPLY__ID = ComponentRepositoryPackage.COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SUPPLY__NAME = ComponentRepositoryPackage.COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SUPPLY__CONNECTED_INTERFACES = ComponentRepositoryPackage.COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SUPPLY__PARENT = ComponentRepositoryPackage.COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SUPPLY__PARENT_MODULE = ComponentRepositoryPackage.COMPONENT__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SUPPLY__PARENT_ELEMENT = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Power Supply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SUPPLY_FEATURE_COUNT = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Power Supply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_SUPPLY_OPERATION_COUNT = ComponentRepositoryPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.aps.components.impl.ConveyorBeltImpl <em>Conveyor Belt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.aps.components.impl.ConveyorBeltImpl
	 * @see domain.aps.components.impl.ComponentsPackageImpl#getConveyorBelt()
	 * @generated
	 */
	int CONVEYOR_BELT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT__ID = ComponentRepositoryPackage.COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT__NAME = ComponentRepositoryPackage.COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT__CONNECTED_INTERFACES = ComponentRepositoryPackage.COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT__PARENT = ComponentRepositoryPackage.COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT__PARENT_MODULE = ComponentRepositoryPackage.COMPONENT__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Rubber Band</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT__RUBBER_BAND = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Conveyor Belt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT_FEATURE_COUNT = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Conveyor Belt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT_OPERATION_COUNT = ComponentRepositoryPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.aps.components.impl.FixtureImpl <em>Fixture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.aps.components.impl.FixtureImpl
	 * @see domain.aps.components.impl.ComponentsPackageImpl#getFixture()
	 * @generated
	 */
	int FIXTURE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXTURE__ID = ComponentRepositoryPackage.COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXTURE__NAME = ComponentRepositoryPackage.COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXTURE__CONNECTED_INTERFACES = ComponentRepositoryPackage.COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXTURE__PARENT = ComponentRepositoryPackage.COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXTURE__PARENT_MODULE = ComponentRepositoryPackage.COMPONENT__PARENT_MODULE;

	/**
	 * The number of structural features of the '<em>Fixture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXTURE_FEATURE_COUNT = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fixture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXTURE_OPERATION_COUNT = ComponentRepositoryPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.aps.components.impl.PipeImpl <em>Pipe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.aps.components.impl.PipeImpl
	 * @see domain.aps.components.impl.ComponentsPackageImpl#getPipe()
	 * @generated
	 */
	int PIPE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE__ID = ComponentRepositoryPackage.COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE__NAME = ComponentRepositoryPackage.COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE__CONNECTED_INTERFACES = ComponentRepositoryPackage.COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE__PARENT = ComponentRepositoryPackage.COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE__PARENT_MODULE = ComponentRepositoryPackage.COMPONENT__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Plugs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE__PLUGS = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pipe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE_FEATURE_COUNT = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pipe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE_OPERATION_COUNT = ComponentRepositoryPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.aps.components.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.aps.components.impl.SensorImpl
	 * @see domain.aps.components.impl.ComponentsPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__ID = ComponentRepositoryPackage.COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NAME = ComponentRepositoryPackage.COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__CONNECTED_INTERFACES = ComponentRepositoryPackage.COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__PARENT = ComponentRepositoryPackage.COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__PARENT_MODULE = ComponentRepositoryPackage.COMPONENT__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Physicalconnection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__PHYSICALCONNECTION = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Signalinterface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__SIGNALINTERFACE = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Powersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__POWERSUPPLY = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = ComponentRepositoryPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.aps.components.impl.CylinderImpl <em>Cylinder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.aps.components.impl.CylinderImpl
	 * @see domain.aps.components.impl.ComponentsPackageImpl#getCylinder()
	 * @generated
	 */
	int CYLINDER = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER__ID = ComponentRepositoryPackage.COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER__NAME = ComponentRepositoryPackage.COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER__CONNECTED_INTERFACES = ComponentRepositoryPackage.COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER__PARENT = ComponentRepositoryPackage.COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER__PARENT_MODULE = ComponentRepositoryPackage.COMPONENT__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Pneumaticsupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER__PNEUMATICSUPPLY = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Signal Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER__SIGNAL_INTERFACE = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cylinder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER_FEATURE_COUNT = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Cylinder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER_OPERATION_COUNT = ComponentRepositoryPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.aps.components.impl.DispenserImpl <em>Dispenser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.aps.components.impl.DispenserImpl
	 * @see domain.aps.components.impl.ComponentsPackageImpl#getDispenser()
	 * @generated
	 */
	int DISPENSER = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPENSER__ID = ComponentRepositoryPackage.COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPENSER__NAME = ComponentRepositoryPackage.COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPENSER__CONNECTED_INTERFACES = ComponentRepositoryPackage.COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPENSER__PARENT = ComponentRepositoryPackage.COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPENSER__PARENT_MODULE = ComponentRepositoryPackage.COMPONENT__PARENT_MODULE;

	/**
	 * The number of structural features of the '<em>Dispenser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPENSER_FEATURE_COUNT = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dispenser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPENSER_OPERATION_COUNT = ComponentRepositoryPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.aps.components.impl.SplitterImpl <em>Splitter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.aps.components.impl.SplitterImpl
	 * @see domain.aps.components.impl.ComponentsPackageImpl#getSplitter()
	 * @generated
	 */
	int SPLITTER = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLITTER__ID = ComponentRepositoryPackage.COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLITTER__NAME = ComponentRepositoryPackage.COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLITTER__CONNECTED_INTERFACES = ComponentRepositoryPackage.COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLITTER__PARENT = ComponentRepositoryPackage.COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLITTER__PARENT_MODULE = ComponentRepositoryPackage.COMPONENT__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Screwing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLITTER__SCREWING = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Splitter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLITTER_FEATURE_COUNT = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Splitter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLITTER_OPERATION_COUNT = ComponentRepositoryPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.aps.components.impl.MotorImpl <em>Motor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.aps.components.impl.MotorImpl
	 * @see domain.aps.components.impl.ComponentsPackageImpl#getMotor()
	 * @generated
	 */
	int MOTOR = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR__ID = ComponentRepositoryPackage.COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR__NAME = ComponentRepositoryPackage.COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR__CONNECTED_INTERFACES = ComponentRepositoryPackage.COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR__PARENT = ComponentRepositoryPackage.COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR__PARENT_MODULE = ComponentRepositoryPackage.COMPONENT__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Gearing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR__GEARING = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Screwing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR__SCREWING = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Powersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR__POWERSUPPLY = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_FEATURE_COUNT = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_OPERATION_COUNT = ComponentRepositoryPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.aps.components.impl.CableImpl <em>Cable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.aps.components.impl.CableImpl
	 * @see domain.aps.components.impl.ComponentsPackageImpl#getCable()
	 * @generated
	 */
	int CABLE = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE__ID = ComponentRepositoryPackage.COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE__NAME = ComponentRepositoryPackage.COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE__CONNECTED_INTERFACES = ComponentRepositoryPackage.COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE__PARENT = ComponentRepositoryPackage.COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE__PARENT_MODULE = ComponentRepositoryPackage.COMPONENT__PARENT_MODULE;

	/**
	 * The number of structural features of the '<em>Cable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_FEATURE_COUNT = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_OPERATION_COUNT = ComponentRepositoryPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.aps.components.impl.ValveImpl <em>Valve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.aps.components.impl.ValveImpl
	 * @see domain.aps.components.impl.ComponentsPackageImpl#getValve()
	 * @generated
	 */
	int VALVE = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALVE__ID = ComponentRepositoryPackage.COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALVE__NAME = ComponentRepositoryPackage.COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALVE__CONNECTED_INTERFACES = ComponentRepositoryPackage.COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALVE__PARENT = ComponentRepositoryPackage.COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALVE__PARENT_MODULE = ComponentRepositoryPackage.COMPONENT__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Pneumaticsupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALVE__PNEUMATICSUPPLY = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Powersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALVE__POWERSUPPLY = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Signalinterface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALVE__SIGNALINTERFACE = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Valve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALVE_FEATURE_COUNT = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Valve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALVE_OPERATION_COUNT = ComponentRepositoryPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.aps.components.impl.TankImpl <em>Tank</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.aps.components.impl.TankImpl
	 * @see domain.aps.components.impl.ComponentsPackageImpl#getTank()
	 * @generated
	 */
	int TANK = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANK__ID = ComponentRepositoryPackage.COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANK__NAME = ComponentRepositoryPackage.COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANK__CONNECTED_INTERFACES = ComponentRepositoryPackage.COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANK__PARENT = ComponentRepositoryPackage.COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANK__PARENT_MODULE = ComponentRepositoryPackage.COMPONENT__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Watersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANK__WATERSUPPLY = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Screwing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANK__SCREWING = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tank</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANK_FEATURE_COUNT = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Tank</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANK_OPERATION_COUNT = ComponentRepositoryPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.aps.components.impl.PusherImpl <em>Pusher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.aps.components.impl.PusherImpl
	 * @see domain.aps.components.impl.ComponentsPackageImpl#getPusher()
	 * @generated
	 */
	int PUSHER = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHER__ID = ComponentRepositoryPackage.COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHER__NAME = ComponentRepositoryPackage.COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHER__CONNECTED_INTERFACES = ComponentRepositoryPackage.COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHER__PARENT = ComponentRepositoryPackage.COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHER__PARENT_MODULE = ComponentRepositoryPackage.COMPONENT__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Components Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHER__COMPONENTS_REPOSITORY = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fixture Cylinder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHER__FIXTURE_CYLINDER = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bus Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHER__BUS_BOX = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bus Cable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHER__BUS_CABLE = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Pusher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHER_FEATURE_COUNT = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Pusher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHER_OPERATION_COUNT = ComponentRepositoryPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.aps.components.impl.CornerImpl <em>Corner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.aps.components.impl.CornerImpl
	 * @see domain.aps.components.impl.ComponentsPackageImpl#getCorner()
	 * @generated
	 */
	int CORNER = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORNER__ID = ComponentRepositoryPackage.COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORNER__NAME = ComponentRepositoryPackage.COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORNER__CONNECTED_INTERFACES = ComponentRepositoryPackage.COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORNER__PARENT = ComponentRepositoryPackage.COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORNER__PARENT_MODULE = ComponentRepositoryPackage.COMPONENT__PARENT_MODULE;

	/**
	 * The number of structural features of the '<em>Corner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORNER_FEATURE_COUNT = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Corner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORNER_OPERATION_COUNT = ComponentRepositoryPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.aps.components.impl.RackImpl <em>Rack</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.aps.components.impl.RackImpl
	 * @see domain.aps.components.impl.ComponentsPackageImpl#getRack()
	 * @generated
	 */
	int RACK = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK__ID = ComponentRepositoryPackage.COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK__NAME = ComponentRepositoryPackage.COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK__CONNECTED_INTERFACES = ComponentRepositoryPackage.COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK__PARENT = ComponentRepositoryPackage.COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK__PARENT_MODULE = ComponentRepositoryPackage.COMPONENT__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Screwing to base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK__SCREWING_TO_BASE = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK_FEATURE_COUNT = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK_OPERATION_COUNT = ComponentRepositoryPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.aps.components.impl.CompressorImpl <em>Compressor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.aps.components.impl.CompressorImpl
	 * @see domain.aps.components.impl.ComponentsPackageImpl#getCompressor()
	 * @generated
	 */
	int COMPRESSOR = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRESSOR__ID = ComponentRepositoryPackage.COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRESSOR__NAME = ComponentRepositoryPackage.COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRESSOR__CONNECTED_INTERFACES = ComponentRepositoryPackage.COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRESSOR__PARENT = ComponentRepositoryPackage.COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRESSOR__PARENT_MODULE = ComponentRepositoryPackage.COMPONENT__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Powersupply</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRESSOR__POWERSUPPLY = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pneumaticsupply</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRESSOR__PNEUMATICSUPPLY = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRESSOR__PINS = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Screwing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRESSOR__SCREWING = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Switch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRESSOR__SWITCH = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Compressor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRESSOR_FEATURE_COUNT = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Compressor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRESSOR_OPERATION_COUNT = ComponentRepositoryPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.aps.components.impl.PanelImpl <em>Panel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.aps.components.impl.PanelImpl
	 * @see domain.aps.components.impl.ComponentsPackageImpl#getPanel()
	 * @generated
	 */
	int PANEL = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__ID = ComponentRepositoryPackage.COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__NAME = ComponentRepositoryPackage.COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__CONNECTED_INTERFACES = ComponentRepositoryPackage.COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__PARENT = ComponentRepositoryPackage.COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__PARENT_MODULE = ComponentRepositoryPackage.COMPONENT__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Component Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__COMPONENT_REPOSITORY = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_FEATURE_COUNT = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_OPERATION_COUNT = ComponentRepositoryPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.aps.components.impl.MechanicalAssemblyImpl <em>Mechanical Assembly</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.aps.components.impl.MechanicalAssemblyImpl
	 * @see domain.aps.components.impl.ComponentsPackageImpl#getMechanicalAssembly()
	 * @generated
	 */
	int MECHANICAL_ASSEMBLY = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANICAL_ASSEMBLY__ID = ComponentRepositoryPackage.COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANICAL_ASSEMBLY__NAME = ComponentRepositoryPackage.COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANICAL_ASSEMBLY__CONNECTED_INTERFACES = ComponentRepositoryPackage.COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANICAL_ASSEMBLY__PARENT = ComponentRepositoryPackage.COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANICAL_ASSEMBLY__PARENT_MODULE = ComponentRepositoryPackage.COMPONENT__PARENT_MODULE;

	/**
	 * The number of structural features of the '<em>Mechanical Assembly</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANICAL_ASSEMBLY_FEATURE_COUNT = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mechanical Assembly</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANICAL_ASSEMBLY_OPERATION_COUNT = ComponentRepositoryPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.aps.components.impl.RegularRampImpl <em>Regular Ramp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.aps.components.impl.RegularRampImpl
	 * @see domain.aps.components.impl.ComponentsPackageImpl#getRegularRamp()
	 * @generated
	 */
	int REGULAR_RAMP = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_RAMP__ID = MechanicalcomponentsPackage.RAMP__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_RAMP__NAME = MechanicalcomponentsPackage.RAMP__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_RAMP__CONNECTED_INTERFACES = MechanicalcomponentsPackage.RAMP__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_RAMP__PARENT = MechanicalcomponentsPackage.RAMP__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_RAMP__PARENT_MODULE = MechanicalcomponentsPackage.RAMP__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Screwing base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_RAMP__SCREWING_BASE = MechanicalcomponentsPackage.RAMP__SCREWING_BASE;

	/**
	 * The feature id for the '<em><b>Screwing component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_RAMP__SCREWING_COMPONENT = MechanicalcomponentsPackage.RAMP__SCREWING_COMPONENT;

	/**
	 * The feature id for the '<em><b>Physicalconnection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_RAMP__PHYSICALCONNECTION = MechanicalcomponentsPackage.RAMP__PHYSICALCONNECTION;

	/**
	 * The number of structural features of the '<em>Regular Ramp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_RAMP_FEATURE_COUNT = MechanicalcomponentsPackage.RAMP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Regular Ramp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_RAMP_OPERATION_COUNT = MechanicalcomponentsPackage.RAMP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.aps.components.impl.TurningTableImpl <em>Turning Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.aps.components.impl.TurningTableImpl
	 * @see domain.aps.components.impl.ComponentsPackageImpl#getTurningTable()
	 * @generated
	 */
	int TURNING_TABLE = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNING_TABLE__ID = ModuleRepositoryPackage.MODULE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNING_TABLE__NAME = ModuleRepositoryPackage.MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNING_TABLE__PARENT_ENTITY = ModuleRepositoryPackage.MODULE__PARENT_ENTITY;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNING_TABLE__MODULES = ModuleRepositoryPackage.MODULE__MODULES;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNING_TABLE__COMPONENTS = ModuleRepositoryPackage.MODULE__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNING_TABLE__INTERFACES = ModuleRepositoryPackage.MODULE__INTERFACES;

	/**
	 * The feature id for the '<em><b>Rack for turningtable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNING_TABLE__RACK_FOR_TURNINGTABLE = ModuleRepositoryPackage.MODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Table to stand on</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNING_TABLE__TABLE_TO_STAND_ON = ModuleRepositoryPackage.MODULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Motor to drive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNING_TABLE__MOTOR_TO_DRIVE = ModuleRepositoryPackage.MODULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bus Slave</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNING_TABLE__BUS_SLAVE = ModuleRepositoryPackage.MODULE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Bus Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNING_TABLE__BUS_BOX = ModuleRepositoryPackage.MODULE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Bus Cable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNING_TABLE__BUS_CABLE = ModuleRepositoryPackage.MODULE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Potentiometer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNING_TABLE__POTENTIOMETER = ModuleRepositoryPackage.MODULE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Turning Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNING_TABLE_FEATURE_COUNT = ModuleRepositoryPackage.MODULE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Turning Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNING_TABLE_OPERATION_COUNT = ModuleRepositoryPackage.MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.aps.components.impl.CylinderPartImpl <em>Cylinder Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.aps.components.impl.CylinderPartImpl
	 * @see domain.aps.components.impl.ComponentsPackageImpl#getCylinderPart()
	 * @generated
	 */
	int CYLINDER_PART = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER_PART__ID = MechanicalcomponentsPackage.MECHANICAL_PART__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER_PART__NAME = MechanicalcomponentsPackage.MECHANICAL_PART__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER_PART__CONNECTED_INTERFACES = MechanicalcomponentsPackage.MECHANICAL_PART__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER_PART__PARENT = MechanicalcomponentsPackage.MECHANICAL_PART__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER_PART__PARENT_MODULE = MechanicalcomponentsPackage.MECHANICAL_PART__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Screwing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER_PART__SCREWING = MechanicalcomponentsPackage.MECHANICAL_PART__SCREWING;

	/**
	 * The number of structural features of the '<em>Cylinder Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER_PART_FEATURE_COUNT = MechanicalcomponentsPackage.MECHANICAL_PART_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cylinder Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER_PART_OPERATION_COUNT = MechanicalcomponentsPackage.MECHANICAL_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.aps.components.impl.SimpleMotorImpl <em>Simple Motor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.aps.components.impl.SimpleMotorImpl
	 * @see domain.aps.components.impl.ComponentsPackageImpl#getSimpleMotor()
	 * @generated
	 */
	int SIMPLE_MOTOR = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MOTOR__ID = MOTOR__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MOTOR__NAME = MOTOR__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MOTOR__CONNECTED_INTERFACES = MOTOR__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MOTOR__PARENT = MOTOR__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MOTOR__PARENT_MODULE = MOTOR__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Gearing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MOTOR__GEARING = MOTOR__GEARING;

	/**
	 * The feature id for the '<em><b>Screwing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MOTOR__SCREWING = MOTOR__SCREWING;

	/**
	 * The feature id for the '<em><b>Powersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MOTOR__POWERSUPPLY = MOTOR__POWERSUPPLY;

	/**
	 * The number of structural features of the '<em>Simple Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MOTOR_FEATURE_COUNT = MOTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MOTOR_OPERATION_COUNT = MOTOR_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link domain.aps.components.PowerSupply <em>Power Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Supply</em>'.
	 * @see domain.aps.components.PowerSupply
	 * @generated
	 */
	EClass getPowerSupply();

	/**
	 * Returns the meta object for class '{@link domain.aps.components.ConveyorBelt <em>Conveyor Belt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conveyor Belt</em>'.
	 * @see domain.aps.components.ConveyorBelt
	 * @generated
	 */
	EClass getConveyorBelt();

	/**
	 * Returns the meta object for the containment reference '{@link domain.aps.components.ConveyorBelt#getRubberBand <em>Rubber Band</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rubber Band</em>'.
	 * @see domain.aps.components.ConveyorBelt#getRubberBand()
	 * @see #getConveyorBelt()
	 * @generated
	 */
	EReference getConveyorBelt_RubberBand();

	/**
	 * Returns the meta object for class '{@link domain.aps.components.Fixture <em>Fixture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixture</em>'.
	 * @see domain.aps.components.Fixture
	 * @generated
	 */
	EClass getFixture();

	/**
	 * Returns the meta object for class '{@link domain.aps.components.Pipe <em>Pipe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pipe</em>'.
	 * @see domain.aps.components.Pipe
	 * @generated
	 */
	EClass getPipe();

	/**
	 * Returns the meta object for the reference '{@link domain.aps.components.Pipe#getPlugs <em>Plugs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Plugs</em>'.
	 * @see domain.aps.components.Pipe#getPlugs()
	 * @see #getPipe()
	 * @generated
	 */
	EReference getPipe_Plugs();

	/**
	 * Returns the meta object for class '{@link domain.aps.components.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see domain.aps.components.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for the reference '{@link domain.aps.components.Sensor#getPhysicalconnection <em>Physicalconnection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Physicalconnection</em>'.
	 * @see domain.aps.components.Sensor#getPhysicalconnection()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_Physicalconnection();

	/**
	 * Returns the meta object for the reference '{@link domain.aps.components.Sensor#getSignalinterface <em>Signalinterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signalinterface</em>'.
	 * @see domain.aps.components.Sensor#getSignalinterface()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_Signalinterface();

	/**
	 * Returns the meta object for the reference '{@link domain.aps.components.Sensor#getPowersupply <em>Powersupply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Powersupply</em>'.
	 * @see domain.aps.components.Sensor#getPowersupply()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_Powersupply();

	/**
	 * Returns the meta object for class '{@link domain.aps.components.Cylinder <em>Cylinder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cylinder</em>'.
	 * @see domain.aps.components.Cylinder
	 * @generated
	 */
	EClass getCylinder();

	/**
	 * Returns the meta object for the reference '{@link domain.aps.components.Cylinder#getPneumaticsupply <em>Pneumaticsupply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pneumaticsupply</em>'.
	 * @see domain.aps.components.Cylinder#getPneumaticsupply()
	 * @see #getCylinder()
	 * @generated
	 */
	EReference getCylinder_Pneumaticsupply();

	/**
	 * Returns the meta object for the reference '{@link domain.aps.components.Cylinder#getSignalInterface <em>Signal Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signal Interface</em>'.
	 * @see domain.aps.components.Cylinder#getSignalInterface()
	 * @see #getCylinder()
	 * @generated
	 */
	EReference getCylinder_SignalInterface();

	/**
	 * Returns the meta object for class '{@link domain.aps.components.Dispenser <em>Dispenser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dispenser</em>'.
	 * @see domain.aps.components.Dispenser
	 * @generated
	 */
	EClass getDispenser();

	/**
	 * Returns the meta object for class '{@link domain.aps.components.Splitter <em>Splitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Splitter</em>'.
	 * @see domain.aps.components.Splitter
	 * @generated
	 */
	EClass getSplitter();

	/**
	 * Returns the meta object for the reference '{@link domain.aps.components.Splitter#getScrewing <em>Screwing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Screwing</em>'.
	 * @see domain.aps.components.Splitter#getScrewing()
	 * @see #getSplitter()
	 * @generated
	 */
	EReference getSplitter_Screwing();

	/**
	 * Returns the meta object for class '{@link domain.aps.components.Motor <em>Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Motor</em>'.
	 * @see domain.aps.components.Motor
	 * @generated
	 */
	EClass getMotor();

	/**
	 * Returns the meta object for the reference '{@link domain.aps.components.Motor#getGearing <em>Gearing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gearing</em>'.
	 * @see domain.aps.components.Motor#getGearing()
	 * @see #getMotor()
	 * @generated
	 */
	EReference getMotor_Gearing();

	/**
	 * Returns the meta object for the reference '{@link domain.aps.components.Motor#getScrewing <em>Screwing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Screwing</em>'.
	 * @see domain.aps.components.Motor#getScrewing()
	 * @see #getMotor()
	 * @generated
	 */
	EReference getMotor_Screwing();

	/**
	 * Returns the meta object for the reference '{@link domain.aps.components.Motor#getPowersupply <em>Powersupply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Powersupply</em>'.
	 * @see domain.aps.components.Motor#getPowersupply()
	 * @see #getMotor()
	 * @generated
	 */
	EReference getMotor_Powersupply();

	/**
	 * Returns the meta object for class '{@link domain.aps.components.Cable <em>Cable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cable</em>'.
	 * @see domain.aps.components.Cable
	 * @generated
	 */
	EClass getCable();

	/**
	 * Returns the meta object for class '{@link domain.aps.components.Valve <em>Valve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valve</em>'.
	 * @see domain.aps.components.Valve
	 * @generated
	 */
	EClass getValve();

	/**
	 * Returns the meta object for the reference '{@link domain.aps.components.Valve#getPneumaticsupply <em>Pneumaticsupply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pneumaticsupply</em>'.
	 * @see domain.aps.components.Valve#getPneumaticsupply()
	 * @see #getValve()
	 * @generated
	 */
	EReference getValve_Pneumaticsupply();

	/**
	 * Returns the meta object for the reference '{@link domain.aps.components.Valve#getPowersupply <em>Powersupply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Powersupply</em>'.
	 * @see domain.aps.components.Valve#getPowersupply()
	 * @see #getValve()
	 * @generated
	 */
	EReference getValve_Powersupply();

	/**
	 * Returns the meta object for the reference '{@link domain.aps.components.Valve#getSignalinterface <em>Signalinterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signalinterface</em>'.
	 * @see domain.aps.components.Valve#getSignalinterface()
	 * @see #getValve()
	 * @generated
	 */
	EReference getValve_Signalinterface();

	/**
	 * Returns the meta object for class '{@link domain.aps.components.Tank <em>Tank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tank</em>'.
	 * @see domain.aps.components.Tank
	 * @generated
	 */
	EClass getTank();

	/**
	 * Returns the meta object for the reference '{@link domain.aps.components.Tank#getWatersupply <em>Watersupply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Watersupply</em>'.
	 * @see domain.aps.components.Tank#getWatersupply()
	 * @see #getTank()
	 * @generated
	 */
	EReference getTank_Watersupply();

	/**
	 * Returns the meta object for the reference '{@link domain.aps.components.Tank#getScrewing <em>Screwing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Screwing</em>'.
	 * @see domain.aps.components.Tank#getScrewing()
	 * @see #getTank()
	 * @generated
	 */
	EReference getTank_Screwing();

	/**
	 * Returns the meta object for class '{@link domain.aps.components.Pusher <em>Pusher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pusher</em>'.
	 * @see domain.aps.components.Pusher
	 * @generated
	 */
	EClass getPusher();

	/**
	 * Returns the meta object for the reference '{@link domain.aps.components.Pusher#getComponentsRepository <em>Components Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Components Repository</em>'.
	 * @see domain.aps.components.Pusher#getComponentsRepository()
	 * @see #getPusher()
	 * @generated
	 */
	EReference getPusher_ComponentsRepository();

	/**
	 * Returns the meta object for the containment reference '{@link domain.aps.components.Pusher#getFixtureCylinder <em>Fixture Cylinder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fixture Cylinder</em>'.
	 * @see domain.aps.components.Pusher#getFixtureCylinder()
	 * @see #getPusher()
	 * @generated
	 */
	EReference getPusher_FixtureCylinder();

	/**
	 * Returns the meta object for the containment reference '{@link domain.aps.components.Pusher#getBusBox <em>Bus Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bus Box</em>'.
	 * @see domain.aps.components.Pusher#getBusBox()
	 * @see #getPusher()
	 * @generated
	 */
	EReference getPusher_BusBox();

	/**
	 * Returns the meta object for the containment reference list '{@link domain.aps.components.Pusher#getBusCable <em>Bus Cable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bus Cable</em>'.
	 * @see domain.aps.components.Pusher#getBusCable()
	 * @see #getPusher()
	 * @generated
	 */
	EReference getPusher_BusCable();

	/**
	 * Returns the meta object for class '{@link domain.aps.components.Corner <em>Corner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Corner</em>'.
	 * @see domain.aps.components.Corner
	 * @generated
	 */
	EClass getCorner();

	/**
	 * Returns the meta object for class '{@link domain.aps.components.Rack <em>Rack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rack</em>'.
	 * @see domain.aps.components.Rack
	 * @generated
	 */
	EClass getRack();

	/**
	 * Returns the meta object for the reference '{@link domain.aps.components.Rack#getScrewing_to_base <em>Screwing to base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Screwing to base</em>'.
	 * @see domain.aps.components.Rack#getScrewing_to_base()
	 * @see #getRack()
	 * @generated
	 */
	EReference getRack_Screwing_to_base();

	/**
	 * Returns the meta object for class '{@link domain.aps.components.Compressor <em>Compressor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compressor</em>'.
	 * @see domain.aps.components.Compressor
	 * @generated
	 */
	EClass getCompressor();

	/**
	 * Returns the meta object for the containment reference '{@link domain.aps.components.Compressor#getPowersupply <em>Powersupply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Powersupply</em>'.
	 * @see domain.aps.components.Compressor#getPowersupply()
	 * @see #getCompressor()
	 * @generated
	 */
	EReference getCompressor_Powersupply();

	/**
	 * Returns the meta object for the containment reference list '{@link domain.aps.components.Compressor#getPneumaticsupply <em>Pneumaticsupply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pneumaticsupply</em>'.
	 * @see domain.aps.components.Compressor#getPneumaticsupply()
	 * @see #getCompressor()
	 * @generated
	 */
	EReference getCompressor_Pneumaticsupply();

	/**
	 * Returns the meta object for the containment reference list '{@link domain.aps.components.Compressor#getPins <em>Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pins</em>'.
	 * @see domain.aps.components.Compressor#getPins()
	 * @see #getCompressor()
	 * @generated
	 */
	EReference getCompressor_Pins();

	/**
	 * Returns the meta object for the containment reference '{@link domain.aps.components.Compressor#getScrewing <em>Screwing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Screwing</em>'.
	 * @see domain.aps.components.Compressor#getScrewing()
	 * @see #getCompressor()
	 * @generated
	 */
	EReference getCompressor_Screwing();

	/**
	 * Returns the meta object for the containment reference '{@link domain.aps.components.Compressor#getSwitch <em>Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Switch</em>'.
	 * @see domain.aps.components.Compressor#getSwitch()
	 * @see #getCompressor()
	 * @generated
	 */
	EReference getCompressor_Switch();

	/**
	 * Returns the meta object for class '{@link domain.aps.components.Panel <em>Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Panel</em>'.
	 * @see domain.aps.components.Panel
	 * @generated
	 */
	EClass getPanel();

	/**
	 * Returns the meta object for the reference '{@link domain.aps.components.Panel#getComponentRepository <em>Component Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Repository</em>'.
	 * @see domain.aps.components.Panel#getComponentRepository()
	 * @see #getPanel()
	 * @generated
	 */
	EReference getPanel_ComponentRepository();

	/**
	 * Returns the meta object for class '{@link domain.aps.components.RegularRamp <em>Regular Ramp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regular Ramp</em>'.
	 * @see domain.aps.components.RegularRamp
	 * @generated
	 */
	EClass getRegularRamp();

	/**
	 * Returns the meta object for class '{@link domain.aps.components.TurningTable <em>Turning Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turning Table</em>'.
	 * @see domain.aps.components.TurningTable
	 * @generated
	 */
	EClass getTurningTable();

	/**
	 * Returns the meta object for the containment reference '{@link domain.aps.components.TurningTable#getRack_for_turningtable <em>Rack for turningtable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rack for turningtable</em>'.
	 * @see domain.aps.components.TurningTable#getRack_for_turningtable()
	 * @see #getTurningTable()
	 * @generated
	 */
	EReference getTurningTable_Rack_for_turningtable();

	/**
	 * Returns the meta object for the containment reference '{@link domain.aps.components.TurningTable#getTable_to_stand_on <em>Table to stand on</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table to stand on</em>'.
	 * @see domain.aps.components.TurningTable#getTable_to_stand_on()
	 * @see #getTurningTable()
	 * @generated
	 */
	EReference getTurningTable_Table_to_stand_on();

	/**
	 * Returns the meta object for the containment reference '{@link domain.aps.components.TurningTable#getMotor_to_drive <em>Motor to drive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Motor to drive</em>'.
	 * @see domain.aps.components.TurningTable#getMotor_to_drive()
	 * @see #getTurningTable()
	 * @generated
	 */
	EReference getTurningTable_Motor_to_drive();

	/**
	 * Returns the meta object for the containment reference '{@link domain.aps.components.TurningTable#getBusSlave <em>Bus Slave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bus Slave</em>'.
	 * @see domain.aps.components.TurningTable#getBusSlave()
	 * @see #getTurningTable()
	 * @generated
	 */
	EReference getTurningTable_BusSlave();

	/**
	 * Returns the meta object for the containment reference '{@link domain.aps.components.TurningTable#getBusBox <em>Bus Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bus Box</em>'.
	 * @see domain.aps.components.TurningTable#getBusBox()
	 * @see #getTurningTable()
	 * @generated
	 */
	EReference getTurningTable_BusBox();

	/**
	 * Returns the meta object for the containment reference list '{@link domain.aps.components.TurningTable#getBusCable <em>Bus Cable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bus Cable</em>'.
	 * @see domain.aps.components.TurningTable#getBusCable()
	 * @see #getTurningTable()
	 * @generated
	 */
	EReference getTurningTable_BusCable();

	/**
	 * Returns the meta object for the containment reference list '{@link domain.aps.components.TurningTable#getPotentiometer <em>Potentiometer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Potentiometer</em>'.
	 * @see domain.aps.components.TurningTable#getPotentiometer()
	 * @see #getTurningTable()
	 * @generated
	 */
	EReference getTurningTable_Potentiometer();

	/**
	 * Returns the meta object for class '{@link domain.aps.components.CylinderPart <em>Cylinder Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cylinder Part</em>'.
	 * @see domain.aps.components.CylinderPart
	 * @generated
	 */
	EClass getCylinderPart();

	/**
	 * Returns the meta object for class '{@link domain.aps.components.MechanicalAssembly <em>Mechanical Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mechanical Assembly</em>'.
	 * @see domain.aps.components.MechanicalAssembly
	 * @generated
	 */
	EClass getMechanicalAssembly();

	/**
	 * Returns the meta object for class '{@link domain.aps.components.SimpleMotor <em>Simple Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Motor</em>'.
	 * @see domain.aps.components.SimpleMotor
	 * @generated
	 */
	EClass getSimpleMotor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComponentsFactory getComponentsFactory();

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
		 * The meta object literal for the '{@link domain.aps.components.impl.PowerSupplyImpl <em>Power Supply</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.aps.components.impl.PowerSupplyImpl
		 * @see domain.aps.components.impl.ComponentsPackageImpl#getPowerSupply()
		 * @generated
		 */
		EClass POWER_SUPPLY = eINSTANCE.getPowerSupply();

		/**
		 * The meta object literal for the '{@link domain.aps.components.impl.ConveyorBeltImpl <em>Conveyor Belt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.aps.components.impl.ConveyorBeltImpl
		 * @see domain.aps.components.impl.ComponentsPackageImpl#getConveyorBelt()
		 * @generated
		 */
		EClass CONVEYOR_BELT = eINSTANCE.getConveyorBelt();

		/**
		 * The meta object literal for the '<em><b>Rubber Band</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVEYOR_BELT__RUBBER_BAND = eINSTANCE.getConveyorBelt_RubberBand();

		/**
		 * The meta object literal for the '{@link domain.aps.components.impl.FixtureImpl <em>Fixture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.aps.components.impl.FixtureImpl
		 * @see domain.aps.components.impl.ComponentsPackageImpl#getFixture()
		 * @generated
		 */
		EClass FIXTURE = eINSTANCE.getFixture();

		/**
		 * The meta object literal for the '{@link domain.aps.components.impl.PipeImpl <em>Pipe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.aps.components.impl.PipeImpl
		 * @see domain.aps.components.impl.ComponentsPackageImpl#getPipe()
		 * @generated
		 */
		EClass PIPE = eINSTANCE.getPipe();

		/**
		 * The meta object literal for the '<em><b>Plugs</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPE__PLUGS = eINSTANCE.getPipe_Plugs();

		/**
		 * The meta object literal for the '{@link domain.aps.components.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.aps.components.impl.SensorImpl
		 * @see domain.aps.components.impl.ComponentsPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '<em><b>Physicalconnection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__PHYSICALCONNECTION = eINSTANCE.getSensor_Physicalconnection();

		/**
		 * The meta object literal for the '<em><b>Signalinterface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__SIGNALINTERFACE = eINSTANCE.getSensor_Signalinterface();

		/**
		 * The meta object literal for the '<em><b>Powersupply</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__POWERSUPPLY = eINSTANCE.getSensor_Powersupply();

		/**
		 * The meta object literal for the '{@link domain.aps.components.impl.CylinderImpl <em>Cylinder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.aps.components.impl.CylinderImpl
		 * @see domain.aps.components.impl.ComponentsPackageImpl#getCylinder()
		 * @generated
		 */
		EClass CYLINDER = eINSTANCE.getCylinder();

		/**
		 * The meta object literal for the '<em><b>Pneumaticsupply</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CYLINDER__PNEUMATICSUPPLY = eINSTANCE.getCylinder_Pneumaticsupply();

		/**
		 * The meta object literal for the '<em><b>Signal Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CYLINDER__SIGNAL_INTERFACE = eINSTANCE.getCylinder_SignalInterface();

		/**
		 * The meta object literal for the '{@link domain.aps.components.impl.DispenserImpl <em>Dispenser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.aps.components.impl.DispenserImpl
		 * @see domain.aps.components.impl.ComponentsPackageImpl#getDispenser()
		 * @generated
		 */
		EClass DISPENSER = eINSTANCE.getDispenser();

		/**
		 * The meta object literal for the '{@link domain.aps.components.impl.SplitterImpl <em>Splitter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.aps.components.impl.SplitterImpl
		 * @see domain.aps.components.impl.ComponentsPackageImpl#getSplitter()
		 * @generated
		 */
		EClass SPLITTER = eINSTANCE.getSplitter();

		/**
		 * The meta object literal for the '<em><b>Screwing</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPLITTER__SCREWING = eINSTANCE.getSplitter_Screwing();

		/**
		 * The meta object literal for the '{@link domain.aps.components.impl.MotorImpl <em>Motor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.aps.components.impl.MotorImpl
		 * @see domain.aps.components.impl.ComponentsPackageImpl#getMotor()
		 * @generated
		 */
		EClass MOTOR = eINSTANCE.getMotor();

		/**
		 * The meta object literal for the '<em><b>Gearing</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOTOR__GEARING = eINSTANCE.getMotor_Gearing();

		/**
		 * The meta object literal for the '<em><b>Screwing</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOTOR__SCREWING = eINSTANCE.getMotor_Screwing();

		/**
		 * The meta object literal for the '<em><b>Powersupply</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOTOR__POWERSUPPLY = eINSTANCE.getMotor_Powersupply();

		/**
		 * The meta object literal for the '{@link domain.aps.components.impl.CableImpl <em>Cable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.aps.components.impl.CableImpl
		 * @see domain.aps.components.impl.ComponentsPackageImpl#getCable()
		 * @generated
		 */
		EClass CABLE = eINSTANCE.getCable();

		/**
		 * The meta object literal for the '{@link domain.aps.components.impl.ValveImpl <em>Valve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.aps.components.impl.ValveImpl
		 * @see domain.aps.components.impl.ComponentsPackageImpl#getValve()
		 * @generated
		 */
		EClass VALVE = eINSTANCE.getValve();

		/**
		 * The meta object literal for the '<em><b>Pneumaticsupply</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALVE__PNEUMATICSUPPLY = eINSTANCE.getValve_Pneumaticsupply();

		/**
		 * The meta object literal for the '<em><b>Powersupply</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALVE__POWERSUPPLY = eINSTANCE.getValve_Powersupply();

		/**
		 * The meta object literal for the '<em><b>Signalinterface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALVE__SIGNALINTERFACE = eINSTANCE.getValve_Signalinterface();

		/**
		 * The meta object literal for the '{@link domain.aps.components.impl.TankImpl <em>Tank</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.aps.components.impl.TankImpl
		 * @see domain.aps.components.impl.ComponentsPackageImpl#getTank()
		 * @generated
		 */
		EClass TANK = eINSTANCE.getTank();

		/**
		 * The meta object literal for the '<em><b>Watersupply</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TANK__WATERSUPPLY = eINSTANCE.getTank_Watersupply();

		/**
		 * The meta object literal for the '<em><b>Screwing</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TANK__SCREWING = eINSTANCE.getTank_Screwing();

		/**
		 * The meta object literal for the '{@link domain.aps.components.impl.PusherImpl <em>Pusher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.aps.components.impl.PusherImpl
		 * @see domain.aps.components.impl.ComponentsPackageImpl#getPusher()
		 * @generated
		 */
		EClass PUSHER = eINSTANCE.getPusher();

		/**
		 * The meta object literal for the '<em><b>Components Repository</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUSHER__COMPONENTS_REPOSITORY = eINSTANCE.getPusher_ComponentsRepository();

		/**
		 * The meta object literal for the '<em><b>Fixture Cylinder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUSHER__FIXTURE_CYLINDER = eINSTANCE.getPusher_FixtureCylinder();

		/**
		 * The meta object literal for the '<em><b>Bus Box</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUSHER__BUS_BOX = eINSTANCE.getPusher_BusBox();

		/**
		 * The meta object literal for the '<em><b>Bus Cable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUSHER__BUS_CABLE = eINSTANCE.getPusher_BusCable();

		/**
		 * The meta object literal for the '{@link domain.aps.components.impl.CornerImpl <em>Corner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.aps.components.impl.CornerImpl
		 * @see domain.aps.components.impl.ComponentsPackageImpl#getCorner()
		 * @generated
		 */
		EClass CORNER = eINSTANCE.getCorner();

		/**
		 * The meta object literal for the '{@link domain.aps.components.impl.RackImpl <em>Rack</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.aps.components.impl.RackImpl
		 * @see domain.aps.components.impl.ComponentsPackageImpl#getRack()
		 * @generated
		 */
		EClass RACK = eINSTANCE.getRack();

		/**
		 * The meta object literal for the '<em><b>Screwing to base</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RACK__SCREWING_TO_BASE = eINSTANCE.getRack_Screwing_to_base();

		/**
		 * The meta object literal for the '{@link domain.aps.components.impl.CompressorImpl <em>Compressor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.aps.components.impl.CompressorImpl
		 * @see domain.aps.components.impl.ComponentsPackageImpl#getCompressor()
		 * @generated
		 */
		EClass COMPRESSOR = eINSTANCE.getCompressor();

		/**
		 * The meta object literal for the '<em><b>Powersupply</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPRESSOR__POWERSUPPLY = eINSTANCE.getCompressor_Powersupply();

		/**
		 * The meta object literal for the '<em><b>Pneumaticsupply</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPRESSOR__PNEUMATICSUPPLY = eINSTANCE.getCompressor_Pneumaticsupply();

		/**
		 * The meta object literal for the '<em><b>Pins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPRESSOR__PINS = eINSTANCE.getCompressor_Pins();

		/**
		 * The meta object literal for the '<em><b>Screwing</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPRESSOR__SCREWING = eINSTANCE.getCompressor_Screwing();

		/**
		 * The meta object literal for the '<em><b>Switch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPRESSOR__SWITCH = eINSTANCE.getCompressor_Switch();

		/**
		 * The meta object literal for the '{@link domain.aps.components.impl.PanelImpl <em>Panel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.aps.components.impl.PanelImpl
		 * @see domain.aps.components.impl.ComponentsPackageImpl#getPanel()
		 * @generated
		 */
		EClass PANEL = eINSTANCE.getPanel();

		/**
		 * The meta object literal for the '<em><b>Component Repository</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PANEL__COMPONENT_REPOSITORY = eINSTANCE.getPanel_ComponentRepository();

		/**
		 * The meta object literal for the '{@link domain.aps.components.impl.RegularRampImpl <em>Regular Ramp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.aps.components.impl.RegularRampImpl
		 * @see domain.aps.components.impl.ComponentsPackageImpl#getRegularRamp()
		 * @generated
		 */
		EClass REGULAR_RAMP = eINSTANCE.getRegularRamp();

		/**
		 * The meta object literal for the '{@link domain.aps.components.impl.TurningTableImpl <em>Turning Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.aps.components.impl.TurningTableImpl
		 * @see domain.aps.components.impl.ComponentsPackageImpl#getTurningTable()
		 * @generated
		 */
		EClass TURNING_TABLE = eINSTANCE.getTurningTable();

		/**
		 * The meta object literal for the '<em><b>Rack for turningtable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURNING_TABLE__RACK_FOR_TURNINGTABLE = eINSTANCE.getTurningTable_Rack_for_turningtable();

		/**
		 * The meta object literal for the '<em><b>Table to stand on</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURNING_TABLE__TABLE_TO_STAND_ON = eINSTANCE.getTurningTable_Table_to_stand_on();

		/**
		 * The meta object literal for the '<em><b>Motor to drive</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURNING_TABLE__MOTOR_TO_DRIVE = eINSTANCE.getTurningTable_Motor_to_drive();

		/**
		 * The meta object literal for the '<em><b>Bus Slave</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURNING_TABLE__BUS_SLAVE = eINSTANCE.getTurningTable_BusSlave();

		/**
		 * The meta object literal for the '<em><b>Bus Box</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURNING_TABLE__BUS_BOX = eINSTANCE.getTurningTable_BusBox();

		/**
		 * The meta object literal for the '<em><b>Bus Cable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURNING_TABLE__BUS_CABLE = eINSTANCE.getTurningTable_BusCable();

		/**
		 * The meta object literal for the '<em><b>Potentiometer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURNING_TABLE__POTENTIOMETER = eINSTANCE.getTurningTable_Potentiometer();

		/**
		 * The meta object literal for the '{@link domain.aps.components.impl.CylinderPartImpl <em>Cylinder Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.aps.components.impl.CylinderPartImpl
		 * @see domain.aps.components.impl.ComponentsPackageImpl#getCylinderPart()
		 * @generated
		 */
		EClass CYLINDER_PART = eINSTANCE.getCylinderPart();

		/**
		 * The meta object literal for the '{@link domain.aps.components.impl.MechanicalAssemblyImpl <em>Mechanical Assembly</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.aps.components.impl.MechanicalAssemblyImpl
		 * @see domain.aps.components.impl.ComponentsPackageImpl#getMechanicalAssembly()
		 * @generated
		 */
		EClass MECHANICAL_ASSEMBLY = eINSTANCE.getMechanicalAssembly();

		/**
		 * The meta object literal for the '{@link domain.aps.components.impl.SimpleMotorImpl <em>Simple Motor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.aps.components.impl.SimpleMotorImpl
		 * @see domain.aps.components.impl.ComponentsPackageImpl#getSimpleMotor()
		 * @generated
		 */
		EClass SIMPLE_MOTOR = eINSTANCE.getSimpleMotor();

	}

} //ComponentsPackage
