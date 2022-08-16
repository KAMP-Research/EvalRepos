/**
 */
package quality.as_foaa;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Drawing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link quality.as_foaa.ModuleDrawing#getDrawn_module <em>Drawn module</em>}</li>
 * </ul>
 *
 * @see quality.as_foaa.As_foaaPackage#getModuleDrawing()
 * @model
 * @generated
 */
public interface ModuleDrawing extends Drawing {
	/**
	 * Returns the value of the '<em><b>Drawn module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drawn module</em>' reference.
	 * @see #setDrawn_module(domain.as.ModuleRepository.Module)
	 * @see quality.as_foaa.As_foaaPackage#getModuleDrawing_Drawn_module()
	 * @model
	 * @generated
	 */
	domain.as.ModuleRepository.Module getDrawn_module();

	/**
	 * Sets the value of the '{@link quality.as_foaa.ModuleDrawing#getDrawn_module <em>Drawn module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drawn module</em>' reference.
	 * @see #getDrawn_module()
	 * @generated
	 */
	void setDrawn_module(domain.as.ModuleRepository.Module value);

} // ModuleDrawing
