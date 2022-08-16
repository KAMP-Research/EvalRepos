/**
 */
package quality.as_foaa;

import domain.as.InterfaceRepository.Interface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Documentation Files</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link quality.as_foaa.InterfaceDocumentationFiles#getParent <em>Parent</em>}</li>
 *   <li>{@link quality.as_foaa.InterfaceDocumentationFiles#getDocumentedInterface <em>Documented Interface</em>}</li>
 * </ul>
 *
 * @see quality.as_foaa.As_foaaPackage#getInterfaceDocumentationFiles()
 * @model
 * @generated
 */
public interface InterfaceDocumentationFiles extends DocumentationFiles {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link quality.as_foaa.DocumentationSpecification#getInterfaceDocumentation <em>Interface Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(DocumentationSpecification)
	 * @see quality.as_foaa.As_foaaPackage#getInterfaceDocumentationFiles_Parent()
	 * @see quality.as_foaa.DocumentationSpecification#getInterfaceDocumentation
	 * @model opposite="interfaceDocumentation" required="true" transient="false"
	 * @generated
	 */
	DocumentationSpecification getParent();

	/**
	 * Sets the value of the '{@link quality.as_foaa.InterfaceDocumentationFiles#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(DocumentationSpecification value);

	/**
	 * Returns the value of the '<em><b>Documented Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documented Interface</em>' reference.
	 * @see #setDocumentedInterface(Interface)
	 * @see quality.as_foaa.As_foaaPackage#getInterfaceDocumentationFiles_DocumentedInterface()
	 * @model required="true"
	 * @generated
	 */
	Interface getDocumentedInterface();

	/**
	 * Sets the value of the '{@link quality.as_foaa.InterfaceDocumentationFiles#getDocumentedInterface <em>Documented Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documented Interface</em>' reference.
	 * @see #getDocumentedInterface()
	 * @generated
	 */
	void setDocumentedInterface(Interface value);

} // InterfaceDocumentationFiles
