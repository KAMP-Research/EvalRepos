/**
 */
package domain.ppu.ppuinterfaces.util;

import domain.aps.interfaces.Screwing;
import domain.aps.interfaces.Suspension;

import domain.as.InterfaceRepository.Interface;

import domain.ppu.ppuinterfaces.*;

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
 * @see domain.ppu.ppuinterfaces.PpuinterfacesPackage
 * @generated
 */
public class PpuinterfacesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PpuinterfacesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PpuinterfacesSwitch() {
		if (modelPackage == null) {
			modelPackage = PpuinterfacesPackage.eINSTANCE;
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
			case PpuinterfacesPackage.SUSPENSION_RACK: {
				SuspensionRack suspensionRack = (SuspensionRack)theEObject;
				T result = caseSuspensionRack(suspensionRack);
				if (result == null) result = caseSuspension(suspensionRack);
				if (result == null) result = caseInterface(suspensionRack);
				if (result == null) result = caseEntity(suspensionRack);
				if (result == null) result = caseIdentifier(suspensionRack);
				if (result == null) result = caseNamedElement(suspensionRack);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PpuinterfacesPackage.SUSPENSION_ARM: {
				SuspensionArm suspensionArm = (SuspensionArm)theEObject;
				T result = caseSuspensionArm(suspensionArm);
				if (result == null) result = caseSuspension(suspensionArm);
				if (result == null) result = caseInterface(suspensionArm);
				if (result == null) result = caseEntity(suspensionArm);
				if (result == null) result = caseIdentifier(suspensionArm);
				if (result == null) result = caseNamedElement(suspensionArm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PpuinterfacesPackage.SCREWING_SPLITTER: {
				ScrewingSplitter screwingSplitter = (ScrewingSplitter)theEObject;
				T result = caseScrewingSplitter(screwingSplitter);
				if (result == null) result = caseScrewing(screwingSplitter);
				if (result == null) result = caseInterface(screwingSplitter);
				if (result == null) result = caseEntity(screwingSplitter);
				if (result == null) result = caseIdentifier(screwingSplitter);
				if (result == null) result = caseNamedElement(screwingSplitter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PpuinterfacesPackage.SCREWING_MOTOR: {
				ScrewingMotor screwingMotor = (ScrewingMotor)theEObject;
				T result = caseScrewingMotor(screwingMotor);
				if (result == null) result = caseScrewing(screwingMotor);
				if (result == null) result = caseInterface(screwingMotor);
				if (result == null) result = caseEntity(screwingMotor);
				if (result == null) result = caseIdentifier(screwingMotor);
				if (result == null) result = caseNamedElement(screwingMotor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PpuinterfacesPackage.SCREWING_POTENTIOMETER: {
				ScrewingPotentiometer screwingPotentiometer = (ScrewingPotentiometer)theEObject;
				T result = caseScrewingPotentiometer(screwingPotentiometer);
				if (result == null) result = caseScrewing(screwingPotentiometer);
				if (result == null) result = caseInterface(screwingPotentiometer);
				if (result == null) result = caseEntity(screwingPotentiometer);
				if (result == null) result = caseIdentifier(screwingPotentiometer);
				if (result == null) result = caseNamedElement(screwingPotentiometer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PpuinterfacesPackage.SCREWING_FIXTURE: {
				ScrewingFixture screwingFixture = (ScrewingFixture)theEObject;
				T result = caseScrewingFixture(screwingFixture);
				if (result == null) result = caseScrewing(screwingFixture);
				if (result == null) result = caseInterface(screwingFixture);
				if (result == null) result = caseEntity(screwingFixture);
				if (result == null) result = caseIdentifier(screwingFixture);
				if (result == null) result = caseNamedElement(screwingFixture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PpuinterfacesPackage.SCREWING_RACK: {
				ScrewingRack screwingRack = (ScrewingRack)theEObject;
				T result = caseScrewingRack(screwingRack);
				if (result == null) result = caseScrewing(screwingRack);
				if (result == null) result = caseInterface(screwingRack);
				if (result == null) result = caseEntity(screwingRack);
				if (result == null) result = caseIdentifier(screwingRack);
				if (result == null) result = caseNamedElement(screwingRack);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PpuinterfacesPackage.SCREWING_CYLINDER: {
				ScrewingCylinder screwingCylinder = (ScrewingCylinder)theEObject;
				T result = caseScrewingCylinder(screwingCylinder);
				if (result == null) result = caseScrewing(screwingCylinder);
				if (result == null) result = caseInterface(screwingCylinder);
				if (result == null) result = caseEntity(screwingCylinder);
				if (result == null) result = caseIdentifier(screwingCylinder);
				if (result == null) result = caseNamedElement(screwingCylinder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Suspension Rack</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Suspension Rack</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuspensionRack(SuspensionRack object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Suspension Arm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Suspension Arm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuspensionArm(SuspensionArm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Screwing Splitter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Screwing Splitter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScrewingSplitter(ScrewingSplitter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Screwing Motor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Screwing Motor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScrewingMotor(ScrewingMotor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Screwing Potentiometer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Screwing Potentiometer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScrewingPotentiometer(ScrewingPotentiometer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Screwing Fixture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Screwing Fixture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScrewingFixture(ScrewingFixture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Screwing Rack</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Screwing Rack</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScrewingRack(ScrewingRack object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Screwing Cylinder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Screwing Cylinder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScrewingCylinder(ScrewingCylinder object) {
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

} //PpuinterfacesSwitch
