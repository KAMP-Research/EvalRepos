/**
 */
package domain.aps.components;

import domain.aps.interfaces.PneumaticSupply;

import domain.as.ComponentRepository.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pipe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.aps.components.Pipe#getPlugs <em>Plugs</em>}</li>
 * </ul>
 *
 * @see domain.aps.components.ComponentsPackage#getPipe()
 * @model abstract="true"
 * @generated
 */
public interface Pipe extends Component {
	/**
	 * Returns the value of the '<em><b>Plugs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugs</em>' reference.
	 * @see #setPlugs(PneumaticSupply)
	 * @see domain.aps.components.ComponentsPackage#getPipe_Plugs()
	 * @model
	 * @generated
	 */
	PneumaticSupply getPlugs();

	/**
	 * Sets the value of the '{@link domain.aps.components.Pipe#getPlugs <em>Plugs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plugs</em>' reference.
	 * @see #getPlugs()
	 * @generated
	 */
	void setPlugs(PneumaticSupply value);

} // Pipe
