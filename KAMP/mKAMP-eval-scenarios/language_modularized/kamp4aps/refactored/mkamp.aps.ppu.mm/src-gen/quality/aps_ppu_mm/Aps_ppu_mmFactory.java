/**
 */
package quality.aps_ppu_mm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see quality.aps_ppu_mm.Aps_ppu_mmPackage
 * @generated
 */
public interface Aps_ppu_mmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Aps_ppu_mmFactory eINSTANCE = quality.aps_ppu_mm.impl.Aps_ppu_mmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Modify Micro Switch Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modify Micro Switch Module</em>'.
	 * @generated
	 */
	ModifyMicroSwitchModule createModifyMicroSwitchModule();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Aps_ppu_mmPackage getAps_ppu_mmPackage();

} //Aps_ppu_mmFactory
