/**
 */
package graph;

import base.BasePackage;

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
 * @see graph.GraphFactory
 * @model kind="package"
 * @generated
 */
public interface GraphPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "graph";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/graph";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "graph";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GraphPackage eINSTANCE = graph.impl.GraphPackageImpl.init();

	/**
	 * The meta object id for the '{@link graph.impl.NetworkEntityImpl <em>Network Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graph.impl.NetworkEntityImpl
	 * @see graph.impl.GraphPackageImpl#getNetworkEntity()
	 * @generated
	 */
	int NETWORK_ENTITY = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ENTITY__ID = BasePackage.NAMED_IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ENTITY__NAME = BasePackage.NAMED_IDENTIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Connected To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ENTITY__CONNECTED_TO = BasePackage.NAMED_IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Linked By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ENTITY__LINKED_BY = BasePackage.NAMED_IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Network Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ENTITY_FEATURE_COUNT = BasePackage.NAMED_IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Network Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ENTITY_OPERATION_COUNT = BasePackage.NAMED_IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graph.impl.PowerGridNodeImpl <em>Power Grid Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graph.impl.PowerGridNodeImpl
	 * @see graph.impl.GraphPackageImpl#getPowerGridNode()
	 * @generated
	 */
	int POWER_GRID_NODE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_GRID_NODE__ID = BasePackage.NAMED_IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_GRID_NODE__NAME = BasePackage.NAMED_IDENTIFIER__NAME;

	/**
	 * The number of structural features of the '<em>Power Grid Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_GRID_NODE_FEATURE_COUNT = BasePackage.NAMED_IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Power Grid Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_GRID_NODE_OPERATION_COUNT = BasePackage.NAMED_IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graph.impl.PhysicalConnectionImpl <em>Physical Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graph.impl.PhysicalConnectionImpl
	 * @see graph.impl.GraphPackageImpl#getPhysicalConnection()
	 * @generated
	 */
	int PHYSICAL_CONNECTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONNECTION__NAME = BasePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONNECTION__LINKS = BasePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Physical Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONNECTION_FEATURE_COUNT = BasePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Physical Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONNECTION_OPERATION_COUNT = BasePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graph.impl.CommunicatingEntityImpl <em>Communicating Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graph.impl.CommunicatingEntityImpl
	 * @see graph.impl.GraphPackageImpl#getCommunicatingEntity()
	 * @generated
	 */
	int COMMUNICATING_ENTITY = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATING_ENTITY__ID = NETWORK_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATING_ENTITY__NAME = NETWORK_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Connected To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATING_ENTITY__CONNECTED_TO = NETWORK_ENTITY__CONNECTED_TO;

	/**
	 * The feature id for the '<em><b>Linked By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATING_ENTITY__LINKED_BY = NETWORK_ENTITY__LINKED_BY;

	/**
	 * The feature id for the '<em><b>Communicates By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATING_ENTITY__COMMUNICATES_BY = NETWORK_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Communicating Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATING_ENTITY_FEATURE_COUNT = NETWORK_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Communicating Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATING_ENTITY_OPERATION_COUNT = NETWORK_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graph.impl.LogicalCommunicationImpl <em>Logical Communication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graph.impl.LogicalCommunicationImpl
	 * @see graph.impl.GraphPackageImpl#getLogicalCommunication()
	 * @generated
	 */
	int LOGICAL_COMMUNICATION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMMUNICATION__NAME = BasePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMMUNICATION__LINKS = BasePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Logical Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMMUNICATION_FEATURE_COUNT = BasePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Logical Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMMUNICATION_OPERATION_COUNT = BasePackage.NAMED_ENTITY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link graph.NetworkEntity <em>Network Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Entity</em>'.
	 * @see graph.NetworkEntity
	 * @generated
	 */
	EClass getNetworkEntity();

	/**
	 * Returns the meta object for the reference list '{@link graph.NetworkEntity#getConnectedTo <em>Connected To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected To</em>'.
	 * @see graph.NetworkEntity#getConnectedTo()
	 * @see #getNetworkEntity()
	 * @generated
	 */
	EReference getNetworkEntity_ConnectedTo();

	/**
	 * Returns the meta object for the reference list '{@link graph.NetworkEntity#getLinkedBy <em>Linked By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Linked By</em>'.
	 * @see graph.NetworkEntity#getLinkedBy()
	 * @see #getNetworkEntity()
	 * @generated
	 */
	EReference getNetworkEntity_LinkedBy();

	/**
	 * Returns the meta object for class '{@link graph.PowerGridNode <em>Power Grid Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Grid Node</em>'.
	 * @see graph.PowerGridNode
	 * @generated
	 */
	EClass getPowerGridNode();

	/**
	 * Returns the meta object for class '{@link graph.PhysicalConnection <em>Physical Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Connection</em>'.
	 * @see graph.PhysicalConnection
	 * @generated
	 */
	EClass getPhysicalConnection();

	/**
	 * Returns the meta object for the reference list '{@link graph.PhysicalConnection#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Links</em>'.
	 * @see graph.PhysicalConnection#getLinks()
	 * @see #getPhysicalConnection()
	 * @generated
	 */
	EReference getPhysicalConnection_Links();

	/**
	 * Returns the meta object for class '{@link graph.CommunicatingEntity <em>Communicating Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communicating Entity</em>'.
	 * @see graph.CommunicatingEntity
	 * @generated
	 */
	EClass getCommunicatingEntity();

	/**
	 * Returns the meta object for the reference list '{@link graph.CommunicatingEntity#getCommunicatesBy <em>Communicates By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Communicates By</em>'.
	 * @see graph.CommunicatingEntity#getCommunicatesBy()
	 * @see #getCommunicatingEntity()
	 * @generated
	 */
	EReference getCommunicatingEntity_CommunicatesBy();

	/**
	 * Returns the meta object for class '{@link graph.LogicalCommunication <em>Logical Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Communication</em>'.
	 * @see graph.LogicalCommunication
	 * @generated
	 */
	EClass getLogicalCommunication();

	/**
	 * Returns the meta object for the reference list '{@link graph.LogicalCommunication#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Links</em>'.
	 * @see graph.LogicalCommunication#getLinks()
	 * @see #getLogicalCommunication()
	 * @generated
	 */
	EReference getLogicalCommunication_Links();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GraphFactory getGraphFactory();

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
		 * The meta object literal for the '{@link graph.impl.NetworkEntityImpl <em>Network Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graph.impl.NetworkEntityImpl
		 * @see graph.impl.GraphPackageImpl#getNetworkEntity()
		 * @generated
		 */
		EClass NETWORK_ENTITY = eINSTANCE.getNetworkEntity();

		/**
		 * The meta object literal for the '<em><b>Connected To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_ENTITY__CONNECTED_TO = eINSTANCE.getNetworkEntity_ConnectedTo();

		/**
		 * The meta object literal for the '<em><b>Linked By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_ENTITY__LINKED_BY = eINSTANCE.getNetworkEntity_LinkedBy();

		/**
		 * The meta object literal for the '{@link graph.impl.PowerGridNodeImpl <em>Power Grid Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graph.impl.PowerGridNodeImpl
		 * @see graph.impl.GraphPackageImpl#getPowerGridNode()
		 * @generated
		 */
		EClass POWER_GRID_NODE = eINSTANCE.getPowerGridNode();

		/**
		 * The meta object literal for the '{@link graph.impl.PhysicalConnectionImpl <em>Physical Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graph.impl.PhysicalConnectionImpl
		 * @see graph.impl.GraphPackageImpl#getPhysicalConnection()
		 * @generated
		 */
		EClass PHYSICAL_CONNECTION = eINSTANCE.getPhysicalConnection();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_CONNECTION__LINKS = eINSTANCE.getPhysicalConnection_Links();

		/**
		 * The meta object literal for the '{@link graph.impl.CommunicatingEntityImpl <em>Communicating Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graph.impl.CommunicatingEntityImpl
		 * @see graph.impl.GraphPackageImpl#getCommunicatingEntity()
		 * @generated
		 */
		EClass COMMUNICATING_ENTITY = eINSTANCE.getCommunicatingEntity();

		/**
		 * The meta object literal for the '<em><b>Communicates By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATING_ENTITY__COMMUNICATES_BY = eINSTANCE.getCommunicatingEntity_CommunicatesBy();

		/**
		 * The meta object literal for the '{@link graph.impl.LogicalCommunicationImpl <em>Logical Communication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graph.impl.LogicalCommunicationImpl
		 * @see graph.impl.GraphPackageImpl#getLogicalCommunication()
		 * @generated
		 */
		EClass LOGICAL_COMMUNICATION = eINSTANCE.getLogicalCommunication();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_COMMUNICATION__LINKS = eINSTANCE.getLogicalCommunication_Links();

	}

} //GraphPackage
