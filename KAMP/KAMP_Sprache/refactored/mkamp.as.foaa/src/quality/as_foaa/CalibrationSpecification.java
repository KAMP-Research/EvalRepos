/**
 */
package quality.as_foaa;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calibration Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link quality.as_foaa.CalibrationSpecification#getParent <em>Parent</em>}</li>
 *   <li>{@link quality.as_foaa.CalibrationSpecification#getRole <em>Role</em>}</li>
 *   <li>{@link quality.as_foaa.CalibrationSpecification#getCalibrationConfig <em>Calibration Config</em>}</li>
 * </ul>
 *
 * @see quality.as_foaa.As_foaaPackage#getCalibrationSpecification()
 * @model
 * @generated
 */
public interface CalibrationSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link quality.as_foaa.FieldOfActivityAnnotationRepository#getCalibrationSpecification <em>Calibration Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(FieldOfActivityAnnotationRepository)
	 * @see quality.as_foaa.As_foaaPackage#getCalibrationSpecification_Parent()
	 * @see quality.as_foaa.FieldOfActivityAnnotationRepository#getCalibrationSpecification
	 * @model opposite="calibrationSpecification" required="true" transient="false"
	 * @generated
	 */
	FieldOfActivityAnnotationRepository getParent();

	/**
	 * Sets the value of the '{@link quality.as_foaa.CalibrationSpecification#getParent <em>Parent</em>}' container reference.
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
	 * @see quality.as_foaa.As_foaaPackage#getCalibrationSpecification_Role()
	 * @model
	 * @generated
	 */
	Role getRole();

	/**
	 * Sets the value of the '{@link quality.as_foaa.CalibrationSpecification#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Role value);

	/**
	 * Returns the value of the '<em><b>Calibration Config</b></em>' containment reference list.
	 * The list contents are of type {@link quality.as_foaa.CalibrationConfiguration}.
	 * It is bidirectional and its opposite is '{@link quality.as_foaa.CalibrationConfiguration#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calibration Config</em>' containment reference list.
	 * @see quality.as_foaa.As_foaaPackage#getCalibrationSpecification_CalibrationConfig()
	 * @see quality.as_foaa.CalibrationConfiguration#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<CalibrationConfiguration> getCalibrationConfig();

} // CalibrationSpecification
