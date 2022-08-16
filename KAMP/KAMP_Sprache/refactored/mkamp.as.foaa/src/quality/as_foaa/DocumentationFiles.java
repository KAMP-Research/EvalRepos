/**
 */
package quality.as_foaa;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Documentation Files</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link quality.as_foaa.DocumentationFiles#getMainteneance <em>Mainteneance</em>}</li>
 *   <li>{@link quality.as_foaa.DocumentationFiles#getInstructions <em>Instructions</em>}</li>
 *   <li>{@link quality.as_foaa.DocumentationFiles#getTrainingIntern <em>Training Intern</em>}</li>
 *   <li>{@link quality.as_foaa.DocumentationFiles#getTrainingExternal <em>Training External</em>}</li>
 * </ul>
 *
 * @see quality.as_foaa.As_foaaPackage#getDocumentationFiles()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface DocumentationFiles extends EObject {
	/**
	 * Returns the value of the '<em><b>Mainteneance</b></em>' containment reference list.
	 * The list contents are of type {@link quality.as_foaa.MainteneanceDocumentation}.
	 * It is bidirectional and its opposite is '{@link quality.as_foaa.MainteneanceDocumentation#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mainteneance</em>' containment reference list.
	 * @see quality.as_foaa.As_foaaPackage#getDocumentationFiles_Mainteneance()
	 * @see quality.as_foaa.MainteneanceDocumentation#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<MainteneanceDocumentation> getMainteneance();

	/**
	 * Returns the value of the '<em><b>Instructions</b></em>' containment reference list.
	 * The list contents are of type {@link quality.as_foaa.OperatorInstructions}.
	 * It is bidirectional and its opposite is '{@link quality.as_foaa.OperatorInstructions#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructions</em>' containment reference list.
	 * @see quality.as_foaa.As_foaaPackage#getDocumentationFiles_Instructions()
	 * @see quality.as_foaa.OperatorInstructions#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<OperatorInstructions> getInstructions();

	/**
	 * Returns the value of the '<em><b>Training Intern</b></em>' containment reference list.
	 * The list contents are of type {@link quality.as_foaa.TrainingDocIntern}.
	 * It is bidirectional and its opposite is '{@link quality.as_foaa.TrainingDocIntern#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Training Intern</em>' containment reference list.
	 * @see quality.as_foaa.As_foaaPackage#getDocumentationFiles_TrainingIntern()
	 * @see quality.as_foaa.TrainingDocIntern#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<TrainingDocIntern> getTrainingIntern();

	/**
	 * Returns the value of the '<em><b>Training External</b></em>' containment reference list.
	 * The list contents are of type {@link quality.as_foaa.TrainingDocExternal}.
	 * It is bidirectional and its opposite is '{@link quality.as_foaa.TrainingDocExternal#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Training External</em>' containment reference list.
	 * @see quality.as_foaa.As_foaaPackage#getDocumentationFiles_TrainingExternal()
	 * @see quality.as_foaa.TrainingDocExternal#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<TrainingDocExternal> getTrainingExternal();

} // DocumentationFiles
