package org.camunda.bpm.engine.query;

public class Bound {
  private int bound;

  Bound(int bound) {
    this.bound = bound;
  }

  /**
   * @return the bound
   */
  public int getBound() {
    return bound;
  }
}
