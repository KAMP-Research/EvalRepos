/**
 */
package input;

import graph.NetworkEntity;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link input.EntityState#isIsDestroyed <em>Is Destroyed</em>}</li>
 *   <li>{@link input.EntityState#isIsHacked <em>Is Hacked</em>}</li>
 *   <li>{@link input.EntityState#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see input.InputPackage#getEntityState()
 * @model
 * @generated
 */
public interface EntityState extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Destroyed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Destroyed</em>' attribute.
	 * @see #setIsDestroyed(boolean)
	 * @see input.InputPackage#getEntityState_IsDestroyed()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsDestroyed();

	/**
	 * Sets the value of the '{@link input.EntityState#isIsDestroyed <em>Is Destroyed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Destroyed</em>' attribute.
	 * @see #isIsDestroyed()
	 * @generated
	 */
	void setIsDestroyed(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Hacked</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Hacked</em>' attribute.
	 * @see #setIsHacked(boolean)
	 * @see input.InputPackage#getEntityState_IsHacked()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsHacked();

	/**
	 * Sets the value of the '{@link input.EntityState#isIsHacked <em>Is Hacked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Hacked</em>' attribute.
	 * @see #isIsHacked()
	 * @generated
	 */
	void setIsHacked(boolean value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(NetworkEntity)
	 * @see input.InputPackage#getEntityState_Owner()
	 * @model required="true"
	 * @generated
	 */
	NetworkEntity getOwner();

	/**
	 * Sets the value of the '{@link input.EntityState#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(NetworkEntity value);

} // EntityState
