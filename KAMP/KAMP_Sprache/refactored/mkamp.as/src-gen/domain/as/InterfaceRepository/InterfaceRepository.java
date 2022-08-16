/**
 */
package domain.as.InterfaceRepository;

import org.eclipse.emf.common.util.EList;

import paradigm.basic.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.as.InterfaceRepository.InterfaceRepository#getAllInterfacesInPlant <em>All Interfaces In Plant</em>}</li>
 * </ul>
 *
 * @see domain.as.InterfaceRepository.InterfaceRepositoryPackage#getInterfaceRepository()
 * @model
 * @generated
 */
public interface InterfaceRepository extends Entity {
	/**
	 * Returns the value of the '<em><b>All Interfaces In Plant</b></em>' containment reference list.
	 * The list contents are of type {@link domain.as.InterfaceRepository.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Interfaces In Plant</em>' containment reference list.
	 * @see domain.as.InterfaceRepository.InterfaceRepositoryPackage#getInterfaceRepository_AllInterfacesInPlant()
	 * @model containment="true"
	 * @generated
	 */
	EList<Interface> getAllInterfacesInPlant();

} // InterfaceRepository
