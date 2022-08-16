/**
 */
package quality.as_foaa;

import domain.as.ComponentRepository.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Documentation Files</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link quality.as_foaa.ComponentDocumentationFiles#getParent <em>Parent</em>}</li>
 *   <li>{@link quality.as_foaa.ComponentDocumentationFiles#getDocumentedComponent <em>Documented Component</em>}</li>
 * </ul>
 *
 * @see quality.as_foaa.As_foaaPackage#getComponentDocumentationFiles()
 * @model
 * @generated
 */
public interface ComponentDocumentationFiles extends DocumentationFiles {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link quality.as_foaa.DocumentationSpecification#getComponentDocumentation <em>Component Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(DocumentationSpecification)
	 * @see quality.as_foaa.As_foaaPackage#getComponentDocumentationFiles_Parent()
	 * @see quality.as_foaa.DocumentationSpecification#getComponentDocumentation
	 * @model opposite="componentDocumentation" required="true" transient="false"
	 * @generated
	 */
	DocumentationSpecification getParent();

	/**
	 * Sets the value of the '{@link quality.as_foaa.ComponentDocumentationFiles#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(DocumentationSpecification value);

	/**
	 * Returns the value of the '<em><b>Documented Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documented Component</em>' reference.
	 * @see #setDocumentedComponent(Component)
	 * @see quality.as_foaa.As_foaaPackage#getComponentDocumentationFiles_DocumentedComponent()
	 * @model required="true"
	 * @generated
	 */
	Component getDocumentedComponent();

	/**
	 * Sets the value of the '{@link quality.as_foaa.ComponentDocumentationFiles#getDocumentedComponent <em>Documented Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documented Component</em>' reference.
	 * @see #getDocumentedComponent()
	 * @generated
	 */
	void setDocumentedComponent(Component value);

} // ComponentDocumentationFiles
