/**
 */
package domain.ppu.ppucomponents;

import domain.aps.components.PowerSupply;

import domain.aps.interfaces.PneumaticSupply;
import domain.aps.interfaces.Screwing;
import domain.aps.interfaces.SignalInterface;

import domain.as.ComponentRepository.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bottle Seperator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.ppu.ppucomponents.BottleSeperator#getSignalinterface <em>Signalinterface</em>}</li>
 *   <li>{@link domain.ppu.ppucomponents.BottleSeperator#getPneumaticsupply <em>Pneumaticsupply</em>}</li>
 *   <li>{@link domain.ppu.ppucomponents.BottleSeperator#getPowersupply <em>Powersupply</em>}</li>
 *   <li>{@link domain.ppu.ppucomponents.BottleSeperator#getScrewing_to_rack <em>Screwing to rack</em>}</li>
 * </ul>
 *
 * @see domain.ppu.ppucomponents.PpucomponentsPackage#getBottleSeperator()
 * @model
 * @generated
 */
public interface BottleSeperator extends Component {
	/**
	 * Returns the value of the '<em><b>Signalinterface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signalinterface</em>' reference.
	 * @see #setSignalinterface(SignalInterface)
	 * @see domain.ppu.ppucomponents.PpucomponentsPackage#getBottleSeperator_Signalinterface()
	 * @model required="true"
	 * @generated
	 */
	SignalInterface getSignalinterface();

	/**
	 * Sets the value of the '{@link domain.ppu.ppucomponents.BottleSeperator#getSignalinterface <em>Signalinterface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signalinterface</em>' reference.
	 * @see #getSignalinterface()
	 * @generated
	 */
	void setSignalinterface(SignalInterface value);

	/**
	 * Returns the value of the '<em><b>Pneumaticsupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pneumaticsupply</em>' reference.
	 * @see #setPneumaticsupply(PneumaticSupply)
	 * @see domain.ppu.ppucomponents.PpucomponentsPackage#getBottleSeperator_Pneumaticsupply()
	 * @model required="true"
	 * @generated
	 */
	PneumaticSupply getPneumaticsupply();

	/**
	 * Sets the value of the '{@link domain.ppu.ppucomponents.BottleSeperator#getPneumaticsupply <em>Pneumaticsupply</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pneumaticsupply</em>' reference.
	 * @see #getPneumaticsupply()
	 * @generated
	 */
	void setPneumaticsupply(PneumaticSupply value);

	/**
	 * Returns the value of the '<em><b>Powersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Powersupply</em>' reference.
	 * @see #setPowersupply(PowerSupply)
	 * @see domain.ppu.ppucomponents.PpucomponentsPackage#getBottleSeperator_Powersupply()
	 * @model required="true"
	 * @generated
	 */
	PowerSupply getPowersupply();

	/**
	 * Sets the value of the '{@link domain.ppu.ppucomponents.BottleSeperator#getPowersupply <em>Powersupply</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Powersupply</em>' reference.
	 * @see #getPowersupply()
	 * @generated
	 */
	void setPowersupply(PowerSupply value);

	/**
	 * Returns the value of the '<em><b>Screwing to rack</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screwing to rack</em>' reference.
	 * @see #setScrewing_to_rack(Screwing)
	 * @see domain.ppu.ppucomponents.PpucomponentsPackage#getBottleSeperator_Screwing_to_rack()
	 * @model required="true"
	 * @generated
	 */
	Screwing getScrewing_to_rack();

	/**
	 * Sets the value of the '{@link domain.ppu.ppucomponents.BottleSeperator#getScrewing_to_rack <em>Screwing to rack</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Screwing to rack</em>' reference.
	 * @see #getScrewing_to_rack()
	 * @generated
	 */
	void setScrewing_to_rack(Screwing value);

} // BottleSeperator
