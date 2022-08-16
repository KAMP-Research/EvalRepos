/**
 */
package quality.as_mm;

import domain.as.ComponentRepository.Component;

import domain.as.InterfaceRepository.Interface;

import domain.as.StructureRepository.Structure;

import org.eclipse.emf.common.util.EList;

import paradigm.modificationmarks.AbstractSeedModifications;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KAMP 4a PS Seed Modifications</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link quality.as_mm.KAMP4aPSSeedModifications#getStructureModifications <em>Structure Modifications</em>}</li>
 *   <li>{@link quality.as_mm.KAMP4aPSSeedModifications#getModuleModifications <em>Module Modifications</em>}</li>
 *   <li>{@link quality.as_mm.KAMP4aPSSeedModifications#getComponentModifications <em>Component Modifications</em>}</li>
 *   <li>{@link quality.as_mm.KAMP4aPSSeedModifications#getInterfaceModifications <em>Interface Modifications</em>}</li>
 * </ul>
 *
 * @see quality.as_mm.As_mmPackage#getKAMP4aPSSeedModifications()
 * @model
 * @generated
 */
public interface KAMP4aPSSeedModifications extends AbstractSeedModifications {
	/**
	 * Returns the value of the '<em><b>Structure Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link quality.as_mm.ModifyStructure}<code>&lt;domain.as.StructureRepository.Structure&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure Modifications</em>' containment reference list.
	 * @see quality.as_mm.As_mmPackage#getKAMP4aPSSeedModifications_StructureModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModifyStructure<Structure>> getStructureModifications();

	/**
	 * Returns the value of the '<em><b>Module Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link quality.as_mm.ModifyModule}<code>&lt;domain.as.ModuleRepository.Module&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Modifications</em>' containment reference list.
	 * @see quality.as_mm.As_mmPackage#getKAMP4aPSSeedModifications_ModuleModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModifyModule<domain.as.ModuleRepository.Module>> getModuleModifications();

	/**
	 * Returns the value of the '<em><b>Component Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link quality.as_mm.ModifyComponent}<code>&lt;domain.as.ComponentRepository.Component&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Modifications</em>' containment reference list.
	 * @see quality.as_mm.As_mmPackage#getKAMP4aPSSeedModifications_ComponentModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModifyComponent<Component>> getComponentModifications();

	/**
	 * Returns the value of the '<em><b>Interface Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link quality.as_mm.ModifyInterface}<code>&lt;domain.as.InterfaceRepository.Interface&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Modifications</em>' containment reference list.
	 * @see quality.as_mm.As_mmPackage#getKAMP4aPSSeedModifications_InterfaceModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModifyInterface<Interface>> getInterfaceModifications();

} // KAMP4aPSSeedModifications
