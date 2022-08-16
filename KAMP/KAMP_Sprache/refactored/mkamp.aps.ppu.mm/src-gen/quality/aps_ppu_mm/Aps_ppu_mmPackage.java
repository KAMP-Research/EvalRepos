/**
 */
package quality.aps_ppu_mm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import quality.as_mm.As_mmPackage;

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
 * @see quality.aps_ppu_mm.Aps_ppu_mmFactory
 * @model kind="package"
 * @generated
 */
public interface Aps_ppu_mmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "aps_ppu_mm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "aps_ppu_mm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "aps_ppu_mm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Aps_ppu_mmPackage eINSTANCE = quality.aps_ppu_mm.impl.Aps_ppu_mmPackageImpl.init();

	/**
	 * The meta object id for the '{@link quality.aps_ppu_mm.impl.ModifyMicroSwitchModuleImpl <em>Modify Micro Switch Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see quality.aps_ppu_mm.impl.ModifyMicroSwitchModuleImpl
	 * @see quality.aps_ppu_mm.impl.Aps_ppu_mmPackageImpl#getModifyMicroSwitchModule()
	 * @generated
	 */
	int MODIFY_MICRO_SWITCH_MODULE = 0;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_MICRO_SWITCH_MODULE__AFFECTED_ELEMENT = As_mmPackage.MODIFY_MODULE__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_MICRO_SWITCH_MODULE__CAUSING_ELEMENTS = As_mmPackage.MODIFY_MODULE__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_MICRO_SWITCH_MODULE__ID = As_mmPackage.MODIFY_MODULE__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_MICRO_SWITCH_MODULE__TOOLDERIVED = As_mmPackage.MODIFY_MODULE__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_MICRO_SWITCH_MODULE__USER_DECISION = As_mmPackage.MODIFY_MODULE__USER_DECISION;

	/**
	 * The feature id for the '<em><b>Is Replaced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_MICRO_SWITCH_MODULE__IS_REPLACED = As_mmPackage.MODIFY_MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Modify Micro Switch Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_MICRO_SWITCH_MODULE_FEATURE_COUNT = As_mmPackage.MODIFY_MODULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Modify Micro Switch Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_MICRO_SWITCH_MODULE_OPERATION_COUNT = As_mmPackage.MODIFY_MODULE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link quality.aps_ppu_mm.ModifyMicroSwitchModule <em>Modify Micro Switch Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modify Micro Switch Module</em>'.
	 * @see quality.aps_ppu_mm.ModifyMicroSwitchModule
	 * @generated
	 */
	EClass getModifyMicroSwitchModule();

	/**
	 * Returns the meta object for the attribute '{@link quality.aps_ppu_mm.ModifyMicroSwitchModule#isIsReplaced <em>Is Replaced</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Replaced</em>'.
	 * @see quality.aps_ppu_mm.ModifyMicroSwitchModule#isIsReplaced()
	 * @see #getModifyMicroSwitchModule()
	 * @generated
	 */
	EAttribute getModifyMicroSwitchModule_IsReplaced();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Aps_ppu_mmFactory getAps_ppu_mmFactory();

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
		 * The meta object literal for the '{@link quality.aps_ppu_mm.impl.ModifyMicroSwitchModuleImpl <em>Modify Micro Switch Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see quality.aps_ppu_mm.impl.ModifyMicroSwitchModuleImpl
		 * @see quality.aps_ppu_mm.impl.Aps_ppu_mmPackageImpl#getModifyMicroSwitchModule()
		 * @generated
		 */
		EClass MODIFY_MICRO_SWITCH_MODULE = eINSTANCE.getModifyMicroSwitchModule();

		/**
		 * The meta object literal for the '<em><b>Is Replaced</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODIFY_MICRO_SWITCH_MODULE__IS_REPLACED = eINSTANCE.getModifyMicroSwitchModule_IsReplaced();

	}

} //Aps_ppu_mmPackage
