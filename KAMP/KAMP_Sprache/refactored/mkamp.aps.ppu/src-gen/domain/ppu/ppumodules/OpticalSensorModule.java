/**
 */
package domain.ppu.ppumodules;

import domain.aps.buscomponents.BusSlave;

import domain.ppu.ppucomponents.OpticalSensor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Optical Sensor Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.ppu.ppumodules.OpticalSensorModule#getOpticalSensor <em>Optical Sensor</em>}</li>
 *   <li>{@link domain.ppu.ppumodules.OpticalSensorModule#getBusSlave <em>Bus Slave</em>}</li>
 * </ul>
 *
 * @see domain.ppu.ppumodules.PpumodulesPackage#getOpticalSensorModule()
 * @model
 * @generated
 */
public interface OpticalSensorModule extends domain.as.ModuleRepository.Module {
	/**
	 * Returns the value of the '<em><b>Optical Sensor</b></em>' containment reference list.
	 * The list contents are of type {@link domain.ppu.ppucomponents.OpticalSensor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optical Sensor</em>' containment reference list.
	 * @see domain.ppu.ppumodules.PpumodulesPackage#getOpticalSensorModule_OpticalSensor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<OpticalSensor> getOpticalSensor();

	/**
	 * Returns the value of the '<em><b>Bus Slave</b></em>' containment reference list.
	 * The list contents are of type {@link domain.aps.buscomponents.BusSlave}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus Slave</em>' containment reference list.
	 * @see domain.ppu.ppumodules.PpumodulesPackage#getOpticalSensorModule_BusSlave()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<BusSlave> getBusSlave();

} // OpticalSensorModule
