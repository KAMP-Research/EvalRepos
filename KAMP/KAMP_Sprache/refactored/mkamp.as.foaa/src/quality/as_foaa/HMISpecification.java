/**
 */
package quality.as_foaa;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HMI Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link quality.as_foaa.HMISpecification#getParent <em>Parent</em>}</li>
 *   <li>{@link quality.as_foaa.HMISpecification#getRole <em>Role</em>}</li>
 *   <li>{@link quality.as_foaa.HMISpecification#getHmiConfig <em>Hmi Config</em>}</li>
 * </ul>
 *
 * @see quality.as_foaa.As_foaaPackage#getHMISpecification()
 * @model
 * @generated
 */
public interface HMISpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link quality.as_foaa.FieldOfActivityAnnotationRepository#getHmiSpecification <em>Hmi Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(FieldOfActivityAnnotationRepository)
	 * @see quality.as_foaa.As_foaaPackage#getHMISpecification_Parent()
	 * @see quality.as_foaa.FieldOfActivityAnnotationRepository#getHmiSpecification
	 * @model opposite="hmiSpecification" required="true" transient="false"
	 * @generated
	 */
	FieldOfActivityAnnotationRepository getParent();

	/**
	 * Sets the value of the '{@link quality.as_foaa.HMISpecification#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(FieldOfActivityAnnotationRepository value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(Role)
	 * @see quality.as_foaa.As_foaaPackage#getHMISpecification_Role()
	 * @model
	 * @generated
	 */
	Role getRole();

	/**
	 * Sets the value of the '{@link quality.as_foaa.HMISpecification#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Role value);

	/**
	 * Returns the value of the '<em><b>Hmi Config</b></em>' containment reference list.
	 * The list contents are of type {@link quality.as_foaa.HMIConfiguration}.
	 * It is bidirectional and its opposite is '{@link quality.as_foaa.HMIConfiguration#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hmi Config</em>' containment reference list.
	 * @see quality.as_foaa.As_foaaPackage#getHMISpecification_HmiConfig()
	 * @see quality.as_foaa.HMIConfiguration#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<HMIConfiguration> getHmiConfig();

} // HMISpecification
