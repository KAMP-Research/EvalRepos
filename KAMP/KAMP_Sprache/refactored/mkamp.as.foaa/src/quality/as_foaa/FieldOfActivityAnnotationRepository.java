/**
 */
package quality.as_foaa;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Of Activity Annotation Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link quality.as_foaa.FieldOfActivityAnnotationRepository#getCalibrationSpecification <em>Calibration Specification</em>}</li>
 *   <li>{@link quality.as_foaa.FieldOfActivityAnnotationRepository#getTestSpecification <em>Test Specification</em>}</li>
 *   <li>{@link quality.as_foaa.FieldOfActivityAnnotationRepository#getStockSpecification <em>Stock Specification</em>}</li>
 *   <li>{@link quality.as_foaa.FieldOfActivityAnnotationRepository#getHmiSpecification <em>Hmi Specification</em>}</li>
 *   <li>{@link quality.as_foaa.FieldOfActivityAnnotationRepository#getEcadSpecification <em>Ecad Specification</em>}</li>
 *   <li>{@link quality.as_foaa.FieldOfActivityAnnotationRepository#getDocumentationSpecification <em>Documentation Specification</em>}</li>
 *   <li>{@link quality.as_foaa.FieldOfActivityAnnotationRepository#getStaffSpecification <em>Staff Specification</em>}</li>
 * </ul>
 *
 * @see quality.as_foaa.As_foaaPackage#getFieldOfActivityAnnotationRepository()
 * @model
 * @generated
 */
public interface FieldOfActivityAnnotationRepository extends EObject {
	/**
	 * Returns the value of the '<em><b>Calibration Specification</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link quality.as_foaa.CalibrationSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calibration Specification</em>' containment reference.
	 * @see #setCalibrationSpecification(CalibrationSpecification)
	 * @see quality.as_foaa.As_foaaPackage#getFieldOfActivityAnnotationRepository_CalibrationSpecification()
	 * @see quality.as_foaa.CalibrationSpecification#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	CalibrationSpecification getCalibrationSpecification();

	/**
	 * Sets the value of the '{@link quality.as_foaa.FieldOfActivityAnnotationRepository#getCalibrationSpecification <em>Calibration Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calibration Specification</em>' containment reference.
	 * @see #getCalibrationSpecification()
	 * @generated
	 */
	void setCalibrationSpecification(CalibrationSpecification value);

	/**
	 * Returns the value of the '<em><b>Test Specification</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link quality.as_foaa.TestSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Specification</em>' containment reference.
	 * @see #setTestSpecification(TestSpecification)
	 * @see quality.as_foaa.As_foaaPackage#getFieldOfActivityAnnotationRepository_TestSpecification()
	 * @see quality.as_foaa.TestSpecification#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	TestSpecification getTestSpecification();

	/**
	 * Sets the value of the '{@link quality.as_foaa.FieldOfActivityAnnotationRepository#getTestSpecification <em>Test Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Specification</em>' containment reference.
	 * @see #getTestSpecification()
	 * @generated
	 */
	void setTestSpecification(TestSpecification value);

	/**
	 * Returns the value of the '<em><b>Stock Specification</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link quality.as_foaa.StockSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stock Specification</em>' containment reference.
	 * @see #setStockSpecification(StockSpecification)
	 * @see quality.as_foaa.As_foaaPackage#getFieldOfActivityAnnotationRepository_StockSpecification()
	 * @see quality.as_foaa.StockSpecification#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	StockSpecification getStockSpecification();

	/**
	 * Sets the value of the '{@link quality.as_foaa.FieldOfActivityAnnotationRepository#getStockSpecification <em>Stock Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stock Specification</em>' containment reference.
	 * @see #getStockSpecification()
	 * @generated
	 */
	void setStockSpecification(StockSpecification value);

	/**
	 * Returns the value of the '<em><b>Hmi Specification</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link quality.as_foaa.HMISpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hmi Specification</em>' containment reference.
	 * @see #setHmiSpecification(HMISpecification)
	 * @see quality.as_foaa.As_foaaPackage#getFieldOfActivityAnnotationRepository_HmiSpecification()
	 * @see quality.as_foaa.HMISpecification#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	HMISpecification getHmiSpecification();

	/**
	 * Sets the value of the '{@link quality.as_foaa.FieldOfActivityAnnotationRepository#getHmiSpecification <em>Hmi Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hmi Specification</em>' containment reference.
	 * @see #getHmiSpecification()
	 * @generated
	 */
	void setHmiSpecification(HMISpecification value);

	/**
	 * Returns the value of the '<em><b>Ecad Specification</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link quality.as_foaa.ECADSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecad Specification</em>' containment reference.
	 * @see #setEcadSpecification(ECADSpecification)
	 * @see quality.as_foaa.As_foaaPackage#getFieldOfActivityAnnotationRepository_EcadSpecification()
	 * @see quality.as_foaa.ECADSpecification#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	ECADSpecification getEcadSpecification();

	/**
	 * Sets the value of the '{@link quality.as_foaa.FieldOfActivityAnnotationRepository#getEcadSpecification <em>Ecad Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ecad Specification</em>' containment reference.
	 * @see #getEcadSpecification()
	 * @generated
	 */
	void setEcadSpecification(ECADSpecification value);

	/**
	 * Returns the value of the '<em><b>Documentation Specification</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link quality.as_foaa.DocumentationSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation Specification</em>' containment reference.
	 * @see #setDocumentationSpecification(DocumentationSpecification)
	 * @see quality.as_foaa.As_foaaPackage#getFieldOfActivityAnnotationRepository_DocumentationSpecification()
	 * @see quality.as_foaa.DocumentationSpecification#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	DocumentationSpecification getDocumentationSpecification();

	/**
	 * Sets the value of the '{@link quality.as_foaa.FieldOfActivityAnnotationRepository#getDocumentationSpecification <em>Documentation Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation Specification</em>' containment reference.
	 * @see #getDocumentationSpecification()
	 * @generated
	 */
	void setDocumentationSpecification(DocumentationSpecification value);

	/**
	 * Returns the value of the '<em><b>Staff Specification</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link quality.as_foaa.StaffSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Staff Specification</em>' containment reference.
	 * @see #setStaffSpecification(StaffSpecification)
	 * @see quality.as_foaa.As_foaaPackage#getFieldOfActivityAnnotationRepository_StaffSpecification()
	 * @see quality.as_foaa.StaffSpecification#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	StaffSpecification getStaffSpecification();

	/**
	 * Sets the value of the '{@link quality.as_foaa.FieldOfActivityAnnotationRepository#getStaffSpecification <em>Staff Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Staff Specification</em>' containment reference.
	 * @see #getStaffSpecification()
	 * @generated
	 */
	void setStaffSpecification(StaffSpecification value);

} // FieldOfActivityAnnotationRepository
