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
package org.camunda.bpm.model.bpmn.impl.instance.paradigm.artifacts;

import org.camunda.bpm.model.bpmn.instance.paradigm.artifacts.AssociationDirection;
import org.camunda.bpm.model.bpmn.instance.paradigm.artifacts.Artifact;
import org.camunda.bpm.model.bpmn.instance.paradigm.artifacts.Association;
import org.camunda.bpm.model.bpmn.instance.paradigm.core.BaseElement;
import org.camunda.bpm.model.bpmn.instance.bpmndi.BpmnEdge;
import org.camunda.bpm.model.xml.ModelBuilder;
import org.camunda.bpm.model.xml.impl.instance.ModelTypeInstanceContext;
import org.camunda.bpm.model.xml.type.ModelElementTypeBuilder;
import org.camunda.bpm.model.xml.type.attribute.Attribute;
import org.camunda.bpm.model.xml.type.reference.AttributeReference;

import static org.camunda.bpm.model.bpmn.impl.BpmnModelConstants.*;
import static org.camunda.bpm.model.xml.type.ModelElementTypeBuilder.ModelTypeInstanceProvider;

/**
 * @author Sebastian Menski
 */
public class AssociationImpl extends ArtifactImpl implements Association {

  protected static AttributeReference<BaseElement> sourceRefAttribute;
  protected static AttributeReference<BaseElement> targetRefAttribute;
  protected static Attribute<AssociationDirection> associationDirectionAttribute;

  public static void registerType(ModelBuilder modelBuilder) {
    ModelElementTypeBuilder typeBuilder = modelBuilder.defineType(Association.class, BPMN_ELEMENT_ASSOCIATION)
      .namespaceUri(BPMN20_NS)
      .extendsType(Artifact.class)
      .instanceProvider(new ModelTypeInstanceProvider<Association>() {
        public Association newInstance(ModelTypeInstanceContext instanceContext) {
          return new AssociationImpl(instanceContext);
        }
      });

    sourceRefAttribute = typeBuilder.stringAttribute(BPMN_ATTRIBUTE_SOURCE_REF)
      .required()
      .qNameAttributeReference(BaseElement.class)
      .build();

    targetRefAttribute = typeBuilder.stringAttribute(BPMN_ATTRIBUTE_TARGET_REF)
      .required()
      .qNameAttributeReference(BaseElement.class)
      .build();

    associationDirectionAttribute = typeBuilder.enumAttribute(BPMN_ATTRIBUTE_ASSOCIATION_DIRECTION, AssociationDirection.class)
      .defaultValue(AssociationDirection.None)
      .build();

    typeBuilder.build();
  }

  public AssociationImpl(ModelTypeInstanceContext instanceContext) {
    super(instanceContext);
  }

  public BaseElement getSource() {
    return sourceRefAttribute.getReferenceTargetElement(this);
  }

  public void setSource(BaseElement source) {
    sourceRefAttribute.setReferenceTargetElement(this, source);
  }

  public BaseElement getTarget() {
    return targetRefAttribute.getReferenceTargetElement(this);
  }

  public void setTarget(BaseElement target) {
    targetRefAttribute.setReferenceTargetElement(this, target);
  }

  public AssociationDirection getAssociationDirection() {
    return associationDirectionAttribute.getValue(this);
  }

  public void setAssociationDirection(AssociationDirection associationDirection) {
    associationDirectionAttribute.setValue(this, associationDirection);
  }

  public BpmnEdge getDiagramElement() {
    return (BpmnEdge) super.getDiagramElement();
  }

}
