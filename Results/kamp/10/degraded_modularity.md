Report [description=Found 10 feature scatter 
Language Type:
domain.aps.buscomponents.BusBox
is used by types:
	edu.kit.ipd.sdq.kamp4aps.core.scenarios.BusChanges at positions:
 		edu.kit.ipd.sdq.kamp4aps.core.scenarios.BusChanges#markChangesBasedOnBusBox  81
		edu.kit.ipd.sdq.kamp4aps.core.scenarios.BusChanges#getInitialMarkedBusBoxes  31
		edu.kit.ipd.sdq.kamp4aps.core.scenarios.BusChanges#createNewModifyBusBox  45

	edu.kit.ipd.sdq.kamp4aps.core.APSChangePropagationAnalysis at positions:
 		edu.kit.ipd.sdq.kamp4aps.core.APSChangePropagationAnalysis#addBusBoxModifications  222

	edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup at positions:
 		edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup#getAllInterfacesOfMarkedBusBoxes  692
		edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup#initBusComponentParams  626
		edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup#BusComponentsParams  745
		edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup#lookUpChangesBasedOnBusModification  467
		edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup#updateBusCableCausingsByBusBoxes  499
		edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup#getAllBusBoxesInTheSystem  664

Language Type:
domain.aps.buscomponents.BusMaster
is used by types:
	edu.kit.ipd.sdq.kamp4aps.core.scenarios.BusChanges at positions:
 		edu.kit.ipd.sdq.kamp4aps.core.scenarios.BusChanges#markChangesBasedOnBusBox  81
		edu.kit.ipd.sdq.kamp4aps.core.scenarios.BusChanges#markChangesBasedOnBusSlave  182
		edu.kit.ipd.sdq.kamp4aps.core.scenarios.BusChanges#markChangesBasedOnBusMaster  131
		edu.kit.ipd.sdq.kamp4aps.core.scenarios.BusChanges#createNewModifyBusMaster  54
		edu.kit.ipd.sdq.kamp4aps.core.scenarios.BusChanges#getInitialMarkedBusMaster  34

	edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup at positions:
 		edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup#getAllInterfacesOfMarkedBusMasters  704
		edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup#initBusComponentParams  626
		edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup#getAllBusMastersInTheSystem  671
		edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup#BusComponentsParams  745
		edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup#addAllBusMastersThatAreConnectedToTheBusCables  588
		edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup#updateMastersToAdd  611
		edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup#updateBusCableCausingsByBusMasters  537

	edu.kit.ipd.sdq.kamp4aps.core.APSChangePropagationAnalysis at positions:
 		edu.kit.ipd.sdq.kamp4aps.core.APSChangePropagationAnalysis#addBusBoxModifications  222

Language Type:
domain.aps.buscomponents.BusSlave
is used by types:
	edu.kit.ipd.sdq.kamp4aps.core.scenarios.BusChanges at positions:
 		edu.kit.ipd.sdq.kamp4aps.core.scenarios.BusChanges#markChangesBasedOnBusMaster  131
		edu.kit.ipd.sdq.kamp4aps.core.scenarios.BusChanges#markChangesBasedOnBusBox  81
		edu.kit.ipd.sdq.kamp4aps.core.scenarios.BusChanges#getInitialMarkedBusSlave  37
		edu.kit.ipd.sdq.kamp4aps.core.scenarios.BusChanges#markChangesBasedOnBusSlave  182
		edu.kit.ipd.sdq.kamp4aps.core.scenarios.BusChanges#createNewModifyBusSlave  63

	edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup at positions:
 		edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup#getAllBusSlavesInTheSystem  678
		edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup#updateBusCableCausingsByBusSlaves  518
		edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup#getAllInterfacesOfMarkedBusSlaves  714
		edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup#initBusComponentParams  626
		edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup#addAllBusSlavessThatAreConnectedToTheBusCables  556
		edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup#updateSlavesToAdd  581
		edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup#BusComponentsParams  745

	edu.kit.ipd.sdq.kamp4aps.core.APSChangePropagationAnalysis at positions:
 		edu.kit.ipd.sdq.kamp4aps.core.APSChangePropagationAnalysis#addBusBoxModifications  222

Language Type:
domain.aps.buscomponents.BusCable
is used by types:
	edu.kit.ipd.sdq.kamp4aps.core.scenarios.BusChanges at positions:
 		edu.kit.ipd.sdq.kamp4aps.core.scenarios.BusChanges#markChangesBasedOnBusBox  81
		edu.kit.ipd.sdq.kamp4aps.core.scenarios.BusChanges#createNewModifyBusCable  72
		edu.kit.ipd.sdq.kamp4aps.core.scenarios.BusChanges#markChangesBasedOnBusMaster  131
		edu.kit.ipd.sdq.kamp4aps.core.scenarios.BusChanges#getInitialMarkedBusCable  41

	edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup at positions:
 		edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup#updateBusCableCausingsByBusMasters  537
		edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup#removeAllBusCablesThatAreNotConnectedToBusComponent  644
		edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup#BusComponentsParams  745
		edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup#updateBusCableCausingsByBusBoxes  499
		edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup#getAllBusCablesInTheSystem  685
		edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup#initBusComponentParams  626
		edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup#getAllInterfacesOfMarkedBusCables  724
		edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup#updateBusCableCausingsByBusSlaves  518

	edu.kit.ipd.sdq.kamp4aps.core.APSChangePropagationAnalysis at positions:
 		edu.kit.ipd.sdq.kamp4aps.core.APSChangePropagationAnalysis#addBusBoxModifications  222

Language Type:
paradigm.modificationmarks.AbstractModification
is used by types:
	edu.kit.ipd.sdq.kamp4aps.core.scenarios.BusChanges at positions:
 		edu.kit.ipd.sdq.kamp4aps.core.scenarios.BusChanges#createNewModifyBusBox  45

	edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup at positions:
 		edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup#lookUpModulesOfModules  177
		edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup#lookUpParentModulesOfModules  149
		edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup#lookUpInterfacesOfModules  237
		edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup#lookUpParentStructuresOfModules  121
		edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup#lookUpComponentsOfModules  206

Language Type:
quality.aps_mm.ModifyBusBox
is used by types:
	edu.kit.ipd.sdq.kamp4aps.core.scenarios.BusChanges at positions:
 		edu.kit.ipd.sdq.kamp4aps.core.scenarios.BusChanges#createNewModifyBusBox  45

	edu.kit.ipd.sdq.kamp4aps.core.APSChangePropagationAnalysis at positions:
 		edu.kit.ipd.sdq.kamp4aps.core.APSChangePropagationAnalysis#addBusBoxModifications  222

Language Type:
paradigm.basic.Identifier
is used by types:
	edu.kit.ipd.sdq.kamp4aps.core.scenarios.BusChanges at positions:
 		edu.kit.ipd.sdq.kamp4aps.core.scenarios.BusChanges#createNewModifyBusCable  72
		edu.kit.ipd.sdq.kamp4aps.core.scenarios.BusChanges#createNewModifyBusSlave  63
		edu.kit.ipd.sdq.kamp4aps.core.scenarios.BusChanges#createNewModifyBusMaster  54

	edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup at positions:
 		edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup#updateBusCableCausingsByBusMasters  537
		edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup#updateSlavesToAdd  581
		edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup#addAllBusMastersThatAreConnectedToTheBusCables  588
		edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup#removeAllBusCablesThatAreNotConnectedToBusComponent  644
		edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup#lookUpParentModulesOfInterfaces  359
		edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup#BusComponentsParams  745
		edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup#updateBusCableCausingsByBusBoxes  499
		edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup#updateMastersToAdd  611
		edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup#lookUpParentComponentsOfInterfaces  393
		edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup#updateBusCableCausingsByBusSlaves  518
		edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup#initBusComponentParams  626
		edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup#addAllBusSlavessThatAreConnectedToTheBusCables  556

Language Type:
domain.as.Plant
is used by types:
	edu.kit.ipd.sdq.kamp4aps.core.scenarios.BusChanges at positions:
 		edu.kit.ipd.sdq.kamp4aps.core.scenarios.BusChanges#markChangesBasedOnBusSlave  182
		edu.kit.ipd.sdq.kamp4aps.core.scenarios.BusChanges#markChangesBasedOnBusMaster  131
		edu.kit.ipd.sdq.kamp4aps.core.scenarios.BusChanges#markChangesBasedOnBusBox  81

	edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup at positions:
 		edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup#lookUpParentsOfStructures  66

Language Type:
quality.as_mm.ChangePropagationDueToHardwareChange
is used by types:
	edu.kit.ipd.sdq.kamp4aps.core.scenarios.BusChanges at positions:
 		edu.kit.ipd.sdq.kamp4aps.core.scenarios.BusChanges#markChangesBasedOnBusSlave  182
		edu.kit.ipd.sdq.kamp4aps.core.scenarios.BusChanges#markChangesBasedOnBusMaster  131
		edu.kit.ipd.sdq.kamp4aps.core.scenarios.BusChanges#markChangesBasedOnBusBox  81

	edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup at positions:
 		edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup#lookUpInterfacesOfModules  237
		edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup#lookUpComponentsOfModules  206
		edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup#lookUpModulesOfModules  177
		edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup#lookUpParentStructuresOfModules  121
		edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup#lookUpParentStructuresOfComponents  273
		edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup#lookUpParentModulesOfInterfaces  359
		edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup#lookUpGlobalVariablesOfInterfaces  425
		edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup#lookUpParentComponentsOfInterfaces  393
		edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup#lookUpInterfacesOfComponents  323
		edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup#lookUpParentModulesOfModules  149
		edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup#lookUpParentModulesOfComponents  298

	edu.kit.ipd.sdq.kamp4aps.core.APSChangePropagationAnalysis at positions:
 		edu.kit.ipd.sdq.kamp4aps.core.APSChangePropagationAnalysis#calculateAndMarkSignalInterfaceChangen  242
		edu.kit.ipd.sdq.kamp4aps.core.APSChangePropagationAnalysis#setChangePropagationDueToHardwareChange  258
		edu.kit.ipd.sdq.kamp4aps.core.APSChangePropagationAnalysis#runChangePropagationAnalysis  95
		edu.kit.ipd.sdq.kamp4aps.core.APSChangePropagationAnalysis#changePropagationDueToHardwareChange  87

Language Type:
quality.as_mm.ModifyInterface
is used by types:
	edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup at positions:
 		edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup#lookUpChangesBasedOnSignalInterfaces  448
		edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup#lookUpParentComponentsOfInterfaces  393
		edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup#lookUpParentModulesOfInterfaces  359

	edu.kit.ipd.sdq.kamp4aps.core.APSChangePropagationAnalysis at positions:
 		edu.kit.ipd.sdq.kamp4aps.core.APSChangePropagationAnalysis#calculateAndMarkSignalInterfaceChangen  242

, smellFound=true, solutions=[], text=Feature Scatter Analyzer on type level]