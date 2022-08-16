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
package org.camunda.bpm.model.bpmn.impl.instance.paradigm.correlations;

import org.camunda.bpm.model.bpmn.impl.instance.paradigm.core.BaseElementImpl;
import org.camunda.bpm.model.bpmn.instance.paradigm.core.BaseElement;
import org.camunda.bpm.model.bpmn.instance.paradigm.correlations.CorrelationKey;
import org.camunda.bpm.model.bpmn.instance.paradigm.correlations.CorrelationPropertyBinding;
import org.camunda.bpm.model.bpmn.instance.paradigm.correlations.CorrelationSubscription;
import org.camunda.bpm.model.xml.ModelBuilder;
import org.camunda.bpm.model.xml.impl.instance.ModelTypeInstanceContext;
import org.camunda.bpm.model.xml.type.ModelElementTypeBuilder;
import org.camunda.bpm.model.xml.type.child.ChildElementCollection;
import org.camunda.bpm.model.xml.type.child.SequenceBuilder;
import org.camunda.bpm.model.xml.type.reference.AttributeReference;

import java.util.Collection;

import static org.camunda.bpm.model.bpmn.impl.BpmnModelConstants.*;
import static org.camunda.bpm.model.xml.type.ModelElementTypeBuilder.ModelTypeInstanceProvider;

/**
 * The BPMN correlationSubscription element
 *
 * @author Sebastian Menski
 */
public class CorrelationSubscriptionImpl extends BaseElementImpl implements CorrelationSubscription {

  protected static AttributeReference<CorrelationKey> correlationKeyAttribute;
  protected static ChildElementCollection<CorrelationPropertyBinding> correlationPropertyBindingCollection;
  
  public static void registerType(ModelBuilder modelBuilder) {
    ModelElementTypeBuilder typeBuilder = modelBuilder.defineType(CorrelationSubscription.class, BPMN_ELEMENT_CORRELATION_SUBSCRIPTION)
      .namespaceUri(BPMN20_NS)
      .extendsType(BaseElement.class)
      .instanceProvider(new ModelTypeInstanceProvider<CorrelationSubscription>() {
        public CorrelationSubscription newInstance(ModelTypeInstanceContext instanceContext) {
          return new CorrelationSubscriptionImpl(instanceContext);
        }
      });

    correlationKeyAttribute = typeBuilder.stringAttribute(BPMN_ATTRIBUTE_CORRELATION_KEY_REF)
      .required()
      .qNameAttributeReference(CorrelationKey.class)
      .build();

    SequenceBuilder sequenceBuilder = typeBuilder.sequence();

    correlationPropertyBindingCollection = sequenceBuilder.elementCollection(CorrelationPropertyBinding.class)
      .build();

    typeBuilder.build();
  }

  public CorrelationSubscriptionImpl(ModelTypeInstanceContext instanceContext) {
    super(instanceContext);
  }

  public CorrelationKey getCorrelationKey() {
    return correlationKeyAttribute.getReferenceTargetElement(this);
  }

  public void setCorrelationKey(CorrelationKey correlationKey) {
    correlationKeyAttribute.setReferenceTargetElement(this, correlationKey);
  }

  public Collection<CorrelationPropertyBinding> getCorrelationPropertyBindings() {
    return correlationPropertyBindingCollection.get(this);
  }
}
