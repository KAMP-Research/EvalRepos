/**
 */
package quality.as_foaa;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drawing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link quality.as_foaa.Drawing#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see quality.as_foaa.As_foaaPackage#getDrawing()
 * @model
 * @generated
 */
public interface Drawing extends File {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link quality.as_foaa.ECADSpecification#getDrawings <em>Drawings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(ECADSpecification)
	 * @see quality.as_foaa.As_foaaPackage#getDrawing_Parent()
	 * @see quality.as_foaa.ECADSpecification#getDrawings
	 * @model opposite="drawings" required="true" transient="false"
	 * @generated
	 */
	ECADSpecification getParent();

	/**
	 * Sets the value of the '{@link quality.as_foaa.Drawing#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(ECADSpecification value);

} // Drawing
