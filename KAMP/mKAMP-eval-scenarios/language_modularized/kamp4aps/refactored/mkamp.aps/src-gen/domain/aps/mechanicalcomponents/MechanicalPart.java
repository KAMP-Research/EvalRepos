/**
 */
package domain.aps.mechanicalcomponents;

import domain.aps.interfaces.Screwing;

import domain.as.ComponentRepository.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mechanical Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.aps.mechanicalcomponents.MechanicalPart#getScrewing <em>Screwing</em>}</li>
 * </ul>
 *
 * @see domain.aps.mechanicalcomponents.MechanicalcomponentsPackage#getMechanicalPart()
 * @model abstract="true"
 * @generated
 */
public interface MechanicalPart extends Component {
	/**
	 * Returns the value of the '<em><b>Screwing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screwing</em>' reference.
	 * @see #setScrewing(Screwing)
	 * @see domain.aps.mechanicalcomponents.MechanicalcomponentsPackage#getMechanicalPart_Screwing()
	 * @model required="true"
	 * @generated
	 */
	Screwing getScrewing();

	/**
	 * Sets the value of the '{@link domain.aps.mechanicalcomponents.MechanicalPart#getScrewing <em>Screwing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Screwing</em>' reference.
	 * @see #getScrewing()
	 * @generated
	 */
	void setScrewing(Screwing value);

} // MechanicalPart
