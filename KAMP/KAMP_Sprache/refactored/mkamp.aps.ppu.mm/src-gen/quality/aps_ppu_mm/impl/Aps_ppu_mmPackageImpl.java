/**
 */
package quality.aps_ppu_mm.impl;

import domain.as.AsPackage;

import domain.as.ModuleRepository.ModuleRepositoryPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import paradigm.basic.BasicPackage;

import paradigm.modificationmarks.ModificationmarksPackage;

import quality.aps_ppu_mm.Aps_ppu_mmFactory;
import quality.aps_ppu_mm.Aps_ppu_mmPackage;
import quality.aps_ppu_mm.ModifyMicroSwitchModule;

import quality.as_mm.As_mmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Aps_ppu_mmPackageImpl extends EPackageImpl implements Aps_ppu_mmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifyMicroSwitchModuleEClass = null;

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
	 * @see quality.aps_ppu_mm.Aps_ppu_mmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Aps_ppu_mmPackageImpl() {
		super(eNS_URI, Aps_ppu_mmFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Aps_ppu_mmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Aps_ppu_mmPackage init() {
		if (isInited) return (Aps_ppu_mmPackage)EPackage.Registry.INSTANCE.getEPackage(Aps_ppu_mmPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAps_ppu_mmPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Aps_ppu_mmPackageImpl theAps_ppu_mmPackage = registeredAps_ppu_mmPackage instanceof Aps_ppu_mmPackageImpl ? (Aps_ppu_mmPackageImpl)registeredAps_ppu_mmPackage : new Aps_ppu_mmPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		AsPackage.eINSTANCE.eClass();
		As_mmPackage.eINSTANCE.eClass();
		BasicPackage.eINSTANCE.eClass();
		ModificationmarksPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAps_ppu_mmPackage.createPackageContents();

		// Initialize created meta-data
		theAps_ppu_mmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAps_ppu_mmPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Aps_ppu_mmPackage.eNS_URI, theAps_ppu_mmPackage);
		return theAps_ppu_mmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifyMicroSwitchModule() {
		return modifyMicroSwitchModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModifyMicroSwitchModule_IsReplaced() {
		return (EAttribute)modifyMicroSwitchModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aps_ppu_mmFactory getAps_ppu_mmFactory() {
		return (Aps_ppu_mmFactory)getEFactoryInstance();
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
		modifyMicroSwitchModuleEClass = createEClass(MODIFY_MICRO_SWITCH_MODULE);
		createEAttribute(modifyMicroSwitchModuleEClass, MODIFY_MICRO_SWITCH_MODULE__IS_REPLACED);
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
		As_mmPackage theAs_mmPackage = (As_mmPackage)EPackage.Registry.INSTANCE.getEPackage(As_mmPackage.eNS_URI);
		ModuleRepositoryPackage theModuleRepositoryPackage = (ModuleRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(ModuleRepositoryPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theAs_mmPackage.getModifyModule());
		EGenericType g2 = createEGenericType(theModuleRepositoryPackage.getModule());
		g1.getETypeArguments().add(g2);
		modifyMicroSwitchModuleEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(modifyMicroSwitchModuleEClass, ModifyMicroSwitchModule.class, "ModifyMicroSwitchModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModifyMicroSwitchModule_IsReplaced(), ecorePackage.getEBoolean(), "isReplaced", null, 1, 1, ModifyMicroSwitchModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Aps_ppu_mmPackageImpl
