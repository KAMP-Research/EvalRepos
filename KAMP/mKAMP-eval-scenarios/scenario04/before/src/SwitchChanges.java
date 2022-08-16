package edu.kit.ipd.sdq.kamp4aps.core.scenarios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import edu.kit.ipd.sdq.kamp.architecture.ArchitectureModelLookup;
import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps.core.changepropagation.Change;
import quality.as_mm.ChangePropagationDueToHardwareChange;
import quality.as_mm.ModifyComponent;
import quality.as_mm.ModifyInterface;
import quality.aps_mm.ModifyMicroSwitchModule;
import quality.as_mm.ModifyModule;
import quality.aps_mm.ModifyPhysicalConnection;
import quality.as_mm.ModifyStructure;
import paradigm.modificationmarks.ModificationmarksFactory;
import domain.as.Component;
import domain.ppu.ppumodules.MicroswitchModule;
import domain.as.Module;
import domain.aps.components.TurningTable;
import domain.as.Interface;
import domain.aps.interfaces.PhysicalConnection;
import domain.as.Structure;

public class SwitchChanges extends Change {

	public SwitchChanges(APSArchitectureVersion v) {
		super(v);
	}

	public Collection<MicroswitchModule> getInitialMarkedMicroswitchModules() {
		return ArchitectureModelLookup.lookUpMarkedObjectsOfAType(version, MicroswitchModule.class);
	}

	public ModifyMicroSwitchModule generateModifyMicroswitchModule(
			MicroswitchModule microswitchModule, ChangePropagationDueToHardwareChange changePropagationDueToHardwareChange) {
		
		List<Interface> interfaces = microswitchModule.getInterfaces();
		Collection<MicroswitchModule> initialMarkedMicroswitches = getInitialMarkedMicroswitchModules();
		
		ModifyMicroSwitchModule modifyMicroSwitchModule = KAMP4aPSModificationmarksFactory.eINSTANCE
				.createModifyMicroSwitchModule();
		modifyMicroSwitchModule.setToolderived(true);
		modifyMicroSwitchModule.setAffectedElement(microswitchModule);
		modifyMicroSwitchModule.getCausingElements().addAll(initialMarkedMicroswitches);
		modifyMicroSwitchModule.setIsReplaced(true);
		
		for(Module module : version.getAPSPlant().getModuleRepository().getAllModulesInPlant()){
			if(module instanceof TurningTable){
				TurningTable tt = (TurningTable)module;
				if(microswitchModule == tt.getMicroswitchModule()){
					ModifyModule<Module> mtt = KAMP4aPSModificationmarksFactory.eINSTANCE.createModifyModule();
					mtt.setToolderived(true);
					mtt.setAffectedElement(tt);
					mtt.getCausingElements().addAll(initialMarkedMicroswitches);
					
					ModifyStructure<Structure> mcrane = KAMP4aPSModificationmarksFactory.eINSTANCE.createModifyStructure();
					mcrane.setToolderived(true);
					mcrane.setAffectedElement(tt.getTable_to_stand_on().getParent());
					mcrane.getCausingElements().addAll(initialMarkedMicroswitches);
					mcrane.getCausingElements().add(tt);
					
					if(!changePropagationDueToHardwareChange.getModuleModifications().contains(mtt))
						changePropagationDueToHardwareChange.getModuleModifications().add(mtt);
					
					if(!changePropagationDueToHardwareChange.getStructureModifications().contains(mcrane))
						changePropagationDueToHardwareChange.getStructureModifications().add(mcrane);
				}
			}
		}
		List<ModifyInterface<Interface>> modifyInterfaces = new ArrayList<ModifyInterface<Interface>>();
		for(Interface i : interfaces){
			ModifyInterface<Interface> modifyInterface = KAMP4aPSModificationmarksFactory.eINSTANCE.createModifyInterface();
			modifyInterface.setToolderived(true);
			modifyInterface.setAffectedElement(i);
			modifyInterface.getCausingElements().add(modifyMicroSwitchModule);
			modifyInterfaces.add(modifyInterface);
		}
		
		changePropagationDueToHardwareChange.getMicroSwitchModuleModifications().add(modifyMicroSwitchModule);
		for(ModifyInterface<Interface> mInterface : modifyInterfaces){
			changePropagationDueToHardwareChange.getInterfaceModifications().add(mInterface);
		}
		return modifyMicroSwitchModule;
	}
	
	public void addMicroswitchModificationToChangePropagation(MicroswitchModule microswitchModule, ChangePropagationDueToHardwareChange changePropagationDueToHardwareChange) {
		changePropagationDueToHardwareChange.getMicroSwitchModuleModifications().add(generateModifyMicroswitchModule(
				microswitchModule, changePropagationDueToHardwareChange));
	}
}
