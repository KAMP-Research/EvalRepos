/**
 */
package quality.as_foaa;

import domain.as.StructureRepository.Structure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure Stock List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link quality.as_foaa.StructureStockList#getParent <em>Parent</em>}</li>
 *   <li>{@link quality.as_foaa.StructureStockList#getStructures <em>Structures</em>}</li>
 * </ul>
 *
 * @see quality.as_foaa.As_foaaPackage#getStructureStockList()
 * @model
 * @generated
 */
public interface StructureStockList extends StockList {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link quality.as_foaa.StockSpecification#getStructureStockList <em>Structure Stock List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(StockSpecification)
	 * @see quality.as_foaa.As_foaaPackage#getStructureStockList_Parent()
	 * @see quality.as_foaa.StockSpecification#getStructureStockList
	 * @model opposite="structureStockList" required="true" transient="false"
	 * @generated
	 */
	StockSpecification getParent();

	/**
	 * Sets the value of the '{@link quality.as_foaa.StructureStockList#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(StockSpecification value);

	/**
	 * Returns the value of the '<em><b>Structures</b></em>' reference list.
	 * The list contents are of type {@link domain.as.StructureRepository.Structure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structures</em>' reference list.
	 * @see quality.as_foaa.As_foaaPackage#getStructureStockList_Structures()
	 * @model
	 * @generated
	 */
	EList<Structure> getStructures();

} // StructureStockList
