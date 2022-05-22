/**
 */
package typerepo.typeapplication.impl;

import base.BasePackage;

import graph.GraphPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import topo.TopoPackage;

import typerepo.TyperepoPackage;

import typerepo.impl.TyperepoPackageImpl;

import typerepo.typeapplication.ConnectionTypeApplication;
import typerepo.typeapplication.NetworkNodeTypeApplication;
import typerepo.typeapplication.SmartMeterTypeApplication;
import typerepo.typeapplication.TypeApplications;
import typerepo.typeapplication.TypeapplicationFactory;
import typerepo.typeapplication.TypeapplicationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypeapplicationPackageImpl extends EPackageImpl implements TypeapplicationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeApplicationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionTypeApplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smartMeterTypeApplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkNodeTypeApplicationEClass = null;

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
	 * @see typerepo.typeapplication.TypeapplicationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TypeapplicationPackageImpl() {
		super(eNS_URI, TypeapplicationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TypeapplicationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TypeapplicationPackage init() {
		if (isInited) return (TypeapplicationPackage)EPackage.Registry.INSTANCE.getEPackage(TypeapplicationPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTypeapplicationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TypeapplicationPackageImpl theTypeapplicationPackage = registeredTypeapplicationPackage instanceof TypeapplicationPackageImpl ? (TypeapplicationPackageImpl)registeredTypeapplicationPackage : new TypeapplicationPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BasePackage.eINSTANCE.eClass();
		GraphPackage.eINSTANCE.eClass();
		TopoPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TyperepoPackage.eNS_URI);
		TyperepoPackageImpl theTyperepoPackage = (TyperepoPackageImpl)(registeredPackage instanceof TyperepoPackageImpl ? registeredPackage : TyperepoPackage.eINSTANCE);

		// Create package meta-data objects
		theTypeapplicationPackage.createPackageContents();
		theTyperepoPackage.createPackageContents();

		// Initialize created meta-data
		theTypeapplicationPackage.initializePackageContents();
		theTyperepoPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTypeapplicationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TypeapplicationPackage.eNS_URI, theTypeapplicationPackage);
		return theTypeapplicationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeApplications() {
		return typeApplicationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeApplications_Networknodetypeapplication() {
		return (EReference)typeApplicationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeApplications_Connectiontypeapplication() {
		return (EReference)typeApplicationsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeApplications_Typeapplications() {
		return (EReference)typeApplicationsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionTypeApplication() {
		return connectionTypeApplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionTypeApplication_Connectiontype() {
		return (EReference)connectionTypeApplicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionTypeApplication_Smartmeter() {
		return (EReference)connectionTypeApplicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSmartMeterTypeApplication() {
		return smartMeterTypeApplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSmartMeterTypeApplication_Smartmetertype() {
		return (EReference)smartMeterTypeApplicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSmartMeterTypeApplication_Networknode() {
		return (EReference)smartMeterTypeApplicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkNodeTypeApplication() {
		return networkNodeTypeApplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkNodeTypeApplication_Networknodetype() {
		return (EReference)networkNodeTypeApplicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkNodeTypeApplication_Physicalconnection() {
		return (EReference)networkNodeTypeApplicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeapplicationFactory getTypeapplicationFactory() {
		return (TypeapplicationFactory)getEFactoryInstance();
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
		typeApplicationsEClass = createEClass(TYPE_APPLICATIONS);
		createEReference(typeApplicationsEClass, TYPE_APPLICATIONS__NETWORKNODETYPEAPPLICATION);
		createEReference(typeApplicationsEClass, TYPE_APPLICATIONS__CONNECTIONTYPEAPPLICATION);
		createEReference(typeApplicationsEClass, TYPE_APPLICATIONS__TYPEAPPLICATIONS);

		connectionTypeApplicationEClass = createEClass(CONNECTION_TYPE_APPLICATION);
		createEReference(connectionTypeApplicationEClass, CONNECTION_TYPE_APPLICATION__CONNECTIONTYPE);
		createEReference(connectionTypeApplicationEClass, CONNECTION_TYPE_APPLICATION__SMARTMETER);

		smartMeterTypeApplicationEClass = createEClass(SMART_METER_TYPE_APPLICATION);
		createEReference(smartMeterTypeApplicationEClass, SMART_METER_TYPE_APPLICATION__SMARTMETERTYPE);
		createEReference(smartMeterTypeApplicationEClass, SMART_METER_TYPE_APPLICATION__NETWORKNODE);

		networkNodeTypeApplicationEClass = createEClass(NETWORK_NODE_TYPE_APPLICATION);
		createEReference(networkNodeTypeApplicationEClass, NETWORK_NODE_TYPE_APPLICATION__NETWORKNODETYPE);
		createEReference(networkNodeTypeApplicationEClass, NETWORK_NODE_TYPE_APPLICATION__PHYSICALCONNECTION);
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
		TyperepoPackage theTyperepoPackage = (TyperepoPackage)EPackage.Registry.INSTANCE.getEPackage(TyperepoPackage.eNS_URI);
		GraphPackage theGraphPackage = (GraphPackage)EPackage.Registry.INSTANCE.getEPackage(GraphPackage.eNS_URI);
		TopoPackage theTopoPackage = (TopoPackage)EPackage.Registry.INSTANCE.getEPackage(TopoPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(typeApplicationsEClass, TypeApplications.class, "TypeApplications", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeApplications_Networknodetypeapplication(), this.getSmartMeterTypeApplication(), null, "networknodetypeapplication", null, 0, -1, TypeApplications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeApplications_Connectiontypeapplication(), this.getNetworkNodeTypeApplication(), null, "connectiontypeapplication", null, 0, -1, TypeApplications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeApplications_Typeapplications(), this.getConnectionTypeApplication(), null, "typeapplications", null, 0, -1, TypeApplications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionTypeApplicationEClass, ConnectionTypeApplication.class, "ConnectionTypeApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectionTypeApplication_Connectiontype(), theTyperepoPackage.getConnectionType(), null, "connectiontype", null, 1, 1, ConnectionTypeApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionTypeApplication_Smartmeter(), theGraphPackage.getPhysicalConnection(), null, "smartmeter", null, 1, 1, ConnectionTypeApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(smartMeterTypeApplicationEClass, SmartMeterTypeApplication.class, "SmartMeterTypeApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSmartMeterTypeApplication_Smartmetertype(), theTyperepoPackage.getSmartMeterType(), null, "smartmetertype", null, 1, 1, SmartMeterTypeApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSmartMeterTypeApplication_Networknode(), theTopoPackage.getSmartMeter(), null, "networknode", null, 1, 1, SmartMeterTypeApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkNodeTypeApplicationEClass, NetworkNodeTypeApplication.class, "NetworkNodeTypeApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNetworkNodeTypeApplication_Networknodetype(), theTyperepoPackage.getNetworkNodeType(), null, "networknodetype", null, 1, 1, NetworkNodeTypeApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetworkNodeTypeApplication_Physicalconnection(), theTopoPackage.getNetworkNode(), null, "physicalconnection", null, 1, 1, NetworkNodeTypeApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //TypeapplicationPackageImpl
