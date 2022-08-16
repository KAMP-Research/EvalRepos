/**
 */
package quality.as_foaa;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link quality.as_foaa.TestSpecification#getParent <em>Parent</em>}</li>
 *   <li>{@link quality.as_foaa.TestSpecification#getSystemTests <em>System Tests</em>}</li>
 *   <li>{@link quality.as_foaa.TestSpecification#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see quality.as_foaa.As_foaaPackage#getTestSpecification()
 * @model
 * @generated
 */
public interface TestSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link quality.as_foaa.FieldOfActivityAnnotationRepository#getTestSpecification <em>Test Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(FieldOfActivityAnnotationRepository)
	 * @see quality.as_foaa.As_foaaPackage#getTestSpecification_Parent()
	 * @see quality.as_foaa.FieldOfActivityAnnotationRepository#getTestSpecification
	 * @model opposite="testSpecification" required="true" transient="false"
	 * @generated
	 */
	FieldOfActivityAnnotationRepository getParent();

	/**
	 * Sets the value of the '{@link quality.as_foaa.TestSpecification#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(FieldOfActivityAnnotationRepository value);

	/**
	 * Returns the value of the '<em><b>System Tests</b></em>' containment reference list.
	 * The list contents are of type {@link quality.as_foaa.SystemTest}.
	 * It is bidirectional and its opposite is '{@link quality.as_foaa.SystemTest#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Tests</em>' containment reference list.
	 * @see quality.as_foaa.As_foaaPackage#getTestSpecification_SystemTests()
	 * @see quality.as_foaa.SystemTest#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<SystemTest> getSystemTests();

	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(Role)
	 * @see quality.as_foaa.As_foaaPackage#getTestSpecification_Role()
	 * @model
	 * @generated
	 */
	Role getRole();

	/**
	 * Sets the value of the '{@link quality.as_foaa.TestSpecification#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Role value);

} // TestSpecification
