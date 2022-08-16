/**
 */
package quality.as_foaa;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operator Instructions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link quality.as_foaa.OperatorInstructions#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see quality.as_foaa.As_foaaPackage#getOperatorInstructions()
 * @model
 * @generated
 */
public interface OperatorInstructions extends Documentation {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link quality.as_foaa.DocumentationFiles#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(DocumentationFiles)
	 * @see quality.as_foaa.As_foaaPackage#getOperatorInstructions_Parent()
	 * @see quality.as_foaa.DocumentationFiles#getInstructions
	 * @model opposite="instructions" required="true" transient="false"
	 * @generated
	 */
	DocumentationFiles getParent();

	/**
	 * Sets the value of the '{@link quality.as_foaa.OperatorInstructions#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(DocumentationFiles value);

} // OperatorInstructions
