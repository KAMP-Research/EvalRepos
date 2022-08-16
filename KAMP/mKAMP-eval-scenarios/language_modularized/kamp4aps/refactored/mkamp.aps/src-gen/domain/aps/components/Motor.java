/**
 */
package domain.aps.components;

import domain.aps.interfaces.Gearing;
import domain.aps.interfaces.Screwing;

import domain.as.ComponentRepository.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Motor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.aps.components.Motor#getGearing <em>Gearing</em>}</li>
 *   <li>{@link domain.aps.components.Motor#getScrewing <em>Screwing</em>}</li>
 *   <li>{@link domain.aps.components.Motor#getPowersupply <em>Powersupply</em>}</li>
 * </ul>
 *
 * @see domain.aps.components.ComponentsPackage#getMotor()
 * @model abstract="true"
 * @generated
 */
public interface Motor extends Component {
	/**
	 * Returns the value of the '<em><b>Gearing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gearing</em>' reference.
	 * @see #setGearing(Gearing)
	 * @see domain.aps.components.ComponentsPackage#getMotor_Gearing()
	 * @model required="true"
	 * @generated
	 */
	Gearing getGearing();

	/**
	 * Sets the value of the '{@link domain.aps.components.Motor#getGearing <em>Gearing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gearing</em>' reference.
	 * @see #getGearing()
	 * @generated
	 */
	void setGearing(Gearing value);

	/**
	 * Returns the value of the '<em><b>Screwing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screwing</em>' reference.
	 * @see #setScrewing(Screwing)
	 * @see domain.aps.components.ComponentsPackage#getMotor_Screwing()
	 * @model required="true"
	 * @generated
	 */
	Screwing getScrewing();

	/**
	 * Sets the value of the '{@link domain.aps.components.Motor#getScrewing <em>Screwing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Screwing</em>' reference.
	 * @see #getScrewing()
	 * @generated
	 */
	void setScrewing(Screwing value);

	/**
	 * Returns the value of the '<em><b>Powersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Powersupply</em>' reference.
	 * @see #setPowersupply(PowerSupply)
	 * @see domain.aps.components.ComponentsPackage#getMotor_Powersupply()
	 * @model required="true"
	 * @generated
	 */
	PowerSupply getPowersupply();

	/**
	 * Sets the value of the '{@link domain.aps.components.Motor#getPowersupply <em>Powersupply</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Powersupply</em>' reference.
	 * @see #getPowersupply()
	 * @generated
	 */
	void setPowersupply(PowerSupply value);

} // Motor
