Found 17 feature scatter 
Language Type:
output.On
is used by types:
	smartgrid.attackersimulation.strategies.AttackStrategies at positions:
 		smartgrid.attackersimulation.strategies.AttackStrategies#getConnected  26
		smartgrid.attackersimulation.strategies.AttackStrategies#hackNextNode  57

	smartgrid.helper.ScenarioModelHelper at positions:
 		smartgrid.helper.ScenarioModelHelper#getIDfromEntityOnState  176
		smartgrid.helper.ScenarioModelHelper#findEntityOnStateFromID  110
		smartgrid.helper.ScenarioModelHelper#getHackedNodes  249
		smartgrid.helper.ScenarioModelHelper#getNeighborsFromCluster  192

	smartgrid.attackersimulation.LocalHacker at positions:
 		smartgrid.attackersimulation.LocalHacker#rootNodeState  35
		smartgrid.attackersimulation.LocalHacker#rootNodeUpdate  71

	smartgrid.impactanalysis.GraphAnalyzer at positions:
 		smartgrid.impactanalysis.GraphAnalyzer#genOutputResult  346

	smartgrid.attackersimulation.strategies.BFSStrategy at positions:
 		smartgrid.attackersimulation.strategies.BFSStrategy#hackNextNode  23

	smartgrid.attackersimulation.strategies.DFSStrategy at positions:
 		smartgrid.attackersimulation.strategies.DFSStrategy#dfsHacking  14
		smartgrid.attackersimulation.strategies.DFSStrategy#hackNextNode  50

	smartgrid.attackersimulation.ViralHacker at positions:
 		smartgrid.attackersimulation.ViralHacker#getHackedNodes  82
		smartgrid.attackersimulation.ViralHacker#fullyMeshedHacking  68
		smartgrid.attackersimulation.ViralHacker#standardHacking  135
		smartgrid.attackersimulation.ViralHacker#run  98

	smartgrid.attackersimulation.strategies.FullyMeshedStrategy at positions:
 		smartgrid.attackersimulation.strategies.FullyMeshedStrategy#hackNextNode  21

Language Type:
output.Cluster
is used by types:
	smartgrid.attackersimulation.strategies.AttackStrategies at positions:
 		smartgrid.attackersimulation.strategies.AttackStrategies#getConnected  26

	smartgrid.helper.ScenarioModelHelper at positions:
 		smartgrid.helper.ScenarioModelHelper#selectRandomRoot  140
		smartgrid.helper.ScenarioModelHelper#getNeighborsFromCluster  192

	smartgrid.attackersimulation.strategies.BFSStrategy at positions:
 		smartgrid.attackersimulation.strategies.BFSStrategy#hackNextNode  23

	smartgrid.impactanalysis.GraphAnalyzer at positions:
 		smartgrid.impactanalysis.GraphAnalyzer#<init>  86
		smartgrid.impactanalysis.GraphAnalyzer#initForTesting  112
		smartgrid.impactanalysis.GraphAnalyzer#genOutputResult  346
		smartgrid.impactanalysis.GraphAnalyzer#init  505
		smartgrid.impactanalysis.GraphAnalyzer#internalToCluster  53
		smartgrid.impactanalysis.GraphAnalyzer#clusterCleaning  408

	smartgrid.attackersimulation.ViralHacker at positions:
 		smartgrid.attackersimulation.ViralHacker#getHackedNodes  82

	smartgrid.attackersimulation.strategies.DFSStrategy at positions:
 		smartgrid.attackersimulation.strategies.DFSStrategy#dfsHacking  14

	smartgrid.attackersimulation.strategies.FullyMeshedStrategy at positions:
 		smartgrid.attackersimulation.strategies.FullyMeshedStrategy#hackNextNode  21

Language Type:
input.InputPackage
is used by types:
	smartgrid.newsimcontrol.rcp.helper.EObjectsHelper at positions:
 		smartgrid.newsimcontrol.rcp.helper.EObjectsHelper#loadInput  67

	smartgrid.newsimcontrol.rcp.commands.ControllerCommand at positions:
 		smartgrid.newsimcontrol.rcp.commands.ControllerCommand#loadInput  106

