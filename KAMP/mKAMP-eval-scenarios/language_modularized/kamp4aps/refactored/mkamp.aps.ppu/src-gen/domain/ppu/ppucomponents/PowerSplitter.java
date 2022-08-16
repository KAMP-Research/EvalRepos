/**
 */
package domain.ppu.ppucomponents;

import domain.aps.components.PowerSupply;
import domain.aps.components.Splitter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Power Splitter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.ppu.ppucomponents.PowerSplitter#getPowersupply <em>Powersupply</em>}</li>
 * </ul>
 *
 * @see domain.ppu.ppucomponents.PpucomponentsPackage#getPowerSplitter()
 * @model
 * @generated
 */
public interface PowerSplitter extends Splitter {
	/**
	 * Returns the value of the '<em><b>Powersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Powersupply</em>' reference.
	 * @see #setPowersupply(PowerSupply)
	 * @see domain.ppu.ppucomponents.PpucomponentsPackage#getPowerSplitter_Powersupply()
	 * @model required="true"
	 * @generated
	 */
	PowerSupply getPowersupply();

	/**
	 * Sets the value of the '{@link domain.ppu.ppucomponents.PowerSplitter#getPowersupply <em>Powersupply</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Powersupply</em>' reference.
	 * @see #getPowersupply()
	 * @generated
	 */
	void setPowersupply(PowerSupply value);

} // PowerSplitter
