Report [description=Found 4 feature scatter 
Language Type:
org.camunda.bpm.model.bpmn.BpmnModelInstance
is used by types:
	org.camunda.bpm.engine.impl.persistence.entity.TaskEntity at positions:
 		org.camunda.bpm.engine.impl.persistence.entity.TaskEntity#getBpmnModelInstance  487
		org.camunda.bpm.engine.impl.persistence.entity.TaskEntity#getBpmnModelElementInstance  470

	org.camunda.bpm.engine.impl.cmd.DeployCmd at positions:
 		org.camunda.bpm.engine.impl.cmd.DeployCmd#parseProcessDefinitionKeys  507

	org.camunda.bpm.engine.impl.test.AbstractProcessEngineTestCase at positions:
 		org.camunda.bpm.engine.impl.test.AbstractProcessEngineTestCase#deployment  440
		org.camunda.bpm.engine.impl.test.AbstractProcessEngineTestCase#deployment  470
		org.camunda.bpm.engine.impl.test.AbstractProcessEngineTestCase#deploymentForTenant  452
		org.camunda.bpm.engine.impl.test.AbstractProcessEngineTestCase#deploymentForTenant  464

	org.camunda.bpm.engine.impl.RepositoryServiceImpl at positions:
 		org.camunda.bpm.engine.impl.RepositoryServiceImpl#getBpmnModelInstance  299

	org.camunda.bpm.engine.repository.ProcessApplicationDeploymentBuilder at positions:
 		org.camunda.bpm.engine.repository.ProcessApplicationDeploymentBuilder#addModelInstance  72

	org.camunda.bpm.engine.impl.persistence.entity.ExecutionEntity at positions:
 		org.camunda.bpm.engine.impl.persistence.entity.ExecutionEntity#getBpmnModelInstance  1941
		org.camunda.bpm.engine.impl.persistence.entity.ExecutionEntity#getBpmnModelElementInstance  1916

	org.camunda.bpm.engine.impl.ProcessDefinitionQueryImpl at positions:
 		org.camunda.bpm.engine.impl.ProcessDefinitionQueryImpl#addProcessDefinitionToCacheAndRetrieveDocumentation  387

	org.camunda.bpm.engine.impl.pvm.runtime.ExecutionImpl at positions:
 		org.camunda.bpm.engine.impl.pvm.runtime.ExecutionImpl#getBpmnModelInstance  331

	org.camunda.bpm.engine.RepositoryService at positions:
 		org.camunda.bpm.engine.RepositoryService#getBpmnModelInstance  584

	org.camunda.bpm.engine.impl.persistence.deploy.cache.BpmnModelInstanceCache at positions:
 		org.camunda.bpm.engine.impl.persistence.deploy.cache.BpmnModelInstanceCache#readModelFromStream  46

	org.camunda.bpm.engine.impl.repository.ProcessApplicationDeploymentBuilderImpl at positions:
 		org.camunda.bpm.engine.impl.repository.ProcessApplicationDeploymentBuilderImpl#addModelInstance  87

	org.camunda.bpm.engine.impl.persistence.deploy.cache.DeploymentCache at positions:
 		org.camunda.bpm.engine.impl.persistence.deploy.cache.DeploymentCache#purgeCache  338
		org.camunda.bpm.engine.impl.persistence.deploy.cache.DeploymentCache#getBpmnModelInstanceCache  278
		org.camunda.bpm.engine.impl.persistence.deploy.cache.DeploymentCache#findBpmnModelInstanceForProcessDefinition  112
		org.camunda.bpm.engine.impl.persistence.deploy.cache.DeploymentCache#findBpmnModelInstanceForProcessDefinition  116

	org.camunda.bpm.engine.impl.repository.DeploymentBuilderImpl at positions:
 		org.camunda.bpm.engine.impl.repository.DeploymentBuilderImpl#addModelInstance  120

	org.camunda.bpm.engine.delegate.BpmnModelExecutionContext at positions:
 		org.camunda.bpm.engine.delegate.BpmnModelExecutionContext#getBpmnModelInstance  39

	org.camunda.bpm.engine.impl.cmd.GetDeploymentBpmnModelInstanceCmd at positions:
 		org.camunda.bpm.engine.impl.cmd.GetDeploymentBpmnModelInstanceCmd#execute  52

	org.camunda.bpm.engine.repository.DeploymentBuilder at positions:
 		org.camunda.bpm.engine.repository.DeploymentBuilder#addModelInstance  80

Language Type:
org.camunda.bpm.model.bpmn.instance.domain.humaninteraction.UserTask
is used by types:
	org.camunda.bpm.engine.impl.persistence.entity.TaskEntity at positions:
 		org.camunda.bpm.engine.impl.persistence.entity.TaskEntity#getBpmnModelElementInstance  470

	org.camunda.bpm.engine.delegate.DelegateTask at positions:
 		org.camunda.bpm.engine.delegate.DelegateTask#getBpmnModelElementInstance  185

Language Type:
org.camunda.bpm.model.bpmn.instance.paradigm.flows.FlowElement
is used by types:
	org.camunda.bpm.engine.impl.persistence.entity.ExecutionEntity at positions:
 		org.camunda.bpm.engine.impl.persistence.entity.ExecutionEntity#getBpmnModelElementInstance  1916

	org.camunda.bpm.engine.impl.pvm.runtime.ExecutionImpl at positions:
 		org.camunda.bpm.engine.impl.pvm.runtime.ExecutionImpl#getBpmnModelElementInstance  327

	org.camunda.bpm.engine.delegate.BpmnModelExecutionContext at positions:
 		org.camunda.bpm.engine.delegate.BpmnModelExecutionContext#getBpmnModelElementInstance  51

Language Type:
org.camunda.bpm.model.bpmn.Bpmn
is used by types:
	org.camunda.bpm.engine.impl.persistence.deploy.cache.BpmnModelInstanceCache at positions:
 		org.camunda.bpm.engine.impl.persistence.deploy.cache.BpmnModelInstanceCache#readModelFromStream  46

	org.camunda.bpm.engine.impl.cmd.DeployCmd at positions:
 		org.camunda.bpm.engine.impl.cmd.DeployCmd#parseProcessDefinitionKeys  507

	org.camunda.bpm.engine.impl.repository.DeploymentBuilderImpl at positions:
 		org.camunda.bpm.engine.impl.repository.DeploymentBuilderImpl#addModelInstance  120

, smellFound=true, solutions=[], text=Feature Scatter Analyzer on type level]