Language Type:
input.ScenarioState
is used by types:
	smartgrid.newsimcontrol.rcp.helper.EObjectsHelper at positions:
 		smartgrid.newsimcontrol.rcp.helper.EObjectsHelper#loadInput  67

	smartgrid.helper.ScenarioModelHelper at positions:
 		smartgrid.helper.ScenarioModelHelper#loadInput  47

	smartgrid.newsimcontrol.rcp.commands.ControllerCommand at positions:
 		smartgrid.newsimcontrol.rcp.commands.ControllerCommand#loadInput  106

	smartgrid.impactanalysis.GraphAnalyzer at positions:
 		smartgrid.impactanalysis.GraphAnalyzer#readLogicalConnections  285
		smartgrid.impactanalysis.GraphAnalyzer#analyze  181
		smartgrid.impactanalysis.GraphAnalyzer#readStates  208
		smartgrid.impactanalysis.GraphAnalyzer#run  130
		smartgrid.impactanalysis.GraphAnalyzer#readPhysicalConnections  240

	smartgrid.model.helper.input.LoadInputModelConformityHelper at positions:
 		smartgrid.model.helper.input.LoadInputModelConformityHelper#checkInputModelConformity  22
		smartgrid.model.helper.input.LoadInputModelConformityHelper#checkInputModelConformitySimple  15
		smartgrid.model.helper.input.LoadInputModelConformityHelper#updated  114

	smartgrid.newsimcontrol.rcp.commands.GetModifiedPowerspecsCommand at positions:
 		smartgrid.newsimcontrol.rcp.commands.GetModifiedPowerspecsCommand#doCommand  41

Language Type:
topo.SmartGridTopology
is used by types:
	smartgrid.newsimcontrol.rcp.helper.EObjectsHelper at positions:
 		smartgrid.newsimcontrol.rcp.helper.EObjectsHelper#loadTopology  98

	smartgrid.helper.ScenarioModelHelper at positions:
 		smartgrid.helper.ScenarioModelHelper#genNeighborMapbyID  75
		smartgrid.helper.ScenarioModelHelper#loadScenario  36

	smartgrid.attackersimulation.LocalHacker at positions:
 		smartgrid.attackersimulation.LocalHacker#run  87

	smartgrid.impactanalysis.GraphAnalyzer at positions:
 		smartgrid.impactanalysis.GraphAnalyzer#run  130
		smartgrid.impactanalysis.GraphAnalyzer#readStates  208
		smartgrid.impactanalysis.GraphAnalyzer#readLogicalConnections  285
		smartgrid.impactanalysis.GraphAnalyzer#analyze  181
		smartgrid.impactanalysis.GraphAnalyzer#readPhysicalConnections  240

	smartgrid.newsimcontrol.rcp.commands.ControllerCommand at positions:
 		smartgrid.newsimcontrol.rcp.commands.ControllerCommand#loadTopology  126

	smartgrid.model.helper.input.LoadInputModelConformityHelper at positions:
 		smartgrid.model.helper.input.LoadInputModelConformityHelper#checkInputModelConformitySimple  15
		smartgrid.model.helper.input.LoadInputModelConformityHelper#checkInputModelConformity  22
		smartgrid.model.helper.input.LoadInputModelConformityHelper#updated  114

	smartgrid.attackersimulation.ViralHacker at positions:
 		smartgrid.attackersimulation.ViralHacker#run  98
		smartgrid.attackersimulation.ViralHacker#standardHacking  135

	smartgrid.newsimcontrol.rcp.commands.GetModifiedPowerspecsCommand at positions:
 		smartgrid.newsimcontrol.rcp.commands.GetModifiedPowerspecsCommand#doCommand  41

	smartgrid.model.helper.output.LoadOutputModelConformityHelper at positions:
 		smartgrid.model.helper.output.LoadOutputModelConformityHelper#checkOutputModelConformitySimple  16
		smartgrid.model.helper.output.LoadOutputModelConformityHelper#checkOutputModelConformity  24

Language Type:
topo.TopoPackage
is used by types:
	smartgrid.newsimcontrol.rcp.helper.EObjectsHelper at positions:
 		smartgrid.newsimcontrol.rcp.helper.EObjectsHelper#loadTopology  98

	smartgrid.newsimcontrol.rcp.commands.ControllerCommand at positions:
 		smartgrid.newsimcontrol.rcp.commands.ControllerCommand#loadTopology  126

Language Type:
graph.CommunicatingEntity
is used by types:
	smartgrid.attackersimulation.strategies.AttackStrategies at positions:
 		smartgrid.attackersimulation.strategies.AttackStrategies#getConnected  26

	smartgrid.helper.ScenarioModelHelper at positions:
 		smartgrid.helper.ScenarioModelHelper#genNeighborMapbyID  75

	smartgrid.impactanalysis.GraphAnalyzer at positions:
 		smartgrid.impactanalysis.GraphAnalyzer#readLogicalConnections  285

Language Type:
graph.LogicalCommunication
is used by types:
	smartgrid.attackersimulation.strategies.AttackStrategies at positions:
 		smartgrid.attackersimulation.strategies.AttackStrategies#getConnected  26

	smartgrid.helper.ScenarioModelHelper at positions:
 		smartgrid.helper.ScenarioModelHelper#genNeighborMapbyID  75

	smartgrid.impactanalysis.GraphAnalyzer at positions:
 		smartgrid.impactanalysis.GraphAnalyzer#readLogicalConnections  285

