/**
 */
package domain.aps.structures;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see domain.aps.structures.StructuresPackage
 * @generated
 */
public interface StructuresFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StructuresFactory eINSTANCE = domain.aps.structures.impl.StructuresFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Control Cabinet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Cabinet</em>'.
	 * @generated
	 */
	ControlCabinet createControlCabinet();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StructuresPackage getStructuresPackage();

} //StructuresFactory
