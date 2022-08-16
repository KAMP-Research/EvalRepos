/**
 */
package domain.ppu.ppumodules;

import domain.aps.buscomponents.BusSlave;

import domain.aps.components.TurningTable;

import domain.aps.electroniccomponents.MicroSwitch;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Microswitch Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.ppu.ppumodules.MicroswitchModule#getBusSlave <em>Bus Slave</em>}</li>
 *   <li>{@link domain.ppu.ppumodules.MicroswitchModule#getSwitch <em>Switch</em>}</li>
 *   <li>{@link domain.ppu.ppumodules.MicroswitchModule#getTurningtable <em>Turningtable</em>}</li>
 * </ul>
 *
 * @see domain.ppu.ppumodules.PpumodulesPackage#getMicroswitchModule()
 * @model
 * @generated
 */
public interface MicroswitchModule extends domain.as.ModuleRepository.Module {
	/**
	 * Returns the value of the '<em><b>Bus Slave</b></em>' containment reference list.
	 * The list contents are of type {@link domain.aps.buscomponents.BusSlave}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus Slave</em>' containment reference list.
	 * @see domain.ppu.ppumodules.PpumodulesPackage#getMicroswitchModule_BusSlave()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<BusSlave> getBusSlave();

	/**
	 * Returns the value of the '<em><b>Switch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switch</em>' containment reference.
	 * @see #setSwitch(MicroSwitch)
	 * @see domain.ppu.ppumodules.PpumodulesPackage#getMicroswitchModule_Switch()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MicroSwitch getSwitch();

	/**
	 * Sets the value of the '{@link domain.ppu.ppumodules.MicroswitchModule#getSwitch <em>Switch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Switch</em>' containment reference.
	 * @see #getSwitch()
	 * @generated
	 */
	void setSwitch(MicroSwitch value);

	/**
	 * Returns the value of the '<em><b>Turningtable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Turningtable</em>' reference.
	 * @see #setTurningtable(TurningTable)
	 * @see domain.ppu.ppumodules.PpumodulesPackage#getMicroswitchModule_Turningtable()
	 * @model
	 * @generated
	 */
	TurningTable getTurningtable();

	/**
	 * Sets the value of the '{@link domain.ppu.ppumodules.MicroswitchModule#getTurningtable <em>Turningtable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Turningtable</em>' reference.
	 * @see #getTurningtable()
	 * @generated
	 */
	void setTurningtable(TurningTable value);

} // MicroswitchModule
