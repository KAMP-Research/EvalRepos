/**
 */
package domain.as.InterfaceRepository;

import org.eclipse.emf.common.util.EList;

import paradigm.basic.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.as.InterfaceRepository.Interface#getParentElement <em>Parent Element</em>}</li>
 * </ul>
 *
 * @see domain.as.InterfaceRepository.InterfaceRepositoryPackage#getInterface()
 * @model
 * @generated
 */
public interface Interface extends Entity {
	/**
	 * Returns the value of the '<em><b>Parent Element</b></em>' reference list.
	 * The list contents are of type {@link paradigm.basic.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Element</em>' reference list.
	 * @see domain.as.InterfaceRepository.InterfaceRepositoryPackage#getInterface_ParentElement()
	 * @model required="true"
	 * @generated
	 */
	EList<Entity> getParentElement();

} // Interface
