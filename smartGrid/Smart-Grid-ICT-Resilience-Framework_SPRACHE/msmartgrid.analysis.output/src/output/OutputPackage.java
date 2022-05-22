/**
 */
package output;

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
 * @see output.OutputFactory
 * @model kind="package"
 * @generated
 */
public interface OutputPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "output";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/output";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "output";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OutputPackage eINSTANCE = output.impl.OutputPackageImpl.init();

	/**
	 * The meta object id for the '{@link output.impl.ScenarioResultImpl <em>Scenario Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see output.impl.ScenarioResultImpl
	 * @see output.impl.OutputPackageImpl#getScenarioResult()
	 * @generated
	 */
	int SCENARIO_RESULT = 0;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_RESULT__STATES = 0;

	/**
	 * The feature id for the '<em><b>Clusters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_RESULT__CLUSTERS = 1;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_RESULT__SCENARIO = 2;

	/**
	 * The number of structural features of the '<em>Scenario Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_RESULT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Scenario Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_RESULT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link output.impl.EntityStateImpl <em>Entity State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see output.impl.EntityStateImpl
	 * @see output.impl.OutputPackageImpl#getEntityState()
	 * @generated
	 */
	int ENTITY_STATE = 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_STATE__OWNER = 0;

	/**
	 * The number of structural features of the '<em>Entity State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_STATE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Entity State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link output.impl.OnImpl <em>On</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see output.impl.OnImpl
	 * @see output.impl.OutputPackageImpl#getOn()
	 * @generated
	 */
	int ON = 8;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON__OWNER = ENTITY_STATE__OWNER;

	/**
	 * The feature id for the '<em><b>Belongs To Cluster</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON__BELONGS_TO_CLUSTER = ENTITY_STATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Hacked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON__IS_HACKED = ENTITY_STATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>On</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_FEATURE_COUNT = ENTITY_STATE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>On</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_OPERATION_COUNT = ENTITY_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link output.impl.OnlineImpl <em>Online</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see output.impl.OnlineImpl
	 * @see output.impl.OutputPackageImpl#getOnline()
	 * @generated
	 */
	int ONLINE = 2;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE__OWNER = ON__OWNER;

	/**
	 * The feature id for the '<em><b>Belongs To Cluster</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE__BELONGS_TO_CLUSTER = ON__BELONGS_TO_CLUSTER;

	/**
	 * The feature id for the '<em><b>Is Hacked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE__IS_HACKED = ON__IS_HACKED;

	/**
	 * The number of structural features of the '<em>Online</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_FEATURE_COUNT = ON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Online</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_OPERATION_COUNT = ON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link output.impl.DefectImpl <em>Defect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see output.impl.DefectImpl
	 * @see output.impl.OutputPackageImpl#getDefect()
	 * @generated
	 */
	int DEFECT = 3;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFECT__OWNER = ENTITY_STATE__OWNER;

	/**
	 * The number of structural features of the '<em>Defect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFECT_FEATURE_COUNT = ENTITY_STATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Defect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFECT_OPERATION_COUNT = ENTITY_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link output.impl.NoPowerImpl <em>No Power</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see output.impl.NoPowerImpl
	 * @see output.impl.OutputPackageImpl#getNoPower()
	 * @generated
	 */
	int NO_POWER = 4;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_POWER__OWNER = ENTITY_STATE__OWNER;

	/**
	 * The number of structural features of the '<em>No Power</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_POWER_FEATURE_COUNT = ENTITY_STATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>No Power</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_POWER_OPERATION_COUNT = ENTITY_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link output.impl.OfflineImpl <em>Offline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see output.impl.OfflineImpl
	 * @see output.impl.OutputPackageImpl#getOffline()
	 * @generated
	 */
	int OFFLINE = 6;

	/**
	 * The number of structural features of the '<em>Offline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFLINE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Offline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFLINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link output.impl.NoUplinkImpl <em>No Uplink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see output.impl.NoUplinkImpl
	 * @see output.impl.OutputPackageImpl#getNoUplink()
	 * @generated
	 */
	int NO_UPLINK = 5;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_UPLINK__OWNER = OFFLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Belongs To Cluster</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_UPLINK__BELONGS_TO_CLUSTER = OFFLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Hacked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_UPLINK__IS_HACKED = OFFLINE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>No Uplink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_UPLINK_FEATURE_COUNT = OFFLINE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>No Uplink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_UPLINK_OPERATION_COUNT = OFFLINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link output.impl.ClusterImpl <em>Cluster</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see output.impl.ClusterImpl
	 * @see output.impl.OutputPackageImpl#getCluster()
	 * @generated
	 */
	int CLUSTER = 7;

	/**
	 * The feature id for the '<em><b>Control Center Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__CONTROL_CENTER_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Smart Meter Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__SMART_METER_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Has Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__HAS_ENTITIES = 2;

	/**
	 * The number of structural features of the '<em>Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link output.ScenarioResult <em>Scenario Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario Result</em>'.
	 * @see output.ScenarioResult
	 * @generated
	 */
	EClass getScenarioResult();

	/**
	 * Returns the meta object for the containment reference list '{@link output.ScenarioResult#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see output.ScenarioResult#getStates()
	 * @see #getScenarioResult()
	 * @generated
	 */
	EReference getScenarioResult_States();

	/**
	 * Returns the meta object for the containment reference list '{@link output.ScenarioResult#getClusters <em>Clusters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clusters</em>'.
	 * @see output.ScenarioResult#getClusters()
	 * @see #getScenarioResult()
	 * @generated
	 */
	EReference getScenarioResult_Clusters();

	/**
	 * Returns the meta object for the reference '{@link output.ScenarioResult#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scenario</em>'.
	 * @see output.ScenarioResult#getScenario()
	 * @see #getScenarioResult()
	 * @generated
	 */
	EReference getScenarioResult_Scenario();

	/**
	 * Returns the meta object for class '{@link output.EntityState <em>Entity State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity State</em>'.
	 * @see output.EntityState
	 * @generated
	 */
	EClass getEntityState();

	/**
	 * Returns the meta object for the reference '{@link output.EntityState#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see output.EntityState#getOwner()
	 * @see #getEntityState()
	 * @generated
	 */
	EReference getEntityState_Owner();

	/**
	 * Returns the meta object for class '{@link output.Online <em>Online</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Online</em>'.
	 * @see output.Online
	 * @generated
	 */
	EClass getOnline();

	/**
	 * Returns the meta object for class '{@link output.Defect <em>Defect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Defect</em>'.
	 * @see output.Defect
	 * @generated
	 */
	EClass getDefect();

	/**
	 * Returns the meta object for class '{@link output.NoPower <em>No Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>No Power</em>'.
	 * @see output.NoPower
	 * @generated
	 */
	EClass getNoPower();

	/**
	 * Returns the meta object for class '{@link output.NoUplink <em>No Uplink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>No Uplink</em>'.
	 * @see output.NoUplink
	 * @generated
	 */
	EClass getNoUplink();

	/**
	 * Returns the meta object for class '{@link output.Offline <em>Offline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offline</em>'.
	 * @see output.Offline
	 * @generated
	 */
	EClass getOffline();

	/**
	 * Returns the meta object for class '{@link output.Cluster <em>Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cluster</em>'.
	 * @see output.Cluster
	 * @generated
	 */
	EClass getCluster();

	/**
	 * Returns the meta object for the attribute '{@link output.Cluster#getControlCenterCount <em>Control Center Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Center Count</em>'.
	 * @see output.Cluster#getControlCenterCount()
	 * @see #getCluster()
	 * @generated
	 */
	EAttribute getCluster_ControlCenterCount();

	/**
	 * Returns the meta object for the attribute '{@link output.Cluster#getSmartMeterCount <em>Smart Meter Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Smart Meter Count</em>'.
	 * @see output.Cluster#getSmartMeterCount()
	 * @see #getCluster()
	 * @generated
	 */
	EAttribute getCluster_SmartMeterCount();

	/**
	 * Returns the meta object for the reference list '{@link output.Cluster#getHasEntities <em>Has Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Entities</em>'.
	 * @see output.Cluster#getHasEntities()
	 * @see #getCluster()
	 * @generated
	 */
	EReference getCluster_HasEntities();

	/**
	 * Returns the meta object for class '{@link output.On <em>On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On</em>'.
	 * @see output.On
	 * @generated
	 */
	EClass getOn();

	/**
	 * Returns the meta object for the reference '{@link output.On#getBelongsToCluster <em>Belongs To Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Belongs To Cluster</em>'.
	 * @see output.On#getBelongsToCluster()
	 * @see #getOn()
	 * @generated
	 */
	EReference getOn_BelongsToCluster();

	/**
	 * Returns the meta object for the attribute '{@link output.On#isIsHacked <em>Is Hacked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Hacked</em>'.
	 * @see output.On#isIsHacked()
	 * @see #getOn()
	 * @generated
	 */
	EAttribute getOn_IsHacked();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OutputFactory getOutputFactory();

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
		 * The meta object literal for the '{@link output.impl.ScenarioResultImpl <em>Scenario Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see output.impl.ScenarioResultImpl
		 * @see output.impl.OutputPackageImpl#getScenarioResult()
		 * @generated
		 */
		EClass SCENARIO_RESULT = eINSTANCE.getScenarioResult();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO_RESULT__STATES = eINSTANCE.getScenarioResult_States();

		/**
		 * The meta object literal for the '<em><b>Clusters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO_RESULT__CLUSTERS = eINSTANCE.getScenarioResult_Clusters();

		/**
		 * The meta object literal for the '<em><b>Scenario</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO_RESULT__SCENARIO = eINSTANCE.getScenarioResult_Scenario();

		/**
		 * The meta object literal for the '{@link output.impl.EntityStateImpl <em>Entity State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see output.impl.EntityStateImpl
		 * @see output.impl.OutputPackageImpl#getEntityState()
		 * @generated
		 */
		EClass ENTITY_STATE = eINSTANCE.getEntityState();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_STATE__OWNER = eINSTANCE.getEntityState_Owner();

		/**
		 * The meta object literal for the '{@link output.impl.OnlineImpl <em>Online</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see output.impl.OnlineImpl
		 * @see output.impl.OutputPackageImpl#getOnline()
		 * @generated
		 */
		EClass ONLINE = eINSTANCE.getOnline();

		/**
		 * The meta object literal for the '{@link output.impl.DefectImpl <em>Defect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see output.impl.DefectImpl
		 * @see output.impl.OutputPackageImpl#getDefect()
		 * @generated
		 */
		EClass DEFECT = eINSTANCE.getDefect();

		/**
		 * The meta object literal for the '{@link output.impl.NoPowerImpl <em>No Power</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see output.impl.NoPowerImpl
		 * @see output.impl.OutputPackageImpl#getNoPower()
		 * @generated
		 */
		EClass NO_POWER = eINSTANCE.getNoPower();

		/**
		 * The meta object literal for the '{@link output.impl.NoUplinkImpl <em>No Uplink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see output.impl.NoUplinkImpl
		 * @see output.impl.OutputPackageImpl#getNoUplink()
		 * @generated
		 */
		EClass NO_UPLINK = eINSTANCE.getNoUplink();

		/**
		 * The meta object literal for the '{@link output.impl.OfflineImpl <em>Offline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see output.impl.OfflineImpl
		 * @see output.impl.OutputPackageImpl#getOffline()
		 * @generated
		 */
		EClass OFFLINE = eINSTANCE.getOffline();

		/**
		 * The meta object literal for the '{@link output.impl.ClusterImpl <em>Cluster</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see output.impl.ClusterImpl
		 * @see output.impl.OutputPackageImpl#getCluster()
		 * @generated
		 */
		EClass CLUSTER = eINSTANCE.getCluster();

		/**
		 * The meta object literal for the '<em><b>Control Center Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLUSTER__CONTROL_CENTER_COUNT = eINSTANCE.getCluster_ControlCenterCount();

		/**
		 * The meta object literal for the '<em><b>Smart Meter Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLUSTER__SMART_METER_COUNT = eINSTANCE.getCluster_SmartMeterCount();

		/**
		 * The meta object literal for the '<em><b>Has Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLUSTER__HAS_ENTITIES = eINSTANCE.getCluster_HasEntities();

		/**
		 * The meta object literal for the '{@link output.impl.OnImpl <em>On</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see output.impl.OnImpl
		 * @see output.impl.OutputPackageImpl#getOn()
		 * @generated
		 */
		EClass ON = eINSTANCE.getOn();

		/**
		 * The meta object literal for the '<em><b>Belongs To Cluster</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON__BELONGS_TO_CLUSTER = eINSTANCE.getOn_BelongsToCluster();

		/**
		 * The meta object literal for the '<em><b>Is Hacked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ON__IS_HACKED = eINSTANCE.getOn_IsHacked();

	}

} //OutputPackage
