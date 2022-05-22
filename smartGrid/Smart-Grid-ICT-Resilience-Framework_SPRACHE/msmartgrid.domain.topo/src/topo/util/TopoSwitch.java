/**
 */
package topo.util;

import base.Identifier;
import base.NamedEntity;
import base.NamedIdentifier;

import graph.CommunicatingEntity;
import graph.NetworkEntity;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import topo.*;

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
 * @see topo.TopoPackage
 * @generated
 */
public class TopoSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TopoPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopoSwitch() {
		if (modelPackage == null) {
			modelPackage = TopoPackage.eINSTANCE;
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
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TopoPackage.SMART_GRID_TOPOLOGY: {
				SmartGridTopology smartGridTopology = (SmartGridTopology)theEObject;
				T result = caseSmartGridTopology(smartGridTopology);
				if (result == null) result = caseNamedIdentifier(smartGridTopology);
				if (result == null) result = caseIdentifier(smartGridTopology);
				if (result == null) result = caseNamedEntity(smartGridTopology);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopoPackage.SMART_METER: {
				SmartMeter smartMeter = (SmartMeter)theEObject;
				T result = caseSmartMeter(smartMeter);
				if (result == null) result = caseCommunicatingEntity(smartMeter);
				if (result == null) result = caseNetworkEntity(smartMeter);
				if (result == null) result = caseNamedIdentifier(smartMeter);
				if (result == null) result = caseIdentifier(smartMeter);
				if (result == null) result = caseNamedEntity(smartMeter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopoPackage.NETWORK_NODE: {
				NetworkNode networkNode = (NetworkNode)theEObject;
				T result = caseNetworkNode(networkNode);
				if (result == null) result = caseNetworkEntity(networkNode);
				if (result == null) result = caseNamedIdentifier(networkNode);
				if (result == null) result = caseIdentifier(networkNode);
				if (result == null) result = caseNamedEntity(networkNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopoPackage.CONTROL_CENTER: {
				ControlCenter controlCenter = (ControlCenter)theEObject;
				T result = caseControlCenter(controlCenter);
				if (result == null) result = caseCommunicatingEntity(controlCenter);
				if (result == null) result = caseNetworkEntity(controlCenter);
				if (result == null) result = caseNamedIdentifier(controlCenter);
				if (result == null) result = caseIdentifier(controlCenter);
				if (result == null) result = caseNamedEntity(controlCenter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopoPackage.GENERIC_CONTROLLER: {
				GenericController genericController = (GenericController)theEObject;
				T result = caseGenericController(genericController);
				if (result == null) result = caseCommunicatingEntity(genericController);
				if (result == null) result = caseNetworkEntity(genericController);
				if (result == null) result = caseNamedIdentifier(genericController);
				if (result == null) result = caseIdentifier(genericController);
				if (result == null) result = caseNamedEntity(genericController);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopoPackage.INTER_COM: {
				InterCom interCom = (InterCom)theEObject;
				T result = caseInterCom(interCom);
				if (result == null) result = caseCommunicatingEntity(interCom);
				if (result == null) result = caseNetworkEntity(interCom);
				if (result == null) result = caseNamedIdentifier(interCom);
				if (result == null) result = caseIdentifier(interCom);
				if (result == null) result = caseNamedEntity(interCom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Smart Grid Topology</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Smart Grid Topology</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSmartGridTopology(SmartGridTopology object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Smart Meter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Smart Meter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSmartMeter(SmartMeter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkNode(NetworkNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Center</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Center</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlCenter(ControlCenter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericController(GenericController object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inter Com</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inter Com</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterCom(InterCom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifier(Identifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedEntity(NamedEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedIdentifier(NamedIdentifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkEntity(NetworkEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communicating Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communicating Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicatingEntity(CommunicatingEntity object) {
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
	public T defaultCase(EObject object) {
		return null;
	}

} //TopoSwitch
