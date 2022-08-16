/**
 */
package quality.aps_mm.util;

import domain.as.ComponentRepository.Component;

import domain.as.InterfaceRepository.Interface;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import paradigm.basic.Entity;

import paradigm.modificationmarks.AbstractModification;

import quality.aps_mm.*;

import quality.as_mm.ModifyComponent;
import quality.as_mm.ModifyEntity;
import quality.as_mm.ModifyInterface;

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
 * @see quality.aps_mm.Aps_mmPackage
 * @generated
 */
public class Aps_mmSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Aps_mmPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aps_mmSwitch() {
		if (modelPackage == null) {
			modelPackage = Aps_mmPackage.eINSTANCE;
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
			case Aps_mmPackage.MODIFY_BUS_MASTER: {
				ModifyBusMaster modifyBusMaster = (ModifyBusMaster)theEObject;
				T1 result = caseModifyBusMaster(modifyBusMaster);
				if (result == null) result = caseModifyComponent(modifyBusMaster);
				if (result == null) result = caseModifyEntity(modifyBusMaster);
				if (result == null) result = caseAbstractModification(modifyBusMaster);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Aps_mmPackage.MODIFY_PHYSICAL_CONNECTION: {
				ModifyPhysicalConnection modifyPhysicalConnection = (ModifyPhysicalConnection)theEObject;
				T1 result = caseModifyPhysicalConnection(modifyPhysicalConnection);
				if (result == null) result = caseModifyInterface(modifyPhysicalConnection);
				if (result == null) result = caseModifyEntity(modifyPhysicalConnection);
				if (result == null) result = caseAbstractModification(modifyPhysicalConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Aps_mmPackage.MODIFY_SIGNALINTERFACE: {
				ModifySignalinterface modifySignalinterface = (ModifySignalinterface)theEObject;
				T1 result = caseModifySignalinterface(modifySignalinterface);
				if (result == null) result = caseModifyInterface(modifySignalinterface);
				if (result == null) result = caseModifyEntity(modifySignalinterface);
				if (result == null) result = caseAbstractModification(modifySignalinterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Aps_mmPackage.MODIFY_SENSOR: {
				ModifySensor modifySensor = (ModifySensor)theEObject;
				T1 result = caseModifySensor(modifySensor);
				if (result == null) result = caseModifyComponent(modifySensor);
				if (result == null) result = caseModifyEntity(modifySensor);
				if (result == null) result = caseAbstractModification(modifySensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Aps_mmPackage.MODIFY_BUS_SLAVE: {
				ModifyBusSlave modifyBusSlave = (ModifyBusSlave)theEObject;
				T1 result = caseModifyBusSlave(modifyBusSlave);
				if (result == null) result = caseModifyComponent(modifyBusSlave);
				if (result == null) result = caseModifyEntity(modifyBusSlave);
				if (result == null) result = caseAbstractModification(modifyBusSlave);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Aps_mmPackage.MODIFY_RAMP: {
				ModifyRamp modifyRamp = (ModifyRamp)theEObject;
				T1 result = caseModifyRamp(modifyRamp);
				if (result == null) result = caseModifyComponent(modifyRamp);
				if (result == null) result = caseModifyEntity(modifyRamp);
				if (result == null) result = caseAbstractModification(modifyRamp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Aps_mmPackage.MODIFY_BUS_CABLE: {
				ModifyBusCable modifyBusCable = (ModifyBusCable)theEObject;
				T1 result = caseModifyBusCable(modifyBusCable);
				if (result == null) result = caseModifyComponent(modifyBusCable);
				if (result == null) result = caseModifyEntity(modifyBusCable);
				if (result == null) result = caseAbstractModification(modifyBusCable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Aps_mmPackage.MODIFY_BUS_BOX: {
				ModifyBusBox modifyBusBox = (ModifyBusBox)theEObject;
				T1 result = caseModifyBusBox(modifyBusBox);
				if (result == null) result = caseModifyComponent(modifyBusBox);
				if (result == null) result = caseModifyEntity(modifyBusBox);
				if (result == null) result = caseAbstractModification(modifyBusBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modify Bus Master</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modify Bus Master</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseModifyBusMaster(ModifyBusMaster object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modify Physical Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modify Physical Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseModifyPhysicalConnection(ModifyPhysicalConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modify Signalinterface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modify Signalinterface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseModifySignalinterface(ModifySignalinterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modify Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modify Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseModifySensor(ModifySensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modify Bus Slave</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modify Bus Slave</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseModifyBusSlave(ModifyBusSlave object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modify Ramp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modify Ramp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseModifyRamp(ModifyRamp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modify Bus Cable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modify Bus Cable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseModifyBusCable(ModifyBusCable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modify Bus Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modify Bus Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseModifyBusBox(ModifyBusBox object) {
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

} //Aps_mmSwitch
