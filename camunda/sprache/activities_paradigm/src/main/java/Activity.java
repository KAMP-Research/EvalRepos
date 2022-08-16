/*
 * Copyright Camunda Services GmbH and/or licensed to Camunda Services GmbH
 * under one or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information regarding copyright
 * ownership. Camunda licenses this file to you under the Apache License,
 * Version 2.0; you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.camunda.bpm.model.bpmn.instance.paradigm.activities;

import org.camunda.bpm.model.bpmn.instance.paradigm.data.DataInputAssociation;
import org.camunda.bpm.model.bpmn.instance.paradigm.data.DataOutputAssociation;
import org.camunda.bpm.model.bpmn.instance.paradigm.flows.FlowNode;
import org.camunda.bpm.model.bpmn.instance.paradigm.messaging.InteractionNode;
import org.camunda.bpm.model.bpmn.instance.IoSpecification;
import org.camunda.bpm.model.bpmn.instance.paradigm.looping.LoopCharacteristics;
import org.camunda.bpm.model.bpmn.instance.paradigm.data.Property;
import org.camunda.bpm.model.bpmn.instance.paradigm.resources.ResourceRole;
import org.camunda.bpm.model.bpmn.instance.paradigm.flows.SequenceFlow;

import java.util.Collection;

/**
 * The BPMN activity element
 *
 * @author Sebastian Menski
 */
public interface Activity extends FlowNode, InteractionNode {

  boolean isForCompensation();

  void setForCompensation(boolean isForCompensation);

  int getStartQuantity();

  void setStartQuantity(int startQuantity);

  int getCompletionQuantity();

  void setCompletionQuantity(int completionQuantity);

  SequenceFlow getDefault();

  void setDefault(SequenceFlow defaultFlow);

  IoSpecification getIoSpecification();

  void setIoSpecification(IoSpecification ioSpecification);

  Collection<Property> getProperties();

  Collection<DataInputAssociation> getDataInputAssociations();

  Collection<DataOutputAssociation> getDataOutputAssociations();

  Collection<ResourceRole> getResourceRoles();

  LoopCharacteristics getLoopCharacteristics();

  void setLoopCharacteristics(LoopCharacteristics loopCharacteristics);
}
