/**
 */
package quality.as_foaa;

import domain.as.StructureRepository.Structure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure Drawing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link quality.as_foaa.StructureDrawing#getDrawn_structure <em>Drawn structure</em>}</li>
 * </ul>
 *
 * @see quality.as_foaa.As_foaaPackage#getStructureDrawing()
 * @model
 * @generated
 */
public interface StructureDrawing extends Drawing {
	/**
	 * Returns the value of the '<em><b>Drawn structure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drawn structure</em>' reference.
	 * @see #setDrawn_structure(Structure)
	 * @see quality.as_foaa.As_foaaPackage#getStructureDrawing_Drawn_structure()
	 * @model
	 * @generated
	 */
	Structure getDrawn_structure();

	/**
	 * Sets the value of the '{@link quality.as_foaa.StructureDrawing#getDrawn_structure <em>Drawn structure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drawn structure</em>' reference.
	 * @see #getDrawn_structure()
	 * @generated
	 */
	void setDrawn_structure(Structure value);

} // StructureDrawing
