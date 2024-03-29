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
package org.camunda.bpm.model.bpmn.builder;

import org.camunda.bpm.model.bpmn.BpmnModelInstance;
import org.camunda.bpm.model.bpmn.instance.bpmndi.BpmnEdge;
import org.camunda.bpm.model.bpmn.instance.bpmndi.BpmnShape;
import org.camunda.bpm.model.bpmn.instance.dc.Bounds;
import org.camunda.bpm.model.bpmn.instance.di.Waypoint;
import org.camunda.bpm.model.bpmn.instance.domain.events.advanced.BoundaryEvent;
import org.camunda.bpm.model.bpmn.instance.domain.events.advanced.ErrorEventDefinition;
import org.camunda.bpm.model.bpmn.instance.domain.events.advanced.EscalationEventDefinition;

/**
 * @author Sebastian Menski
 */
public abstract class AbstractBoundaryEventBuilder<B extends AbstractBoundaryEventBuilder<B>> extends AbstractCatchEventBuilder<B, BoundaryEvent> {
  private ErrorEventDefinitionBuilderDelegate errorEventDefinitionBuilderDelegate;

  protected AbstractBoundaryEventBuilder(BpmnModelInstance modelInstance, BoundaryEvent element, Class<?> selfType) {
    super(modelInstance, element, selfType);
    errorEventDefinitionBuilderDelegate = new ErrorEventDefinitionBuilderDelegate(modelInstance, element, selfType);
  }

  /**
   * Set if the boundary event cancels the attached activity.
   *
   * @param cancelActivity true if the boundary event cancels the activiy, false otherwise
   * @return the builder object
   */
  public B cancelActivity(Boolean cancelActivity) {
    element.setCancelActivity(cancelActivity);

    return myself;
  }



  /**
   * Creates an error event definition with an unique id
   * and returns a builder for the error event definition.
   *
   * @return the error event definition builder object
   */
  public ErrorEventDefinitionBuilder errorEventDefinition(String id) {
    ErrorEventDefinition errorEventDefinition = errorEventDefinitionBuilderDelegate.createEmptyErrorEventDefinition();
    if (id != null) {
      errorEventDefinition.setId(id);
    }

    setEventDefinition(errorEventDefinition);
    return new ErrorEventDefinitionBuilder(modelInstance, errorEventDefinition);
  }

  /**
   * Creates an error event definition
   * and returns a builder for the error event definition.
   *
   * @return the error event definition builder object
   */
  public ErrorEventDefinitionBuilder errorEventDefinition() {
    ErrorEventDefinition errorEventDefinition = errorEventDefinitionBuilderDelegate.createEmptyErrorEventDefinition();
    setEventDefinition(errorEventDefinition);
    return new ErrorEventDefinitionBuilder(modelInstance, errorEventDefinition);
  }

  private void setEventDefinition(EventDefinition errorEventDefinition) {
    element.getEventDefinitions().add(errorEventDefinition);
  }

  /**
   * Sets a catch all escalation definition.
   *
   * @return the builder object
   */
  public B escalation() {
    EscalationEventDefinition escalationEventDefinition = createInstance(EscalationEventDefinition.class);
    setEventDefinition(escalationEventDefinition);

    return myself;
  }

  /**
   * Sets an escalation definition for the given escalation code. If already an escalation
   * with this code exists it will be used, otherwise a new escalation is created.
   *
   * @param escalationCode the code of the escalation
   * @return the builder object
   */
  public B escalation(String escalationCode) {
    EscalationEventDefinition escalationEventDefinition = createEscalationEventDefinition(escalationCode);
    setEventDefinition(escalationEventDefinition);

    return myself;
  }


  @Override
  protected void setCoordinates(BpmnShape shape) {
    BpmnShape source = findBpmnShape(element);
    Bounds shapeBounds = shape.getBounds();

    double x = 0;
    double y = 0;

    if (source != null) {
      Bounds sourceBounds = source.getBounds();

      double sourceX = sourceBounds.getX();
      double sourceWidth = sourceBounds.getWidth();
      double sourceY = sourceBounds.getY();
      double sourceHeight = sourceBounds.getHeight();
      double targetHeight = shapeBounds.getHeight();

      x = sourceX + sourceWidth + SPACE / 4;
      y = sourceY + sourceHeight - targetHeight / 2 + SPACE;
    }

    shapeBounds.setX(x);
    shapeBounds.setY(y);
  }

  @Override
  protected void setWaypointsWithSourceAndTarget(BpmnEdge edge, Nodes nodes) {
    BpmnShape source = findBpmnShape(nodes.getEdgeSource());
    BpmnShape target = findBpmnShape(nodes.getEdgeTarget());

    if (source != null && target != null) {
      Bounds sourceBounds = source.getBounds();
      Bounds targetBounds = target.getBounds();

      double sourceX = sourceBounds.getX();
      double sourceY = sourceBounds.getY();
      double sourceWidth = sourceBounds.getWidth();
      double sourceHeight = sourceBounds.getHeight();

      double targetX = targetBounds.getX();
      double targetY = targetBounds.getY();
      double targetHeight = targetBounds.getHeight();

      Waypoint w1 = createInstance(Waypoint.class);
      w1.setX(sourceX + sourceWidth / 2);
      w1.setY(sourceY + sourceHeight);

      Waypoint w2 = createInstance(Waypoint.class);
      w2.setX(sourceX + sourceWidth / 2);
      w2.setY(sourceY + sourceHeight + SPACE);

      Waypoint w3 = createInstance(Waypoint.class);
      w3.setX(targetX);
      w3.setY(targetY + targetHeight / 2);

      edge.addChildElement(w1);
      edge.addChildElement(w2);
      edge.addChildElement(w3);
    }
  }
}
