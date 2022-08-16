package org.palladiosimulator.simulizar.usagemodel;

import org.palladiosimulator.pcm.usagemodel.Workload;
import softwareusage.UsageScenario;

public class WorkloadUseageScenario {
  
  private Workload workload;
  private UsageScenario usageScenario;

  public WorkloadUseageScenario(Workload workload, UsageScenario usageScenario) {
    this.workload = workload;
    this.usageScenario = usageScenario;
  }

  public Workload getWorkload() {
    return workload;
  }

  public UsageScenario getUsageScenario() {
    return usageScenario;
  }
}
