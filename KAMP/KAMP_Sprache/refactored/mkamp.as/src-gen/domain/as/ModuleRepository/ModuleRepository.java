/**
 */
package domain.as.ModuleRepository;

import org.eclipse.emf.common.util.EList;

import paradigm.basic.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.as.ModuleRepository.ModuleRepository#getAllModulesInPlant <em>All Modules In Plant</em>}</li>
 * </ul>
 *
 * @see domain.as.ModuleRepository.ModuleRepositoryPackage#getModuleRepository()
 * @model
 * @generated
 */
public interface ModuleRepository extends Entity {
	/**
	 * Returns the value of the '<em><b>All Modules In Plant</b></em>' reference list.
	 * The list contents are of type {@link domain.as.ModuleRepository.Module}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Modules In Plant</em>' reference list.
	 * @see domain.as.ModuleRepository.ModuleRepositoryPackage#getModuleRepository_AllModulesInPlant()
	 * @model
	 * @generated
	 */
	EList<domain.as.ModuleRepository.Module> getAllModulesInPlant();

} // ModuleRepository
