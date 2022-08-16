/**
 */
package domain.as.InterfaceRepository;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see domain.as.InterfaceRepository.InterfaceRepositoryPackage
 * @generated
 */
public interface InterfaceRepositoryFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InterfaceRepositoryFactory eINSTANCE = domain.as.InterfaceRepository.impl.InterfaceRepositoryFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Interface Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Repository</em>'.
	 * @generated
	 */
	InterfaceRepository createInterfaceRepository();

	/**
	 * Returns a new object of class '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface</em>'.
	 * @generated
	 */
	Interface createInterface();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InterfaceRepositoryPackage getInterfaceRepositoryPackage();

} //InterfaceRepositoryFactory
