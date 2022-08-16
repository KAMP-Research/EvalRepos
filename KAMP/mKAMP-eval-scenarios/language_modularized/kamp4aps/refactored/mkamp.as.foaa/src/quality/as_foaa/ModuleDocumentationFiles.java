/**
 */
package quality.as_foaa;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Documentation Files</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link quality.as_foaa.ModuleDocumentationFiles#getParent <em>Parent</em>}</li>
 *   <li>{@link quality.as_foaa.ModuleDocumentationFiles#getDocumentedModule <em>Documented Module</em>}</li>
 * </ul>
 *
 * @see quality.as_foaa.As_foaaPackage#getModuleDocumentationFiles()
 * @model
 * @generated
 */
public interface ModuleDocumentationFiles extends DocumentationFiles {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link quality.as_foaa.DocumentationSpecification#getModuleDocumentation <em>Module Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(DocumentationSpecification)
	 * @see quality.as_foaa.As_foaaPackage#getModuleDocumentationFiles_Parent()
	 * @see quality.as_foaa.DocumentationSpecification#getModuleDocumentation
	 * @model opposite="moduleDocumentation" required="true" transient="false"
	 * @generated
	 */
	DocumentationSpecification getParent();

	/**
	 * Sets the value of the '{@link quality.as_foaa.ModuleDocumentationFiles#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(DocumentationSpecification value);

	/**
	 * Returns the value of the '<em><b>Documented Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documented Module</em>' reference.
	 * @see #setDocumentedModule(domain.as.ModuleRepository.Module)
	 * @see quality.as_foaa.As_foaaPackage#getModuleDocumentationFiles_DocumentedModule()
	 * @model required="true"
	 * @generated
	 */
	domain.as.ModuleRepository.Module getDocumentedModule();

	/**
	 * Sets the value of the '{@link quality.as_foaa.ModuleDocumentationFiles#getDocumentedModule <em>Documented Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documented Module</em>' reference.
	 * @see #getDocumentedModule()
	 * @generated
	 */
	void setDocumentedModule(domain.as.ModuleRepository.Module value);

} // ModuleDocumentationFiles
