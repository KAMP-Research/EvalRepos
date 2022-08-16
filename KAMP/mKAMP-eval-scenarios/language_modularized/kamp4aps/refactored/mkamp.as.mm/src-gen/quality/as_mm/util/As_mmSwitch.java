/**
 */
package quality.as_mm.util;

import domain.as.ComponentRepository.Component;

import domain.as.InterfaceRepository.Interface;

import domain.as.StructureRepository.Structure;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import paradigm.basic.Entity;

import paradigm.modificationmarks.AbstractChangePropagationStep;
import paradigm.modificationmarks.AbstractModification;
import paradigm.modificationmarks.AbstractModificationRepository;
import paradigm.modificationmarks.AbstractSeedModifications;
import paradigm.modificationmarks.ChangePropagationStep;

import quality.as_mm.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see quality.as_mm.As_mmPackage
 * @generated
 */
public class As_mmSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static As_mmPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As_mmSwitch() {
		if (modelPackage == null) {
			modelPackage = As_mmPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case As_mmPackage.ABSTRACT_KAMP_4A_PS_MODIFICATION_REPOSITORY: {
				AbstractKAMP4aPSModificationRepository<?> abstractKAMP4aPSModificationRepository = (AbstractKAMP4aPSModificationRepository<?>)theEObject;
				T1 result = caseAbstractKAMP4aPSModificationRepository(abstractKAMP4aPSModificationRepository);
				if (result == null) result = caseAbstractModificationRepository(abstractKAMP4aPSModificationRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As_mmPackage.KAMP_4A_PS_MODIFICATION_REPOSITORY: {
				KAMP4aPSModificationRepository kamp4aPSModificationRepository = (KAMP4aPSModificationRepository)theEObject;
				T1 result = caseKAMP4aPSModificationRepository(kamp4aPSModificationRepository);
				if (result == null) result = caseAbstractKAMP4aPSModificationRepository(kamp4aPSModificationRepository);
				if (result == null) result = caseAbstractModificationRepository(kamp4aPSModificationRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As_mmPackage.KAMP_4A_PS_SEED_MODIFICATIONS: {
				KAMP4aPSSeedModifications kamp4aPSSeedModifications = (KAMP4aPSSeedModifications)theEObject;
				T1 result = caseKAMP4aPSSeedModifications(kamp4aPSSeedModifications);
				if (result == null) result = caseAbstractSeedModifications(kamp4aPSSeedModifications);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As_mmPackage.CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE: {
				ChangePropagationDueToHardwareChange changePropagationDueToHardwareChange = (ChangePropagationDueToHardwareChange)theEObject;
				T1 result = caseChangePropagationDueToHardwareChange(changePropagationDueToHardwareChange);
				if (result == null) result = caseChangePropagationStep(changePropagationDueToHardwareChange);
				if (result == null) result = caseAbstractChangePropagationStep(changePropagationDueToHardwareChange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As_mmPackage.MODIFY_ENTITY: {
				ModifyEntity<?> modifyEntity = (ModifyEntity<?>)theEObject;
				T1 result = caseModifyEntity(modifyEntity);
				if (result == null) result = caseAbstractModification(modifyEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As_mmPackage.MODIFY_COMPONENT: {
				ModifyComponent<?> modifyComponent = (ModifyComponent<?>)theEObject;
				T1 result = caseModifyComponent(modifyComponent);
				if (result == null) result = caseModifyEntity(modifyComponent);
				if (result == null) result = caseAbstractModification(modifyComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As_mmPackage.MODIFY_MODULE: {
				ModifyModule<?> modifyModule = (ModifyModule<?>)theEObject;
				T1 result = caseModifyModule(modifyModule);
				if (result == null) result = caseModifyEntity(modifyModule);
				if (result == null) result = caseAbstractModification(modifyModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As_mmPackage.MODIFY_STRUCTURE: {
				ModifyStructure<?> modifyStructure = (ModifyStructure<?>)theEObject;
				T1 result = caseModifyStructure(modifyStructure);
				if (result == null) result = caseModifyEntity(modifyStructure);
				if (result == null) result = caseAbstractModification(modifyStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case As_mmPackage.MODIFY_INTERFACE: {
				ModifyInterface<?> modifyInterface = (ModifyInterface<?>)theEObject;
				T1 result = caseModifyInterface(modifyInterface);
				if (result == null) result = caseModifyEntity(modifyInterface);
				if (result == null) result = caseAbstractModification(modifyInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract KAMP 4a PS Modification Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract KAMP 4a PS Modification Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends KAMP4aPSSeedModifications> T1 caseAbstractKAMP4aPSModificationRepository(AbstractKAMP4aPSModificationRepository<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KAMP 4a PS Modification Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KAMP 4a PS Modification Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseKAMP4aPSModificationRepository(KAMP4aPSModificationRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KAMP 4a PS Seed Modifications</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KAMP 4a PS Seed Modifications</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseKAMP4aPSSeedModifications(KAMP4aPSSeedModifications object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Propagation Due To Hardware Change</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Propagation Due To Hardware Change</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseChangePropagationDueToHardwareChange(ChangePropagationDueToHardwareChange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modify Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modify Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Entity> T1 caseModifyEntity(ModifyEntity<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modify Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modify Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Component> T1 caseModifyComponent(ModifyComponent<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modify Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modify Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends domain.as.ModuleRepository.Module> T1 caseModifyModule(ModifyModule<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modify Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modify Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Structure> T1 caseModifyStructure(ModifyStructure<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modify Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modify Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Interface> T1 caseModifyInterface(ModifyInterface<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Modification Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Modification Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <S extends AbstractSeedModifications, T extends AbstractChangePropagationStep> T1 caseAbstractModificationRepository(AbstractModificationRepository<S, T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Seed Modifications</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Seed Modifications</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAbstractSeedModifications(AbstractSeedModifications object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Change Propagation Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Change Propagation Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAbstractChangePropagationStep(AbstractChangePropagationStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Propagation Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Propagation Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseChangePropagationStep(ChangePropagationStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Modification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Modification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <S, T> T1 caseAbstractModification(AbstractModification<S, T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T1 defaultCase(EObject object) {
		return null;
	}

} //As_mmSwitch
