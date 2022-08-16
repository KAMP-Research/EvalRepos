/**
 */
package quality.as_mm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import paradigm.modificationmarks.ModificationmarksPackage;

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
 * @see quality.as_mm.As_mmFactory
 * @model kind="package"
 * @generated
 */
public interface As_mmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "as_mm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "as_mm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "as_mm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	As_mmPackage eINSTANCE = quality.as_mm.impl.As_mmPackageImpl.init();

	/**
	 * The meta object id for the '{@link quality.as_mm.impl.AbstractKAMP4aPSModificationRepositoryImpl <em>Abstract KAMP 4a PS Modification Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see quality.as_mm.impl.AbstractKAMP4aPSModificationRepositoryImpl
	 * @see quality.as_mm.impl.As_mmPackageImpl#getAbstractKAMP4aPSModificationRepository()
	 * @generated
	 */
	int ABSTRACT_KAMP_4A_PS_MODIFICATION_REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Seed Modifications</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_KAMP_4A_PS_MODIFICATION_REPOSITORY__SEED_MODIFICATIONS = ModificationmarksPackage.ABSTRACT_MODIFICATION_REPOSITORY__SEED_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Change Propagation Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_KAMP_4A_PS_MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS = ModificationmarksPackage.ABSTRACT_MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS;

	/**
	 * The number of structural features of the '<em>Abstract KAMP 4a PS Modification Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_KAMP_4A_PS_MODIFICATION_REPOSITORY_FEATURE_COUNT = ModificationmarksPackage.ABSTRACT_MODIFICATION_REPOSITORY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstract KAMP 4a PS Modification Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_KAMP_4A_PS_MODIFICATION_REPOSITORY_OPERATION_COUNT = ModificationmarksPackage.ABSTRACT_MODIFICATION_REPOSITORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link quality.as_mm.impl.KAMP4aPSModificationRepositoryImpl <em>KAMP 4a PS Modification Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see quality.as_mm.impl.KAMP4aPSModificationRepositoryImpl
	 * @see quality.as_mm.impl.As_mmPackageImpl#getKAMP4aPSModificationRepository()
	 * @generated
	 */
	int KAMP_4A_PS_MODIFICATION_REPOSITORY = 1;

	/**
	 * The feature id for the '<em><b>Seed Modifications</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAMP_4A_PS_MODIFICATION_REPOSITORY__SEED_MODIFICATIONS = ABSTRACT_KAMP_4A_PS_MODIFICATION_REPOSITORY__SEED_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Change Propagation Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAMP_4A_PS_MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS = ABSTRACT_KAMP_4A_PS_MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS;

	/**
	 * The number of structural features of the '<em>KAMP 4a PS Modification Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAMP_4A_PS_MODIFICATION_REPOSITORY_FEATURE_COUNT = ABSTRACT_KAMP_4A_PS_MODIFICATION_REPOSITORY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>KAMP 4a PS Modification Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAMP_4A_PS_MODIFICATION_REPOSITORY_OPERATION_COUNT = ABSTRACT_KAMP_4A_PS_MODIFICATION_REPOSITORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link quality.as_mm.impl.KAMP4aPSSeedModificationsImpl <em>KAMP 4a PS Seed Modifications</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see quality.as_mm.impl.KAMP4aPSSeedModificationsImpl
	 * @see quality.as_mm.impl.As_mmPackageImpl#getKAMP4aPSSeedModifications()
	 * @generated
	 */
	int KAMP_4A_PS_SEED_MODIFICATIONS = 2;

	/**
	 * The feature id for the '<em><b>Structure Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAMP_4A_PS_SEED_MODIFICATIONS__STRUCTURE_MODIFICATIONS = ModificationmarksPackage.ABSTRACT_SEED_MODIFICATIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Module Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAMP_4A_PS_SEED_MODIFICATIONS__MODULE_MODIFICATIONS = ModificationmarksPackage.ABSTRACT_SEED_MODIFICATIONS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Component Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAMP_4A_PS_SEED_MODIFICATIONS__COMPONENT_MODIFICATIONS = ModificationmarksPackage.ABSTRACT_SEED_MODIFICATIONS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Interface Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAMP_4A_PS_SEED_MODIFICATIONS__INTERFACE_MODIFICATIONS = ModificationmarksPackage.ABSTRACT_SEED_MODIFICATIONS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>KAMP 4a PS Seed Modifications</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAMP_4A_PS_SEED_MODIFICATIONS_FEATURE_COUNT = ModificationmarksPackage.ABSTRACT_SEED_MODIFICATIONS_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>KAMP 4a PS Seed Modifications</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAMP_4A_PS_SEED_MODIFICATIONS_OPERATION_COUNT = ModificationmarksPackage.ABSTRACT_SEED_MODIFICATIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link quality.as_mm.impl.ChangePropagationDueToHardwareChangeImpl <em>Change Propagation Due To Hardware Change</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see quality.as_mm.impl.ChangePropagationDueToHardwareChangeImpl
	 * @see quality.as_mm.impl.As_mmPackageImpl#getChangePropagationDueToHardwareChange()
	 * @generated
	 */
	int CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE = 3;

	/**
	 * The feature id for the '<em><b>Interface Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__INTERFACE_MODIFICATIONS = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__COMPONENT_MODIFICATIONS = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Structure Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__STRUCTURE_MODIFICATIONS = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Module Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__MODULE_MODIFICATIONS = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__CHANGED = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Change Propagation Due To Hardware Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE_FEATURE_COUNT = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Change Propagation Due To Hardware Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE_OPERATION_COUNT = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link quality.as_mm.impl.ModifyEntityImpl <em>Modify Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see quality.as_mm.impl.ModifyEntityImpl
	 * @see quality.as_mm.impl.As_mmPackageImpl#getModifyEntity()
	 * @generated
	 */
	int MODIFY_ENTITY = 4;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_ENTITY__AFFECTED_ELEMENT = ModificationmarksPackage.ABSTRACT_MODIFICATION__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_ENTITY__CAUSING_ELEMENTS = ModificationmarksPackage.ABSTRACT_MODIFICATION__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_ENTITY__ID = ModificationmarksPackage.ABSTRACT_MODIFICATION__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_ENTITY__TOOLDERIVED = ModificationmarksPackage.ABSTRACT_MODIFICATION__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_ENTITY__USER_DECISION = ModificationmarksPackage.ABSTRACT_MODIFICATION__USER_DECISION;

	/**
	 * The number of structural features of the '<em>Modify Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_ENTITY_FEATURE_COUNT = ModificationmarksPackage.ABSTRACT_MODIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Modify Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_ENTITY_OPERATION_COUNT = ModificationmarksPackage.ABSTRACT_MODIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link quality.as_mm.impl.ModifyComponentImpl <em>Modify Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see quality.as_mm.impl.ModifyComponentImpl
	 * @see quality.as_mm.impl.As_mmPackageImpl#getModifyComponent()
	 * @generated
	 */
	int MODIFY_COMPONENT = 5;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_COMPONENT__AFFECTED_ELEMENT = MODIFY_ENTITY__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_COMPONENT__CAUSING_ELEMENTS = MODIFY_ENTITY__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_COMPONENT__ID = MODIFY_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_COMPONENT__TOOLDERIVED = MODIFY_ENTITY__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_COMPONENT__USER_DECISION = MODIFY_ENTITY__USER_DECISION;

	/**
	 * The number of structural features of the '<em>Modify Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_COMPONENT_FEATURE_COUNT = MODIFY_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Modify Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_COMPONENT_OPERATION_COUNT = MODIFY_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link quality.as_mm.impl.ModifyModuleImpl <em>Modify Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see quality.as_mm.impl.ModifyModuleImpl
	 * @see quality.as_mm.impl.As_mmPackageImpl#getModifyModule()
	 * @generated
	 */
	int MODIFY_MODULE = 6;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_MODULE__AFFECTED_ELEMENT = MODIFY_ENTITY__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_MODULE__CAUSING_ELEMENTS = MODIFY_ENTITY__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_MODULE__ID = MODIFY_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_MODULE__TOOLDERIVED = MODIFY_ENTITY__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_MODULE__USER_DECISION = MODIFY_ENTITY__USER_DECISION;

	/**
	 * The number of structural features of the '<em>Modify Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_MODULE_FEATURE_COUNT = MODIFY_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Modify Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_MODULE_OPERATION_COUNT = MODIFY_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link quality.as_mm.impl.ModifyStructureImpl <em>Modify Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see quality.as_mm.impl.ModifyStructureImpl
	 * @see quality.as_mm.impl.As_mmPackageImpl#getModifyStructure()
	 * @generated
	 */
	int MODIFY_STRUCTURE = 7;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_STRUCTURE__AFFECTED_ELEMENT = MODIFY_ENTITY__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_STRUCTURE__CAUSING_ELEMENTS = MODIFY_ENTITY__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_STRUCTURE__ID = MODIFY_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_STRUCTURE__TOOLDERIVED = MODIFY_ENTITY__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_STRUCTURE__USER_DECISION = MODIFY_ENTITY__USER_DECISION;

	/**
	 * The number of structural features of the '<em>Modify Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_STRUCTURE_FEATURE_COUNT = MODIFY_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Modify Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_STRUCTURE_OPERATION_COUNT = MODIFY_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link quality.as_mm.impl.ModifyInterfaceImpl <em>Modify Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see quality.as_mm.impl.ModifyInterfaceImpl
	 * @see quality.as_mm.impl.As_mmPackageImpl#getModifyInterface()
	 * @generated
	 */
	int MODIFY_INTERFACE = 8;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_INTERFACE__AFFECTED_ELEMENT = MODIFY_ENTITY__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_INTERFACE__CAUSING_ELEMENTS = MODIFY_ENTITY__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_INTERFACE__ID = MODIFY_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_INTERFACE__TOOLDERIVED = MODIFY_ENTITY__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_INTERFACE__USER_DECISION = MODIFY_ENTITY__USER_DECISION;

	/**
	 * The number of structural features of the '<em>Modify Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_INTERFACE_FEATURE_COUNT = MODIFY_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Modify Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_INTERFACE_OPERATION_COUNT = MODIFY_ENTITY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link quality.as_mm.AbstractKAMP4aPSModificationRepository <em>Abstract KAMP 4a PS Modification Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract KAMP 4a PS Modification Repository</em>'.
	 * @see quality.as_mm.AbstractKAMP4aPSModificationRepository
	 * @generated
	 */
	EClass getAbstractKAMP4aPSModificationRepository();

	/**
	 * Returns the meta object for class '{@link quality.as_mm.KAMP4aPSModificationRepository <em>KAMP 4a PS Modification Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KAMP 4a PS Modification Repository</em>'.
	 * @see quality.as_mm.KAMP4aPSModificationRepository
	 * @generated
	 */
	EClass getKAMP4aPSModificationRepository();

	/**
	 * Returns the meta object for class '{@link quality.as_mm.KAMP4aPSSeedModifications <em>KAMP 4a PS Seed Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KAMP 4a PS Seed Modifications</em>'.
	 * @see quality.as_mm.KAMP4aPSSeedModifications
	 * @generated
	 */
	EClass getKAMP4aPSSeedModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link quality.as_mm.KAMP4aPSSeedModifications#getStructureModifications <em>Structure Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Structure Modifications</em>'.
	 * @see quality.as_mm.KAMP4aPSSeedModifications#getStructureModifications()
	 * @see #getKAMP4aPSSeedModifications()
	 * @generated
	 */
	EReference getKAMP4aPSSeedModifications_StructureModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link quality.as_mm.KAMP4aPSSeedModifications#getModuleModifications <em>Module Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module Modifications</em>'.
	 * @see quality.as_mm.KAMP4aPSSeedModifications#getModuleModifications()
	 * @see #getKAMP4aPSSeedModifications()
	 * @generated
	 */
	EReference getKAMP4aPSSeedModifications_ModuleModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link quality.as_mm.KAMP4aPSSeedModifications#getComponentModifications <em>Component Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Modifications</em>'.
	 * @see quality.as_mm.KAMP4aPSSeedModifications#getComponentModifications()
	 * @see #getKAMP4aPSSeedModifications()
	 * @generated
	 */
	EReference getKAMP4aPSSeedModifications_ComponentModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link quality.as_mm.KAMP4aPSSeedModifications#getInterfaceModifications <em>Interface Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface Modifications</em>'.
	 * @see quality.as_mm.KAMP4aPSSeedModifications#getInterfaceModifications()
	 * @see #getKAMP4aPSSeedModifications()
	 * @generated
	 */
	EReference getKAMP4aPSSeedModifications_InterfaceModifications();

	/**
	 * Returns the meta object for class '{@link quality.as_mm.ChangePropagationDueToHardwareChange <em>Change Propagation Due To Hardware Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Propagation Due To Hardware Change</em>'.
	 * @see quality.as_mm.ChangePropagationDueToHardwareChange
	 * @generated
	 */
	EClass getChangePropagationDueToHardwareChange();

	/**
	 * Returns the meta object for the containment reference list '{@link quality.as_mm.ChangePropagationDueToHardwareChange#getInterfaceModifications <em>Interface Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface Modifications</em>'.
	 * @see quality.as_mm.ChangePropagationDueToHardwareChange#getInterfaceModifications()
	 * @see #getChangePropagationDueToHardwareChange()
	 * @generated
	 */
	EReference getChangePropagationDueToHardwareChange_InterfaceModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link quality.as_mm.ChangePropagationDueToHardwareChange#getComponentModifications <em>Component Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Modifications</em>'.
	 * @see quality.as_mm.ChangePropagationDueToHardwareChange#getComponentModifications()
	 * @see #getChangePropagationDueToHardwareChange()
	 * @generated
	 */
	EReference getChangePropagationDueToHardwareChange_ComponentModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link quality.as_mm.ChangePropagationDueToHardwareChange#getStructureModifications <em>Structure Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Structure Modifications</em>'.
	 * @see quality.as_mm.ChangePropagationDueToHardwareChange#getStructureModifications()
	 * @see #getChangePropagationDueToHardwareChange()
	 * @generated
	 */
	EReference getChangePropagationDueToHardwareChange_StructureModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link quality.as_mm.ChangePropagationDueToHardwareChange#getModuleModifications <em>Module Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module Modifications</em>'.
	 * @see quality.as_mm.ChangePropagationDueToHardwareChange#getModuleModifications()
	 * @see #getChangePropagationDueToHardwareChange()
	 * @generated
	 */
	EReference getChangePropagationDueToHardwareChange_ModuleModifications();

	/**
	 * Returns the meta object for the attribute '{@link quality.as_mm.ChangePropagationDueToHardwareChange#isChanged <em>Changed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Changed</em>'.
	 * @see quality.as_mm.ChangePropagationDueToHardwareChange#isChanged()
	 * @see #getChangePropagationDueToHardwareChange()
	 * @generated
	 */
	EAttribute getChangePropagationDueToHardwareChange_Changed();

	/**
	 * Returns the meta object for class '{@link quality.as_mm.ModifyEntity <em>Modify Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modify Entity</em>'.
	 * @see quality.as_mm.ModifyEntity
	 * @generated
	 */
	EClass getModifyEntity();

	/**
	 * Returns the meta object for class '{@link quality.as_mm.ModifyComponent <em>Modify Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modify Component</em>'.
	 * @see quality.as_mm.ModifyComponent
	 * @generated
	 */
	EClass getModifyComponent();

	/**
	 * Returns the meta object for class '{@link quality.as_mm.ModifyModule <em>Modify Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modify Module</em>'.
	 * @see quality.as_mm.ModifyModule
	 * @generated
	 */
	EClass getModifyModule();

	/**
	 * Returns the meta object for class '{@link quality.as_mm.ModifyStructure <em>Modify Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modify Structure</em>'.
	 * @see quality.as_mm.ModifyStructure
	 * @generated
	 */
	EClass getModifyStructure();

	/**
	 * Returns the meta object for class '{@link quality.as_mm.ModifyInterface <em>Modify Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modify Interface</em>'.
	 * @see quality.as_mm.ModifyInterface
	 * @generated
	 */
	EClass getModifyInterface();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	As_mmFactory getAs_mmFactory();

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
		 * The meta object literal for the '{@link quality.as_mm.impl.AbstractKAMP4aPSModificationRepositoryImpl <em>Abstract KAMP 4a PS Modification Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see quality.as_mm.impl.AbstractKAMP4aPSModificationRepositoryImpl
		 * @see quality.as_mm.impl.As_mmPackageImpl#getAbstractKAMP4aPSModificationRepository()
		 * @generated
		 */
		EClass ABSTRACT_KAMP_4A_PS_MODIFICATION_REPOSITORY = eINSTANCE.getAbstractKAMP4aPSModificationRepository();

		/**
		 * The meta object literal for the '{@link quality.as_mm.impl.KAMP4aPSModificationRepositoryImpl <em>KAMP 4a PS Modification Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see quality.as_mm.impl.KAMP4aPSModificationRepositoryImpl
		 * @see quality.as_mm.impl.As_mmPackageImpl#getKAMP4aPSModificationRepository()
		 * @generated
		 */
		EClass KAMP_4A_PS_MODIFICATION_REPOSITORY = eINSTANCE.getKAMP4aPSModificationRepository();

		/**
		 * The meta object literal for the '{@link quality.as_mm.impl.KAMP4aPSSeedModificationsImpl <em>KAMP 4a PS Seed Modifications</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see quality.as_mm.impl.KAMP4aPSSeedModificationsImpl
		 * @see quality.as_mm.impl.As_mmPackageImpl#getKAMP4aPSSeedModifications()
		 * @generated
		 */
		EClass KAMP_4A_PS_SEED_MODIFICATIONS = eINSTANCE.getKAMP4aPSSeedModifications();

		/**
		 * The meta object literal for the '<em><b>Structure Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KAMP_4A_PS_SEED_MODIFICATIONS__STRUCTURE_MODIFICATIONS = eINSTANCE.getKAMP4aPSSeedModifications_StructureModifications();

		/**
		 * The meta object literal for the '<em><b>Module Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KAMP_4A_PS_SEED_MODIFICATIONS__MODULE_MODIFICATIONS = eINSTANCE.getKAMP4aPSSeedModifications_ModuleModifications();

		/**
		 * The meta object literal for the '<em><b>Component Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KAMP_4A_PS_SEED_MODIFICATIONS__COMPONENT_MODIFICATIONS = eINSTANCE.getKAMP4aPSSeedModifications_ComponentModifications();

		/**
		 * The meta object literal for the '<em><b>Interface Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KAMP_4A_PS_SEED_MODIFICATIONS__INTERFACE_MODIFICATIONS = eINSTANCE.getKAMP4aPSSeedModifications_InterfaceModifications();

		/**
		 * The meta object literal for the '{@link quality.as_mm.impl.ChangePropagationDueToHardwareChangeImpl <em>Change Propagation Due To Hardware Change</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see quality.as_mm.impl.ChangePropagationDueToHardwareChangeImpl
		 * @see quality.as_mm.impl.As_mmPackageImpl#getChangePropagationDueToHardwareChange()
		 * @generated
		 */
		EClass CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE = eINSTANCE.getChangePropagationDueToHardwareChange();

		/**
		 * The meta object literal for the '<em><b>Interface Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__INTERFACE_MODIFICATIONS = eINSTANCE.getChangePropagationDueToHardwareChange_InterfaceModifications();

		/**
		 * The meta object literal for the '<em><b>Component Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__COMPONENT_MODIFICATIONS = eINSTANCE.getChangePropagationDueToHardwareChange_ComponentModifications();

		/**
		 * The meta object literal for the '<em><b>Structure Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__STRUCTURE_MODIFICATIONS = eINSTANCE.getChangePropagationDueToHardwareChange_StructureModifications();

		/**
		 * The meta object literal for the '<em><b>Module Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__MODULE_MODIFICATIONS = eINSTANCE.getChangePropagationDueToHardwareChange_ModuleModifications();

		/**
		 * The meta object literal for the '<em><b>Changed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE__CHANGED = eINSTANCE.getChangePropagationDueToHardwareChange_Changed();

		/**
		 * The meta object literal for the '{@link quality.as_mm.impl.ModifyEntityImpl <em>Modify Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see quality.as_mm.impl.ModifyEntityImpl
		 * @see quality.as_mm.impl.As_mmPackageImpl#getModifyEntity()
		 * @generated
		 */
		EClass MODIFY_ENTITY = eINSTANCE.getModifyEntity();

		/**
		 * The meta object literal for the '{@link quality.as_mm.impl.ModifyComponentImpl <em>Modify Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see quality.as_mm.impl.ModifyComponentImpl
		 * @see quality.as_mm.impl.As_mmPackageImpl#getModifyComponent()
		 * @generated
		 */
		EClass MODIFY_COMPONENT = eINSTANCE.getModifyComponent();

		/**
		 * The meta object literal for the '{@link quality.as_mm.impl.ModifyModuleImpl <em>Modify Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see quality.as_mm.impl.ModifyModuleImpl
		 * @see quality.as_mm.impl.As_mmPackageImpl#getModifyModule()
		 * @generated
		 */
		EClass MODIFY_MODULE = eINSTANCE.getModifyModule();

		/**
		 * The meta object literal for the '{@link quality.as_mm.impl.ModifyStructureImpl <em>Modify Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see quality.as_mm.impl.ModifyStructureImpl
		 * @see quality.as_mm.impl.As_mmPackageImpl#getModifyStructure()
		 * @generated
		 */
		EClass MODIFY_STRUCTURE = eINSTANCE.getModifyStructure();

		/**
		 * The meta object literal for the '{@link quality.as_mm.impl.ModifyInterfaceImpl <em>Modify Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see quality.as_mm.impl.ModifyInterfaceImpl
		 * @see quality.as_mm.impl.As_mmPackageImpl#getModifyInterface()
		 * @generated
		 */
		EClass MODIFY_INTERFACE = eINSTANCE.getModifyInterface();

	}

} //As_mmPackage
