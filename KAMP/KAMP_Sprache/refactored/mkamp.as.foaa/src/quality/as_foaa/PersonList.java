/**
 */
package quality.as_foaa;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link quality.as_foaa.PersonList#getParent <em>Parent</em>}</li>
 *   <li>{@link quality.as_foaa.PersonList#getPersons <em>Persons</em>}</li>
 * </ul>
 *
 * @see quality.as_foaa.As_foaaPackage#getPersonList()
 * @model
 * @generated
 */
public interface PersonList extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link quality.as_foaa.StaffSpecification#getPersonList <em>Person List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(StaffSpecification)
	 * @see quality.as_foaa.As_foaaPackage#getPersonList_Parent()
	 * @see quality.as_foaa.StaffSpecification#getPersonList
	 * @model opposite="personList" required="true" transient="false"
	 * @generated
	 */
	StaffSpecification getParent();

	/**
	 * Sets the value of the '{@link quality.as_foaa.PersonList#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(StaffSpecification value);

	/**
	 * Returns the value of the '<em><b>Persons</b></em>' containment reference list.
	 * The list contents are of type {@link quality.as_foaa.Person}.
	 * It is bidirectional and its opposite is '{@link quality.as_foaa.Person#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persons</em>' containment reference list.
	 * @see quality.as_foaa.As_foaaPackage#getPersonList_Persons()
	 * @see quality.as_foaa.Person#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Person> getPersons();

} // PersonList
