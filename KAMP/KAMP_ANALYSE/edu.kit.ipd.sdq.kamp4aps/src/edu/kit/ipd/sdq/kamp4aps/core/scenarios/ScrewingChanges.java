package edu.kit.ipd.sdq.kamp4aps.core.scenarios;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import domain.as.Component;
import domain.as.Interface;
import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup;
import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps.core.changepropagation.InterfaceChanges;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Screwing;
import quality.as_mm.ChangePropagationDueToHardwareChange;
import quality.as_mm.ModifyComponent;
import quality.as_mm.ModifyInterface;
import quality.as_mm.ModifyModule;

public class ScrewingChanges extends InterfaceChanges {

	private Collection<Screwing> initialMarkedScrewings;
	private Map<Interface, Set<Component>> componentsToBeMarked;
	private Map<Interface, Set<Module>> modulesToBeMarked;

	public ScrewingChanges(APSArchitectureVersion v) {
		super(v);
		initialMarkedScrewings = APSArchitectureModelLookup.lookUpMarkedObjectsOfAType(version, Screwing.class);
		componentsToBeMarked = new HashMap<Interface, Set<Component>>();
		modulesToBeMarked = new HashMap<Interface, Set<Module>>();
	}

	public void addInitialMarkedScrewingsToList(
			ChangePropagationDueToHardwareChange changePropagationDueToHardwareChange) {
		for(Screwing screwing : initialMarkedScrewings){
			ModifyInterface<Interface> modifyScrewing = KAMP4aPSModificationmarksFactory.eINSTANCE.createModifyInterface();
			modifyScrewing.setAffectedElement(screwing);
			modifyScrewing.setToolderived(true);
			modifyScrewing.setId("Modify" + screwing.getId());
			changePropagationDueToHardwareChange.getInterfaceModifications().add(modifyScrewing);
		}
	}
	
	public void calculateAndMarkAffectedComponentsByScrewingChange(ChangePropagationDueToHardwareChange changePropagationDueToHardwareChange){
		List<ModifyComponent<Component>> modifyComponents = null;
		int mapHash;
		do {
			mapHash = componentsToBeMarked.hashCode();
			componentsToBeMarked = APSArchitectureModelLookup.lookUpParentComponentsOfInterfaces(initialMarkedScrewings, changePropagationDueToHardwareChange);
			modifyComponents = createModifyComponentsFromAffectedComponents(componentsToBeMarked);
			addToModifyComponentsToChangePropagation(modifyComponents, changePropagationDueToHardwareChange);
		} while (mapHash != componentsToBeMarked.hashCode());
	}
	
	public void calclulateAndMarkAffectedModulesByScrewingChange(ChangePropagationDueToHardwareChange changePropagationDueToHardwareChange){
		List<ModifyModule<Module>> modifyModules = null;
		int mapHash;
		do {
			mapHash = modulesToBeMarked.hashCode();
			modulesToBeMarked = APSArchitectureModelLookup.lookUpParentModulesOfInterfaces(initialMarkedScrewings, changePropagationDueToHardwareChange);
			modifyModules = createModifyModulesFromAffectedModules(modulesToBeMarked);
			addToModifyModulesToChangePropagation(modifyModules, changePropagationDueToHardwareChange);
		} while (mapHash != modulesToBeMarked.hashCode());
	}

}
