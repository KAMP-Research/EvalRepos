/**
 */
package domain.aps.components;

import domain.aps.interfaces.Screwing;

import domain.as.ComponentRepository.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rack</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.aps.components.Rack#getScrewing_to_base <em>Screwing to base</em>}</li>
 * </ul>
 *
 * @see domain.aps.components.ComponentsPackage#getRack()
 * @model
 * @generated
 */
public interface Rack extends Component {
	/**
	 * Returns the value of the '<em><b>Screwing to base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screwing to base</em>' reference.
	 * @see #setScrewing_to_base(Screwing)
	 * @see domain.aps.components.ComponentsPackage#getRack_Screwing_to_base()
	 * @model required="true"
	 * @generated
	 */
	Screwing getScrewing_to_base();

	/**
	 * Sets the value of the '{@link domain.aps.components.Rack#getScrewing_to_base <em>Screwing to base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Screwing to base</em>' reference.
	 * @see #getScrewing_to_base()
	 * @generated
	 */
	void setScrewing_to_base(Screwing value);

} // Rack
