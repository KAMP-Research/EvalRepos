/**
 */
package domain.ppu.ppustructures;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see domain.ppu.ppustructures.PpustructuresPackage
 * @generated
 */
public interface PpustructuresFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PpustructuresFactory eINSTANCE = domain.ppu.ppustructures.impl.PpustructuresFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Conveyor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conveyor</em>'.
	 * @generated
	 */
	Conveyor createConveyor();

	/**
	 * Returns a new object of class '<em>Pneumatic Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pneumatic Network</em>'.
	 * @generated
	 */
	PneumaticNetwork createPneumaticNetwork();

	/**
	 * Returns a new object of class '<em>Communication Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communication Network</em>'.
	 * @generated
	 */
	CommunicationNetwork createCommunicationNetwork();

	/**
	 * Returns a new object of class '<em>Power Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Power Network</em>'.
	 * @generated
	 */
	PowerNetwork createPowerNetwork();

	/**
	 * Returns a new object of class '<em>Crane</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Crane</em>'.
	 * @generated
	 */
	Crane createCrane();

	/**
	 * Returns a new object of class '<em>Power Wiring</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Power Wiring</em>'.
	 * @generated
	 */
	PowerWiring createPowerWiring();

	/**
	 * Returns a new object of class '<em>Logical Wiring</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logical Wiring</em>'.
	 * @generated
	 */
	LogicalWiring createLogicalWiring();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PpustructuresPackage getPpustructuresPackage();

} //PpustructuresFactory