Language Type:
output.ScenarioResult
is used by types:
	smartgrid.helper.ScenarioModelHelper at positions:
 		smartgrid.helper.ScenarioModelHelper#selectRandomRoot  140
		smartgrid.helper.ScenarioModelHelper#findEntityOnStateFromID  110

	smartgrid.attackersimulation.LocalHacker at positions:
 		smartgrid.attackersimulation.LocalHacker#scenarioResult  39
		smartgrid.attackersimulation.LocalHacker#run  87

	smartgrid.impactanalysis.GraphAnalyzer at positions:
 		smartgrid.impactanalysis.GraphAnalyzer#genOutputResult  346
		smartgrid.impactanalysis.GraphAnalyzer#clusterCleaning  408
		smartgrid.impactanalysis.GraphAnalyzer#run  130
		smartgrid.impactanalysis.GraphAnalyzer#analyze  181

	smartgrid.attackersimulation.ViralHacker at positions:
 		smartgrid.attackersimulation.ViralHacker#run  98
		smartgrid.attackersimulation.ViralHacker#standardHacking  135
		smartgrid.attackersimulation.ViralHacker#getHackedNodes  82
		smartgrid.attackersimulation.ViralHacker#fullyMeshedHacking  68

	smartgrid.model.helper.output.LoadOutputModelConformityHelper at positions:
 		smartgrid.model.helper.output.LoadOutputModelConformityHelper#checkOutputModelConformitySimple  16
		smartgrid.model.helper.output.LoadOutputModelConformityHelper#checkOutputModelConformity  24

Language Type:
base.NamedEntity
is used by types:
	smartgrid.helper.ScenarioModelHelper at positions:
 		smartgrid.helper.ScenarioModelHelper#findEntityOnStateFromID  110
		smartgrid.helper.ScenarioModelHelper#getIDfromEntityOnState  176

	smartgrid.impactanalysis.GraphAnalyzer at positions:
 		smartgrid.impactanalysis.GraphAnalyzer#readStates  208

	smartgrid.model.helper.input.LoadInputModelConformityHelper at positions:
 		smartgrid.model.helper.input.LoadInputModelConformityHelper#updated  114
		smartgrid.model.helper.input.LoadInputModelConformityHelper#checkInputModelConformitySimple  15

	smartgrid.attackersimulation.strategies.DFSStrategy at positions:
 		smartgrid.attackersimulation.strategies.DFSStrategy#dfsHacking  14

	smartgrid.model.helper.output.LoadOutputModelConformityHelper at positions:
 		smartgrid.model.helper.output.LoadOutputModelConformityHelper#checkOutputModelConformitySimple  16

Language Type:
output.EntityState
is used by types:
	smartgrid.attackersimulation.strategies.AttackStrategies at positions:
 		smartgrid.attackersimulation.strategies.AttackStrategies#getConnected  26

	smartgrid.helper.ScenarioModelHelper at positions:
 		smartgrid.helper.ScenarioModelHelper#findEntityOnStateFromID  110
		smartgrid.helper.ScenarioModelHelper#getIDfromEntityOnState  176
		smartgrid.helper.ScenarioModelHelper#getHackedNodes  249

	smartgrid.impactanalysis.GraphAnalyzer at positions:
 		smartgrid.impactanalysis.GraphAnalyzer#genOutputResult  346

	smartgrid.attackersimulation.strategies.DFSStrategy at positions:
 		smartgrid.attackersimulation.strategies.DFSStrategy#dfsHacking  14

	smartgrid.attackersimulation.ViralHacker at positions:
 		smartgrid.attackersimulation.ViralHacker#run  98

	smartgrid.model.helper.output.LoadOutputModelConformityHelper at positions:
 		smartgrid.model.helper.output.LoadOutputModelConformityHelper#compareAndCountEntityStates  36
		smartgrid.model.helper.output.LoadOutputModelConformityHelper#getListWithoutZombies  61

Language Type:
input.PowerState
is used by types:
	smartgrid.impactanalysis.GraphAnalyzer at positions:
 		smartgrid.impactanalysis.GraphAnalyzer#externalNodeHasPower  449
		smartgrid.impactanalysis.GraphAnalyzer#initForTesting  112
		smartgrid.impactanalysis.GraphAnalyzer#powerStates  48
		smartgrid.impactanalysis.GraphAnalyzer#<init>  86
		smartgrid.impactanalysis.GraphAnalyzer#readStates  208
		smartgrid.impactanalysis.GraphAnalyzer#init  505

	smartgrid.model.helper.input.LoadInputModelConformityHelper at positions:
 		smartgrid.model.helper.input.LoadInputModelConformityHelper#getListWithoutZombiesPower  102
		smartgrid.model.helper.input.LoadInputModelConformityHelper#compareAndCountPowerStates  77
		smartgrid.model.helper.input.LoadInputModelConformityHelper#updated  114

