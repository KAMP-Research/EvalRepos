/**
 */
package output;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cluster</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link output.Cluster#getControlCenterCount <em>Control Center Count</em>}</li>
 *   <li>{@link output.Cluster#getSmartMeterCount <em>Smart Meter Count</em>}</li>
 *   <li>{@link output.Cluster#getHasEntities <em>Has Entities</em>}</li>
 * </ul>
 *
 * @see output.OutputPackage#getCluster()
 * @model
 * @generated
 */
public interface Cluster extends EObject {
	/**
	 * Returns the value of the '<em><b>Control Center Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Center Count</em>' attribute.
	 * @see #setControlCenterCount(int)
	 * @see output.OutputPackage#getCluster_ControlCenterCount()
	 * @model
	 * @generated
	 */
	int getControlCenterCount();

	/**
	 * Sets the value of the '{@link output.Cluster#getControlCenterCount <em>Control Center Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Center Count</em>' attribute.
	 * @see #getControlCenterCount()
	 * @generated
	 */
	void setControlCenterCount(int value);

	/**
	 * Returns the value of the '<em><b>Smart Meter Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Smart Meter Count</em>' attribute.
	 * @see #setSmartMeterCount(int)
	 * @see output.OutputPackage#getCluster_SmartMeterCount()
	 * @model
	 * @generated
	 */
	int getSmartMeterCount();

	/**
	 * Sets the value of the '{@link output.Cluster#getSmartMeterCount <em>Smart Meter Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Smart Meter Count</em>' attribute.
	 * @see #getSmartMeterCount()
	 * @generated
	 */
	void setSmartMeterCount(int value);

	/**
	 * Returns the value of the '<em><b>Has Entities</b></em>' reference list.
	 * The list contents are of type {@link output.On}.
	 * It is bidirectional and its opposite is '{@link output.On#getBelongsToCluster <em>Belongs To Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Entities</em>' reference list.
	 * @see output.OutputPackage#getCluster_HasEntities()
	 * @see output.On#getBelongsToCluster
	 * @model opposite="BelongsToCluster"
	 * @generated
	 */
	EList<On> getHasEntities();

} // Cluster
