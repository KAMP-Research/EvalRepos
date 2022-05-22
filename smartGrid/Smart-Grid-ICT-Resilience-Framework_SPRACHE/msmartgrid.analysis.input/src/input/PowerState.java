/**
 */
package input;

import graph.PowerGridNode;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Power State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link input.PowerState#getOwner <em>Owner</em>}</li>
 *   <li>{@link input.PowerState#isPowerOutage <em>Power Outage</em>}</li>
 * </ul>
 *
 * @see input.InputPackage#getPowerState()
 * @model
 * @generated
 */
public interface PowerState extends EObject {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(PowerGridNode)
	 * @see input.InputPackage#getPowerState_Owner()
	 * @model required="true"
	 * @generated
	 */
	PowerGridNode getOwner();

	/**
	 * Sets the value of the '{@link input.PowerState#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(PowerGridNode value);

	/**
	 * Returns the value of the '<em><b>Power Outage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Outage</em>' attribute.
	 * @see #setPowerOutage(boolean)
	 * @see input.InputPackage#getPowerState_PowerOutage()
	 * @model required="true"
	 * @generated
	 */
	boolean isPowerOutage();

	/**
	 * Sets the value of the '{@link input.PowerState#isPowerOutage <em>Power Outage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Outage</em>' attribute.
	 * @see #isPowerOutage()
	 * @generated
	 */
	void setPowerOutage(boolean value);

} // PowerState
