/**
 */
package quality.as_foaa;

import domain.as.ComponentRepository.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Drawing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link quality.as_foaa.ComponentDrawing#getDrawn_component <em>Drawn component</em>}</li>
 * </ul>
 *
 * @see quality.as_foaa.As_foaaPackage#getComponentDrawing()
 * @model
 * @generated
 */
public interface ComponentDrawing extends Drawing {
	/**
	 * Returns the value of the '<em><b>Drawn component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drawn component</em>' reference.
	 * @see #setDrawn_component(Component)
	 * @see quality.as_foaa.As_foaaPackage#getComponentDrawing_Drawn_component()
	 * @model
	 * @generated
	 */
	Component getDrawn_component();

	/**
	 * Sets the value of the '{@link quality.as_foaa.ComponentDrawing#getDrawn_component <em>Drawn component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drawn component</em>' reference.
	 * @see #getDrawn_component()
	 * @generated
	 */
	void setDrawn_component(Component value);

} // ComponentDrawing
