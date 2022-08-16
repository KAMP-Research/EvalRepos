/**
 */
package domain.as.ComponentRepository;

import org.eclipse.emf.common.util.EList;

import paradigm.basic.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.as.ComponentRepository.ComponentRepository#getAllComponentsInPlant <em>All Components In Plant</em>}</li>
 * </ul>
 *
 * @see domain.as.ComponentRepository.ComponentRepositoryPackage#getComponentRepository()
 * @model
 * @generated
 */
public interface ComponentRepository extends Entity {
	/**
	 * Returns the value of the '<em><b>All Components In Plant</b></em>' reference list.
	 * The list contents are of type {@link domain.as.ComponentRepository.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Components In Plant</em>' reference list.
	 * @see domain.as.ComponentRepository.ComponentRepositoryPackage#getComponentRepository_AllComponentsInPlant()
	 * @model
	 * @generated
	 */
	EList<Component> getAllComponentsInPlant();

} // ComponentRepository
