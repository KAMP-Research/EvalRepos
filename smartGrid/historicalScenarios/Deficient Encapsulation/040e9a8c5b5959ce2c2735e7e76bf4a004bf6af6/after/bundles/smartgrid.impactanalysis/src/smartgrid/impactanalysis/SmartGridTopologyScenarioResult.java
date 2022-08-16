package smartgrid.attackersimulation;

import output.ScenarioResult;
import topo.SmartGridTopology;

public class SmartGridTopologyScenarioResult {
  
  private SmartGridTopology topo;
  private ScenarioResult result;

  public SmartGridTopologyScenarioResult(SmartGridTopology topo, ScenarioResult result) {
    this.topo = topo;
    this.result = result;
  }

  public SmartGridTopology getTopo() {
    return topo;
  }

  public ScenarioResult getResult() {
    return result;
  }
}
