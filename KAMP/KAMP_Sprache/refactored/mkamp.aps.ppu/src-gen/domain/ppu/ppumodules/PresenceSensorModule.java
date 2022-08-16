/**
 */
package domain.ppu.ppumodules;

import domain.aps.buscomponents.BusSlave;

import domain.ppu.ppucomponents.PresenceSensor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Presence Sensor Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.ppu.ppumodules.PresenceSensorModule#getPresenceSensor <em>Presence Sensor</em>}</li>
 *   <li>{@link domain.ppu.ppumodules.PresenceSensorModule#getBusSlave <em>Bus Slave</em>}</li>
 * </ul>
 *
 * @see domain.ppu.ppumodules.PpumodulesPackage#getPresenceSensorModule()
 * @model
 * @generated
 */
public interface PresenceSensorModule extends domain.as.ModuleRepository.Module {
	/**
	 * Returns the value of the '<em><b>Presence Sensor</b></em>' containment reference list.
	 * The list contents are of type {@link domain.ppu.ppucomponents.PresenceSensor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presence Sensor</em>' containment reference list.
	 * @see domain.ppu.ppumodules.PpumodulesPackage#getPresenceSensorModule_PresenceSensor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PresenceSensor> getPresenceSensor();

	/**
	 * Returns the value of the '<em><b>Bus Slave</b></em>' containment reference list.
	 * The list contents are of type {@link domain.aps.buscomponents.BusSlave}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus Slave</em>' containment reference list.
	 * @see domain.ppu.ppumodules.PpumodulesPackage#getPresenceSensorModule_BusSlave()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<BusSlave> getBusSlave();

} // PresenceSensorModule
