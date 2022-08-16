/**
 */
package quality.as_foaa;

import domain.as.InterfaceRepository.Interface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Drawing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link quality.as_foaa.InterfaceDrawing#getDrawn_interface <em>Drawn interface</em>}</li>
 * </ul>
 *
 * @see quality.as_foaa.As_foaaPackage#getInterfaceDrawing()
 * @model
 * @generated
 */
public interface InterfaceDrawing extends Drawing {
	/**
	 * Returns the value of the '<em><b>Drawn interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drawn interface</em>' reference.
	 * @see #setDrawn_interface(Interface)
	 * @see quality.as_foaa.As_foaaPackage#getInterfaceDrawing_Drawn_interface()
	 * @model
	 * @generated
	 */
	Interface getDrawn_interface();

	/**
	 * Sets the value of the '{@link quality.as_foaa.InterfaceDrawing#getDrawn_interface <em>Drawn interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drawn interface</em>' reference.
	 * @see #getDrawn_interface()
	 * @generated
	 */
	void setDrawn_interface(Interface value);

} // InterfaceDrawing
