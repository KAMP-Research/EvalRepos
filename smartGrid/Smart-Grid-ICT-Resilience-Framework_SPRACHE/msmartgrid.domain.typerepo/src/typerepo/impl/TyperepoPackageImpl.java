/**
 */
package typerepo.impl;

import base.BasePackage;

import graph.GraphPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import topo.TopoPackage;

import typerepo.ConnectionType;
import typerepo.NetworkNodeType;
import typerepo.Repository;
import typerepo.SmartMeterType;
import typerepo.TyperepoFactory;
import typerepo.TyperepoPackage;

import typerepo.typeapplication.TypeapplicationPackage;

import typerepo.typeapplication.impl.TypeapplicationPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TyperepoPackageImpl extends EPackageImpl implements TyperepoPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smartMeterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkNodeTypeEClass = null;

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
	 * @see typerepo.TyperepoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TyperepoPackageImpl() {
		super(eNS_URI, TyperepoFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TyperepoPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TyperepoPackage init() {
		if (isInited) return (TyperepoPackage)EPackage.Registry.INSTANCE.getEPackage(TyperepoPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTyperepoPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TyperepoPackageImpl theTyperepoPackage = registeredTyperepoPackage instanceof TyperepoPackageImpl ? (TyperepoPackageImpl)registeredTyperepoPackage : new TyperepoPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BasePackage.eINSTANCE.eClass();
		GraphPackage.eINSTANCE.eClass();
		TopoPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TypeapplicationPackage.eNS_URI);
		TypeapplicationPackageImpl theTypeapplicationPackage = (TypeapplicationPackageImpl)(registeredPackage instanceof TypeapplicationPackageImpl ? registeredPackage : TypeapplicationPackage.eINSTANCE);

		// Create package meta-data objects
		theTyperepoPackage.createPackageContents();
		theTypeapplicationPackage.createPackageContents();

		// Initialize created meta-data
		theTyperepoPackage.initializePackageContents();
		theTypeapplicationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTyperepoPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TyperepoPackage.eNS_URI, theTyperepoPackage);
		return theTyperepoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepository() {
		return repositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepository_ContainsSmartMeterTypes() {
		return (EReference)repositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepository_ContainsConnectionType() {
		return (EReference)repositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepository_ContainsNetworkNodeTypes() {
		return (EReference)repositoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSmartMeterType() {
		return smartMeterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionType() {
		return connectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkNodeType() {
		return networkNodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TyperepoFactory getTyperepoFactory() {
		return (TyperepoFactory)getEFactoryInstance();
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
		repositoryEClass = createEClass(REPOSITORY);
		createEReference(repositoryEClass, REPOSITORY__CONTAINS_SMART_METER_TYPES);
		createEReference(repositoryEClass, REPOSITORY__CONTAINS_CONNECTION_TYPE);
		createEReference(repositoryEClass, REPOSITORY__CONTAINS_NETWORK_NODE_TYPES);

		smartMeterTypeEClass = createEClass(SMART_METER_TYPE);

		connectionTypeEClass = createEClass(CONNECTION_TYPE);

		networkNodeTypeEClass = createEClass(NETWORK_NODE_TYPE);
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
		TypeapplicationPackage theTypeapplicationPackage = (TypeapplicationPackage)EPackage.Registry.INSTANCE.getEPackage(TypeapplicationPackage.eNS_URI);
		BasePackage theBasePackage = (BasePackage)EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theTypeapplicationPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		repositoryEClass.getESuperTypes().add(theBasePackage.getNamedIdentifier());
		smartMeterTypeEClass.getESuperTypes().add(theBasePackage.getNamedIdentifier());
		connectionTypeEClass.getESuperTypes().add(theBasePackage.getNamedIdentifier());
		networkNodeTypeEClass.getESuperTypes().add(theBasePackage.getNamedIdentifier());

		// Initialize classes, features, and operations; add parameters
		initEClass(repositoryEClass, Repository.class, "Repository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRepository_ContainsSmartMeterTypes(), this.getSmartMeterType(), null, "ContainsSmartMeterTypes", null, 0, -1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepository_ContainsConnectionType(), this.getConnectionType(), null, "ContainsConnectionType", null, 0, -1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepository_ContainsNetworkNodeTypes(), this.getNetworkNodeType(), null, "ContainsNetworkNodeTypes", null, 0, -1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(smartMeterTypeEClass, SmartMeterType.class, "SmartMeterType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(connectionTypeEClass, ConnectionType.class, "ConnectionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(networkNodeTypeEClass, NetworkNodeType.class, "NetworkNodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //TyperepoPackageImpl
