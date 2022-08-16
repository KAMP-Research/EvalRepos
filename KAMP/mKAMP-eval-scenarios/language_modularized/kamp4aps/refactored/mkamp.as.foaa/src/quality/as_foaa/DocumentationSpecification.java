/**
 */
package quality.as_foaa;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Documentation Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link quality.as_foaa.DocumentationSpecification#getParent <em>Parent</em>}</li>
 *   <li>{@link quality.as_foaa.DocumentationSpecification#getComponentDocumentation <em>Component Documentation</em>}</li>
 *   <li>{@link quality.as_foaa.DocumentationSpecification#getModuleDocumentation <em>Module Documentation</em>}</li>
 *   <li>{@link quality.as_foaa.DocumentationSpecification#getInterfaceDocumentation <em>Interface Documentation</em>}</li>
 *   <li>{@link quality.as_foaa.DocumentationSpecification#getStructureDocumentation <em>Structure Documentation</em>}</li>
 *   <li>{@link quality.as_foaa.DocumentationSpecification#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see quality.as_foaa.As_foaaPackage#getDocumentationSpecification()
 * @model
 * @generated
 */
public interface DocumentationSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link quality.as_foaa.FieldOfActivityAnnotationRepository#getDocumentationSpecification <em>Documentation Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(FieldOfActivityAnnotationRepository)
	 * @see quality.as_foaa.As_foaaPackage#getDocumentationSpecification_Parent()
	 * @see quality.as_foaa.FieldOfActivityAnnotationRepository#getDocumentationSpecification
	 * @model opposite="documentationSpecification" required="true" transient="false"
	 * @generated
	 */
	FieldOfActivityAnnotationRepository getParent();

	/**
	 * Sets the value of the '{@link quality.as_foaa.DocumentationSpecification#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(FieldOfActivityAnnotationRepository value);

	/**
	 * Returns the value of the '<em><b>Component Documentation</b></em>' containment reference list.
	 * The list contents are of type {@link quality.as_foaa.ComponentDocumentationFiles}.
	 * It is bidirectional and its opposite is '{@link quality.as_foaa.ComponentDocumentationFiles#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Documentation</em>' containment reference list.
	 * @see quality.as_foaa.As_foaaPackage#getDocumentationSpecification_ComponentDocumentation()
	 * @see quality.as_foaa.ComponentDocumentationFiles#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ComponentDocumentationFiles> getComponentDocumentation();

	/**
	 * Returns the value of the '<em><b>Module Documentation</b></em>' containment reference list.
	 * The list contents are of type {@link quality.as_foaa.ModuleDocumentationFiles}.
	 * It is bidirectional and its opposite is '{@link quality.as_foaa.ModuleDocumentationFiles#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Documentation</em>' containment reference list.
	 * @see quality.as_foaa.As_foaaPackage#getDocumentationSpecification_ModuleDocumentation()
	 * @see quality.as_foaa.ModuleDocumentationFiles#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ModuleDocumentationFiles> getModuleDocumentation();

	/**
	 * Returns the value of the '<em><b>Interface Documentation</b></em>' containment reference list.
	 * The list contents are of type {@link quality.as_foaa.InterfaceDocumentationFiles}.
	 * It is bidirectional and its opposite is '{@link quality.as_foaa.InterfaceDocumentationFiles#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Documentation</em>' containment reference list.
	 * @see quality.as_foaa.As_foaaPackage#getDocumentationSpecification_InterfaceDocumentation()
	 * @see quality.as_foaa.InterfaceDocumentationFiles#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<InterfaceDocumentationFiles> getInterfaceDocumentation();

	/**
	 * Returns the value of the '<em><b>Structure Documentation</b></em>' containment reference list.
	 * The list contents are of type {@link quality.as_foaa.StructureDocumentationFiles}.
	 * It is bidirectional and its opposite is '{@link quality.as_foaa.StructureDocumentationFiles#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure Documentation</em>' containment reference list.
	 * @see quality.as_foaa.As_foaaPackage#getDocumentationSpecification_StructureDocumentation()
	 * @see quality.as_foaa.StructureDocumentationFiles#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<StructureDocumentationFiles> getStructureDocumentation();

	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(Role)
	 * @see quality.as_foaa.As_foaaPackage#getDocumentationSpecification_Role()
	 * @model
	 * @generated
	 */
	Role getRole();

	/**
	 * Sets the value of the '{@link quality.as_foaa.DocumentationSpecification#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Role value);

} // DocumentationSpecification
