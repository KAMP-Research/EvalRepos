/**
 */
package quality.as_mm;

import domain.as.ComponentRepository.Component;

import domain.as.InterfaceRepository.Interface;

import domain.as.StructureRepository.Structure;

import org.eclipse.emf.common.util.EList;

import paradigm.modificationmarks.ChangePropagationStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Propagation Due To Hardware Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link quality.as_mm.ChangePropagationDueToHardwareChange#getInterfaceModifications <em>Interface Modifications</em>}</li>
 *   <li>{@link quality.as_mm.ChangePropagationDueToHardwareChange#getComponentModifications <em>Component Modifications</em>}</li>
 *   <li>{@link quality.as_mm.ChangePropagationDueToHardwareChange#getStructureModifications <em>Structure Modifications</em>}</li>
 *   <li>{@link quality.as_mm.ChangePropagationDueToHardwareChange#getModuleModifications <em>Module Modifications</em>}</li>
 *   <li>{@link quality.as_mm.ChangePropagationDueToHardwareChange#isChanged <em>Changed</em>}</li>
 * </ul>
 *
 * @see quality.as_mm.As_mmPackage#getChangePropagationDueToHardwareChange()
 * @model
 * @generated
 */
public interface ChangePropagationDueToHardwareChange extends ChangePropagationStep {
	/**
	 * Returns the value of the '<em><b>Interface Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link quality.as_mm.ModifyInterface}<code>&lt;domain.as.InterfaceRepository.Interface&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Modifications</em>' containment reference list.
	 * @see quality.as_mm.As_mmPackage#getChangePropagationDueToHardwareChange_InterfaceModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModifyInterface<Interface>> getInterfaceModifications();

	/**
	 * Returns the value of the '<em><b>Component Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link quality.as_mm.ModifyComponent}<code>&lt;domain.as.ComponentRepository.Component&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Modifications</em>' containment reference list.
	 * @see quality.as_mm.As_mmPackage#getChangePropagationDueToHardwareChange_ComponentModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModifyComponent<Component>> getComponentModifications();

	/**
	 * Returns the value of the '<em><b>Structure Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link quality.as_mm.ModifyStructure}<code>&lt;domain.as.StructureRepository.Structure&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure Modifications</em>' containment reference list.
	 * @see quality.as_mm.As_mmPackage#getChangePropagationDueToHardwareChange_StructureModifications()
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
	 * @see quality.as_mm.As_mmPackage#getChangePropagationDueToHardwareChange_ModuleModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModifyModule<domain.as.ModuleRepository.Module>> getModuleModifications();

	/**
	 * Returns the value of the '<em><b>Changed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Changed</em>' attribute.
	 * @see #setChanged(boolean)
	 * @see quality.as_mm.As_mmPackage#getChangePropagationDueToHardwareChange_Changed()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isChanged();

	/**
	 * Sets the value of the '{@link quality.as_mm.ChangePropagationDueToHardwareChange#isChanged <em>Changed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Changed</em>' attribute.
	 * @see #isChanged()
	 * @generated
	 */
	void setChanged(boolean value);

} // ChangePropagationDueToHardwareChange
