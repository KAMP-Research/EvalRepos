/**
 */
package domain.aps.mechanicalcomponents;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see domain.aps.mechanicalcomponents.MechanicalcomponentsPackage
 * @generated
 */
public interface MechanicalcomponentsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MechanicalcomponentsFactory eINSTANCE = domain.aps.mechanicalcomponents.impl.MechanicalcomponentsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Gripper Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gripper Part</em>'.
	 * @generated
	 */
	GripperPart createGripperPart();

	/**
	 * Returns a new object of class '<em>Return Spring</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Spring</em>'.
	 * @generated
	 */
	ReturnSpring createReturnSpring();

	/**
	 * Returns a new object of class '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table</em>'.
	 * @generated
	 */
	Table createTable();

	/**
	 * Returns a new object of class '<em>Rubber Band</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rubber Band</em>'.
	 * @generated
	 */
	RubberBand createRubberBand();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MechanicalcomponentsPackage getMechanicalcomponentsPackage();

} //MechanicalcomponentsFactory
