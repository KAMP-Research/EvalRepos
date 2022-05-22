/**
 */
package topo.impl;

import base.BasePackage;

import graph.GraphPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import topo.ControlCenter;
import topo.GenericController;
import topo.InterCom;
import topo.NetworkNode;
import topo.SmartGridTopology;
import topo.SmartMeter;
import topo.TopoFactory;
import topo.TopoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TopoPackageImpl extends EPackageImpl implements TopoPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smartGridTopologyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smartMeterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlCenterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericControllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interComEClass = null;

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
	 * @see topo.TopoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TopoPackageImpl() {
		super(eNS_URI, TopoFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TopoPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TopoPackage init() {
		if (isInited) return (TopoPackage)EPackage.Registry.INSTANCE.getEPackage(TopoPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTopoPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TopoPackageImpl theTopoPackage = registeredTopoPackage instanceof TopoPackageImpl ? (TopoPackageImpl)registeredTopoPackage : new TopoPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BasePackage.eINSTANCE.eClass();
		GraphPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTopoPackage.createPackageContents();

		// Initialize created meta-data
		theTopoPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTopoPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TopoPackage.eNS_URI, theTopoPackage);
		return theTopoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSmartGridTopology() {
		return smartGridTopologyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSmartGridTopology_ContainsNE() {
		return (EReference)smartGridTopologyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSmartGridTopology_ContainsPGN() {
		return (EReference)smartGridTopologyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSmartGridTopology_ContainsPC() {
		return (EReference)smartGridTopologyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSmartGridTopology_ContainsLC() {
		return (EReference)smartGridTopologyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSmartMeter() {
		return smartMeterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSmartMeter_Aggregation() {
		return (EAttribute)smartMeterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkNode() {
		return networkNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlCenter() {
		return controlCenterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericController() {
		return genericControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterCom() {
		return interComEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopoFactory getTopoFactory() {
		return (TopoFactory)getEFactoryInstance();
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
		smartGridTopologyEClass = createEClass(SMART_GRID_TOPOLOGY);
		createEReference(smartGridTopologyEClass, SMART_GRID_TOPOLOGY__CONTAINS_NE);
		createEReference(smartGridTopologyEClass, SMART_GRID_TOPOLOGY__CONTAINS_PGN);
		createEReference(smartGridTopologyEClass, SMART_GRID_TOPOLOGY__CONTAINS_PC);
		createEReference(smartGridTopologyEClass, SMART_GRID_TOPOLOGY__CONTAINS_LC);

		smartMeterEClass = createEClass(SMART_METER);
		createEAttribute(smartMeterEClass, SMART_METER__AGGREGATION);

		networkNodeEClass = createEClass(NETWORK_NODE);

		controlCenterEClass = createEClass(CONTROL_CENTER);

		genericControllerEClass = createEClass(GENERIC_CONTROLLER);

		interComEClass = createEClass(INTER_COM);
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
		BasePackage theBasePackage = (BasePackage)EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);
		GraphPackage theGraphPackage = (GraphPackage)EPackage.Registry.INSTANCE.getEPackage(GraphPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		smartGridTopologyEClass.getESuperTypes().add(theBasePackage.getNamedIdentifier());
		smartMeterEClass.getESuperTypes().add(theGraphPackage.getCommunicatingEntity());
		networkNodeEClass.getESuperTypes().add(theGraphPackage.getNetworkEntity());
		controlCenterEClass.getESuperTypes().add(theGraphPackage.getCommunicatingEntity());
		genericControllerEClass.getESuperTypes().add(theGraphPackage.getCommunicatingEntity());
		interComEClass.getESuperTypes().add(theGraphPackage.getCommunicatingEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(smartGridTopologyEClass, SmartGridTopology.class, "SmartGridTopology", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSmartGridTopology_ContainsNE(), theGraphPackage.getNetworkEntity(), null, "ContainsNE", null, 0, -1, SmartGridTopology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSmartGridTopology_ContainsPGN(), theGraphPackage.getPowerGridNode(), null, "ContainsPGN", null, 0, -1, SmartGridTopology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSmartGridTopology_ContainsPC(), theGraphPackage.getPhysicalConnection(), null, "ContainsPC", null, 0, -1, SmartGridTopology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSmartGridTopology_ContainsLC(), theGraphPackage.getLogicalCommunication(), null, "ContainsLC", null, 0, -1, SmartGridTopology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(smartMeterEClass, SmartMeter.class, "SmartMeter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSmartMeter_Aggregation(), ecorePackage.getEInt(), "Aggregation", "1", 0, 1, SmartMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkNodeEClass, NetworkNode.class, "NetworkNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(controlCenterEClass, ControlCenter.class, "ControlCenter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(genericControllerEClass, GenericController.class, "GenericController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interComEClass, InterCom.class, "InterCom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //TopoPackageImpl