Language Type:
input.EntityState
is used by types:
	smartgrid.impactanalysis.GraphAnalyzer at positions:
 		smartgrid.impactanalysis.GraphAnalyzer#init  505
		smartgrid.impactanalysis.GraphAnalyzer#readStates  208
		smartgrid.impactanalysis.GraphAnalyzer#externalNodeHasPower  449
		smartgrid.impactanalysis.GraphAnalyzer#clusterCleaning  408
		smartgrid.impactanalysis.GraphAnalyzer#entityStates  49
		smartgrid.impactanalysis.GraphAnalyzer#<init>  86
		smartgrid.impactanalysis.GraphAnalyzer#genOutputResult  346
		smartgrid.impactanalysis.GraphAnalyzer#externalNodeIsDestroyed  465
		smartgrid.impactanalysis.GraphAnalyzer#initForTesting  112
		smartgrid.impactanalysis.GraphAnalyzer#externalNodeIsHacked  469

	smartgrid.model.helper.input.LoadInputModelConformityHelper at positions:
 		smartgrid.model.helper.input.LoadInputModelConformityHelper#updated  114
		smartgrid.model.helper.input.LoadInputModelConformityHelper#getListWithoutZombies  64
		smartgrid.model.helper.input.LoadInputModelConformityHelper#compareAndCountEntityStates  39

Language Type:
graph.NetworkEntity
is used by types:
	smartgrid.attackersimulation.strategies.AttackStrategies at positions:
 		smartgrid.attackersimulation.strategies.AttackStrategies#getConnected  26

	smartgrid.impactanalysis.GraphAnalyzer at positions:
 		smartgrid.impactanalysis.GraphAnalyzer#externalNodeHasPower  449
		smartgrid.impactanalysis.GraphAnalyzer#readStates  208
		smartgrid.impactanalysis.GraphAnalyzer#readPhysicalConnections  240

	smartgrid.model.helper.input.LoadInputModelConformityHelper at positions:
 		smartgrid.model.helper.input.LoadInputModelConformityHelper#updated  114
		smartgrid.model.helper.input.LoadInputModelConformityHelper#compareAndCountEntityStates  39

	smartgrid.model.helper.output.LoadOutputModelConformityHelper at positions:
 		smartgrid.model.helper.output.LoadOutputModelConformityHelper#compareAndCountEntityStates  36

Language Type:
graph.PowerGridNode
is used by types:
	smartgrid.impactanalysis.GraphAnalyzer at positions:
 		smartgrid.impactanalysis.GraphAnalyzer#readStates  208
		smartgrid.impactanalysis.GraphAnalyzer#externalNodeHasPower  449

	smartgrid.model.helper.input.LoadInputModelConformityHelper at positions:
 		smartgrid.model.helper.input.LoadInputModelConformityHelper#updated  114
		smartgrid.model.helper.input.LoadInputModelConformityHelper#compareAndCountPowerStates  77

Language Type:
base.Identifier
is used by types:
	smartgrid.impactanalysis.GraphAnalyzer at positions:
 		smartgrid.impactanalysis.GraphAnalyzer#externalNodeHasPower  449
		smartgrid.impactanalysis.GraphAnalyzer#readStates  208
		smartgrid.impactanalysis.GraphAnalyzer#readPhysicalConnections  240

	smartgrid.model.helper.input.LoadInputModelConformityHelper at positions:
 		smartgrid.model.helper.input.LoadInputModelConformityHelper#compareAndCountPowerStates  77
		smartgrid.model.helper.input.LoadInputModelConformityHelper#compareAndCountEntityStates  39

	smartgrid.attackersimulation.ViralHacker at positions:
 		smartgrid.attackersimulation.ViralHacker#run  98

	smartgrid.model.helper.output.LoadOutputModelConformityHelper at positions:
 		smartgrid.model.helper.output.LoadOutputModelConformityHelper#compareAndCountEntityStates  36

Language Type:
graph.PhysicalConnection
is used by types:
	smartgrid.attackersimulation.strategies.AttackStrategies at positions:
 		smartgrid.attackersimulation.strategies.AttackStrategies#getConnected  26

	smartgrid.impactanalysis.GraphAnalyzer at positions:
 		smartgrid.impactanalysis.GraphAnalyzer#readPhysicalConnections  240

