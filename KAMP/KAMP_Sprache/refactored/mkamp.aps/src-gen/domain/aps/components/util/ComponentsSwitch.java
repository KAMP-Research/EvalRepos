/**
 */
package domain.aps.components.util;

import domain.aps.components.*;

import domain.aps.mechanicalcomponents.MechanicalPart;
import domain.aps.mechanicalcomponents.Ramp;

import domain.as.ComponentRepository.Component;

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
 * @see domain.aps.components.ComponentsPackage
 * @generated
 */
public class ComponentsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ComponentsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentsSwitch() {
		if (modelPackage == null) {
			modelPackage = ComponentsPackage.eINSTANCE;
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
			case ComponentsPackage.POWER_SUPPLY: {
				PowerSupply powerSupply = (PowerSupply)theEObject;
				T result = casePowerSupply(powerSupply);
				if (result == null) result = caseComponent(powerSupply);
				if (result == null) result = caseInterface(powerSupply);
				if (result == null) result = caseEntity(powerSupply);
				if (result == null) result = caseIdentifier(powerSupply);
				if (result == null) result = caseNamedElement(powerSupply);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.CONVEYOR_BELT: {
				ConveyorBelt conveyorBelt = (ConveyorBelt)theEObject;
				T result = caseConveyorBelt(conveyorBelt);
				if (result == null) result = caseComponent(conveyorBelt);
				if (result == null) result = caseEntity(conveyorBelt);
				if (result == null) result = caseIdentifier(conveyorBelt);
				if (result == null) result = caseNamedElement(conveyorBelt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.FIXTURE: {
				Fixture fixture = (Fixture)theEObject;
				T result = caseFixture(fixture);
				if (result == null) result = caseComponent(fixture);
				if (result == null) result = caseEntity(fixture);
				if (result == null) result = caseIdentifier(fixture);
				if (result == null) result = caseNamedElement(fixture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.PIPE: {
				Pipe pipe = (Pipe)theEObject;
				T result = casePipe(pipe);
				if (result == null) result = caseComponent(pipe);
				if (result == null) result = caseEntity(pipe);
				if (result == null) result = caseIdentifier(pipe);
				if (result == null) result = caseNamedElement(pipe);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.SENSOR: {
				Sensor sensor = (Sensor)theEObject;
				T result = caseSensor(sensor);
				if (result == null) result = caseComponent(sensor);
				if (result == null) result = caseEntity(sensor);
				if (result == null) result = caseIdentifier(sensor);
				if (result == null) result = caseNamedElement(sensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.CYLINDER: {
				Cylinder cylinder = (Cylinder)theEObject;
				T result = caseCylinder(cylinder);
				if (result == null) result = caseComponent(cylinder);
				if (result == null) result = caseEntity(cylinder);
				if (result == null) result = caseIdentifier(cylinder);
				if (result == null) result = caseNamedElement(cylinder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.DISPENSER: {
				Dispenser dispenser = (Dispenser)theEObject;
				T result = caseDispenser(dispenser);
				if (result == null) result = caseComponent(dispenser);
				if (result == null) result = caseEntity(dispenser);
				if (result == null) result = caseIdentifier(dispenser);
				if (result == null) result = caseNamedElement(dispenser);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.SPLITTER: {
				Splitter splitter = (Splitter)theEObject;
				T result = caseSplitter(splitter);
				if (result == null) result = caseComponent(splitter);
				if (result == null) result = caseEntity(splitter);
				if (result == null) result = caseIdentifier(splitter);
				if (result == null) result = caseNamedElement(splitter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.MOTOR: {
				Motor motor = (Motor)theEObject;
				T result = caseMotor(motor);
				if (result == null) result = caseComponent(motor);
				if (result == null) result = caseEntity(motor);
				if (result == null) result = caseIdentifier(motor);
				if (result == null) result = caseNamedElement(motor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.CABLE: {
				Cable cable = (Cable)theEObject;
				T result = caseCable(cable);
				if (result == null) result = caseComponent(cable);
				if (result == null) result = caseEntity(cable);
				if (result == null) result = caseIdentifier(cable);
				if (result == null) result = caseNamedElement(cable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.VALVE: {
				Valve valve = (Valve)theEObject;
				T result = caseValve(valve);
				if (result == null) result = caseComponent(valve);
				if (result == null) result = caseEntity(valve);
				if (result == null) result = caseIdentifier(valve);
				if (result == null) result = caseNamedElement(valve);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.TANK: {
				Tank tank = (Tank)theEObject;
				T result = caseTank(tank);
				if (result == null) result = caseComponent(tank);
				if (result == null) result = caseEntity(tank);
				if (result == null) result = caseIdentifier(tank);
				if (result == null) result = caseNamedElement(tank);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.PUSHER: {
				Pusher pusher = (Pusher)theEObject;
				T result = casePusher(pusher);
				if (result == null) result = caseComponent(pusher);
				if (result == null) result = caseEntity(pusher);
				if (result == null) result = caseIdentifier(pusher);
				if (result == null) result = caseNamedElement(pusher);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.CORNER: {
				Corner corner = (Corner)theEObject;
				T result = caseCorner(corner);
				if (result == null) result = caseComponent(corner);
				if (result == null) result = caseEntity(corner);
				if (result == null) result = caseIdentifier(corner);
				if (result == null) result = caseNamedElement(corner);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.RACK: {
				Rack rack = (Rack)theEObject;
				T result = caseRack(rack);
				if (result == null) result = caseComponent(rack);
				if (result == null) result = caseEntity(rack);
				if (result == null) result = caseIdentifier(rack);
				if (result == null) result = caseNamedElement(rack);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.COMPRESSOR: {
				Compressor compressor = (Compressor)theEObject;
				T result = caseCompressor(compressor);
				if (result == null) result = caseComponent(compressor);
				if (result == null) result = caseEntity(compressor);
				if (result == null) result = caseIdentifier(compressor);
				if (result == null) result = caseNamedElement(compressor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.PANEL: {
				Panel panel = (Panel)theEObject;
				T result = casePanel(panel);
				if (result == null) result = caseComponent(panel);
				if (result == null) result = caseEntity(panel);
				if (result == null) result = caseIdentifier(panel);
				if (result == null) result = caseNamedElement(panel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.REGULAR_RAMP: {
				RegularRamp regularRamp = (RegularRamp)theEObject;
				T result = caseRegularRamp(regularRamp);
				if (result == null) result = caseRamp(regularRamp);
				if (result == null) result = caseMechanicalAssembly(regularRamp);
				if (result == null) result = caseComponent(regularRamp);
				if (result == null) result = caseEntity(regularRamp);
				if (result == null) result = caseIdentifier(regularRamp);
				if (result == null) result = caseNamedElement(regularRamp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.TURNING_TABLE: {
				TurningTable turningTable = (TurningTable)theEObject;
				T result = caseTurningTable(turningTable);
				if (result == null) result = caseModule(turningTable);
				if (result == null) result = caseEntity(turningTable);
				if (result == null) result = caseIdentifier(turningTable);
				if (result == null) result = caseNamedElement(turningTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.CYLINDER_PART: {
				CylinderPart cylinderPart = (CylinderPart)theEObject;
				T result = caseCylinderPart(cylinderPart);
				if (result == null) result = caseMechanicalPart(cylinderPart);
				if (result == null) result = caseComponent(cylinderPart);
				if (result == null) result = caseEntity(cylinderPart);
				if (result == null) result = caseIdentifier(cylinderPart);
				if (result == null) result = caseNamedElement(cylinderPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.MECHANICAL_ASSEMBLY: {
				MechanicalAssembly mechanicalAssembly = (MechanicalAssembly)theEObject;
				T result = caseMechanicalAssembly(mechanicalAssembly);
				if (result == null) result = caseComponent(mechanicalAssembly);
				if (result == null) result = caseEntity(mechanicalAssembly);
				if (result == null) result = caseIdentifier(mechanicalAssembly);
				if (result == null) result = caseNamedElement(mechanicalAssembly);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.SIMPLE_MOTOR: {
				SimpleMotor simpleMotor = (SimpleMotor)theEObject;
				T result = caseSimpleMotor(simpleMotor);
				if (result == null) result = caseMotor(simpleMotor);
				if (result == null) result = caseComponent(simpleMotor);
				if (result == null) result = caseEntity(simpleMotor);
				if (result == null) result = caseIdentifier(simpleMotor);
				if (result == null) result = caseNamedElement(simpleMotor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power Supply</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power Supply</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerSupply(PowerSupply object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conveyor Belt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conveyor Belt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConveyorBelt(ConveyorBelt object) {
		return null;
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
	 * Returns the result of interpreting the object as an instance of '<em>Dispenser</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dispenser</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDispenser(Dispenser object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Motor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Motor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMotor(Motor object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Tank</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tank</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTank(Tank object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pusher</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pusher</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePusher(Pusher object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Corner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Corner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorner(Corner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rack</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rack</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRack(Rack object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compressor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compressor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompressor(Compressor object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Regular Ramp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regular Ramp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegularRamp(RegularRamp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turning Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turning Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTurningTable(TurningTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cylinder Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cylinder Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCylinderPart(CylinderPart object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Simple Motor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Motor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleMotor(SimpleMotor object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Ramp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ramp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRamp(Ramp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModule(domain.as.ModuleRepository.Module object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mechanical Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mechanical Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMechanicalPart(MechanicalPart object) {
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

} //ComponentsSwitch
