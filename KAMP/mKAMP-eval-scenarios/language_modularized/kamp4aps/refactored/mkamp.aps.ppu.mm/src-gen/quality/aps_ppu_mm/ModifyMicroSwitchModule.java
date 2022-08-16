/**
 */
package quality.aps_ppu_mm;

import quality.as_mm.ModifyModule;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modify Micro Switch Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link quality.aps_ppu_mm.ModifyMicroSwitchModule#isIsReplaced <em>Is Replaced</em>}</li>
 * </ul>
 *
 * @see quality.aps_ppu_mm.Aps_ppu_mmPackage#getModifyMicroSwitchModule()
 * @model
 * @generated
 */
public interface ModifyMicroSwitchModule extends ModifyModule<domain.as.ModuleRepository.Module> {
	/**
	 * Returns the value of the '<em><b>Is Replaced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Replaced</em>' attribute.
	 * @see #setIsReplaced(boolean)
	 * @see quality.aps_ppu_mm.Aps_ppu_mmPackage#getModifyMicroSwitchModule_IsReplaced()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsReplaced();

	/**
	 * Sets the value of the '{@link quality.aps_ppu_mm.ModifyMicroSwitchModule#isIsReplaced <em>Is Replaced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Replaced</em>' attribute.
	 * @see #isIsReplaced()
	 * @generated
	 */
	void setIsReplaced(boolean value);

} // ModifyMicroSwitchModule
