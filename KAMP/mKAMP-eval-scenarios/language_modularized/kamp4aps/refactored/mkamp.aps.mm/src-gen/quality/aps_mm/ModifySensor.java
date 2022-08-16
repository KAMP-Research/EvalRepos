/**
 */
package quality.aps_mm;

import domain.aps.components.Sensor;

import domain.aps.interfaces.PhysicalConnection;
import domain.aps.interfaces.SignalInterface;

import org.eclipse.emf.common.util.EList;

import quality.as_mm.ModifyComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modify Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link quality.aps_mm.ModifySensor#getModifySignalInterfaces <em>Modify Signal Interfaces</em>}</li>
 *   <li>{@link quality.aps_mm.ModifySensor#getModifyPhysicalConnections <em>Modify Physical Connections</em>}</li>
 * </ul>
 *
 * @see quality.aps_mm.Aps_mmPackage#getModifySensor()
 * @model
 * @generated
 */
public interface ModifySensor extends ModifyComponent<Sensor> {
	/**
	 * Returns the value of the '<em><b>Modify Signal Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link domain.aps.interfaces.SignalInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modify Signal Interfaces</em>' containment reference list.
	 * @see quality.aps_mm.Aps_mmPackage#getModifySensor_ModifySignalInterfaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<SignalInterface> getModifySignalInterfaces();

	/**
	 * Returns the value of the '<em><b>Modify Physical Connections</b></em>' containment reference list.
	 * The list contents are of type {@link domain.aps.interfaces.PhysicalConnection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modify Physical Connections</em>' containment reference list.
	 * @see quality.aps_mm.Aps_mmPackage#getModifySensor_ModifyPhysicalConnections()
	 * @model containment="true"
	 * @generated
	 */
	EList<PhysicalConnection> getModifyPhysicalConnections();

} // ModifySensor
