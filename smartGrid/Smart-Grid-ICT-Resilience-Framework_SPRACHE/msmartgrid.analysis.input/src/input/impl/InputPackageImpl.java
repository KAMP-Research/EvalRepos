/**
 */
package input.impl;

import base.BasePackage;

import graph.GraphPackage;

import input.EntityState;
import input.InputFactory;
import input.InputPackage;
import input.PowerState;
import input.ScenarioState;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import topo.TopoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InputPackageImpl extends EPackageImpl implements InputPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scenarioStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerStateEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see input.InputPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InputPackageImpl() {
		super(eNS_URI, InputFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link InputPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InputPackage init() {
		if (isInited) return (InputPackage)EPackage.Registry.INSTANCE.getEPackage(InputPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredInputPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		InputPackageImpl theInputPackage = registeredInputPackage instanceof InputPackageImpl ? (InputPackageImpl)registeredInputPackage : new InputPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BasePackage.eINSTANCE.eClass();
		GraphPackage.eINSTANCE.eClass();
		TopoPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theInputPackage.createPackageContents();

		// Initialize created meta-data
		theInputPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theInputPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InputPackage.eNS_URI, theInputPackage);
		return theInputPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScenarioState() {
		return scenarioStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenarioState_EntityStates() {
		return (EReference)scenarioStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenarioState_PowerStates() {
		return (EReference)scenarioStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenarioState_Scenario() {
		return (EReference)scenarioStateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityState() {
		return entityStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityState_IsDestroyed() {
		return (EAttribute)entityStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityState_IsHacked() {
		return (EAttribute)entityStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityState_Owner() {
		return (EReference)entityStateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPowerState() {
		return powerStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPowerState_Owner() {
		return (EReference)powerStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPowerState_PowerOutage() {
		return (EAttribute)powerStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputFactory getInputFactory() {
		return (InputFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		scenarioStateEClass = createEClass(SCENARIO_STATE);
		createEReference(scenarioStateEClass, SCENARIO_STATE__ENTITY_STATES);
		createEReference(scenarioStateEClass, SCENARIO_STATE__POWER_STATES);
		createEReference(scenarioStateEClass, SCENARIO_STATE__SCENARIO);

		entityStateEClass = createEClass(ENTITY_STATE);
		createEAttribute(entityStateEClass, ENTITY_STATE__IS_DESTROYED);
		createEAttribute(entityStateEClass, ENTITY_STATE__IS_HACKED);
		createEReference(entityStateEClass, ENTITY_STATE__OWNER);

		powerStateEClass = createEClass(POWER_STATE);
		createEReference(powerStateEClass, POWER_STATE__OWNER);
		createEAttribute(powerStateEClass, POWER_STATE__POWER_OUTAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TopoPackage theTopoPackage = (TopoPackage)EPackage.Registry.INSTANCE.getEPackage(TopoPackage.eNS_URI);
		GraphPackage theGraphPackage = (GraphPackage)EPackage.Registry.INSTANCE.getEPackage(GraphPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(scenarioStateEClass, ScenarioState.class, "ScenarioState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScenarioState_EntityStates(), this.getEntityState(), null, "EntityStates", null, 0, -1, ScenarioState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenarioState_PowerStates(), this.getPowerState(), null, "PowerStates", null, 0, -1, ScenarioState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenarioState_Scenario(), theTopoPackage.getSmartGridTopology(), null, "Scenario", null, 0, 1, ScenarioState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityStateEClass, EntityState.class, "EntityState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntityState_IsDestroyed(), ecorePackage.getEBoolean(), "IsDestroyed", null, 1, 1, EntityState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityState_IsHacked(), ecorePackage.getEBoolean(), "IsHacked", "false", 1, 1, EntityState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityState_Owner(), theGraphPackage.getNetworkEntity(), null, "Owner", null, 1, 1, EntityState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(powerStateEClass, PowerState.class, "PowerState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPowerState_Owner(), theGraphPackage.getPowerGridNode(), null, "Owner", null, 1, 1, PowerState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPowerState_PowerOutage(), ecorePackage.getEBoolean(), "PowerOutage", null, 1, 1, PowerState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //InputPackageImpl
