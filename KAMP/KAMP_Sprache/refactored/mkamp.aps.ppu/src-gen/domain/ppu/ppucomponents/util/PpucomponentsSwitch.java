/**
 */
package domain.ppu.ppucomponents.util;

import domain.aps.components.Cable;
import domain.aps.components.Cylinder;
import domain.aps.components.MechanicalAssembly;
import domain.aps.components.Panel;
import domain.aps.components.Pipe;
import domain.aps.components.Sensor;
import domain.aps.components.Splitter;
import domain.aps.components.Valve;

import domain.aps.electroniccomponents.ElectronicPart;

import domain.as.ComponentRepository.Component;

import domain.ppu.ppucomponents.*;

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
 * @see domain.ppu.ppucomponents.PpucomponentsPackage
 * @generated
 */
public class PpucomponentsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PpucomponentsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PpucomponentsSwitch() {
		if (modelPackage == null) {
			modelPackage = PpucomponentsPackage.eINSTANCE;
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
			case PpucomponentsPackage.POWER_SPLITTER: {
				PowerSplitter powerSplitter = (PowerSplitter)theEObject;
				T result = casePowerSplitter(powerSplitter);
				if (result == null) result = caseSplitter(powerSplitter);
				if (result == null) result = caseComponent(powerSplitter);
				if (result == null) result = caseEntity(powerSplitter);
				if (result == null) result = caseIdentifier(powerSplitter);
				if (result == null) result = caseNamedElement(powerSplitter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PpucomponentsPackage.OPTICAL_SENSOR: {
				OpticalSensor opticalSensor = (OpticalSensor)theEObject;
				T result = caseOpticalSensor(opticalSensor);
				if (result == null) result = caseSensor(opticalSensor);
				if (result == null) result = caseComponent(opticalSensor);
				if (result == null) result = caseEntity(opticalSensor);
				if (result == null) result = caseIdentifier(opticalSensor);
				if (result == null) result = caseNamedElement(opticalSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PpucomponentsPackage.PNEUMATIC_PIPE: {
				PneumaticPipe pneumaticPipe = (PneumaticPipe)theEObject;
				T result = casePneumaticPipe(pneumaticPipe);
				if (result == null) result = casePipe(pneumaticPipe);
				if (result == null) result = caseComponent(pneumaticPipe);
				if (result == null) result = caseEntity(pneumaticPipe);
				if (result == null) result = caseIdentifier(pneumaticPipe);
				if (result == null) result = caseNamedElement(pneumaticPipe);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PpucomponentsPackage.PNEUMATIC_SPLITTER: {
				PneumaticSplitter pneumaticSplitter = (PneumaticSplitter)theEObject;
				T result = casePneumaticSplitter(pneumaticSplitter);
				if (result == null) result = caseSplitter(pneumaticSplitter);
				if (result == null) result = caseComponent(pneumaticSplitter);
				if (result == null) result = caseEntity(pneumaticSplitter);
				if (result == null) result = caseIdentifier(pneumaticSplitter);
				if (result == null) result = caseNamedElement(pneumaticSplitter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PpucomponentsPackage.MONOSTABLE_CYLINDER: {
				MonostableCylinder monostableCylinder = (MonostableCylinder)theEObject;
				T result = caseMonostableCylinder(monostableCylinder);
				if (result == null) result = caseCylinder(monostableCylinder);
				if (result == null) result = caseComponent(monostableCylinder);
				if (result == null) result = caseEntity(monostableCylinder);
				if (result == null) result = caseIdentifier(monostableCylinder);
				if (result == null) result = caseNamedElement(monostableCylinder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PpucomponentsPackage.PRESENCE_SENSOR: {
				PresenceSensor presenceSensor = (PresenceSensor)theEObject;
				T result = casePresenceSensor(presenceSensor);
				if (result == null) result = caseSensor(presenceSensor);
				if (result == null) result = caseComponent(presenceSensor);
				if (result == null) result = caseEntity(presenceSensor);
				if (result == null) result = caseIdentifier(presenceSensor);
				if (result == null) result = caseNamedElement(presenceSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PpucomponentsPackage.REGULAR_VALVE: {
				RegularValve regularValve = (RegularValve)theEObject;
				T result = caseRegularValve(regularValve);
				if (result == null) result = caseValve(regularValve);
				if (result == null) result = caseComponent(regularValve);
				if (result == null) result = caseEntity(regularValve);
				if (result == null) result = caseIdentifier(regularValve);
				if (result == null) result = caseNamedElement(regularValve);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PpucomponentsPackage.FRAME: {
				Frame frame = (Frame)theEObject;
				T result = caseFrame(frame);
				if (result == null) result = caseMechanicalAssembly(frame);
				if (result == null) result = caseComponent(frame);
				if (result == null) result = caseEntity(frame);
				if (result == null) result = caseIdentifier(frame);
				if (result == null) result = caseNamedElement(frame);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PpucomponentsPackage.INDUCTIVE_SENSOR: {
				InductiveSensor inductiveSensor = (InductiveSensor)theEObject;
				T result = caseInductiveSensor(inductiveSensor);
				if (result == null) result = caseSensor(inductiveSensor);
				if (result == null) result = caseComponent(inductiveSensor);
				if (result == null) result = caseEntity(inductiveSensor);
				if (result == null) result = caseIdentifier(inductiveSensor);
				if (result == null) result = caseNamedElement(inductiveSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PpucomponentsPackage.REED_SWITCH: {
				ReedSwitch reedSwitch = (ReedSwitch)theEObject;
				T result = caseReedSwitch(reedSwitch);
				if (result == null) result = caseSwitch(reedSwitch);
				if (result == null) result = caseElectronicPart(reedSwitch);
				if (result == null) result = caseComponent(reedSwitch);
				if (result == null) result = caseEntity(reedSwitch);
				if (result == null) result = caseIdentifier(reedSwitch);
				if (result == null) result = caseNamedElement(reedSwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PpucomponentsPackage.VACUUM_SWITCH: {
				VacuumSwitch vacuumSwitch = (VacuumSwitch)theEObject;
				T result = caseVacuumSwitch(vacuumSwitch);
				if (result == null) result = caseSwitch(vacuumSwitch);
				if (result == null) result = caseElectronicPart(vacuumSwitch);
				if (result == null) result = caseComponent(vacuumSwitch);
				if (result == null) result = caseEntity(vacuumSwitch);
				if (result == null) result = caseIdentifier(vacuumSwitch);
				if (result == null) result = caseNamedElement(vacuumSwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PpucomponentsPackage.PROPORTIONAL_CYLINDER: {
				ProportionalCylinder proportionalCylinder = (ProportionalCylinder)theEObject;
				T result = caseProportionalCylinder(proportionalCylinder);
				if (result == null) result = caseCylinder(proportionalCylinder);
				if (result == null) result = caseComponent(proportionalCylinder);
				if (result == null) result = caseEntity(proportionalCylinder);
				if (result == null) result = caseIdentifier(proportionalCylinder);
				if (result == null) result = caseNamedElement(proportionalCylinder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PpucomponentsPackage.BISTABLE_CYLINDER: {
				BistableCylinder bistableCylinder = (BistableCylinder)theEObject;
				T result = caseBistableCylinder(bistableCylinder);
				if (result == null) result = caseCylinder(bistableCylinder);
				if (result == null) result = caseComponent(bistableCylinder);
				if (result == null) result = caseEntity(bistableCylinder);
				if (result == null) result = caseIdentifier(bistableCylinder);
				if (result == null) result = caseNamedElement(bistableCylinder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PpucomponentsPackage.WATER_SPLITTER: {
				WaterSplitter waterSplitter = (WaterSplitter)theEObject;
				T result = caseWaterSplitter(waterSplitter);
				if (result == null) result = caseSplitter(waterSplitter);
				if (result == null) result = caseComponent(waterSplitter);
				if (result == null) result = caseEntity(waterSplitter);
				if (result == null) result = caseIdentifier(waterSplitter);
				if (result == null) result = caseNamedElement(waterSplitter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PpucomponentsPackage.OPERATION_PANEL: {
				OperationPanel operationPanel = (OperationPanel)theEObject;
				T result = caseOperationPanel(operationPanel);
				if (result == null) result = casePanel(operationPanel);
				if (result == null) result = caseComponent(operationPanel);
				if (result == null) result = caseEntity(operationPanel);
				if (result == null) result = caseIdentifier(operationPanel);
				if (result == null) result = caseNamedElement(operationPanel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PpucomponentsPackage.POWER_CABLE: {
				PowerCable powerCable = (PowerCable)theEObject;
				T result = casePowerCable(powerCable);
				if (result == null) result = caseCable(powerCable);
				if (result == null) result = caseComponent(powerCable);
				if (result == null) result = caseEntity(powerCable);
				if (result == null) result = caseIdentifier(powerCable);
				if (result == null) result = caseNamedElement(powerCable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PpucomponentsPackage.PRESSURE_SENSOR: {
				PressureSensor pressureSensor = (PressureSensor)theEObject;
				T result = casePressureSensor(pressureSensor);
				if (result == null) result = caseSensor(pressureSensor);
				if (result == null) result = caseComponent(pressureSensor);
				if (result == null) result = caseEntity(pressureSensor);
				if (result == null) result = caseIdentifier(pressureSensor);
				if (result == null) result = caseNamedElement(pressureSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PpucomponentsPackage.BOTTLE_SEPERATOR: {
				BottleSeperator bottleSeperator = (BottleSeperator)theEObject;
				T result = caseBottleSeperator(bottleSeperator);
				if (result == null) result = caseComponent(bottleSeperator);
				if (result == null) result = caseEntity(bottleSeperator);
				if (result == null) result = caseIdentifier(bottleSeperator);
				if (result == null) result = caseNamedElement(bottleSeperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PpucomponentsPackage.CONTROLLER: {
				Controller controller = (Controller)theEObject;
				T result = caseController(controller);
				if (result == null) result = caseComponent(controller);
				if (result == null) result = caseEntity(controller);
				if (result == null) result = caseIdentifier(controller);
				if (result == null) result = caseNamedElement(controller);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power Splitter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power Splitter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerSplitter(PowerSplitter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Optical Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Optical Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpticalSensor(OpticalSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pneumatic Pipe</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pneumatic Pipe</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePneumaticPipe(PneumaticPipe object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pneumatic Splitter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pneumatic Splitter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePneumaticSplitter(PneumaticSplitter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Monostable Cylinder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Monostable Cylinder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMonostableCylinder(MonostableCylinder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Presence Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Presence Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePresenceSensor(PresenceSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regular Valve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regular Valve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegularValve(RegularValve object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Frame</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Frame</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFrame(Frame object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inductive Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inductive Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInductiveSensor(InductiveSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reed Switch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reed Switch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReedSwitch(ReedSwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vacuum Switch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vacuum Switch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVacuumSwitch(VacuumSwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proportional Cylinder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proportional Cylinder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProportionalCylinder(ProportionalCylinder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bistable Cylinder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bistable Cylinder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBistableCylinder(BistableCylinder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Water Splitter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Water Splitter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWaterSplitter(WaterSplitter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Panel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Panel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationPanel(OperationPanel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power Cable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power Cable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerCable(PowerCable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pressure Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pressure Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePressureSensor(PressureSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bottle Seperator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bottle Seperator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBottleSeperator(BottleSeperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseController(Controller object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Splitter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Splitter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSplitter(Splitter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensor(Sensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pipe</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pipe</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePipe(Pipe object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cylinder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cylinder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCylinder(Cylinder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Valve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Valve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValve(Valve object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mechanical Assembly</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mechanical Assembly</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMechanicalAssembly(MechanicalAssembly object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Electronic Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Electronic Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElectronicPart(ElectronicPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitch(domain.aps.electroniccomponents.Switch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Panel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Panel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePanel(Panel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCable(Cable object) {
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

} //PpucomponentsSwitch
