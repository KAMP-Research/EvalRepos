/**
 */
package domain.as.ModuleRepository;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see domain.as.ModuleRepository.ModuleRepositoryPackage
 * @generated
 */
public interface ModuleRepositoryFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModuleRepositoryFactory eINSTANCE = domain.as.ModuleRepository.impl.ModuleRepositoryFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Module Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module Repository</em>'.
	 * @generated
	 */
	ModuleRepository createModuleRepository();

	/**
	 * Returns a new object of class '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module</em>'.
	 * @generated
	 */
	Module createModule();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModuleRepositoryPackage getModuleRepositoryPackage();

} //ModuleRepositoryFactory
