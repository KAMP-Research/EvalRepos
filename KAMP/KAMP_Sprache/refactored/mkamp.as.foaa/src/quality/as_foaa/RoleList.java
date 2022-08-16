/**
 */
package quality.as_foaa;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link quality.as_foaa.RoleList#getParent <em>Parent</em>}</li>
 *   <li>{@link quality.as_foaa.RoleList#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @see quality.as_foaa.As_foaaPackage#getRoleList()
 * @model
 * @generated
 */
public interface RoleList extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link quality.as_foaa.StaffSpecification#getRoleList <em>Role List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(StaffSpecification)
	 * @see quality.as_foaa.As_foaaPackage#getRoleList_Parent()
	 * @see quality.as_foaa.StaffSpecification#getRoleList
	 * @model opposite="roleList" required="true" transient="false"
	 * @generated
	 */
	StaffSpecification getParent();

	/**
	 * Sets the value of the '{@link quality.as_foaa.RoleList#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(StaffSpecification value);

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link quality.as_foaa.Role}.
	 * It is bidirectional and its opposite is '{@link quality.as_foaa.Role#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see quality.as_foaa.As_foaaPackage#getRoleList_Roles()
	 * @see quality.as_foaa.Role#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Role> getRoles();

} // RoleList
