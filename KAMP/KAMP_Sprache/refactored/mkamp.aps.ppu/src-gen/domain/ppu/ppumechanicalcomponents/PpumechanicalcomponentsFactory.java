/**
 */
package domain.ppu.ppumechanicalcomponents;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see domain.ppu.ppumechanicalcomponents.PpumechanicalcomponentsPackage
 * @generated
 */
public interface PpumechanicalcomponentsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PpumechanicalcomponentsFactory eINSTANCE = domain.ppu.ppumechanicalcomponents.impl.PpumechanicalcomponentsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Arm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arm</em>'.
	 * @generated
	 */
	Arm createArm();

	/**
	 * Returns a new object of class '<em>Housing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Housing</em>'.
	 * @generated
	 */
	Housing createHousing();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PpumechanicalcomponentsPackage getPpumechanicalcomponentsPackage();

} //PpumechanicalcomponentsFactory
