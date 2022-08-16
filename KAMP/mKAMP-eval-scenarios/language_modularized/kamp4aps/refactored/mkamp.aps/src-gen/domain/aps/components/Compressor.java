/**
 */
package domain.aps.components;

import domain.aps.electroniccomponents.Switch;

import domain.aps.interfaces.PneumaticSupply;
import domain.aps.interfaces.Screwing;
import domain.aps.interfaces.SignalInterface;

import domain.as.ComponentRepository.Component;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compressor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.aps.components.Compressor#getPowersupply <em>Powersupply</em>}</li>
 *   <li>{@link domain.aps.components.Compressor#getPneumaticsupply <em>Pneumaticsupply</em>}</li>
 *   <li>{@link domain.aps.components.Compressor#getPins <em>Pins</em>}</li>
 *   <li>{@link domain.aps.components.Compressor#getScrewing <em>Screwing</em>}</li>
 *   <li>{@link domain.aps.components.Compressor#getSwitch <em>Switch</em>}</li>
 * </ul>
 *
 * @see domain.aps.components.ComponentsPackage#getCompressor()
 * @model
 * @generated
 */
public interface Compressor extends Component {
	/**
	 * Returns the value of the '<em><b>Powersupply</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Powersupply</em>' containment reference.
	 * @see #setPowersupply(PowerSupply)
	 * @see domain.aps.components.ComponentsPackage#getCompressor_Powersupply()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PowerSupply getPowersupply();

	/**
	 * Sets the value of the '{@link domain.aps.components.Compressor#getPowersupply <em>Powersupply</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Powersupply</em>' containment reference.
	 * @see #getPowersupply()
	 * @generated
	 */
	void setPowersupply(PowerSupply value);

	/**
	 * Returns the value of the '<em><b>Pneumaticsupply</b></em>' containment reference list.
	 * The list contents are of type {@link domain.aps.interfaces.PneumaticSupply}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pneumaticsupply</em>' containment reference list.
	 * @see domain.aps.components.ComponentsPackage#getCompressor_Pneumaticsupply()
	 * @model containment="true"
	 * @generated
	 */
	EList<PneumaticSupply> getPneumaticsupply();

	/**
	 * Returns the value of the '<em><b>Pins</b></em>' containment reference list.
	 * The list contents are of type {@link domain.aps.interfaces.SignalInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pins</em>' containment reference list.
	 * @see domain.aps.components.ComponentsPackage#getCompressor_Pins()
	 * @model containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<SignalInterface> getPins();

	/**
	 * Returns the value of the '<em><b>Screwing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screwing</em>' containment reference.
	 * @see #setScrewing(Screwing)
	 * @see domain.aps.components.ComponentsPackage#getCompressor_Screwing()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Screwing getScrewing();

	/**
	 * Sets the value of the '{@link domain.aps.components.Compressor#getScrewing <em>Screwing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Screwing</em>' containment reference.
	 * @see #getScrewing()
	 * @generated
	 */
	void setScrewing(Screwing value);

	/**
	 * Returns the value of the '<em><b>Switch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switch</em>' containment reference.
	 * @see #setSwitch(Switch)
	 * @see domain.aps.components.ComponentsPackage#getCompressor_Switch()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Switch getSwitch();

	/**
	 * Sets the value of the '{@link domain.aps.components.Compressor#getSwitch <em>Switch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Switch</em>' containment reference.
	 * @see #getSwitch()
	 * @generated
	 */
	void setSwitch(Switch value);

} // Compressor
