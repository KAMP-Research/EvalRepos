package org.palladiosimulator.simulizar.modelobserver;

import java.util.LinkedList;

public class CtxHierarchy {
  
  private LinkedList<AssemblyContext> ctxHierarchy;

  public CtxHierarchy(List<AssemblyContext> ctxHierarchy) {
    this.ctxHierarchy = ctxHierarchy;
  }

  public List<AssemblyContext> getCtxHierarchy() {
    return ctxHierarchy;
  }

  public boolean remove(AssemblyContext ctx) {
    return ctxHierarchy.remove(ctx);
  }

  public boolean push(AssemblyContext ctx) {
    return ctxHierarchy.push(ctx);
  }
  public boolean isEmpty() {
    return ctxHierarchy.isEmpty();
  }
}
