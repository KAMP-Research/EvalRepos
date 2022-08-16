/**
 */
package quality.as_foaa;

import domain.as.InterfaceRepository.Interface;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Stock List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link quality.as_foaa.InterfaceStockList#getParent <em>Parent</em>}</li>
 *   <li>{@link quality.as_foaa.InterfaceStockList#getInterfaces <em>Interfaces</em>}</li>
 * </ul>
 *
 * @see quality.as_foaa.As_foaaPackage#getInterfaceStockList()
 * @model
 * @generated
 */
public interface InterfaceStockList extends StockList {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link quality.as_foaa.StockSpecification#getInterfaceStockList <em>Interface Stock List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(StockSpecification)
	 * @see quality.as_foaa.As_foaaPackage#getInterfaceStockList_Parent()
	 * @see quality.as_foaa.StockSpecification#getInterfaceStockList
	 * @model opposite="interfaceStockList" required="true" transient="false"
	 * @generated
	 */
	StockSpecification getParent();

	/**
	 * Sets the value of the '{@link quality.as_foaa.InterfaceStockList#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(StockSpecification value);

	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' reference list.
	 * The list contents are of type {@link domain.as.InterfaceRepository.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' reference list.
	 * @see quality.as_foaa.As_foaaPackage#getInterfaceStockList_Interfaces()
	 * @model
	 * @generated
	 */
	EList<Interface> getInterfaces();

} // InterfaceStockList
