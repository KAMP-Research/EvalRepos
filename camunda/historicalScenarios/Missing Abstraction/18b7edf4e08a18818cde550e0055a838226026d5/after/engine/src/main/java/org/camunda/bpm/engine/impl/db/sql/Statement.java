package org.camunda.bpm.engine.impl.db.sql;

public class Statement {
  private String statement;

  public Statement(String statement) {
    this.statement = statement;
  }
  /**
   * @return the statement
   */
  public String getStatement() {
    return statement;
  }
}
