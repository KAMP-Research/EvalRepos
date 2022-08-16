/**
 */
package domain.ppu.ppucomponents;

import domain.aps.components.Splitter;

import domain.aps.interfaces.PneumaticSupply;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pneumatic Splitter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.ppu.ppucomponents.PneumaticSplitter#getPneumaticsupply <em>Pneumaticsupply</em>}</li>
 * </ul>
 *
 * @see domain.ppu.ppucomponents.PpucomponentsPackage#getPneumaticSplitter()
 * @model
 * @generated
 */
public interface PneumaticSplitter extends Splitter {
	/**
	 * Returns the value of the '<em><b>Pneumaticsupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pneumaticsupply</em>' reference.
	 * @see #setPneumaticsupply(PneumaticSupply)
	 * @see domain.ppu.ppucomponents.PpucomponentsPackage#getPneumaticSplitter_Pneumaticsupply()
	 * @model
	 * @generated
	 */
	PneumaticSupply getPneumaticsupply();

	/**
	 * Sets the value of the '{@link domain.ppu.ppucomponents.PneumaticSplitter#getPneumaticsupply <em>Pneumaticsupply</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pneumaticsupply</em>' reference.
	 * @see #getPneumaticsupply()
	 * @generated
	 */
	void setPneumaticsupply(PneumaticSupply value);

} // PneumaticSplitter
