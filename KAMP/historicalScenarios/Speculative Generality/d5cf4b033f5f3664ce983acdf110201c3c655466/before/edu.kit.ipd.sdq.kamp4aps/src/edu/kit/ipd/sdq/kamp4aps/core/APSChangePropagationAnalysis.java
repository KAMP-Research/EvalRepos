package edu.kit.ipd.sdq.kamp4aps.core;

import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup.BusComponentsParams;
import edu.kit.ipd.sdq.kamp4aps.core.changepropagation.ComponentChanges;
import edu.kit.ipd.sdq.kamp4aps.core.changepropagation.InterfaceChanges;
import edu.kit.ipd.sdq.kamp4aps.core.changepropagation.ModuleChanges;
import edu.kit.ipd.sdq.kamp4aps.core.changepropagation.StructureChanges;
import edu.kit.ipd.sdq.kamp4aps.core.scenarios.BusChanges;
import edu.kit.ipd.sdq.kamp4aps.core.scenarios.RampChange;
import edu.kit.ipd.sdq.kamp4aps.core.scenarios.ScrewingChanges;
import edu.kit.ipd.sdq.kamp4aps.core.scenarios.SensorChanges;
import edu.kit.ipd.sdq.kamp4aps.core.scenarios.SignalInterfacePropagation;
import edu.kit.ipd.sdq.kamp4aps.core.scenarios.SwitchChanges;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ChangePropagationDueToHardwareChange;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyBusBox;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyBusCable;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyBusMaster;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyBusSlave;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyInterface;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSModificationmarksFactory;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusBox;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusCable;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusMaster;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.BusComponents.BusSlave;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.MicroswitchModule;
import edu.kit.ipd.sdq.kamp4iec.core.IECArchitectureVersion;
import edu.kit.ipd.sdq.kamp4iec.core.IECArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp4iec.core.IECArchitectureVersion.ArchitectureVersionParams;
import edu.kit.ipd.sdq.kamp4iec.core.IECChangePropagationAnalysis;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECChangePropagationDueToDataDependency;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModificationmarksFactory;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyAbstractMethod;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyAbstractProperty;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyConfiguration;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyFunction;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyFunctionBlock;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyGlobalVariable;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyInterface;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyMethod;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyProgram;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyProperty;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECComponent;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Sensor;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Interface;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.PhysicalConnection;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.SignalInterface;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationStep;
import edu.kit.ipd.sdq.kamp.propagation.AbstractChangePropagationAnalysis;
/**
 * The change propagation analysis of KAMP4APS
 * 1. determines a seed population of affected components (resp. provided roles)
 * 2. calculates in iterations:
 *    a) inter-component propagation
 *    b) intra-component propagation
 * 3. generates internal modification marks for affected elements
 * 
 * - elements which were already part of a seed population are not further investigated
 * 
 * 
 * @author Sandro Koch
 *
 */
public class APSChangePropagationAnalysis implements AbstractChangePropagationAnalysis<APSArchitectureVersion> {

	private ChangePropagationDueToHardwareChange changePropagationDueToHardwareChange;
	private IECChangePropagationDueToDataDependency changePropagationDueToDataDependency;
	private SensorChanges scenarioZero;
	private SwitchChanges scenarioOne;
	private BusChanges scenarioTwo;
	private SignalInterfacePropagation siPropagation;
	
