/**
 */
package domain.aps.buscomponents;

import domain.aps.components.ComponentsPackage;

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
 * @see domain.aps.buscomponents.BuscomponentsFactory
 * @model kind="package"
 * @generated
 */
public interface BuscomponentsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "buscomponents";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "buscomponents";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "buscomponents";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BuscomponentsPackage eINSTANCE = domain.aps.buscomponents.impl.BuscomponentsPackageImpl.init();

	/**
	 * The meta object id for the '{@link domain.aps.buscomponents.impl.BusMasterImpl <em>Bus Master</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.aps.buscomponents.impl.BusMasterImpl
	 * @see domain.aps.buscomponents.impl.BuscomponentsPackageImpl#getBusMaster()
	 * @generated
	 */
	int BUS_MASTER = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_MASTER__ID = ComponentRepositoryPackage.COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_MASTER__NAME = ComponentRepositoryPackage.COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_MASTER__CONNECTED_INTERFACES = ComponentRepositoryPackage.COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_MASTER__PARENT = ComponentRepositoryPackage.COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_MASTER__PARENT_MODULE = ComponentRepositoryPackage.COMPONENT__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Signalinterfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_MASTER__SIGNALINTERFACES = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Signalinterface controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_MASTER__SIGNALINTERFACE_CONTROLLER = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bus Master</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_MASTER_FEATURE_COUNT = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bus Master</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_MASTER_OPERATION_COUNT = ComponentRepositoryPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.aps.buscomponents.impl.BusBoxImpl <em>Bus Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.aps.buscomponents.impl.BusBoxImpl
	 * @see domain.aps.buscomponents.impl.BuscomponentsPackageImpl#getBusBox()
	 * @generated
	 */
	int BUS_BOX = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_BOX__ID = ComponentRepositoryPackage.COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_BOX__NAME = ComponentRepositoryPackage.COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_BOX__CONNECTED_INTERFACES = ComponentRepositoryPackage.COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_BOX__PARENT = ComponentRepositoryPackage.COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_BOX__PARENT_MODULE = ComponentRepositoryPackage.COMPONENT__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Signalinterfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_BOX__SIGNALINTERFACES = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Signalinterface master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_BOX__SIGNALINTERFACE_MASTER = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Signalinterface box</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_BOX__SIGNALINTERFACE_BOX = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Powersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_BOX__POWERSUPPLY = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Bus Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_BOX_FEATURE_COUNT = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Bus Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_BOX_OPERATION_COUNT = ComponentRepositoryPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.aps.buscomponents.impl.BusSlaveImpl <em>Bus Slave</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.aps.buscomponents.impl.BusSlaveImpl
	 * @see domain.aps.buscomponents.impl.BuscomponentsPackageImpl#getBusSlave()
	 * @generated
	 */
	int BUS_SLAVE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_SLAVE__ID = ComponentRepositoryPackage.COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_SLAVE__NAME = ComponentRepositoryPackage.COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_SLAVE__CONNECTED_INTERFACES = ComponentRepositoryPackage.COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_SLAVE__PARENT = ComponentRepositoryPackage.COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_SLAVE__PARENT_MODULE = ComponentRepositoryPackage.COMPONENT__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Signalinterface master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_SLAVE__SIGNALINTERFACE_MASTER = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Signalinterface slave</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_SLAVE__SIGNALINTERFACE_SLAVE = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bus Slave</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_SLAVE_FEATURE_COUNT = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bus Slave</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_SLAVE_OPERATION_COUNT = ComponentRepositoryPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.aps.buscomponents.impl.BusCableImpl <em>Bus Cable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.aps.buscomponents.impl.BusCableImpl
	 * @see domain.aps.buscomponents.impl.BuscomponentsPackageImpl#getBusCable()
	 * @generated
	 */
	int BUS_CABLE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CABLE__ID = ComponentsPackage.CABLE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CABLE__NAME = ComponentsPackage.CABLE__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CABLE__CONNECTED_INTERFACES = ComponentsPackage.CABLE__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CABLE__PARENT = ComponentsPackage.CABLE__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CABLE__PARENT_MODULE = ComponentsPackage.CABLE__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Signal Plug1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CABLE__SIGNAL_PLUG1 = ComponentsPackage.CABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Signal Plug2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CABLE__SIGNAL_PLUG2 = ComponentsPackage.CABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bus Cable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CABLE_FEATURE_COUNT = ComponentsPackage.CABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bus Cable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CABLE_OPERATION_COUNT = ComponentsPackage.CABLE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link domain.aps.buscomponents.BusMaster <em>Bus Master</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus Master</em>'.
	 * @see domain.aps.buscomponents.BusMaster
	 * @generated
	 */
	EClass getBusMaster();

	/**
	 * Returns the meta object for the reference list '{@link domain.aps.buscomponents.BusMaster#getSignalinterfaces <em>Signalinterfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Signalinterfaces</em>'.
	 * @see domain.aps.buscomponents.BusMaster#getSignalinterfaces()
	 * @see #getBusMaster()
	 * @generated
	 */
	EReference getBusMaster_Signalinterfaces();

	/**
	 * Returns the meta object for the reference '{@link domain.aps.buscomponents.BusMaster#getSignalinterface_controller <em>Signalinterface controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signalinterface controller</em>'.
	 * @see domain.aps.buscomponents.BusMaster#getSignalinterface_controller()
	 * @see #getBusMaster()
	 * @generated
	 */
	EReference getBusMaster_Signalinterface_controller();

	/**
	 * Returns the meta object for class '{@link domain.aps.buscomponents.BusBox <em>Bus Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus Box</em>'.
	 * @see domain.aps.buscomponents.BusBox
	 * @generated
	 */
	EClass getBusBox();

	/**
	 * Returns the meta object for the reference list '{@link domain.aps.buscomponents.BusBox#getSignalinterfaces <em>Signalinterfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Signalinterfaces</em>'.
	 * @see domain.aps.buscomponents.BusBox#getSignalinterfaces()
	 * @see #getBusBox()
	 * @generated
	 */
	EReference getBusBox_Signalinterfaces();

	/**
	 * Returns the meta object for the reference '{@link domain.aps.buscomponents.BusBox#getSignalinterface_master <em>Signalinterface master</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signalinterface master</em>'.
	 * @see domain.aps.buscomponents.BusBox#getSignalinterface_master()
	 * @see #getBusBox()
	 * @generated
	 */
	EReference getBusBox_Signalinterface_master();

	/**
	 * Returns the meta object for the reference '{@link domain.aps.buscomponents.BusBox#getSignalinterface_box <em>Signalinterface box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signalinterface box</em>'.
	 * @see domain.aps.buscomponents.BusBox#getSignalinterface_box()
	 * @see #getBusBox()
	 * @generated
	 */
	EReference getBusBox_Signalinterface_box();

	/**
	 * Returns the meta object for the reference '{@link domain.aps.buscomponents.BusBox#getPowersupply <em>Powersupply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Powersupply</em>'.
	 * @see domain.aps.buscomponents.BusBox#getPowersupply()
	 * @see #getBusBox()
	 * @generated
	 */
	EReference getBusBox_Powersupply();

	/**
	 * Returns the meta object for class '{@link domain.aps.buscomponents.BusSlave <em>Bus Slave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus Slave</em>'.
	 * @see domain.aps.buscomponents.BusSlave
	 * @generated
	 */
	EClass getBusSlave();

	/**
	 * Returns the meta object for the reference '{@link domain.aps.buscomponents.BusSlave#getSignalinterface_master <em>Signalinterface master</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signalinterface master</em>'.
	 * @see domain.aps.buscomponents.BusSlave#getSignalinterface_master()
	 * @see #getBusSlave()
	 * @generated
	 */
	EReference getBusSlave_Signalinterface_master();

	/**
	 * Returns the meta object for the reference '{@link domain.aps.buscomponents.BusSlave#getSignalinterface_slave <em>Signalinterface slave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signalinterface slave</em>'.
	 * @see domain.aps.buscomponents.BusSlave#getSignalinterface_slave()
	 * @see #getBusSlave()
	 * @generated
	 */
	EReference getBusSlave_Signalinterface_slave();

	/**
	 * Returns the meta object for class '{@link domain.aps.buscomponents.BusCable <em>Bus Cable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus Cable</em>'.
	 * @see domain.aps.buscomponents.BusCable
	 * @generated
	 */
	EClass getBusCable();

	/**
	 * Returns the meta object for the containment reference '{@link domain.aps.buscomponents.BusCable#getSignalPlug1 <em>Signal Plug1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signal Plug1</em>'.
	 * @see domain.aps.buscomponents.BusCable#getSignalPlug1()
	 * @see #getBusCable()
	 * @generated
	 */
	EReference getBusCable_SignalPlug1();

	/**
	 * Returns the meta object for the containment reference '{@link domain.aps.buscomponents.BusCable#getSignalPlug2 <em>Signal Plug2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signal Plug2</em>'.
	 * @see domain.aps.buscomponents.BusCable#getSignalPlug2()
	 * @see #getBusCable()
	 * @generated
	 */
	EReference getBusCable_SignalPlug2();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BuscomponentsFactory getBuscomponentsFactory();

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
		 * The meta object literal for the '{@link domain.aps.buscomponents.impl.BusMasterImpl <em>Bus Master</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.aps.buscomponents.impl.BusMasterImpl
		 * @see domain.aps.buscomponents.impl.BuscomponentsPackageImpl#getBusMaster()
		 * @generated
		 */
		EClass BUS_MASTER = eINSTANCE.getBusMaster();

		/**
		 * The meta object literal for the '<em><b>Signalinterfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS_MASTER__SIGNALINTERFACES = eINSTANCE.getBusMaster_Signalinterfaces();

		/**
		 * The meta object literal for the '<em><b>Signalinterface controller</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS_MASTER__SIGNALINTERFACE_CONTROLLER = eINSTANCE.getBusMaster_Signalinterface_controller();

		/**
		 * The meta object literal for the '{@link domain.aps.buscomponents.impl.BusBoxImpl <em>Bus Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.aps.buscomponents.impl.BusBoxImpl
		 * @see domain.aps.buscomponents.impl.BuscomponentsPackageImpl#getBusBox()
		 * @generated
		 */
		EClass BUS_BOX = eINSTANCE.getBusBox();

		/**
		 * The meta object literal for the '<em><b>Signalinterfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS_BOX__SIGNALINTERFACES = eINSTANCE.getBusBox_Signalinterfaces();

		/**
		 * The meta object literal for the '<em><b>Signalinterface master</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS_BOX__SIGNALINTERFACE_MASTER = eINSTANCE.getBusBox_Signalinterface_master();

		/**
		 * The meta object literal for the '<em><b>Signalinterface box</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS_BOX__SIGNALINTERFACE_BOX = eINSTANCE.getBusBox_Signalinterface_box();

		/**
		 * The meta object literal for the '<em><b>Powersupply</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS_BOX__POWERSUPPLY = eINSTANCE.getBusBox_Powersupply();

		/**
		 * The meta object literal for the '{@link domain.aps.buscomponents.impl.BusSlaveImpl <em>Bus Slave</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.aps.buscomponents.impl.BusSlaveImpl
		 * @see domain.aps.buscomponents.impl.BuscomponentsPackageImpl#getBusSlave()
		 * @generated
		 */
		EClass BUS_SLAVE = eINSTANCE.getBusSlave();

		/**
		 * The meta object literal for the '<em><b>Signalinterface master</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS_SLAVE__SIGNALINTERFACE_MASTER = eINSTANCE.getBusSlave_Signalinterface_master();

		/**
		 * The meta object literal for the '<em><b>Signalinterface slave</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS_SLAVE__SIGNALINTERFACE_SLAVE = eINSTANCE.getBusSlave_Signalinterface_slave();

		/**
		 * The meta object literal for the '{@link domain.aps.buscomponents.impl.BusCableImpl <em>Bus Cable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.aps.buscomponents.impl.BusCableImpl
		 * @see domain.aps.buscomponents.impl.BuscomponentsPackageImpl#getBusCable()
		 * @generated
		 */
		EClass BUS_CABLE = eINSTANCE.getBusCable();

		/**
		 * The meta object literal for the '<em><b>Signal Plug1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS_CABLE__SIGNAL_PLUG1 = eINSTANCE.getBusCable_SignalPlug1();

		/**
		 * The meta object literal for the '<em><b>Signal Plug2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS_CABLE__SIGNAL_PLUG2 = eINSTANCE.getBusCable_SignalPlug2();

	}

} //BuscomponentsPackage
