/**
 */
package domain.aps.interfaces.util;

import domain.aps.interfaces.*;

import domain.as.InterfaceRepository.Interface;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import paradigm.basic.Entity;
import paradigm.basic.Identifier;
import paradigm.basic.NamedElement;

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
 * @see domain.aps.interfaces.InterfacesPackage
 * @generated
 */
public class InterfacesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InterfacesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfacesSwitch() {
		if (modelPackage == null) {
			modelPackage = InterfacesPackage.eINSTANCE;
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
			case InterfacesPackage.FIXTURE: {
				Fixture fixture = (Fixture)theEObject;
				T result = caseFixture(fixture);
				if (result == null) result = caseInterface(fixture);
				if (result == null) result = caseEntity(fixture);
				if (result == null) result = caseIdentifier(fixture);
				if (result == null) result = caseNamedElement(fixture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.WATER_SUPPLY: {
				WaterSupply waterSupply = (WaterSupply)theEObject;
				T result = caseWaterSupply(waterSupply);
				if (result == null) result = caseInterface(waterSupply);
				if (result == null) result = caseEntity(waterSupply);
				if (result == null) result = caseIdentifier(waterSupply);
				if (result == null) result = caseNamedElement(waterSupply);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.PHYSICAL_CONNECTION: {
				PhysicalConnection physicalConnection = (PhysicalConnection)theEObject;
				T result = casePhysicalConnection(physicalConnection);
				if (result == null) result = caseInterface(physicalConnection);
				if (result == null) result = caseEntity(physicalConnection);
				if (result == null) result = caseIdentifier(physicalConnection);
				if (result == null) result = caseNamedElement(physicalConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.SUSPENSION: {
				Suspension suspension = (Suspension)theEObject;
				T result = caseSuspension(suspension);
				if (result == null) result = caseInterface(suspension);
				if (result == null) result = caseEntity(suspension);
				if (result == null) result = caseIdentifier(suspension);
				if (result == null) result = caseNamedElement(suspension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.TRANSPORT_CONNECTION: {
				TransportConnection transportConnection = (TransportConnection)theEObject;
				T result = caseTransportConnection(transportConnection);
				if (result == null) result = caseInterface(transportConnection);
				if (result == null) result = caseEntity(transportConnection);
				if (result == null) result = caseIdentifier(transportConnection);
				if (result == null) result = caseNamedElement(transportConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.CLAMPING: {
				Clamping clamping = (Clamping)theEObject;
				T result = caseClamping(clamping);
				if (result == null) result = caseInterface(clamping);
				if (result == null) result = caseEntity(clamping);
				if (result == null) result = caseIdentifier(clamping);
				if (result == null) result = caseNamedElement(clamping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.GEARING: {
				Gearing gearing = (Gearing)theEObject;
				T result = caseGearing(gearing);
				if (result == null) result = caseInterface(gearing);
				if (result == null) result = caseEntity(gearing);
				if (result == null) result = caseIdentifier(gearing);
				if (result == null) result = caseNamedElement(gearing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.SCREWING: {
				Screwing screwing = (Screwing)theEObject;
				T result = caseScrewing(screwing);
				if (result == null) result = caseInterface(screwing);
				if (result == null) result = caseEntity(screwing);
				if (result == null) result = caseIdentifier(screwing);
				if (result == null) result = caseNamedElement(screwing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.PNEUMATIC_SUPPLY: {
				PneumaticSupply pneumaticSupply = (PneumaticSupply)theEObject;
				T result = casePneumaticSupply(pneumaticSupply);
				if (result == null) result = caseInterface(pneumaticSupply);
				if (result == null) result = caseEntity(pneumaticSupply);
				if (result == null) result = caseIdentifier(pneumaticSupply);
				if (result == null) result = caseNamedElement(pneumaticSupply);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.SIGNAL_INTERFACE: {
				SignalInterface signalInterface = (SignalInterface)theEObject;
				T result = caseSignalInterface(signalInterface);
				if (result == null) result = caseInterface(signalInterface);
				if (result == null) result = caseEntity(signalInterface);
				if (result == null) result = caseIdentifier(signalInterface);
				if (result == null) result = caseNamedElement(signalInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fixture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fixture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFixture(Fixture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Water Supply</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Water Supply</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWaterSupply(WaterSupply object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalConnection(PhysicalConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Suspension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Suspension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuspension(Suspension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transport Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transport Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransportConnection(TransportConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clamping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clamping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClamping(Clamping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gearing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gearing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGearing(Gearing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Screwing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Screwing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScrewing(Screwing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pneumatic Supply</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pneumatic Supply</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePneumaticSupply(PneumaticSupply object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignalInterface(SignalInterface object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterface(Interface object) {
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

} //InterfacesSwitch