	@Override
	public void runChangePropagationAnalysis(APSArchitectureVersion version) {
		// Setup
		setChangePropagationDueToHardwareChange(KAMP4aPSModificationmarksFactory.eINSTANCE.createChangePropagationDueToHardwareChange());
		setChangePropagationDueToDataDependency(IECModificationmarksFactory.eINSTANCE.createIECChangePropagationDueToDataDependency());
		//remove old modifications from KAMP4IEC
		for (Iterator<ChangePropagationStep> it = version.getIECModificationMarkRepository().getChangePropagationSteps().iterator(); it.hasNext(); ) {
			ChangePropagationStep step = it.next();
			it.remove();
		}
		
		// Calculate
		do {
			changePropagationDueToHardwareChange.setChanged(false);
			calculateAndMarkFromStructurePropagation(version);
			calculateAndMarkFromModulePropagation(version);
			calculateAndMarkFromComponentPropagation(version);
			calculateAndMarkFromInterfacePropagation(version);
			addAllChangePropagations(version);
		} while(changePropagationDueToHardwareChange.isChanged());
//		calculateAndMarkRampChanges(version);
//		calculateAndMarkScrewingChanges(version);
		
		// Update
		
		IECArchitectureVersion iecVersion = APSArchitectureVersion.extractIECArchitecture(version);
		if(iecVersion.getModificationMarkRepository() != null && iecVersion.getConfiguration() != null) {
			IECChangePropagationAnalysis iecAnalysis = new IECChangePropagationAnalysis();
			List<IECComponent> iecSeed = new LinkedList<>();
			for(IECModifyGlobalVariable mod : changePropagationDueToDataDependency.getGlobalVariableModifications()) {
				iecSeed.add(mod.getAffectedElement());
			}
			iecAnalysis.setSeedModifications(iecSeed);
			
			iecAnalysis.runChangePropagationAnalysis(iecVersion);
		}
	}

	private void calculateAndMarkScrewingChanges(APSArchitectureVersion version) {
		ScrewingChanges sc = new ScrewingChanges(version);
		sc.addInitialMarkedScrewingsToList(changePropagationDueToHardwareChange);
		sc.calculateAndMarkAffectedComponentsByScrewingChange(changePropagationDueToHardwareChange);
		sc.calclulateAndMarkAffectedModulesByScrewingChange(changePropagationDueToHardwareChange);
	}

	private void calculateAndMarkRampChanges(APSArchitectureVersion version) {
		RampChange rc = new RampChange(version);
		rc.addInitialMarkedModulesToList(changePropagationDueToHardwareChange);
		rc.calculateAndMarkAffectedInterfacesByRampChange(changePropagationDueToHardwareChange);
		rc.calculateAndMarkToFramePropagation(changePropagationDueToHardwareChange);
	}

	private void calculateAndMarkFromStructurePropagation(APSArchitectureVersion version) {
		StructureChanges sc = new StructureChanges(version);
		sc.addInitialMarkedStructuresToList(changePropagationDueToHardwareChange);
		sc.calculateAndMarkToModulePropagation(changePropagationDueToHardwareChange);
		sc.calculateAndMarkToComponentPropagation(changePropagationDueToHardwareChange);
	}
	
	private void calculateAndMarkFromModulePropagation(APSArchitectureVersion version){
		ModuleChanges mc = new ModuleChanges(version);
		mc.addInitialMarkedModulesToList(changePropagationDueToHardwareChange);
		mc.calculateAndMarkToModulePropagation(changePropagationDueToHardwareChange);
		mc.calculateAndMarkToComponentPropagation(changePropagationDueToHardwareChange);
		mc.calculateAndMarkToInterfacePropagation(changePropagationDueToHardwareChange);
	}
	
	private void calculateAndMarkFromComponentPropagation(APSArchitectureVersion version){
		ComponentChanges cc = new ComponentChanges(version);
		cc.addInitialMarkedModulesToList(changePropagationDueToHardwareChange);
		cc.calculateAndMarkToInterfacePropagation(changePropagationDueToHardwareChange);
	}
	
	private void calculateAndMarkFromInterfacePropagation(APSArchitectureVersion version){
		InterfaceChanges ic = new InterfaceChanges(version);
		ic.addInitialMarkedInterfacesToList(changePropagationDueToHardwareChange);
		ic.calculateAndMarkToModulePropagation(changePropagationDueToHardwareChange);
		ic.calculateAndMarkToComponentPropagation(changePropagationDueToHardwareChange);
		ic.flattenAllModifyInterfaces(changePropagationDueToHardwareChange);
		ic.calculateAndMarkToGlobalVariablePropagation(changePropagationDueToHardwareChange, changePropagationDueToDataDependency);
	}

	/**
	 * Scenario 0
	 * Sensor Change
	 */
	protected void calculateAndMarkFromSensorPropagration(APSArchitectureVersion version) {
		scenarioZero = new SensorChanges(version);
		Collection<SignalInterface> signalInterfaceToChange = new ArrayList<SignalInterface>();
		Collection<PhysicalConnection> physicalConnectionToChange = new ArrayList<PhysicalConnection>();
		addSensorModifications(signalInterfaceToChange, physicalConnectionToChange);
	}

