/**
 */
package quality.as_foaa;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Stock List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link quality.as_foaa.ModuleStockList#getParent <em>Parent</em>}</li>
 *   <li>{@link quality.as_foaa.ModuleStockList#getModules <em>Modules</em>}</li>
 * </ul>
 *
 * @see quality.as_foaa.As_foaaPackage#getModuleStockList()
 * @model
 * @generated
 */
public interface ModuleStockList extends StockList {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link quality.as_foaa.StockSpecification#getModuleStockList <em>Module Stock List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(StockSpecification)
	 * @see quality.as_foaa.As_foaaPackage#getModuleStockList_Parent()
	 * @see quality.as_foaa.StockSpecification#getModuleStockList
	 * @model opposite="moduleStockList" required="true" transient="false"
	 * @generated
	 */
	StockSpecification getParent();

	/**
	 * Sets the value of the '{@link quality.as_foaa.ModuleStockList#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(StockSpecification value);

	/**
	 * Returns the value of the '<em><b>Modules</b></em>' reference list.
	 * The list contents are of type {@link domain.as.ModuleRepository.Module}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' reference list.
	 * @see quality.as_foaa.As_foaaPackage#getModuleStockList_Modules()
	 * @model
	 * @generated
	 */
	EList<domain.as.ModuleRepository.Module> getModules();

} // ModuleStockList
