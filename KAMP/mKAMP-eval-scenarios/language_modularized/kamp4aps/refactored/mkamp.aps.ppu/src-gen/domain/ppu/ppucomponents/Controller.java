/**
 */
package domain.ppu.ppucomponents;

import domain.aps.components.PowerSupply;

import domain.aps.structures.ControlCabinet;

import domain.as.ComponentRepository.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.ppu.ppucomponents.Controller#getPowersupply <em>Powersupply</em>}</li>
 *   <li>{@link domain.ppu.ppucomponents.Controller#getControllerOf <em>Controller Of</em>}</li>
 * </ul>
 *
 * @see domain.ppu.ppucomponents.PpucomponentsPackage#getController()
 * @model
 * @generated
 */
public interface Controller extends Component {
	/**
	 * Returns the value of the '<em><b>Powersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Powersupply</em>' reference.
	 * @see #setPowersupply(PowerSupply)
	 * @see domain.ppu.ppucomponents.PpucomponentsPackage#getController_Powersupply()
	 * @model required="true"
	 * @generated
	 */
	PowerSupply getPowersupply();

	/**
	 * Sets the value of the '{@link domain.ppu.ppucomponents.Controller#getPowersupply <em>Powersupply</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Powersupply</em>' reference.
	 * @see #getPowersupply()
	 * @generated
	 */
	void setPowersupply(PowerSupply value);

	/**
	 * Returns the value of the '<em><b>Controller Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller Of</em>' reference.
	 * @see #setControllerOf(ControlCabinet)
	 * @see domain.ppu.ppucomponents.PpucomponentsPackage#getController_ControllerOf()
	 * @model required="true"
	 * @generated
	 */
	ControlCabinet getControllerOf();

	/**
	 * Sets the value of the '{@link domain.ppu.ppucomponents.Controller#getControllerOf <em>Controller Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controller Of</em>' reference.
	 * @see #getControllerOf()
	 * @generated
	 */
	void setControllerOf(ControlCabinet value);

} // Controller
