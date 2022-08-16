/**
 */
package quality.aps_mm;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import quality.as_mm.As_mmPackage;

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
 * @see quality.aps_mm.Aps_mmFactory
 * @model kind="package"
 * @generated
 */
public interface Aps_mmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "aps_mm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "aps_mm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "aps_mm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Aps_mmPackage eINSTANCE = quality.aps_mm.impl.Aps_mmPackageImpl.init();

	/**
	 * The meta object id for the '{@link quality.aps_mm.impl.ModifyBusMasterImpl <em>Modify Bus Master</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see quality.aps_mm.impl.ModifyBusMasterImpl
	 * @see quality.aps_mm.impl.Aps_mmPackageImpl#getModifyBusMaster()
	 * @generated
	 */
	int MODIFY_BUS_MASTER = 0;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_MASTER__AFFECTED_ELEMENT = As_mmPackage.MODIFY_COMPONENT__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_MASTER__CAUSING_ELEMENTS = As_mmPackage.MODIFY_COMPONENT__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_MASTER__ID = As_mmPackage.MODIFY_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_MASTER__TOOLDERIVED = As_mmPackage.MODIFY_COMPONENT__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_MASTER__USER_DECISION = As_mmPackage.MODIFY_COMPONENT__USER_DECISION;

	/**
	 * The number of structural features of the '<em>Modify Bus Master</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_MASTER_FEATURE_COUNT = As_mmPackage.MODIFY_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Modify Bus Master</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_MASTER_OPERATION_COUNT = As_mmPackage.MODIFY_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link quality.aps_mm.impl.ModifyPhysicalConnectionImpl <em>Modify Physical Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see quality.aps_mm.impl.ModifyPhysicalConnectionImpl
	 * @see quality.aps_mm.impl.Aps_mmPackageImpl#getModifyPhysicalConnection()
	 * @generated
	 */
	int MODIFY_PHYSICAL_CONNECTION = 1;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_PHYSICAL_CONNECTION__AFFECTED_ELEMENT = As_mmPackage.MODIFY_INTERFACE__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_PHYSICAL_CONNECTION__CAUSING_ELEMENTS = As_mmPackage.MODIFY_INTERFACE__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_PHYSICAL_CONNECTION__ID = As_mmPackage.MODIFY_INTERFACE__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_PHYSICAL_CONNECTION__TOOLDERIVED = As_mmPackage.MODIFY_INTERFACE__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_PHYSICAL_CONNECTION__USER_DECISION = As_mmPackage.MODIFY_INTERFACE__USER_DECISION;

	/**
	 * The number of structural features of the '<em>Modify Physical Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_PHYSICAL_CONNECTION_FEATURE_COUNT = As_mmPackage.MODIFY_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Modify Physical Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_PHYSICAL_CONNECTION_OPERATION_COUNT = As_mmPackage.MODIFY_INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link quality.aps_mm.impl.ModifySignalinterfaceImpl <em>Modify Signalinterface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see quality.aps_mm.impl.ModifySignalinterfaceImpl
	 * @see quality.aps_mm.impl.Aps_mmPackageImpl#getModifySignalinterface()
	 * @generated
	 */
	int MODIFY_SIGNALINTERFACE = 2;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_SIGNALINTERFACE__AFFECTED_ELEMENT = As_mmPackage.MODIFY_INTERFACE__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_SIGNALINTERFACE__CAUSING_ELEMENTS = As_mmPackage.MODIFY_INTERFACE__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_SIGNALINTERFACE__ID = As_mmPackage.MODIFY_INTERFACE__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_SIGNALINTERFACE__TOOLDERIVED = As_mmPackage.MODIFY_INTERFACE__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_SIGNALINTERFACE__USER_DECISION = As_mmPackage.MODIFY_INTERFACE__USER_DECISION;

	/**
	 * The number of structural features of the '<em>Modify Signalinterface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_SIGNALINTERFACE_FEATURE_COUNT = As_mmPackage.MODIFY_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Modify Signalinterface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_SIGNALINTERFACE_OPERATION_COUNT = As_mmPackage.MODIFY_INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link quality.aps_mm.impl.ModifySensorImpl <em>Modify Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see quality.aps_mm.impl.ModifySensorImpl
	 * @see quality.aps_mm.impl.Aps_mmPackageImpl#getModifySensor()
	 * @generated
	 */
	int MODIFY_SENSOR = 3;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_SENSOR__AFFECTED_ELEMENT = As_mmPackage.MODIFY_COMPONENT__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_SENSOR__CAUSING_ELEMENTS = As_mmPackage.MODIFY_COMPONENT__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_SENSOR__ID = As_mmPackage.MODIFY_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_SENSOR__TOOLDERIVED = As_mmPackage.MODIFY_COMPONENT__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_SENSOR__USER_DECISION = As_mmPackage.MODIFY_COMPONENT__USER_DECISION;

	/**
	 * The feature id for the '<em><b>Modify Signal Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_SENSOR__MODIFY_SIGNAL_INTERFACES = As_mmPackage.MODIFY_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modify Physical Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_SENSOR__MODIFY_PHYSICAL_CONNECTIONS = As_mmPackage.MODIFY_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Modify Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_SENSOR_FEATURE_COUNT = As_mmPackage.MODIFY_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Modify Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_SENSOR_OPERATION_COUNT = As_mmPackage.MODIFY_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link quality.aps_mm.impl.ModifyBusSlaveImpl <em>Modify Bus Slave</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see quality.aps_mm.impl.ModifyBusSlaveImpl
	 * @see quality.aps_mm.impl.Aps_mmPackageImpl#getModifyBusSlave()
	 * @generated
	 */
	int MODIFY_BUS_SLAVE = 4;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_SLAVE__AFFECTED_ELEMENT = As_mmPackage.MODIFY_COMPONENT__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_SLAVE__CAUSING_ELEMENTS = As_mmPackage.MODIFY_COMPONENT__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_SLAVE__ID = As_mmPackage.MODIFY_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_SLAVE__TOOLDERIVED = As_mmPackage.MODIFY_COMPONENT__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_SLAVE__USER_DECISION = As_mmPackage.MODIFY_COMPONENT__USER_DECISION;

	/**
	 * The number of structural features of the '<em>Modify Bus Slave</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_SLAVE_FEATURE_COUNT = As_mmPackage.MODIFY_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Modify Bus Slave</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_SLAVE_OPERATION_COUNT = As_mmPackage.MODIFY_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link quality.aps_mm.impl.ModifyRampImpl <em>Modify Ramp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see quality.aps_mm.impl.ModifyRampImpl
	 * @see quality.aps_mm.impl.Aps_mmPackageImpl#getModifyRamp()
	 * @generated
	 */
	int MODIFY_RAMP = 5;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_RAMP__AFFECTED_ELEMENT = As_mmPackage.MODIFY_COMPONENT__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_RAMP__CAUSING_ELEMENTS = As_mmPackage.MODIFY_COMPONENT__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_RAMP__ID = As_mmPackage.MODIFY_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_RAMP__TOOLDERIVED = As_mmPackage.MODIFY_COMPONENT__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_RAMP__USER_DECISION = As_mmPackage.MODIFY_COMPONENT__USER_DECISION;

	/**
	 * The number of structural features of the '<em>Modify Ramp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_RAMP_FEATURE_COUNT = As_mmPackage.MODIFY_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Modify Ramp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_RAMP_OPERATION_COUNT = As_mmPackage.MODIFY_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link quality.aps_mm.impl.ModifyBusCableImpl <em>Modify Bus Cable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see quality.aps_mm.impl.ModifyBusCableImpl
	 * @see quality.aps_mm.impl.Aps_mmPackageImpl#getModifyBusCable()
	 * @generated
	 */
	int MODIFY_BUS_CABLE = 6;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_CABLE__AFFECTED_ELEMENT = As_mmPackage.MODIFY_COMPONENT__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_CABLE__CAUSING_ELEMENTS = As_mmPackage.MODIFY_COMPONENT__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_CABLE__ID = As_mmPackage.MODIFY_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_CABLE__TOOLDERIVED = As_mmPackage.MODIFY_COMPONENT__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_CABLE__USER_DECISION = As_mmPackage.MODIFY_COMPONENT__USER_DECISION;

	/**
	 * The number of structural features of the '<em>Modify Bus Cable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_CABLE_FEATURE_COUNT = As_mmPackage.MODIFY_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Modify Bus Cable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_CABLE_OPERATION_COUNT = As_mmPackage.MODIFY_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link quality.aps_mm.impl.ModifyBusBoxImpl <em>Modify Bus Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see quality.aps_mm.impl.ModifyBusBoxImpl
	 * @see quality.aps_mm.impl.Aps_mmPackageImpl#getModifyBusBox()
	 * @generated
	 */
	int MODIFY_BUS_BOX = 7;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_BOX__AFFECTED_ELEMENT = As_mmPackage.MODIFY_COMPONENT__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_BOX__CAUSING_ELEMENTS = As_mmPackage.MODIFY_COMPONENT__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_BOX__ID = As_mmPackage.MODIFY_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_BOX__TOOLDERIVED = As_mmPackage.MODIFY_COMPONENT__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_BOX__USER_DECISION = As_mmPackage.MODIFY_COMPONENT__USER_DECISION;

	/**
	 * The number of structural features of the '<em>Modify Bus Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_BOX_FEATURE_COUNT = As_mmPackage.MODIFY_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Modify Bus Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_BUS_BOX_OPERATION_COUNT = As_mmPackage.MODIFY_COMPONENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link quality.aps_mm.ModifyBusMaster <em>Modify Bus Master</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modify Bus Master</em>'.
	 * @see quality.aps_mm.ModifyBusMaster
	 * @generated
	 */
	EClass getModifyBusMaster();

	/**
	 * Returns the meta object for class '{@link quality.aps_mm.ModifyPhysicalConnection <em>Modify Physical Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modify Physical Connection</em>'.
	 * @see quality.aps_mm.ModifyPhysicalConnection
	 * @generated
	 */
	EClass getModifyPhysicalConnection();

	/**
	 * Returns the meta object for class '{@link quality.aps_mm.ModifySignalinterface <em>Modify Signalinterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modify Signalinterface</em>'.
	 * @see quality.aps_mm.ModifySignalinterface
	 * @generated
	 */
	EClass getModifySignalinterface();

	/**
	 * Returns the meta object for class '{@link quality.aps_mm.ModifySensor <em>Modify Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modify Sensor</em>'.
	 * @see quality.aps_mm.ModifySensor
	 * @generated
	 */
	EClass getModifySensor();

	/**
	 * Returns the meta object for the containment reference list '{@link quality.aps_mm.ModifySensor#getModifySignalInterfaces <em>Modify Signal Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modify Signal Interfaces</em>'.
	 * @see quality.aps_mm.ModifySensor#getModifySignalInterfaces()
	 * @see #getModifySensor()
	 * @generated
	 */
	EReference getModifySensor_ModifySignalInterfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link quality.aps_mm.ModifySensor#getModifyPhysicalConnections <em>Modify Physical Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modify Physical Connections</em>'.
	 * @see quality.aps_mm.ModifySensor#getModifyPhysicalConnections()
	 * @see #getModifySensor()
	 * @generated
	 */
	EReference getModifySensor_ModifyPhysicalConnections();

	/**
	 * Returns the meta object for class '{@link quality.aps_mm.ModifyBusSlave <em>Modify Bus Slave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modify Bus Slave</em>'.
	 * @see quality.aps_mm.ModifyBusSlave
	 * @generated
	 */
	EClass getModifyBusSlave();

	/**
	 * Returns the meta object for class '{@link quality.aps_mm.ModifyRamp <em>Modify Ramp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modify Ramp</em>'.
	 * @see quality.aps_mm.ModifyRamp
	 * @generated
	 */
	EClass getModifyRamp();

	/**
	 * Returns the meta object for class '{@link quality.aps_mm.ModifyBusCable <em>Modify Bus Cable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modify Bus Cable</em>'.
	 * @see quality.aps_mm.ModifyBusCable
	 * @generated
	 */
	EClass getModifyBusCable();

	/**
	 * Returns the meta object for class '{@link quality.aps_mm.ModifyBusBox <em>Modify Bus Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modify Bus Box</em>'.
	 * @see quality.aps_mm.ModifyBusBox
	 * @generated
	 */
	EClass getModifyBusBox();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Aps_mmFactory getAps_mmFactory();

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
		 * The meta object literal for the '{@link quality.aps_mm.impl.ModifyBusMasterImpl <em>Modify Bus Master</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see quality.aps_mm.impl.ModifyBusMasterImpl
		 * @see quality.aps_mm.impl.Aps_mmPackageImpl#getModifyBusMaster()
		 * @generated
		 */
		EClass MODIFY_BUS_MASTER = eINSTANCE.getModifyBusMaster();

		/**
		 * The meta object literal for the '{@link quality.aps_mm.impl.ModifyPhysicalConnectionImpl <em>Modify Physical Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see quality.aps_mm.impl.ModifyPhysicalConnectionImpl
		 * @see quality.aps_mm.impl.Aps_mmPackageImpl#getModifyPhysicalConnection()
		 * @generated
		 */
		EClass MODIFY_PHYSICAL_CONNECTION = eINSTANCE.getModifyPhysicalConnection();

		/**
		 * The meta object literal for the '{@link quality.aps_mm.impl.ModifySignalinterfaceImpl <em>Modify Signalinterface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see quality.aps_mm.impl.ModifySignalinterfaceImpl
		 * @see quality.aps_mm.impl.Aps_mmPackageImpl#getModifySignalinterface()
		 * @generated
		 */
		EClass MODIFY_SIGNALINTERFACE = eINSTANCE.getModifySignalinterface();

		/**
		 * The meta object literal for the '{@link quality.aps_mm.impl.ModifySensorImpl <em>Modify Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see quality.aps_mm.impl.ModifySensorImpl
		 * @see quality.aps_mm.impl.Aps_mmPackageImpl#getModifySensor()
		 * @generated
		 */
		EClass MODIFY_SENSOR = eINSTANCE.getModifySensor();

		/**
		 * The meta object literal for the '<em><b>Modify Signal Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODIFY_SENSOR__MODIFY_SIGNAL_INTERFACES = eINSTANCE.getModifySensor_ModifySignalInterfaces();

		/**
		 * The meta object literal for the '<em><b>Modify Physical Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODIFY_SENSOR__MODIFY_PHYSICAL_CONNECTIONS = eINSTANCE.getModifySensor_ModifyPhysicalConnections();

		/**
		 * The meta object literal for the '{@link quality.aps_mm.impl.ModifyBusSlaveImpl <em>Modify Bus Slave</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see quality.aps_mm.impl.ModifyBusSlaveImpl
		 * @see quality.aps_mm.impl.Aps_mmPackageImpl#getModifyBusSlave()
		 * @generated
		 */
		EClass MODIFY_BUS_SLAVE = eINSTANCE.getModifyBusSlave();

		/**
		 * The meta object literal for the '{@link quality.aps_mm.impl.ModifyRampImpl <em>Modify Ramp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see quality.aps_mm.impl.ModifyRampImpl
		 * @see quality.aps_mm.impl.Aps_mmPackageImpl#getModifyRamp()
		 * @generated
		 */
		EClass MODIFY_RAMP = eINSTANCE.getModifyRamp();

		/**
		 * The meta object literal for the '{@link quality.aps_mm.impl.ModifyBusCableImpl <em>Modify Bus Cable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see quality.aps_mm.impl.ModifyBusCableImpl
		 * @see quality.aps_mm.impl.Aps_mmPackageImpl#getModifyBusCable()
		 * @generated
		 */
		EClass MODIFY_BUS_CABLE = eINSTANCE.getModifyBusCable();

		/**
		 * The meta object literal for the '{@link quality.aps_mm.impl.ModifyBusBoxImpl <em>Modify Bus Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see quality.aps_mm.impl.ModifyBusBoxImpl
		 * @see quality.aps_mm.impl.Aps_mmPackageImpl#getModifyBusBox()
		 * @generated
		 */
		EClass MODIFY_BUS_BOX = eINSTANCE.getModifyBusBox();

	}

} //Aps_mmPackage
