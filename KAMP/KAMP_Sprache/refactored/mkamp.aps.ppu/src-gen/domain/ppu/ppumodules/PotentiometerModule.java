/**
 */
package domain.ppu.ppumodules;

import domain.aps.electroniccomponents.Potentiometer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Potentiometer Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.ppu.ppumodules.PotentiometerModule#getPoti <em>Poti</em>}</li>
 * </ul>
 *
 * @see domain.ppu.ppumodules.PpumodulesPackage#getPotentiometerModule()
 * @model
 * @generated
 */
public interface PotentiometerModule extends domain.as.ModuleRepository.Module {
	/**
	 * Returns the value of the '<em><b>Poti</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Poti</em>' containment reference.
	 * @see #setPoti(Potentiometer)
	 * @see domain.ppu.ppumodules.PpumodulesPackage#getPotentiometerModule_Poti()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Potentiometer getPoti();

	/**
	 * Sets the value of the '{@link domain.ppu.ppumodules.PotentiometerModule#getPoti <em>Poti</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Poti</em>' containment reference.
	 * @see #getPoti()
	 * @generated
	 */
	void setPoti(Potentiometer value);

} // PotentiometerModule
