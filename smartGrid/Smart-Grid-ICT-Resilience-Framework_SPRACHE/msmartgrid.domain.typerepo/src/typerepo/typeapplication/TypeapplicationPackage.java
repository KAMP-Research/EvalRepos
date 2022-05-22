/**
 */
package typerepo.typeapplication;

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
 * @see typerepo.typeapplication.TypeapplicationFactory
 * @model kind="package"
 * @generated
 */
public interface TypeapplicationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "typeapplication";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/typeapplication";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "typeapplication";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TypeapplicationPackage eINSTANCE = typerepo.typeapplication.impl.TypeapplicationPackageImpl.init();

	/**
	 * The meta object id for the '{@link typerepo.typeapplication.impl.TypeApplicationsImpl <em>Type Applications</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typerepo.typeapplication.impl.TypeApplicationsImpl
	 * @see typerepo.typeapplication.impl.TypeapplicationPackageImpl#getTypeApplications()
	 * @generated
	 */
	int TYPE_APPLICATIONS = 0;

	/**
	 * The feature id for the '<em><b>Networknodetypeapplication</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_APPLICATIONS__NETWORKNODETYPEAPPLICATION = 0;

	/**
	 * The feature id for the '<em><b>Connectiontypeapplication</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_APPLICATIONS__CONNECTIONTYPEAPPLICATION = 1;

	/**
	 * The feature id for the '<em><b>Typeapplications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_APPLICATIONS__TYPEAPPLICATIONS = 2;

	/**
	 * The number of structural features of the '<em>Type Applications</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_APPLICATIONS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Type Applications</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_APPLICATIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link typerepo.typeapplication.impl.ConnectionTypeApplicationImpl <em>Connection Type Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typerepo.typeapplication.impl.ConnectionTypeApplicationImpl
	 * @see typerepo.typeapplication.impl.TypeapplicationPackageImpl#getConnectionTypeApplication()
	 * @generated
	 */
	int CONNECTION_TYPE_APPLICATION = 1;

	/**
	 * The feature id for the '<em><b>Connectiontype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE_APPLICATION__CONNECTIONTYPE = 0;

	/**
	 * The feature id for the '<em><b>Smartmeter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE_APPLICATION__SMARTMETER = 1;

	/**
	 * The number of structural features of the '<em>Connection Type Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE_APPLICATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Connection Type Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE_APPLICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link typerepo.typeapplication.impl.SmartMeterTypeApplicationImpl <em>Smart Meter Type Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typerepo.typeapplication.impl.SmartMeterTypeApplicationImpl
	 * @see typerepo.typeapplication.impl.TypeapplicationPackageImpl#getSmartMeterTypeApplication()
	 * @generated
	 */
	int SMART_METER_TYPE_APPLICATION = 2;

	/**
	 * The feature id for the '<em><b>Smartmetertype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_METER_TYPE_APPLICATION__SMARTMETERTYPE = 0;

	/**
	 * The feature id for the '<em><b>Networknode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_METER_TYPE_APPLICATION__NETWORKNODE = 1;

	/**
	 * The number of structural features of the '<em>Smart Meter Type Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_METER_TYPE_APPLICATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Smart Meter Type Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_METER_TYPE_APPLICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link typerepo.typeapplication.impl.NetworkNodeTypeApplicationImpl <em>Network Node Type Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typerepo.typeapplication.impl.NetworkNodeTypeApplicationImpl
	 * @see typerepo.typeapplication.impl.TypeapplicationPackageImpl#getNetworkNodeTypeApplication()
	 * @generated
	 */
	int NETWORK_NODE_TYPE_APPLICATION = 3;

	/**
	 * The feature id for the '<em><b>Networknodetype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_NODE_TYPE_APPLICATION__NETWORKNODETYPE = 0;

	/**
	 * The feature id for the '<em><b>Physicalconnection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_NODE_TYPE_APPLICATION__PHYSICALCONNECTION = 1;

	/**
	 * The number of structural features of the '<em>Network Node Type Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_NODE_TYPE_APPLICATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Network Node Type Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_NODE_TYPE_APPLICATION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link typerepo.typeapplication.TypeApplications <em>Type Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Applications</em>'.
	 * @see typerepo.typeapplication.TypeApplications
	 * @generated
	 */
	EClass getTypeApplications();

	/**
	 * Returns the meta object for the containment reference list '{@link typerepo.typeapplication.TypeApplications#getNetworknodetypeapplication <em>Networknodetypeapplication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Networknodetypeapplication</em>'.
	 * @see typerepo.typeapplication.TypeApplications#getNetworknodetypeapplication()
	 * @see #getTypeApplications()
	 * @generated
	 */
	EReference getTypeApplications_Networknodetypeapplication();

	/**
	 * Returns the meta object for the containment reference list '{@link typerepo.typeapplication.TypeApplications#getConnectiontypeapplication <em>Connectiontypeapplication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connectiontypeapplication</em>'.
	 * @see typerepo.typeapplication.TypeApplications#getConnectiontypeapplication()
	 * @see #getTypeApplications()
	 * @generated
	 */
	EReference getTypeApplications_Connectiontypeapplication();

	/**
	 * Returns the meta object for the containment reference list '{@link typerepo.typeapplication.TypeApplications#getTypeapplications <em>Typeapplications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Typeapplications</em>'.
	 * @see typerepo.typeapplication.TypeApplications#getTypeapplications()
	 * @see #getTypeApplications()
	 * @generated
	 */
	EReference getTypeApplications_Typeapplications();

	/**
	 * Returns the meta object for class '{@link typerepo.typeapplication.ConnectionTypeApplication <em>Connection Type Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Type Application</em>'.
	 * @see typerepo.typeapplication.ConnectionTypeApplication
	 * @generated
	 */
	EClass getConnectionTypeApplication();

	/**
	 * Returns the meta object for the reference '{@link typerepo.typeapplication.ConnectionTypeApplication#getConnectiontype <em>Connectiontype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connectiontype</em>'.
	 * @see typerepo.typeapplication.ConnectionTypeApplication#getConnectiontype()
	 * @see #getConnectionTypeApplication()
	 * @generated
	 */
	EReference getConnectionTypeApplication_Connectiontype();

	/**
	 * Returns the meta object for the reference '{@link typerepo.typeapplication.ConnectionTypeApplication#getSmartmeter <em>Smartmeter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Smartmeter</em>'.
	 * @see typerepo.typeapplication.ConnectionTypeApplication#getSmartmeter()
	 * @see #getConnectionTypeApplication()
	 * @generated
	 */
	EReference getConnectionTypeApplication_Smartmeter();

	/**
	 * Returns the meta object for class '{@link typerepo.typeapplication.SmartMeterTypeApplication <em>Smart Meter Type Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Smart Meter Type Application</em>'.
	 * @see typerepo.typeapplication.SmartMeterTypeApplication
	 * @generated
	 */
	EClass getSmartMeterTypeApplication();

	/**
	 * Returns the meta object for the reference '{@link typerepo.typeapplication.SmartMeterTypeApplication#getSmartmetertype <em>Smartmetertype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Smartmetertype</em>'.
	 * @see typerepo.typeapplication.SmartMeterTypeApplication#getSmartmetertype()
	 * @see #getSmartMeterTypeApplication()
	 * @generated
	 */
	EReference getSmartMeterTypeApplication_Smartmetertype();

	/**
	 * Returns the meta object for the reference '{@link typerepo.typeapplication.SmartMeterTypeApplication#getNetworknode <em>Networknode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Networknode</em>'.
	 * @see typerepo.typeapplication.SmartMeterTypeApplication#getNetworknode()
	 * @see #getSmartMeterTypeApplication()
	 * @generated
	 */
	EReference getSmartMeterTypeApplication_Networknode();

	/**
	 * Returns the meta object for class '{@link typerepo.typeapplication.NetworkNodeTypeApplication <em>Network Node Type Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Node Type Application</em>'.
	 * @see typerepo.typeapplication.NetworkNodeTypeApplication
	 * @generated
	 */
	EClass getNetworkNodeTypeApplication();

	/**
	 * Returns the meta object for the reference '{@link typerepo.typeapplication.NetworkNodeTypeApplication#getNetworknodetype <em>Networknodetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Networknodetype</em>'.
	 * @see typerepo.typeapplication.NetworkNodeTypeApplication#getNetworknodetype()
	 * @see #getNetworkNodeTypeApplication()
	 * @generated
	 */
	EReference getNetworkNodeTypeApplication_Networknodetype();

	/**
	 * Returns the meta object for the reference '{@link typerepo.typeapplication.NetworkNodeTypeApplication#getPhysicalconnection <em>Physicalconnection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Physicalconnection</em>'.
	 * @see typerepo.typeapplication.NetworkNodeTypeApplication#getPhysicalconnection()
	 * @see #getNetworkNodeTypeApplication()
	 * @generated
	 */
	EReference getNetworkNodeTypeApplication_Physicalconnection();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TypeapplicationFactory getTypeapplicationFactory();

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
		 * The meta object literal for the '{@link typerepo.typeapplication.impl.TypeApplicationsImpl <em>Type Applications</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typerepo.typeapplication.impl.TypeApplicationsImpl
		 * @see typerepo.typeapplication.impl.TypeapplicationPackageImpl#getTypeApplications()
		 * @generated
		 */
		EClass TYPE_APPLICATIONS = eINSTANCE.getTypeApplications();

		/**
		 * The meta object literal for the '<em><b>Networknodetypeapplication</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_APPLICATIONS__NETWORKNODETYPEAPPLICATION = eINSTANCE.getTypeApplications_Networknodetypeapplication();

		/**
		 * The meta object literal for the '<em><b>Connectiontypeapplication</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_APPLICATIONS__CONNECTIONTYPEAPPLICATION = eINSTANCE.getTypeApplications_Connectiontypeapplication();

		/**
		 * The meta object literal for the '<em><b>Typeapplications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_APPLICATIONS__TYPEAPPLICATIONS = eINSTANCE.getTypeApplications_Typeapplications();

		/**
		 * The meta object literal for the '{@link typerepo.typeapplication.impl.ConnectionTypeApplicationImpl <em>Connection Type Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typerepo.typeapplication.impl.ConnectionTypeApplicationImpl
		 * @see typerepo.typeapplication.impl.TypeapplicationPackageImpl#getConnectionTypeApplication()
		 * @generated
		 */
		EClass CONNECTION_TYPE_APPLICATION = eINSTANCE.getConnectionTypeApplication();

		/**
		 * The meta object literal for the '<em><b>Connectiontype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_TYPE_APPLICATION__CONNECTIONTYPE = eINSTANCE.getConnectionTypeApplication_Connectiontype();

		/**
		 * The meta object literal for the '<em><b>Smartmeter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_TYPE_APPLICATION__SMARTMETER = eINSTANCE.getConnectionTypeApplication_Smartmeter();

		/**
		 * The meta object literal for the '{@link typerepo.typeapplication.impl.SmartMeterTypeApplicationImpl <em>Smart Meter Type Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typerepo.typeapplication.impl.SmartMeterTypeApplicationImpl
		 * @see typerepo.typeapplication.impl.TypeapplicationPackageImpl#getSmartMeterTypeApplication()
		 * @generated
		 */
		EClass SMART_METER_TYPE_APPLICATION = eINSTANCE.getSmartMeterTypeApplication();

		/**
		 * The meta object literal for the '<em><b>Smartmetertype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMART_METER_TYPE_APPLICATION__SMARTMETERTYPE = eINSTANCE.getSmartMeterTypeApplication_Smartmetertype();

		/**
		 * The meta object literal for the '<em><b>Networknode</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMART_METER_TYPE_APPLICATION__NETWORKNODE = eINSTANCE.getSmartMeterTypeApplication_Networknode();

		/**
		 * The meta object literal for the '{@link typerepo.typeapplication.impl.NetworkNodeTypeApplicationImpl <em>Network Node Type Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typerepo.typeapplication.impl.NetworkNodeTypeApplicationImpl
		 * @see typerepo.typeapplication.impl.TypeapplicationPackageImpl#getNetworkNodeTypeApplication()
		 * @generated
		 */
		EClass NETWORK_NODE_TYPE_APPLICATION = eINSTANCE.getNetworkNodeTypeApplication();

		/**
		 * The meta object literal for the '<em><b>Networknodetype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_NODE_TYPE_APPLICATION__NETWORKNODETYPE = eINSTANCE.getNetworkNodeTypeApplication_Networknodetype();

		/**
		 * The meta object literal for the '<em><b>Physicalconnection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_NODE_TYPE_APPLICATION__PHYSICALCONNECTION = eINSTANCE.getNetworkNodeTypeApplication_Physicalconnection();

	}

} //TypeapplicationPackage
