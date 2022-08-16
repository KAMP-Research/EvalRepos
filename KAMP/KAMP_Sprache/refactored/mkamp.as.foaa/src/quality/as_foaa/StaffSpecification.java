/**
 */
package quality.as_foaa;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Staff Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link quality.as_foaa.StaffSpecification#getParent <em>Parent</em>}</li>
 *   <li>{@link quality.as_foaa.StaffSpecification#getPersonList <em>Person List</em>}</li>
 *   <li>{@link quality.as_foaa.StaffSpecification#getRoleList <em>Role List</em>}</li>
 * </ul>
 *
 * @see quality.as_foaa.As_foaaPackage#getStaffSpecification()
 * @model
 * @generated
 */
public interface StaffSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link quality.as_foaa.FieldOfActivityAnnotationRepository#getStaffSpecification <em>Staff Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(FieldOfActivityAnnotationRepository)
	 * @see quality.as_foaa.As_foaaPackage#getStaffSpecification_Parent()
	 * @see quality.as_foaa.FieldOfActivityAnnotationRepository#getStaffSpecification
	 * @model opposite="staffSpecification" required="true" transient="false"
	 * @generated
	 */
	FieldOfActivityAnnotationRepository getParent();

	/**
	 * Sets the value of the '{@link quality.as_foaa.StaffSpecification#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(FieldOfActivityAnnotationRepository value);

	/**
	 * Returns the value of the '<em><b>Person List</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link quality.as_foaa.PersonList#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person List</em>' containment reference.
	 * @see #setPersonList(PersonList)
	 * @see quality.as_foaa.As_foaaPackage#getStaffSpecification_PersonList()
	 * @see quality.as_foaa.PersonList#getParent
	 * @model opposite="parent" containment="true" required="true"
	 * @generated
	 */
	PersonList getPersonList();

	/**
	 * Sets the value of the '{@link quality.as_foaa.StaffSpecification#getPersonList <em>Person List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person List</em>' containment reference.
	 * @see #getPersonList()
	 * @generated
	 */
	void setPersonList(PersonList value);

	/**
	 * Returns the value of the '<em><b>Role List</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link quality.as_foaa.RoleList#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role List</em>' containment reference.
	 * @see #setRoleList(RoleList)
	 * @see quality.as_foaa.As_foaaPackage#getStaffSpecification_RoleList()
	 * @see quality.as_foaa.RoleList#getParent
	 * @model opposite="parent" containment="true" required="true"
	 * @generated
	 */
	RoleList getRoleList();

	/**
	 * Sets the value of the '{@link quality.as_foaa.StaffSpecification#getRoleList <em>Role List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role List</em>' containment reference.
	 * @see #getRoleList()
	 * @generated
	 */
	void setRoleList(RoleList value);

} // StaffSpecification
