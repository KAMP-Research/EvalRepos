package edu.kit.ipd.sdq.kamp4aps.core.scenarios;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import domain.aps.components.RegularRamp;
import domain.as.Component;
import domain.as.Interface;
import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup;
import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps.core.changepropagation.ComponentChanges;
import quality.as_mm.ChangePropagationDueToHardwareChange;
import quality.as_mm.ModifyComponent;
import quality.as_mm.ModifyInterface;

public class RampChange extends ComponentChanges {

	private Collection<RegularRamp> initialMarkedRamps;
	private Map<Component, Set<Interface>> interfacesToBeMarked;
	public RampChange(APSArchitectureVersion v) {
		super(v);
		initialMarkedRamps = APSArchitectureModelLookup.lookUpMarkedObjectsOfAType(version, RegularRamp.class);
		interfacesToBeMarked = new HashMap<Component, Set<Interface>>();
	}

	// hier werden erstmal alle vom nutzer markierten rampen herausgesucht
	// und entsprechend als modifikation angelegt.
	public void addInitialMarkedRampsToList(
			ChangePropagationDueToHardwareChange changePropagationDueToHardwareChange) {
		for(RegularRamp ramp : initialMarkedRamps){
			ModifyComponent<Component> modifyRamp = KAMP4aPSModificationmarksFactory.eINSTANCE.createModifyComponent();
			modifyRamp.setAffectedElement(ramp);
			modifyRamp.setToolderived(true);
			modifyRamp.setId("Modify " + ramp.getId());
			changePropagationDueToHardwareChange.getComponentModifications().add(modifyRamp);
		}
	}
	
	// hol alle schnittstellen die mit ner rampe verbunden sind
	// und f�ge sie der liste der beeinflussten schnittstellen hinzu
	public void calculateAndMarkAffectedInterfacesByRampChange(ChangePropagationDueToHardwareChange changePropagationDueToHardwareChange){
 		List<ModifyInterface<Interface>> modifyInterfaces = null;
		int mapHash;
		do {
			mapHash = interfacesToBeMarked.hashCode();
			interfacesToBeMarked = APSArchitectureModelLookup.lookUpInterfacesOfComponents(initialMarkedRamps, changePropagationDueToHardwareChange);
			modifyInterfaces = createModifyInterfaceFromAffectedInterfaces(interfacesToBeMarked);
			addToModifyInterfacesToChangePropagation(modifyInterfaces, changePropagationDueToHardwareChange);
		} while(mapHash != interfacesToBeMarked.hashCode());
	}

	public void calculateAndMarkToFramePropagation(
			ChangePropagationDueToHardwareChange changePropagationDueToHardwareChange) {
		for (Map.Entry<Component, Set<Interface>> entry : interfacesToBeMarked.entrySet())
		{
			Map<Interface,Set<Component>> affectedComponents = APSArchitectureModelLookup.lookUpParentComponentsOfInterfaces(entry.getValue(), changePropagationDueToHardwareChange);
			for(Interface interfac : entry.getValue()){
				for(Component affectedComponent : affectedComponents.get(interfac)) {
					if(affectedComponent instanceof Frame){
						ModifyComponent<Component> modifyFrame = KAMP4aPSModificationmarksFactory.eINSTANCE.createModifyComponent();
						modifyFrame.setAffectedElement(affectedComponent);
						modifyFrame.setToolderived(true);
						modifyFrame.setId("Modify " + affectedComponent.getId());
						changePropagationDueToHardwareChange.getComponentModifications().add(modifyFrame);
					}
				}
			}

		}
	}
	
}
