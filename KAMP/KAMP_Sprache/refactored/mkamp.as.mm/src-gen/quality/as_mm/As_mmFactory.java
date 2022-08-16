/**
 */
package quality.as_mm;

import domain.as.ComponentRepository.Component;

import domain.as.InterfaceRepository.Interface;

import domain.as.StructureRepository.Structure;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see quality.as_mm.As_mmPackage
 * @generated
 */
public interface As_mmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	As_mmFactory eINSTANCE = quality.as_mm.impl.As_mmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>KAMP 4a PS Modification Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>KAMP 4a PS Modification Repository</em>'.
	 * @generated
	 */
	KAMP4aPSModificationRepository createKAMP4aPSModificationRepository();

	/**
	 * Returns a new object of class '<em>KAMP 4a PS Seed Modifications</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>KAMP 4a PS Seed Modifications</em>'.
	 * @generated
	 */
	KAMP4aPSSeedModifications createKAMP4aPSSeedModifications();

	/**
	 * Returns a new object of class '<em>Change Propagation Due To Hardware Change</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Propagation Due To Hardware Change</em>'.
	 * @generated
	 */
	ChangePropagationDueToHardwareChange createChangePropagationDueToHardwareChange();

	/**
	 * Returns a new object of class '<em>Modify Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modify Component</em>'.
	 * @generated
	 */
	<T extends Component> ModifyComponent<T> createModifyComponent();

	/**
	 * Returns a new object of class '<em>Modify Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modify Module</em>'.
	 * @generated
	 */
	<T extends domain.as.ModuleRepository.Module> ModifyModule<T> createModifyModule();

	/**
	 * Returns a new object of class '<em>Modify Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modify Structure</em>'.
	 * @generated
	 */
	<T extends Structure> ModifyStructure<T> createModifyStructure();

	/**
	 * Returns a new object of class '<em>Modify Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modify Interface</em>'.
	 * @generated
	 */
	<T extends Interface> ModifyInterface<T> createModifyInterface();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	As_mmPackage getAs_mmPackage();

} //As_mmFactory
