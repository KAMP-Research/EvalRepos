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
import domain.aps.electroniccomponents.Switch;

import domain.as.ComponentRepository.Component;

import domain.ppu.ppucomponents.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import paradigm.basic.Entity;
import paradigm.basic.Identifier;
import paradigm.basic.NamedElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see domain.ppu.ppucomponents.PpucomponentsPackage
 * @generated
 */
public class PpucomponentsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PpucomponentsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PpucomponentsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PpucomponentsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PpucomponentsSwitch<Adapter> modelSwitch =
		new PpucomponentsSwitch<Adapter>() {
			@Override
			public Adapter casePowerSplitter(PowerSplitter object) {
				return createPowerSplitterAdapter();
			}
			@Override
			public Adapter caseOpticalSensor(OpticalSensor object) {
				return createOpticalSensorAdapter();
			}
			@Override
			public Adapter casePneumaticPipe(PneumaticPipe object) {
				return createPneumaticPipeAdapter();
			}
			@Override
			public Adapter casePneumaticSplitter(PneumaticSplitter object) {
				return createPneumaticSplitterAdapter();
			}
			@Override
			public Adapter caseMonostableCylinder(MonostableCylinder object) {
				return createMonostableCylinderAdapter();
			}
			@Override
			public Adapter casePresenceSensor(PresenceSensor object) {
				return createPresenceSensorAdapter();
			}
			@Override
			public Adapter caseRegularValve(RegularValve object) {
				return createRegularValveAdapter();
			}
			@Override
			public Adapter caseFrame(Frame object) {
				return createFrameAdapter();
			}
			@Override
			public Adapter caseInductiveSensor(InductiveSensor object) {
				return createInductiveSensorAdapter();
			}
			@Override
			public Adapter caseReedSwitch(ReedSwitch object) {
				return createReedSwitchAdapter();
			}
			@Override
			public Adapter caseVacuumSwitch(VacuumSwitch object) {
				return createVacuumSwitchAdapter();
			}
			@Override
			public Adapter caseProportionalCylinder(ProportionalCylinder object) {
				return createProportionalCylinderAdapter();
			}
			@Override
			public Adapter caseBistableCylinder(BistableCylinder object) {
				return createBistableCylinderAdapter();
			}
			@Override
			public Adapter caseWaterSplitter(WaterSplitter object) {
				return createWaterSplitterAdapter();
			}
			@Override
			public Adapter caseOperationPanel(OperationPanel object) {
				return createOperationPanelAdapter();
			}
			@Override
			public Adapter casePowerCable(PowerCable object) {
				return createPowerCableAdapter();
			}
			@Override
			public Adapter casePressureSensor(PressureSensor object) {
				return createPressureSensorAdapter();
			}
			@Override
			public Adapter caseBottleSeperator(BottleSeperator object) {
				return createBottleSeperatorAdapter();
			}
			@Override
			public Adapter caseController(Controller object) {
				return createControllerAdapter();
			}
			@Override
			public Adapter caseIdentifier(Identifier object) {
				return createIdentifierAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter caseComponent(Component object) {
				return createComponentAdapter();
			}
			@Override
			public Adapter caseSplitter(Splitter object) {
				return createSplitterAdapter();
			}
			@Override
			public Adapter caseSensor(Sensor object) {
				return createSensorAdapter();
			}
			@Override
			public Adapter casePipe(Pipe object) {
				return createPipeAdapter();
			}
			@Override
			public Adapter caseCylinder(Cylinder object) {
				return createCylinderAdapter();
			}
			@Override
			public Adapter caseValve(Valve object) {
				return createValveAdapter();
			}
			@Override
			public Adapter caseMechanicalAssembly(MechanicalAssembly object) {
				return createMechanicalAssemblyAdapter();
			}
			@Override
			public Adapter caseElectronicPart(ElectronicPart object) {
				return createElectronicPartAdapter();
			}
			@Override
			public Adapter caseSwitch(Switch object) {
				return createSwitchAdapter();
			}
			@Override
			public Adapter casePanel(Panel object) {
				return createPanelAdapter();
			}
			@Override
			public Adapter caseCable(Cable object) {
				return createCableAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link domain.ppu.ppucomponents.PowerSplitter <em>Power Splitter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.ppu.ppucomponents.PowerSplitter
	 * @generated
	 */
	public Adapter createPowerSplitterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.ppu.ppucomponents.OpticalSensor <em>Optical Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.ppu.ppucomponents.OpticalSensor
	 * @generated
	 */
	public Adapter createOpticalSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.ppu.ppucomponents.PneumaticPipe <em>Pneumatic Pipe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.ppu.ppucomponents.PneumaticPipe
	 * @generated
	 */
	public Adapter createPneumaticPipeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.ppu.ppucomponents.PneumaticSplitter <em>Pneumatic Splitter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.ppu.ppucomponents.PneumaticSplitter
	 * @generated
	 */
	public Adapter createPneumaticSplitterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.ppu.ppucomponents.MonostableCylinder <em>Monostable Cylinder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.ppu.ppucomponents.MonostableCylinder
	 * @generated
	 */
	public Adapter createMonostableCylinderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.ppu.ppucomponents.PresenceSensor <em>Presence Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.ppu.ppucomponents.PresenceSensor
	 * @generated
	 */
	public Adapter createPresenceSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.ppu.ppucomponents.RegularValve <em>Regular Valve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.ppu.ppucomponents.RegularValve
	 * @generated
	 */
	public Adapter createRegularValveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.ppu.ppucomponents.Frame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.ppu.ppucomponents.Frame
	 * @generated
	 */
	public Adapter createFrameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.ppu.ppucomponents.InductiveSensor <em>Inductive Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.ppu.ppucomponents.InductiveSensor
	 * @generated
	 */
	public Adapter createInductiveSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.ppu.ppucomponents.ReedSwitch <em>Reed Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.ppu.ppucomponents.ReedSwitch
	 * @generated
	 */
	public Adapter createReedSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.ppu.ppucomponents.VacuumSwitch <em>Vacuum Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.ppu.ppucomponents.VacuumSwitch
	 * @generated
	 */
	public Adapter createVacuumSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.ppu.ppucomponents.ProportionalCylinder <em>Proportional Cylinder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.ppu.ppucomponents.ProportionalCylinder
	 * @generated
	 */
	public Adapter createProportionalCylinderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.ppu.ppucomponents.BistableCylinder <em>Bistable Cylinder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.ppu.ppucomponents.BistableCylinder
	 * @generated
	 */
	public Adapter createBistableCylinderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.ppu.ppucomponents.WaterSplitter <em>Water Splitter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.ppu.ppucomponents.WaterSplitter
	 * @generated
	 */
	public Adapter createWaterSplitterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.ppu.ppucomponents.OperationPanel <em>Operation Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.ppu.ppucomponents.OperationPanel
	 * @generated
	 */
	public Adapter createOperationPanelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.ppu.ppucomponents.PowerCable <em>Power Cable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.ppu.ppucomponents.PowerCable
	 * @generated
	 */
	public Adapter createPowerCableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.ppu.ppucomponents.PressureSensor <em>Pressure Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.ppu.ppucomponents.PressureSensor
	 * @generated
	 */
	public Adapter createPressureSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.ppu.ppucomponents.BottleSeperator <em>Bottle Seperator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.ppu.ppucomponents.BottleSeperator
	 * @generated
	 */
	public Adapter createBottleSeperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.ppu.ppucomponents.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.ppu.ppucomponents.Controller
	 * @generated
	 */
	public Adapter createControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link paradigm.basic.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see paradigm.basic.Identifier
	 * @generated
	 */
	public Adapter createIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link paradigm.basic.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see paradigm.basic.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link paradigm.basic.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see paradigm.basic.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.as.ComponentRepository.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.as.ComponentRepository.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.aps.components.Splitter <em>Splitter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.aps.components.Splitter
	 * @generated
	 */
	public Adapter createSplitterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.aps.components.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.aps.components.Sensor
	 * @generated
	 */
	public Adapter createSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.aps.components.Pipe <em>Pipe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.aps.components.Pipe
	 * @generated
	 */
	public Adapter createPipeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.aps.components.Cylinder <em>Cylinder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.aps.components.Cylinder
	 * @generated
	 */
	public Adapter createCylinderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.aps.components.Valve <em>Valve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.aps.components.Valve
	 * @generated
	 */
	public Adapter createValveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.aps.components.MechanicalAssembly <em>Mechanical Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.aps.components.MechanicalAssembly
	 * @generated
	 */
	public Adapter createMechanicalAssemblyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.aps.electroniccomponents.ElectronicPart <em>Electronic Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.aps.electroniccomponents.ElectronicPart
	 * @generated
	 */
	public Adapter createElectronicPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.aps.electroniccomponents.Switch <em>Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.aps.electroniccomponents.Switch
	 * @generated
	 */
	public Adapter createSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.aps.components.Panel <em>Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.aps.components.Panel
	 * @generated
	 */
	public Adapter createPanelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.aps.components.Cable <em>Cable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.aps.components.Cable
	 * @generated
	 */
	public Adapter createCableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PpucomponentsAdapterFactory
