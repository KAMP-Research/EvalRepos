/**
 */
package topo;

import base.BasePackage;

import graph.GraphPackage;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see topo.TopoFactory
 * @model kind="package"
 * @generated
 */
public interface TopoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "topo";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/topo";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "topo";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TopoPackage eINSTANCE = topo.impl.TopoPackageImpl.init();

	/**
	 * The meta object id for the '{@link topo.impl.SmartGridTopologyImpl <em>Smart Grid Topology</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see topo.impl.SmartGridTopologyImpl
	 * @see topo.impl.TopoPackageImpl#getSmartGridTopology()
	 * @generated
	 */
	int SMART_GRID_TOPOLOGY = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_GRID_TOPOLOGY__ID = BasePackage.NAMED_IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_GRID_TOPOLOGY__NAME = BasePackage.NAMED_IDENTIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Contains NE</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_GRID_TOPOLOGY__CONTAINS_NE = BasePackage.NAMED_IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contains PGN</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_GRID_TOPOLOGY__CONTAINS_PGN = BasePackage.NAMED_IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contains PC</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_GRID_TOPOLOGY__CONTAINS_PC = BasePackage.NAMED_IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Contains LC</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_GRID_TOPOLOGY__CONTAINS_LC = BasePackage.NAMED_IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Smart Grid Topology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_GRID_TOPOLOGY_FEATURE_COUNT = BasePackage.NAMED_IDENTIFIER_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Smart Grid Topology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_GRID_TOPOLOGY_OPERATION_COUNT = BasePackage.NAMED_IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link topo.impl.SmartMeterImpl <em>Smart Meter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see topo.impl.SmartMeterImpl
	 * @see topo.impl.TopoPackageImpl#getSmartMeter()
	 * @generated
	 */
	int SMART_METER = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_METER__ID = GraphPackage.COMMUNICATING_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_METER__NAME = GraphPackage.COMMUNICATING_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Connected To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_METER__CONNECTED_TO = GraphPackage.COMMUNICATING_ENTITY__CONNECTED_TO;

	/**
	 * The feature id for the '<em><b>Linked By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_METER__LINKED_BY = GraphPackage.COMMUNICATING_ENTITY__LINKED_BY;

	/**
	 * The feature id for the '<em><b>Communicates By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_METER__COMMUNICATES_BY = GraphPackage.COMMUNICATING_ENTITY__COMMUNICATES_BY;

	/**
	 * The feature id for the '<em><b>Aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_METER__AGGREGATION = GraphPackage.COMMUNICATING_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Smart Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_METER_FEATURE_COUNT = GraphPackage.COMMUNICATING_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Smart Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_METER_OPERATION_COUNT = GraphPackage.COMMUNICATING_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link topo.impl.NetworkNodeImpl <em>Network Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see topo.impl.NetworkNodeImpl
	 * @see topo.impl.TopoPackageImpl#getNetworkNode()
	 * @generated
	 */
	int NETWORK_NODE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_NODE__ID = GraphPackage.NETWORK_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_NODE__NAME = GraphPackage.NETWORK_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Connected To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_NODE__CONNECTED_TO = GraphPackage.NETWORK_ENTITY__CONNECTED_TO;

	/**
	 * The feature id for the '<em><b>Linked By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_NODE__LINKED_BY = GraphPackage.NETWORK_ENTITY__LINKED_BY;

	/**
	 * The number of structural features of the '<em>Network Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_NODE_FEATURE_COUNT = GraphPackage.NETWORK_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Network Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_NODE_OPERATION_COUNT = GraphPackage.NETWORK_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link topo.impl.ControlCenterImpl <em>Control Center</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see topo.impl.ControlCenterImpl
	 * @see topo.impl.TopoPackageImpl#getControlCenter()
	 * @generated
	 */
	int CONTROL_CENTER = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CENTER__ID = GraphPackage.COMMUNICATING_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CENTER__NAME = GraphPackage.COMMUNICATING_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Connected To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CENTER__CONNECTED_TO = GraphPackage.COMMUNICATING_ENTITY__CONNECTED_TO;

	/**
	 * The feature id for the '<em><b>Linked By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CENTER__LINKED_BY = GraphPackage.COMMUNICATING_ENTITY__LINKED_BY;

	/**
	 * The feature id for the '<em><b>Communicates By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CENTER__COMMUNICATES_BY = GraphPackage.COMMUNICATING_ENTITY__COMMUNICATES_BY;

	/**
	 * The number of structural features of the '<em>Control Center</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CENTER_FEATURE_COUNT = GraphPackage.COMMUNICATING_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Control Center</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CENTER_OPERATION_COUNT = GraphPackage.COMMUNICATING_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link topo.impl.GenericControllerImpl <em>Generic Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see topo.impl.GenericControllerImpl
	 * @see topo.impl.TopoPackageImpl#getGenericController()
	 * @generated
	 */
	int GENERIC_CONTROLLER = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONTROLLER__ID = GraphPackage.COMMUNICATING_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONTROLLER__NAME = GraphPackage.COMMUNICATING_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Connected To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONTROLLER__CONNECTED_TO = GraphPackage.COMMUNICATING_ENTITY__CONNECTED_TO;

	/**
	 * The feature id for the '<em><b>Linked By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONTROLLER__LINKED_BY = GraphPackage.COMMUNICATING_ENTITY__LINKED_BY;

	/**
	 * The feature id for the '<em><b>Communicates By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONTROLLER__COMMUNICATES_BY = GraphPackage.COMMUNICATING_ENTITY__COMMUNICATES_BY;

	/**
	 * The number of structural features of the '<em>Generic Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONTROLLER_FEATURE_COUNT = GraphPackage.COMMUNICATING_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Generic Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONTROLLER_OPERATION_COUNT = GraphPackage.COMMUNICATING_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link topo.impl.InterComImpl <em>Inter Com</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see topo.impl.InterComImpl
	 * @see topo.impl.TopoPackageImpl#getInterCom()
	 * @generated
	 */
	int INTER_COM = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_COM__ID = GraphPackage.COMMUNICATING_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_COM__NAME = GraphPackage.COMMUNICATING_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Connected To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_COM__CONNECTED_TO = GraphPackage.COMMUNICATING_ENTITY__CONNECTED_TO;

	/**
	 * The feature id for the '<em><b>Linked By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_COM__LINKED_BY = GraphPackage.COMMUNICATING_ENTITY__LINKED_BY;

	/**
	 * The feature id for the '<em><b>Communicates By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_COM__COMMUNICATES_BY = GraphPackage.COMMUNICATING_ENTITY__COMMUNICATES_BY;

	/**
	 * The number of structural features of the '<em>Inter Com</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_COM_FEATURE_COUNT = GraphPackage.COMMUNICATING_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Inter Com</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_COM_OPERATION_COUNT = GraphPackage.COMMUNICATING_ENTITY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link topo.SmartGridTopology <em>Smart Grid Topology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Smart Grid Topology</em>'.
	 * @see topo.SmartGridTopology
	 * @generated
	 */
	EClass getSmartGridTopology();

	/**
	 * Returns the meta object for the containment reference list '{@link topo.SmartGridTopology#getContainsNE <em>Contains NE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains NE</em>'.
	 * @see topo.SmartGridTopology#getContainsNE()
	 * @see #getSmartGridTopology()
	 * @generated
	 */
	EReference getSmartGridTopology_ContainsNE();

	/**
	 * Returns the meta object for the containment reference list '{@link topo.SmartGridTopology#getContainsPGN <em>Contains PGN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains PGN</em>'.
	 * @see topo.SmartGridTopology#getContainsPGN()
	 * @see #getSmartGridTopology()
	 * @generated
	 */
	EReference getSmartGridTopology_ContainsPGN();

	/**
	 * Returns the meta object for the containment reference list '{@link topo.SmartGridTopology#getContainsPC <em>Contains PC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains PC</em>'.
	 * @see topo.SmartGridTopology#getContainsPC()
	 * @see #getSmartGridTopology()
	 * @generated
	 */
	EReference getSmartGridTopology_ContainsPC();

	/**
	 * Returns the meta object for the containment reference list '{@link topo.SmartGridTopology#getContainsLC <em>Contains LC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains LC</em>'.
	 * @see topo.SmartGridTopology#getContainsLC()
	 * @see #getSmartGridTopology()
	 * @generated
	 */
	EReference getSmartGridTopology_ContainsLC();

	/**
	 * Returns the meta object for class '{@link topo.SmartMeter <em>Smart Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Smart Meter</em>'.
	 * @see topo.SmartMeter
	 * @generated
	 */
	EClass getSmartMeter();

	/**
	 * Returns the meta object for the attribute '{@link topo.SmartMeter#getAggregation <em>Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aggregation</em>'.
	 * @see topo.SmartMeter#getAggregation()
	 * @see #getSmartMeter()
	 * @generated
	 */
	EAttribute getSmartMeter_Aggregation();

	/**
	 * Returns the meta object for class '{@link topo.NetworkNode <em>Network Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Node</em>'.
	 * @see topo.NetworkNode
	 * @generated
	 */
	EClass getNetworkNode();

	/**
	 * Returns the meta object for class '{@link topo.ControlCenter <em>Control Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Center</em>'.
	 * @see topo.ControlCenter
	 * @generated
	 */
	EClass getControlCenter();

	/**
	 * Returns the meta object for class '{@link topo.GenericController <em>Generic Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Controller</em>'.
	 * @see topo.GenericController
	 * @generated
	 */
	EClass getGenericController();

	/**
	 * Returns the meta object for class '{@link topo.InterCom <em>Inter Com</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inter Com</em>'.
	 * @see topo.InterCom
	 * @generated
	 */
	EClass getInterCom();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TopoFactory getTopoFactory();

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
		 * The meta object literal for the '{@link topo.impl.SmartGridTopologyImpl <em>Smart Grid Topology</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see topo.impl.SmartGridTopologyImpl
		 * @see topo.impl.TopoPackageImpl#getSmartGridTopology()
		 * @generated
		 */
		EClass SMART_GRID_TOPOLOGY = eINSTANCE.getSmartGridTopology();

		/**
		 * The meta object literal for the '<em><b>Contains NE</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMART_GRID_TOPOLOGY__CONTAINS_NE = eINSTANCE.getSmartGridTopology_ContainsNE();

		/**
		 * The meta object literal for the '<em><b>Contains PGN</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMART_GRID_TOPOLOGY__CONTAINS_PGN = eINSTANCE.getSmartGridTopology_ContainsPGN();

		/**
		 * The meta object literal for the '<em><b>Contains PC</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMART_GRID_TOPOLOGY__CONTAINS_PC = eINSTANCE.getSmartGridTopology_ContainsPC();

		/**
		 * The meta object literal for the '<em><b>Contains LC</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMART_GRID_TOPOLOGY__CONTAINS_LC = eINSTANCE.getSmartGridTopology_ContainsLC();

		/**
		 * The meta object literal for the '{@link topo.impl.SmartMeterImpl <em>Smart Meter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see topo.impl.SmartMeterImpl
		 * @see topo.impl.TopoPackageImpl#getSmartMeter()
		 * @generated
		 */
		EClass SMART_METER = eINSTANCE.getSmartMeter();

		/**
		 * The meta object literal for the '<em><b>Aggregation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMART_METER__AGGREGATION = eINSTANCE.getSmartMeter_Aggregation();

		/**
		 * The meta object literal for the '{@link topo.impl.NetworkNodeImpl <em>Network Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see topo.impl.NetworkNodeImpl
		 * @see topo.impl.TopoPackageImpl#getNetworkNode()
		 * @generated
		 */
		EClass NETWORK_NODE = eINSTANCE.getNetworkNode();

		/**
		 * The meta object literal for the '{@link topo.impl.ControlCenterImpl <em>Control Center</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see topo.impl.ControlCenterImpl
		 * @see topo.impl.TopoPackageImpl#getControlCenter()
		 * @generated
		 */
		EClass CONTROL_CENTER = eINSTANCE.getControlCenter();

		/**
		 * The meta object literal for the '{@link topo.impl.GenericControllerImpl <em>Generic Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see topo.impl.GenericControllerImpl
		 * @see topo.impl.TopoPackageImpl#getGenericController()
		 * @generated
		 */
		EClass GENERIC_CONTROLLER = eINSTANCE.getGenericController();

		/**
		 * The meta object literal for the '{@link topo.impl.InterComImpl <em>Inter Com</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see topo.impl.InterComImpl
		 * @see topo.impl.TopoPackageImpl#getInterCom()
		 * @generated
		 */
		EClass INTER_COM = eINSTANCE.getInterCom();

	}

} //TopoPackage
