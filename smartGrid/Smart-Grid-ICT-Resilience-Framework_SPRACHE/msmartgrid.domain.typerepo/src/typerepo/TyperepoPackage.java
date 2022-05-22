/**
 */
package typerepo;

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
 * @see typerepo.TyperepoFactory
 * @model kind="package"
 * @generated
 */
public interface TyperepoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "typerepo";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/typerepo";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "typerepo";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TyperepoPackage eINSTANCE = typerepo.impl.TyperepoPackageImpl.init();

	/**
	 * The meta object id for the '{@link typerepo.impl.RepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typerepo.impl.RepositoryImpl
	 * @see typerepo.impl.TyperepoPackageImpl#getRepository()
	 * @generated
	 */
	int REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__ID = BasePackage.NAMED_IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__NAME = BasePackage.NAMED_IDENTIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Contains Smart Meter Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__CONTAINS_SMART_METER_TYPES = BasePackage.NAMED_IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contains Connection Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__CONTAINS_CONNECTION_TYPE = BasePackage.NAMED_IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contains Network Node Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__CONTAINS_NETWORK_NODE_TYPES = BasePackage.NAMED_IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FEATURE_COUNT = BasePackage.NAMED_IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION_COUNT = BasePackage.NAMED_IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typerepo.impl.SmartMeterTypeImpl <em>Smart Meter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typerepo.impl.SmartMeterTypeImpl
	 * @see typerepo.impl.TyperepoPackageImpl#getSmartMeterType()
	 * @generated
	 */
	int SMART_METER_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_METER_TYPE__ID = BasePackage.NAMED_IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_METER_TYPE__NAME = BasePackage.NAMED_IDENTIFIER__NAME;

	/**
	 * The number of structural features of the '<em>Smart Meter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_METER_TYPE_FEATURE_COUNT = BasePackage.NAMED_IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Smart Meter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_METER_TYPE_OPERATION_COUNT = BasePackage.NAMED_IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typerepo.impl.ConnectionTypeImpl <em>Connection Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typerepo.impl.ConnectionTypeImpl
	 * @see typerepo.impl.TyperepoPackageImpl#getConnectionType()
	 * @generated
	 */
	int CONNECTION_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE__ID = BasePackage.NAMED_IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE__NAME = BasePackage.NAMED_IDENTIFIER__NAME;

	/**
	 * The number of structural features of the '<em>Connection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE_FEATURE_COUNT = BasePackage.NAMED_IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Connection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE_OPERATION_COUNT = BasePackage.NAMED_IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link typerepo.impl.NetworkNodeTypeImpl <em>Network Node Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typerepo.impl.NetworkNodeTypeImpl
	 * @see typerepo.impl.TyperepoPackageImpl#getNetworkNodeType()
	 * @generated
	 */
	int NETWORK_NODE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_NODE_TYPE__ID = BasePackage.NAMED_IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_NODE_TYPE__NAME = BasePackage.NAMED_IDENTIFIER__NAME;

	/**
	 * The number of structural features of the '<em>Network Node Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_NODE_TYPE_FEATURE_COUNT = BasePackage.NAMED_IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Network Node Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_NODE_TYPE_OPERATION_COUNT = BasePackage.NAMED_IDENTIFIER_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link typerepo.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see typerepo.Repository
	 * @generated
	 */
	EClass getRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link typerepo.Repository#getContainsSmartMeterTypes <em>Contains Smart Meter Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Smart Meter Types</em>'.
	 * @see typerepo.Repository#getContainsSmartMeterTypes()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_ContainsSmartMeterTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link typerepo.Repository#getContainsConnectionType <em>Contains Connection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Connection Type</em>'.
	 * @see typerepo.Repository#getContainsConnectionType()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_ContainsConnectionType();

	/**
	 * Returns the meta object for the containment reference list '{@link typerepo.Repository#getContainsNetworkNodeTypes <em>Contains Network Node Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Network Node Types</em>'.
	 * @see typerepo.Repository#getContainsNetworkNodeTypes()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_ContainsNetworkNodeTypes();

	/**
	 * Returns the meta object for class '{@link typerepo.SmartMeterType <em>Smart Meter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Smart Meter Type</em>'.
	 * @see typerepo.SmartMeterType
	 * @generated
	 */
	EClass getSmartMeterType();

	/**
	 * Returns the meta object for class '{@link typerepo.ConnectionType <em>Connection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Type</em>'.
	 * @see typerepo.ConnectionType
	 * @generated
	 */
	EClass getConnectionType();

	/**
	 * Returns the meta object for class '{@link typerepo.NetworkNodeType <em>Network Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Node Type</em>'.
	 * @see typerepo.NetworkNodeType
	 * @generated
	 */
	EClass getNetworkNodeType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TyperepoFactory getTyperepoFactory();

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
		 * The meta object literal for the '{@link typerepo.impl.RepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typerepo.impl.RepositoryImpl
		 * @see typerepo.impl.TyperepoPackageImpl#getRepository()
		 * @generated
		 */
		EClass REPOSITORY = eINSTANCE.getRepository();

		/**
		 * The meta object literal for the '<em><b>Contains Smart Meter Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__CONTAINS_SMART_METER_TYPES = eINSTANCE.getRepository_ContainsSmartMeterTypes();

		/**
		 * The meta object literal for the '<em><b>Contains Connection Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__CONTAINS_CONNECTION_TYPE = eINSTANCE.getRepository_ContainsConnectionType();

		/**
		 * The meta object literal for the '<em><b>Contains Network Node Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__CONTAINS_NETWORK_NODE_TYPES = eINSTANCE.getRepository_ContainsNetworkNodeTypes();

		/**
		 * The meta object literal for the '{@link typerepo.impl.SmartMeterTypeImpl <em>Smart Meter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typerepo.impl.SmartMeterTypeImpl
		 * @see typerepo.impl.TyperepoPackageImpl#getSmartMeterType()
		 * @generated
		 */
		EClass SMART_METER_TYPE = eINSTANCE.getSmartMeterType();

		/**
		 * The meta object literal for the '{@link typerepo.impl.ConnectionTypeImpl <em>Connection Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typerepo.impl.ConnectionTypeImpl
		 * @see typerepo.impl.TyperepoPackageImpl#getConnectionType()
		 * @generated
		 */
		EClass CONNECTION_TYPE = eINSTANCE.getConnectionType();

		/**
		 * The meta object literal for the '{@link typerepo.impl.NetworkNodeTypeImpl <em>Network Node Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typerepo.impl.NetworkNodeTypeImpl
		 * @see typerepo.impl.TyperepoPackageImpl#getNetworkNodeType()
		 * @generated
		 */
		EClass NETWORK_NODE_TYPE = eINSTANCE.getNetworkNodeType();

	}

} //TyperepoPackage
