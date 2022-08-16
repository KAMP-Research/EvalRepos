/**
 */
package quality.as_foaa;

import domain.as.ComponentRepository.Component;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Stock List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link quality.as_foaa.ComponentStockList#getParent <em>Parent</em>}</li>
 *   <li>{@link quality.as_foaa.ComponentStockList#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @see quality.as_foaa.As_foaaPackage#getComponentStockList()
 * @model
 * @generated
 */
public interface ComponentStockList extends StockList {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link quality.as_foaa.StockSpecification#getComponentStockList <em>Component Stock List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(StockSpecification)
	 * @see quality.as_foaa.As_foaaPackage#getComponentStockList_Parent()
	 * @see quality.as_foaa.StockSpecification#getComponentStockList
	 * @model opposite="componentStockList" required="true" transient="false"
	 * @generated
	 */
	StockSpecification getParent();

	/**
	 * Sets the value of the '{@link quality.as_foaa.ComponentStockList#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(StockSpecification value);

	/**
	 * Returns the value of the '<em><b>Components</b></em>' reference list.
	 * The list contents are of type {@link domain.as.ComponentRepository.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' reference list.
	 * @see quality.as_foaa.As_foaaPackage#getComponentStockList_Components()
	 * @model
	 * @generated
	 */
	EList<Component> getComponents();

} // ComponentStockList