		private void addSensorModifications(Collection<SignalInterface> signalInterfaceToChange,
				Collection<PhysicalConnection> physicalConnectionToChange) {
			for (Sensor sensor : scenarioZero.getInitialMarkedSensors()) {
				scenarioZero.addSensorModificationToChangePropagation(sensor, 
						changePropagationDueToHardwareChange,
						signalInterfaceToChange,
						physicalConnectionToChange);
			}
		}
	
	/**
	 * Scenario 1
	 * Replace MicroSwitches with Potentiometers
	 */
	protected void calculateAndMarkReplacementOfMicroSwitch(APSArchitectureVersion version) {
		scenarioOne = new SwitchChanges(version);
		addMicroSwitchModifications();
	}

		private void addMicroSwitchModifications() {
			for (MicroswitchModule microswitchModule : scenarioOne.getInitialMarkedMicroswitchModules()) {
				scenarioOne.addMicroswitchModificationToChangePropagation(microswitchModule, 
						changePropagationDueToHardwareChange);			
			}
		}

	/**
	 * Scenario 2
	 * BusChange
	 */
	protected void calculateAndMarkBusBoxChange(APSArchitectureVersion version){
		scenarioTwo = new BusChanges(version);
		addBusBoxModifications(version);
	}

		private void addBusBoxModifications(APSArchitectureVersion version) {
			BusComponentsParams params = APSArchitectureModelLookup.lookUpChangesBasedOnBusModification(version, scenarioTwo.getInitialMarkedBusBoxes());
			for(BusBox busBox : params.busBoxesToChange){
				ModifyBusBox modifyBusBox = scenarioTwo.createNewModifyBusBox(busBox);
				changePropagationDueToHardwareChange.getBusBoxModifications().add(modifyBusBox);
			}
			for(BusMaster busMaster : params.busMastersToChange){
				ModifyBusMaster modifyBusMaster = scenarioTwo.createNewModifyBusMaster(busMaster, params.causingElementsOfBusMaster.get(busMaster));
				changePropagationDueToHardwareChange.getBusMasterModifications().add(modifyBusMaster);
			}
			for(BusSlave busSlave : params.busSlavesToChange){
				ModifyBusSlave modifyBusSlave = scenarioTwo.createNewModifyBusSlave(busSlave, params.causingElementsOfBusSlave.get(busSlave));
				changePropagationDueToHardwareChange.getBusSlaveModifications().add(modifyBusSlave);
			}
			for(BusCable busCable : params.busCablesToChange){
				ModifyBusCable modifyBusCable = scenarioTwo.createNewModifyBusCable(busCable, params.causingElementsOfBusCable.get(busCable));
				changePropagationDueToHardwareChange.getBusCableModifications().add(modifyBusCable);
			}
		}
		
	protected void calculateAndMarkSignalInterfaceChangen(APSArchitectureVersion version) {
		boolean hasChanged = false;
		do{
			siPropagation = new SignalInterfacePropagation(version);
			Collection<ModifyInterface<Interface>> markedInterfaceChanges = changePropagationDueToHardwareChange.getInterfaceModifications();
			Map<Component, Set<ModifyInterface<Interface>>> changes = APSArchitectureModelLookup.lookUpChangesBasedOnSignalInterfaces(version, markedInterfaceChanges);
			for(Component key : changes.keySet()){
				siPropagation.markChangesBasedOnSignalInterfaces(key, changePropagationDueToHardwareChange, hasChanged);
			}
		}while(hasChanged);
	}
			
	protected void addAllChangePropagations(APSArchitectureVersion version){
		version.getModificationMarkRepository().getChangePropagationSteps().add(changePropagationDueToHardwareChange);
	}
	
	protected void setChangePropagationDueToHardwareChange(ChangePropagationDueToHardwareChange changePropagationDueToHardwareChange) {
		this.changePropagationDueToHardwareChange = changePropagationDueToHardwareChange;
	}
	
	protected void setChangePropagationDueToDataDependency(IECChangePropagationDueToDataDependency changePropagationDueToDataDependency) {
		this.changePropagationDueToDataDependency = changePropagationDueToDataDependency;
	}


}
