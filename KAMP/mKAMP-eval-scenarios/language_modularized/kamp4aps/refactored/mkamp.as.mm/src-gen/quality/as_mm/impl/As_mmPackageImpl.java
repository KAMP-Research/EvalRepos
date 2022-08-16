/**
 */
package quality.as_mm.impl;

import domain.as.AsPackage;

import domain.as.ComponentRepository.ComponentRepositoryPackage;

import domain.as.InterfaceRepository.InterfaceRepositoryPackage;

import domain.as.ModuleRepository.ModuleRepositoryPackage;

import domain.as.StructureRepository.StructureRepositoryPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import paradigm.basic.BasicPackage;

import paradigm.modificationmarks.ModificationmarksPackage;

import quality.as_mm.AbstractKAMP4aPSModificationRepository;
import quality.as_mm.As_mmFactory;
import quality.as_mm.As_mmPackage;
import quality.as_mm.ChangePropagationDueToHardwareChange;
import quality.as_mm.KAMP4aPSModificationRepository;
import quality.as_mm.KAMP4aPSSeedModifications;
import quality.as_mm.ModifyComponent;
import quality.as_mm.ModifyEntity;
import quality.as_mm.ModifyInterface;
import quality.as_mm.ModifyModule;
import quality.as_mm.ModifyStructure;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class As_mmPackageImpl extends EPackageImpl implements As_mmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractKAMP4aPSModificationRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kamp4aPSModificationRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kamp4aPSSeedModificationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changePropagationDueToHardwareChangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifyEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifyComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifyModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifyStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifyInterfaceEClass = null;

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
	 * @see quality.as_mm.As_mmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private As_mmPackageImpl() {
		super(eNS_URI, As_mmFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link As_mmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static As_mmPackage init() {
		if (isInited) return (As_mmPackage)EPackage.Registry.INSTANCE.getEPackage(As_mmPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAs_mmPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		As_mmPackageImpl theAs_mmPackage = registeredAs_mmPackage instanceof As_mmPackageImpl ? (As_mmPackageImpl)registeredAs_mmPackage : new As_mmPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		AsPackage.eINSTANCE.eClass();
		BasicPackage.eINSTANCE.eClass();
		ModificationmarksPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAs_mmPackage.createPackageContents();

		// Initialize created meta-data
		theAs_mmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAs_mmPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(As_mmPackage.eNS_URI, theAs_mmPackage);
		return theAs_mmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractKAMP4aPSModificationRepository() {
		return abstractKAMP4aPSModificationRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKAMP4aPSModificationRepository() {
		return kamp4aPSModificationRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKAMP4aPSSeedModifications() {
		return kamp4aPSSeedModificationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKAMP4aPSSeedModifications_StructureModifications() {
		return (EReference)kamp4aPSSeedModificationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKAMP4aPSSeedModifications_ModuleModifications() {
		return (EReference)kamp4aPSSeedModificationsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKAMP4aPSSeedModifications_ComponentModifications() {
		return (EReference)kamp4aPSSeedModificationsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKAMP4aPSSeedModifications_InterfaceModifications() {
		return (EReference)kamp4aPSSeedModificationsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangePropagationDueToHardwareChange() {
		return changePropagationDueToHardwareChangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangePropagationDueToHardwareChange_InterfaceModifications() {
		return (EReference)changePropagationDueToHardwareChangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangePropagationDueToHardwareChange_ComponentModifications() {
		return (EReference)changePropagationDueToHardwareChangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangePropagationDueToHardwareChange_StructureModifications() {
		return (EReference)changePropagationDueToHardwareChangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangePropagationDueToHardwareChange_ModuleModifications() {
		return (EReference)changePropagationDueToHardwareChangeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangePropagationDueToHardwareChange_Changed() {
		return (EAttribute)changePropagationDueToHardwareChangeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifyEntity() {
		return modifyEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifyComponent() {
		return modifyComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifyModule() {
		return modifyModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifyStructure() {
		return modifyStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifyInterface() {
		return modifyInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As_mmFactory getAs_mmFactory() {
		return (As_mmFactory)getEFactoryInstance();
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
		abstractKAMP4aPSModificationRepositoryEClass = createEClass(ABSTRACT_KAMP_4A_PS_MODIFICATION_REPOSITORY);

		kamp4aPSModificationRepositoryEClass = createEClass(KAMP_4A_PS_MODIFICATION_REPOSITORY);

		kamp4aPSSeedModificationsEClass = createEClass(KAMP_4A_PS_SEED_MODIFICATIONS);
		createEReference(kamp4aPSSeedModificationsEClass, KAMP_4A_PS_SEED_MODIFICATIONS__STRUCTURE_MODIFICATIONS);
		createEReference(kamp4aPSSeedModificationsEClass, KAMP_4A_PS_SEED_MODIFICATIONS__MODULE_MODIFICATIONS);
		createEReference(kamp4aPSSeedModificationsEClass, KAMP_4A_PS_SEED_MODIFICATIONS__COMPONENT_MODIFICATIONS);
		createEReference(kamp4aPSSeedModificationsEClass, KAMP_4A_PS_SEED_MODIFICATIONS__INTERFACE_MODIFICATIONS);

		changePropagationDueToHardwareChangeEClass = createEClass(CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE);
		createEReference(changePropagationDueToHardwareChangeEClass, CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__INTERFACE_MODIFICATIONS);
		createEReference(changePropagationDueToHardwareChangeEClass, CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__COMPONENT_MODIFICATIONS);
		createEReference(changePropagationDueToHardwareChangeEClass, CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__STRUCTURE_MODIFICATIONS);
		createEReference(changePropagationDueToHardwareChangeEClass, CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__MODULE_MODIFICATIONS);
		createEAttribute(changePropagationDueToHardwareChangeEClass, CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__CHANGED);

		modifyEntityEClass = createEClass(MODIFY_ENTITY);

		modifyComponentEClass = createEClass(MODIFY_COMPONENT);

		modifyModuleEClass = createEClass(MODIFY_MODULE);

		modifyStructureEClass = createEClass(MODIFY_STRUCTURE);

		modifyInterfaceEClass = createEClass(MODIFY_INTERFACE);
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
		ModificationmarksPackage theModificationmarksPackage = (ModificationmarksPackage)EPackage.Registry.INSTANCE.getEPackage(ModificationmarksPackage.eNS_URI);
		StructureRepositoryPackage theStructureRepositoryPackage = (StructureRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(StructureRepositoryPackage.eNS_URI);
		ModuleRepositoryPackage theModuleRepositoryPackage = (ModuleRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(ModuleRepositoryPackage.eNS_URI);
		ComponentRepositoryPackage theComponentRepositoryPackage = (ComponentRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentRepositoryPackage.eNS_URI);
		InterfaceRepositoryPackage theInterfaceRepositoryPackage = (InterfaceRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(InterfaceRepositoryPackage.eNS_URI);
		BasicPackage theBasicPackage = (BasicPackage)EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI);

		// Create type parameters
		ETypeParameter abstractKAMP4aPSModificationRepositoryEClass_T = addETypeParameter(abstractKAMP4aPSModificationRepositoryEClass, "T");
		ETypeParameter modifyEntityEClass_T = addETypeParameter(modifyEntityEClass, "T");
		ETypeParameter modifyComponentEClass_T = addETypeParameter(modifyComponentEClass, "T");
		ETypeParameter modifyModuleEClass_T = addETypeParameter(modifyModuleEClass, "T");
		ETypeParameter modifyStructureEClass_T = addETypeParameter(modifyStructureEClass, "T");
		ETypeParameter modifyInterfaceEClass_T = addETypeParameter(modifyInterfaceEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getKAMP4aPSSeedModifications());
		abstractKAMP4aPSModificationRepositoryEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theBasicPackage.getEntity());
		modifyEntityEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theComponentRepositoryPackage.getComponent());
		modifyComponentEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theModuleRepositoryPackage.getModule());
		modifyModuleEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theStructureRepositoryPackage.getStructure());
		modifyStructureEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theInterfaceRepositoryPackage.getInterface());
		modifyInterfaceEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		g1 = createEGenericType(theModificationmarksPackage.getAbstractModificationRepository());
		EGenericType g2 = createEGenericType(abstractKAMP4aPSModificationRepositoryEClass_T);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theModificationmarksPackage.getChangePropagationStep());
		g1.getETypeArguments().add(g2);
		abstractKAMP4aPSModificationRepositoryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getAbstractKAMP4aPSModificationRepository());
		g2 = createEGenericType(this.getKAMP4aPSSeedModifications());
		g1.getETypeArguments().add(g2);
		kamp4aPSModificationRepositoryEClass.getEGenericSuperTypes().add(g1);
		kamp4aPSSeedModificationsEClass.getESuperTypes().add(theModificationmarksPackage.getAbstractSeedModifications());
		changePropagationDueToHardwareChangeEClass.getESuperTypes().add(theModificationmarksPackage.getChangePropagationStep());
		g1 = createEGenericType(theModificationmarksPackage.getAbstractModification());
		g2 = createEGenericType(modifyEntityEClass_T);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEObject());
		g1.getETypeArguments().add(g2);
		modifyEntityEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getModifyEntity());
		g2 = createEGenericType(theComponentRepositoryPackage.getComponent());
		g1.getETypeArguments().add(g2);
		modifyComponentEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getModifyEntity());
		g2 = createEGenericType(theModuleRepositoryPackage.getModule());
		g1.getETypeArguments().add(g2);
		modifyModuleEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getModifyEntity());
		g2 = createEGenericType(theStructureRepositoryPackage.getStructure());
		g1.getETypeArguments().add(g2);
		modifyStructureEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getModifyEntity());
		g2 = createEGenericType(theInterfaceRepositoryPackage.getInterface());
		g1.getETypeArguments().add(g2);
		modifyInterfaceEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractKAMP4aPSModificationRepositoryEClass, AbstractKAMP4aPSModificationRepository.class, "AbstractKAMP4aPSModificationRepository", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(kamp4aPSModificationRepositoryEClass, KAMP4aPSModificationRepository.class, "KAMP4aPSModificationRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(kamp4aPSSeedModificationsEClass, KAMP4aPSSeedModifications.class, "KAMP4aPSSeedModifications", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getModifyStructure());
		g2 = createEGenericType(theStructureRepositoryPackage.getStructure());
		g1.getETypeArguments().add(g2);
		initEReference(getKAMP4aPSSeedModifications_StructureModifications(), g1, null, "structureModifications", null, 0, -1, KAMP4aPSSeedModifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getModifyModule());
		g2 = createEGenericType(theModuleRepositoryPackage.getModule());
		g1.getETypeArguments().add(g2);
		initEReference(getKAMP4aPSSeedModifications_ModuleModifications(), g1, null, "moduleModifications", null, 0, -1, KAMP4aPSSeedModifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getModifyComponent());
		g2 = createEGenericType(theComponentRepositoryPackage.getComponent());
		g1.getETypeArguments().add(g2);
		initEReference(getKAMP4aPSSeedModifications_ComponentModifications(), g1, null, "componentModifications", null, 0, -1, KAMP4aPSSeedModifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getModifyInterface());
		g2 = createEGenericType(theInterfaceRepositoryPackage.getInterface());
		g1.getETypeArguments().add(g2);
		initEReference(getKAMP4aPSSeedModifications_InterfaceModifications(), g1, null, "interfaceModifications", null, 0, -1, KAMP4aPSSeedModifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changePropagationDueToHardwareChangeEClass, ChangePropagationDueToHardwareChange.class, "ChangePropagationDueToHardwareChange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getModifyInterface());
		g2 = createEGenericType(theInterfaceRepositoryPackage.getInterface());
		g1.getETypeArguments().add(g2);
		initEReference(getChangePropagationDueToHardwareChange_InterfaceModifications(), g1, null, "interfaceModifications", null, 0, -1, ChangePropagationDueToHardwareChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getModifyComponent());
		g2 = createEGenericType(theComponentRepositoryPackage.getComponent());
		g1.getETypeArguments().add(g2);
		initEReference(getChangePropagationDueToHardwareChange_ComponentModifications(), g1, null, "componentModifications", null, 0, -1, ChangePropagationDueToHardwareChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getModifyStructure());
		g2 = createEGenericType(theStructureRepositoryPackage.getStructure());
		g1.getETypeArguments().add(g2);
		initEReference(getChangePropagationDueToHardwareChange_StructureModifications(), g1, null, "structureModifications", null, 0, -1, ChangePropagationDueToHardwareChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getModifyModule());
		g2 = createEGenericType(theModuleRepositoryPackage.getModule());
		g1.getETypeArguments().add(g2);
		initEReference(getChangePropagationDueToHardwareChange_ModuleModifications(), g1, null, "moduleModifications", null, 0, -1, ChangePropagationDueToHardwareChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangePropagationDueToHardwareChange_Changed(), ecorePackage.getEBoolean(), "changed", "false", 1, 1, ChangePropagationDueToHardwareChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modifyEntityEClass, ModifyEntity.class, "ModifyEntity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modifyComponentEClass, ModifyComponent.class, "ModifyComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modifyModuleEClass, ModifyModule.class, "ModifyModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modifyStructureEClass, ModifyStructure.class, "ModifyStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modifyInterfaceEClass, ModifyInterface.class, "ModifyInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //As_mmPackageImpl
