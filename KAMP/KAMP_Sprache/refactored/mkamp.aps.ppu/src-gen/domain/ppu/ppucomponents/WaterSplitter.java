/**
 */
package domain.ppu.ppucomponents;

import domain.aps.components.Splitter;

import domain.aps.interfaces.WaterSupply;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Water Splitter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.ppu.ppucomponents.WaterSplitter#getWatersupply <em>Watersupply</em>}</li>
 * </ul>
 *
 * @see domain.ppu.ppucomponents.PpucomponentsPackage#getWaterSplitter()
 * @model
 * @generated
 */
public interface WaterSplitter extends Splitter {
	/**
	 * Returns the value of the '<em><b>Watersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Watersupply</em>' reference.
	 * @see #setWatersupply(WaterSupply)
	 * @see domain.ppu.ppucomponents.PpucomponentsPackage#getWaterSplitter_Watersupply()
	 * @model required="true"
	 * @generated
	 */
	WaterSupply getWatersupply();

	/**
	 * Sets the value of the '{@link domain.ppu.ppucomponents.WaterSplitter#getWatersupply <em>Watersupply</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Watersupply</em>' reference.
	 * @see #getWatersupply()
	 * @generated
	 */
	void setWatersupply(WaterSupply value);

} // WaterSplitter
