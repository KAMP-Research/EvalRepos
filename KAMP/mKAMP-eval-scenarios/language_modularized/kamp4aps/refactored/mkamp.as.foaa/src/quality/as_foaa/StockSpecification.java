/**
 */
package quality.as_foaa;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stock Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link quality.as_foaa.StockSpecification#getParent <em>Parent</em>}</li>
 *   <li>{@link quality.as_foaa.StockSpecification#getComponentStockList <em>Component Stock List</em>}</li>
 *   <li>{@link quality.as_foaa.StockSpecification#getInterfaceStockList <em>Interface Stock List</em>}</li>
 *   <li>{@link quality.as_foaa.StockSpecification#getModuleStockList <em>Module Stock List</em>}</li>
 *   <li>{@link quality.as_foaa.StockSpecification#getStructureStockList <em>Structure Stock List</em>}</li>
 *   <li>{@link quality.as_foaa.StockSpecification#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see quality.as_foaa.As_foaaPackage#getStockSpecification()
 * @model
 * @generated
 */
public interface StockSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link quality.as_foaa.FieldOfActivityAnnotationRepository#getStockSpecification <em>Stock Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(FieldOfActivityAnnotationRepository)
	 * @see quality.as_foaa.As_foaaPackage#getStockSpecification_Parent()
	 * @see quality.as_foaa.FieldOfActivityAnnotationRepository#getStockSpecification
	 * @model opposite="stockSpecification" required="true" transient="false"
	 * @generated
	 */
	FieldOfActivityAnnotationRepository getParent();

	/**
	 * Sets the value of the '{@link quality.as_foaa.StockSpecification#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(FieldOfActivityAnnotationRepository value);

	/**
	 * Returns the value of the '<em><b>Component Stock List</b></em>' containment reference list.
	 * The list contents are of type {@link quality.as_foaa.ComponentStockList}.
	 * It is bidirectional and its opposite is '{@link quality.as_foaa.ComponentStockList#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Stock List</em>' containment reference list.
	 * @see quality.as_foaa.As_foaaPackage#getStockSpecification_ComponentStockList()
	 * @see quality.as_foaa.ComponentStockList#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ComponentStockList> getComponentStockList();

	/**
	 * Returns the value of the '<em><b>Interface Stock List</b></em>' containment reference list.
	 * The list contents are of type {@link quality.as_foaa.InterfaceStockList}.
	 * It is bidirectional and its opposite is '{@link quality.as_foaa.InterfaceStockList#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Stock List</em>' containment reference list.
	 * @see quality.as_foaa.As_foaaPackage#getStockSpecification_InterfaceStockList()
	 * @see quality.as_foaa.InterfaceStockList#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<InterfaceStockList> getInterfaceStockList();

	/**
	 * Returns the value of the '<em><b>Module Stock List</b></em>' containment reference list.
	 * The list contents are of type {@link quality.as_foaa.ModuleStockList}.
	 * It is bidirectional and its opposite is '{@link quality.as_foaa.ModuleStockList#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Stock List</em>' containment reference list.
	 * @see quality.as_foaa.As_foaaPackage#getStockSpecification_ModuleStockList()
	 * @see quality.as_foaa.ModuleStockList#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ModuleStockList> getModuleStockList();

	/**
	 * Returns the value of the '<em><b>Structure Stock List</b></em>' containment reference list.
	 * The list contents are of type {@link quality.as_foaa.StructureStockList}.
	 * It is bidirectional and its opposite is '{@link quality.as_foaa.StructureStockList#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure Stock List</em>' containment reference list.
	 * @see quality.as_foaa.As_foaaPackage#getStockSpecification_StructureStockList()
	 * @see quality.as_foaa.StructureStockList#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<StructureStockList> getStructureStockList();

	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(Role)
	 * @see quality.as_foaa.As_foaaPackage#getStockSpecification_Role()
	 * @model
	 * @generated
	 */
	Role getRole();

	/**
	 * Sets the value of the '{@link quality.as_foaa.StockSpecification#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Role value);

} // StockSpecification
