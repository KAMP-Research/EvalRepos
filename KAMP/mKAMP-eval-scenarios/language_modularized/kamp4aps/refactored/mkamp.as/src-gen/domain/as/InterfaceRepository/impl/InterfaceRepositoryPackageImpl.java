/**
 */
package domain.as.InterfaceRepository.impl;

import domain.as.AsPackage;

import domain.as.ComponentRepository.ComponentRepositoryPackage;

import domain.as.ComponentRepository.impl.ComponentRepositoryPackageImpl;

import domain.as.InterfaceRepository.Interface;
import domain.as.InterfaceRepository.InterfaceRepository;
import domain.as.InterfaceRepository.InterfaceRepositoryFactory;
import domain.as.InterfaceRepository.InterfaceRepositoryPackage;

import domain.as.ModuleRepository.ModuleRepositoryPackage;

import domain.as.ModuleRepository.impl.ModuleRepositoryPackageImpl;

import domain.as.StructureRepository.StructureRepositoryPackage;

import domain.as.StructureRepository.impl.StructureRepositoryPackageImpl;

import domain.as.impl.AsPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import paradigm.basic.BasicPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InterfaceRepositoryPackageImpl extends EPackageImpl implements InterfaceRepositoryPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceEClass = null;

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
	 * @see domain.as.InterfaceRepository.InterfaceRepositoryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InterfaceRepositoryPackageImpl() {
		super(eNS_URI, InterfaceRepositoryFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link InterfaceRepositoryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InterfaceRepositoryPackage init() {
		if (isInited) return (InterfaceRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(InterfaceRepositoryPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredInterfaceRepositoryPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		InterfaceRepositoryPackageImpl theInterfaceRepositoryPackage = registeredInterfaceRepositoryPackage instanceof InterfaceRepositoryPackageImpl ? (InterfaceRepositoryPackageImpl)registeredInterfaceRepositoryPackage : new InterfaceRepositoryPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BasicPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AsPackage.eNS_URI);
		AsPackageImpl theAsPackage = (AsPackageImpl)(registeredPackage instanceof AsPackageImpl ? registeredPackage : AsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ComponentRepositoryPackage.eNS_URI);
		ComponentRepositoryPackageImpl theComponentRepositoryPackage = (ComponentRepositoryPackageImpl)(registeredPackage instanceof ComponentRepositoryPackageImpl ? registeredPackage : ComponentRepositoryPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StructureRepositoryPackage.eNS_URI);
		StructureRepositoryPackageImpl theStructureRepositoryPackage = (StructureRepositoryPackageImpl)(registeredPackage instanceof StructureRepositoryPackageImpl ? registeredPackage : StructureRepositoryPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ModuleRepositoryPackage.eNS_URI);
		ModuleRepositoryPackageImpl theModuleRepositoryPackage = (ModuleRepositoryPackageImpl)(registeredPackage instanceof ModuleRepositoryPackageImpl ? registeredPackage : ModuleRepositoryPackage.eINSTANCE);

		// Create package meta-data objects
		theInterfaceRepositoryPackage.createPackageContents();
		theAsPackage.createPackageContents();
		theComponentRepositoryPackage.createPackageContents();
		theStructureRepositoryPackage.createPackageContents();
		theModuleRepositoryPackage.createPackageContents();

		// Initialize created meta-data
		theInterfaceRepositoryPackage.initializePackageContents();
		theAsPackage.initializePackageContents();
		theComponentRepositoryPackage.initializePackageContents();
		theStructureRepositoryPackage.initializePackageContents();
		theModuleRepositoryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theInterfaceRepositoryPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InterfaceRepositoryPackage.eNS_URI, theInterfaceRepositoryPackage);
		return theInterfaceRepositoryPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceRepository() {
		return interfaceRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceRepository_AllInterfacesInPlant() {
		return (EReference)interfaceRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterface() {
		return interfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_ParentElement() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceRepositoryFactory getInterfaceRepositoryFactory() {
		return (InterfaceRepositoryFactory)getEFactoryInstance();
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
		interfaceRepositoryEClass = createEClass(INTERFACE_REPOSITORY);
		createEReference(interfaceRepositoryEClass, INTERFACE_REPOSITORY__ALL_INTERFACES_IN_PLANT);

		interfaceEClass = createEClass(INTERFACE);
		createEReference(interfaceEClass, INTERFACE__PARENT_ELEMENT);
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
		BasicPackage theBasicPackage = (BasicPackage)EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		interfaceRepositoryEClass.getESuperTypes().add(theBasicPackage.getEntity());
		interfaceEClass.getESuperTypes().add(theBasicPackage.getEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(interfaceRepositoryEClass, InterfaceRepository.class, "InterfaceRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceRepository_AllInterfacesInPlant(), this.getInterface(), null, "allInterfacesInPlant", null, 0, -1, InterfaceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterface_ParentElement(), theBasicPackage.getEntity(), null, "parentElement", null, 1, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //InterfaceRepositoryPackageImpl
