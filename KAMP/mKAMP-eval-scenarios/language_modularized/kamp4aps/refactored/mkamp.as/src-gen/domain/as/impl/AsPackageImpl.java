/**
 */
package domain.as.impl;

import domain.as.AsFactory;
import domain.as.AsPackage;

import domain.as.ComponentRepository.ComponentRepositoryPackage;

import domain.as.ComponentRepository.impl.ComponentRepositoryPackageImpl;

import domain.as.InterfaceRepository.InterfaceRepositoryPackage;

import domain.as.InterfaceRepository.impl.InterfaceRepositoryPackageImpl;

import domain.as.ModuleRepository.ModuleRepositoryPackage;

import domain.as.ModuleRepository.impl.ModuleRepositoryPackageImpl;

import domain.as.Plant;

import domain.as.StructureRepository.StructureRepositoryPackage;

import domain.as.StructureRepository.impl.StructureRepositoryPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
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
public class AsPackageImpl extends EPackageImpl implements AsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plantEClass = null;

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
	 * @see domain.as.AsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AsPackageImpl() {
		super(eNS_URI, AsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AsPackage init() {
		if (isInited) return (AsPackage)EPackage.Registry.INSTANCE.getEPackage(AsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AsPackageImpl theAsPackage = registeredAsPackage instanceof AsPackageImpl ? (AsPackageImpl)registeredAsPackage : new AsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BasicPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ComponentRepositoryPackage.eNS_URI);
		ComponentRepositoryPackageImpl theComponentRepositoryPackage = (ComponentRepositoryPackageImpl)(registeredPackage instanceof ComponentRepositoryPackageImpl ? registeredPackage : ComponentRepositoryPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StructureRepositoryPackage.eNS_URI);
		StructureRepositoryPackageImpl theStructureRepositoryPackage = (StructureRepositoryPackageImpl)(registeredPackage instanceof StructureRepositoryPackageImpl ? registeredPackage : StructureRepositoryPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ModuleRepositoryPackage.eNS_URI);
		ModuleRepositoryPackageImpl theModuleRepositoryPackage = (ModuleRepositoryPackageImpl)(registeredPackage instanceof ModuleRepositoryPackageImpl ? registeredPackage : ModuleRepositoryPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(InterfaceRepositoryPackage.eNS_URI);
		InterfaceRepositoryPackageImpl theInterfaceRepositoryPackage = (InterfaceRepositoryPackageImpl)(registeredPackage instanceof InterfaceRepositoryPackageImpl ? registeredPackage : InterfaceRepositoryPackage.eINSTANCE);

		// Create package meta-data objects
		theAsPackage.createPackageContents();
		theComponentRepositoryPackage.createPackageContents();
		theStructureRepositoryPackage.createPackageContents();
		theModuleRepositoryPackage.createPackageContents();
		theInterfaceRepositoryPackage.createPackageContents();

		// Initialize created meta-data
		theAsPackage.initializePackageContents();
		theComponentRepositoryPackage.initializePackageContents();
		theStructureRepositoryPackage.initializePackageContents();
		theModuleRepositoryPackage.initializePackageContents();
		theInterfaceRepositoryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AsPackage.eNS_URI, theAsPackage);
		return theAsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlant() {
		return plantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlant_PlantName() {
		return (EAttribute)plantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlant_Structures() {
		return (EReference)plantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlant_InterfaceRepository() {
		return (EReference)plantEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlant_ComponentRepository() {
		return (EReference)plantEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlant_ModuleRepository() {
		return (EReference)plantEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsFactory getAsFactory() {
		return (AsFactory)getEFactoryInstance();
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
		plantEClass = createEClass(PLANT);
		createEAttribute(plantEClass, PLANT__PLANT_NAME);
		createEReference(plantEClass, PLANT__STRUCTURES);
		createEReference(plantEClass, PLANT__INTERFACE_REPOSITORY);
		createEReference(plantEClass, PLANT__COMPONENT_REPOSITORY);
		createEReference(plantEClass, PLANT__MODULE_REPOSITORY);
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
		ComponentRepositoryPackage theComponentRepositoryPackage = (ComponentRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentRepositoryPackage.eNS_URI);
		StructureRepositoryPackage theStructureRepositoryPackage = (StructureRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(StructureRepositoryPackage.eNS_URI);
		ModuleRepositoryPackage theModuleRepositoryPackage = (ModuleRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(ModuleRepositoryPackage.eNS_URI);
		InterfaceRepositoryPackage theInterfaceRepositoryPackage = (InterfaceRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(InterfaceRepositoryPackage.eNS_URI);
		BasicPackage theBasicPackage = (BasicPackage)EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theComponentRepositoryPackage);
		getESubpackages().add(theStructureRepositoryPackage);
		getESubpackages().add(theModuleRepositoryPackage);
		getESubpackages().add(theInterfaceRepositoryPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		plantEClass.getESuperTypes().add(theBasicPackage.getEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(plantEClass, Plant.class, "Plant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlant_PlantName(), ecorePackage.getEString(), "PlantName", null, 0, 1, Plant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlant_Structures(), theStructureRepositoryPackage.getStructure(), theStructureRepositoryPackage.getStructure_ParentPlant(), "structures", null, 0, -1, Plant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlant_InterfaceRepository(), theInterfaceRepositoryPackage.getInterfaceRepository(), null, "interfaceRepository", null, 1, 1, Plant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlant_ComponentRepository(), theComponentRepositoryPackage.getComponentRepository(), null, "componentRepository", null, 1, 1, Plant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlant_ModuleRepository(), theModuleRepositoryPackage.getModuleRepository(), null, "moduleRepository", null, 1, 1, Plant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //AsPackageImpl
