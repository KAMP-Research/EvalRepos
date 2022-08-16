Report [description=Found 14 feature scatter 
Language Type:
paradigm.basic.Identifier
is used by types:
	edu.kit.ipd.sdq.kamp4aps.core.derivation.APSSubactivityDerivation at positions:
 		edu.kit.ipd.sdq.kamp4aps.core.derivation.APSSubactivityDerivation#generateDescription  104
		edu.kit.ipd.sdq.kamp4aps.core.derivation.APSSubactivityDerivation#deriveSubactivity  49

	edu.kit.ipd.sdq.kamp4aps.labels.LabelCustomizing at positions:
 		edu.kit.ipd.sdq.kamp4aps.labels.LabelCustomizing#customizePowerSupply  123
		edu.kit.ipd.sdq.kamp4aps.labels.LabelCustomizing#customizePowerSupply  131
		edu.kit.ipd.sdq.kamp4aps.labels.LabelCustomizing#customizeSensor  80
		edu.kit.ipd.sdq.kamp4aps.labels.LabelCustomizing#customizeBusComponent  96
		edu.kit.ipd.sdq.kamp4aps.labels.LabelCustomizing#customizePhysicalConnection  64
		edu.kit.ipd.sdq.kamp4aps.labels.LabelCustomizing#customizeMicroswitchModule  72

Language Type:
domain.ppu.ppumodules.MicroswitchModule
is used by types:
	edu.kit.ipd.sdq.kamp4aps.core.derivation.APSSubactivityDerivation at positions:
 		edu.kit.ipd.sdq.kamp4aps.core.derivation.APSSubactivityDerivation#deriveSubactivity  49

	edu.kit.ipd.sdq.kamp4aps.core.APSChangePropagationAnalysis at positions:
 		edu.kit.ipd.sdq.kamp4aps.core.APSChangePropagationAnalysis#addMicroSwitchModifications  206

	edu.kit.ipd.sdq.kamp4aps.core.scenarios.SwitchChanges at positions:
 		edu.kit.ipd.sdq.kamp4aps.core.scenarios.SwitchChanges#generateModifyMicroswitchModule  36
		edu.kit.ipd.sdq.kamp4aps.core.scenarios.SwitchChanges#getInitialMarkedMicroswitchModules  32
		edu.kit.ipd.sdq.kamp4aps.core.scenarios.SwitchChanges#addMicroswitchModificationToChangePropagation  88

	edu.kit.ipd.sdq.kamp4aps.core.scenarios.MicroSwitchModuleChange at positions:
 		edu.kit.ipd.sdq.kamp4aps.core.scenarios.MicroSwitchModuleChange#initialMarkedMicroswitches  23
		edu.kit.ipd.sdq.kamp4aps.core.scenarios.MicroSwitchModuleChange#<init>  28

	edu.kit.ipd.sdq.kamp4aps.labels.LabelCustomizing at positions:
 		edu.kit.ipd.sdq.kamp4aps.labels.LabelCustomizing#customizeMicroswitchModule  72

Language Type:
domain.aps.components.TurningTable
is used by types:
	edu.kit.ipd.sdq.kamp4aps.core.derivation.APSSubactivityDerivation at positions:
 		edu.kit.ipd.sdq.kamp4aps.core.derivation.APSSubactivityDerivation#deriveSubactivity  49

	edu.kit.ipd.sdq.kamp4aps.core.scenarios.SwitchChanges at positions:
 		edu.kit.ipd.sdq.kamp4aps.core.scenarios.SwitchChanges#generateModifyMicroswitchModule  36

Language Type:
domain.as.ComponentRepository.Component
is used by types:
	edu.kit.ipd.sdq.kamp4aps.core.derivation.APSSubactivityDerivation at positions:
 		edu.kit.ipd.sdq.kamp4aps.core.derivation.APSSubactivityDerivation#deriveSubactivity  49

	edu.kit.ipd.sdq.kamp4aps.core.scenarios.SwitchChanges at positions:
 		edu.kit.ipd.sdq.kamp4aps.core.scenarios.SwitchChanges#generateModifyMicroswitchModule  36

Language Type:
quality.as_mm.ChangePropagationDueToHardwareChange
is used by types:
	edu.kit.ipd.sdq.kamp4aps.core.APSChangePropagationAnalysis at positions:
 		edu.kit.ipd.sdq.kamp4aps.core.APSChangePropagationAnalysis#calculateAndMarkSignalInterfaceChangen  242
		edu.kit.ipd.sdq.kamp4aps.core.APSChangePropagationAnalysis#setChangePropagationDueToHardwareChange  258
		edu.kit.ipd.sdq.kamp4aps.core.APSChangePropagationAnalysis#runChangePropagationAnalysis  95
		edu.kit.ipd.sdq.kamp4aps.core.APSChangePropagationAnalysis#changePropagationDueToHardwareChange  87

	edu.kit.ipd.sdq.kamp4aps.core.scenarios.SwitchChanges at positions:
 		edu.kit.ipd.sdq.kamp4aps.core.scenarios.SwitchChanges#generateModifyMicroswitchModule  36
		edu.kit.ipd.sdq.kamp4aps.core.scenarios.SwitchChanges#addMicroswitchModificationToChangePropagation  88

	edu.kit.ipd.sdq.kamp4aps.core.scenarios.MicroSwitchModuleChange at positions:
 		edu.kit.ipd.sdq.kamp4aps.core.scenarios.MicroSwitchModuleChange#calculateAndMarkAffectedInterfacesByMicroSwitchModuleChange  59
		edu.kit.ipd.sdq.kamp4aps.core.scenarios.MicroSwitchModuleChange#calculateAndMarkAffectedComponentsByMicroSwitchModuleChange  48
		edu.kit.ipd.sdq.kamp4aps.core.scenarios.MicroSwitchModuleChange#calculateAndMarkAffectedModulesByMicroSwitchModuleChange  37

Language Type:
domain.aps.interfaces.PhysicalConnection
is used by types:
	edu.kit.ipd.sdq.kamp4aps.core.APSChangePropagationAnalysis at positions:
 		edu.kit.ipd.sdq.kamp4aps.core.APSChangePropagationAnalysis#addSensorModifications  187
		edu.kit.ipd.sdq.kamp4aps.core.APSChangePropagationAnalysis#calculateAndMarkFromSensorPropagration  180

	edu.kit.ipd.sdq.kamp4aps.labels.LabelCustomizing at positions:
 		edu.kit.ipd.sdq.kamp4aps.labels.LabelCustomizing#customizePhysicalConnection  64

Language Type:
domain.aps.components.Sensor
is used by types:
	edu.kit.ipd.sdq.kamp4aps.core.APSChangePropagationAnalysis at positions:
 		edu.kit.ipd.sdq.kamp4aps.core.APSChangePropagationAnalysis#addSensorModifications  187

	edu.kit.ipd.sdq.kamp4aps.labels.LabelCustomizing at positions:
 		edu.kit.ipd.sdq.kamp4aps.labels.LabelCustomizing#customizeSensor  80

Language Type:
domain.aps.buscomponents.BusBox
is used by types:
	edu.kit.ipd.sdq.kamp4aps.core.APSChangePropagationAnalysis at positions:
 		edu.kit.ipd.sdq.kamp4aps.core.APSChangePropagationAnalysis#addBusBoxModifications  222

	edu.kit.ipd.sdq.kamp4aps.labels.LabelCustomizing at positions:
 		edu.kit.ipd.sdq.kamp4aps.labels.LabelCustomizing#customizeBusComponent  96

Language Type:
domain.aps.buscomponents.BusMaster
is used by types:
	edu.kit.ipd.sdq.kamp4aps.core.APSChangePropagationAnalysis at positions:
 		edu.kit.ipd.sdq.kamp4aps.core.APSChangePropagationAnalysis#addBusBoxModifications  222

	edu.kit.ipd.sdq.kamp4aps.labels.LabelCustomizing at positions:
 		edu.kit.ipd.sdq.kamp4aps.labels.LabelCustomizing#customizeBusComponent  96

Language Type:
domain.aps.buscomponents.BusSlave
is used by types:
	edu.kit.ipd.sdq.kamp4aps.core.APSChangePropagationAnalysis at positions:
 		edu.kit.ipd.sdq.kamp4aps.core.APSChangePropagationAnalysis#addBusBoxModifications  222

	edu.kit.ipd.sdq.kamp4aps.labels.LabelCustomizing at positions:
 		edu.kit.ipd.sdq.kamp4aps.labels.LabelCustomizing#customizeBusComponent  96

Language Type:
domain.aps.buscomponents.BusCable
is used by types:
	edu.kit.ipd.sdq.kamp4aps.core.APSChangePropagationAnalysis at positions:
 		edu.kit.ipd.sdq.kamp4aps.core.APSChangePropagationAnalysis#addBusBoxModifications  222

	edu.kit.ipd.sdq.kamp4aps.labels.LabelCustomizing at positions:
 		edu.kit.ipd.sdq.kamp4aps.labels.LabelCustomizing#customizeBusComponent  96

Language Type:
quality.as_mm.ModifyInterface
is used by types:
	edu.kit.ipd.sdq.kamp4aps.core.APSChangePropagationAnalysis at positions:
 		edu.kit.ipd.sdq.kamp4aps.core.APSChangePropagationAnalysis#calculateAndMarkSignalInterfaceChangen  242

	edu.kit.ipd.sdq.kamp4aps.core.scenarios.SwitchChanges at positions:
 		edu.kit.ipd.sdq.kamp4aps.core.scenarios.SwitchChanges#generateModifyMicroswitchModule  36

	edu.kit.ipd.sdq.kamp4aps.core.scenarios.MicroSwitchModuleChange at positions:
 		edu.kit.ipd.sdq.kamp4aps.core.scenarios.MicroSwitchModuleChange#calculateAndMarkAffectedInterfacesByMicroSwitchModuleChange  59

	edu.kit.ipd.sdq.kamp4aps.labels.LabelCustomizing at positions:
 		edu.kit.ipd.sdq.kamp4aps.labels.LabelCustomizing#customizePhysicalConnection  64
		edu.kit.ipd.sdq.kamp4aps.labels.LabelCustomizing#customizeSignalInterface  56
		edu.kit.ipd.sdq.kamp4aps.labels.LabelCustomizing#customizePowerSupply  131
		edu.kit.ipd.sdq.kamp4aps.labels.LabelCustomizing#hasAffectedElement  143
		edu.kit.ipd.sdq.kamp4aps.labels.LabelCustomizing#customize  38

Language Type:
quality.as_mm.ModifyModule
is used by types:
	edu.kit.ipd.sdq.kamp4aps.core.scenarios.SwitchChanges at positions:
 		edu.kit.ipd.sdq.kamp4aps.core.scenarios.SwitchChanges#generateModifyMicroswitchModule  36

	edu.kit.ipd.sdq.kamp4aps.core.scenarios.MicroSwitchModuleChange at positions:
 		edu.kit.ipd.sdq.kamp4aps.core.scenarios.MicroSwitchModuleChange#calculateAndMarkAffectedModulesByMicroSwitchModuleChange  37

Language Type:
quality.as_mm.ModifyComponent
is used by types:
	edu.kit.ipd.sdq.kamp4aps.core.scenarios.MicroSwitchModuleChange at positions:
 		edu.kit.ipd.sdq.kamp4aps.core.scenarios.MicroSwitchModuleChange#calculateAndMarkAffectedComponentsByMicroSwitchModuleChange  48

	edu.kit.ipd.sdq.kamp4aps.labels.LabelCustomizing at positions:
 		edu.kit.ipd.sdq.kamp4aps.labels.LabelCustomizing#hasAffectedElement  139
		edu.kit.ipd.sdq.kamp4aps.labels.LabelCustomizing#customizeBusComponent  96
		edu.kit.ipd.sdq.kamp4aps.labels.LabelCustomizing#customizeSensor  80
		edu.kit.ipd.sdq.kamp4aps.labels.LabelCustomizing#customize  19
		edu.kit.ipd.sdq.kamp4aps.labels.LabelCustomizing#customizePowerSupply  123
		edu.kit.ipd.sdq.kamp4aps.labels.LabelCustomizing#customizeMicroswitchModule  72

, smellFound=true, solutions=[], text=Feature Scatter Analyzer on type level]