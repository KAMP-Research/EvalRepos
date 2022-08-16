package smartgrid.attackersimulation.strategies;

import java.util.ArrayDeque;

import output.Cluster;
import output.On;

public class DFSStrategy extends SingleStepAttackStrategies {

    public DFSStrategy(final boolean ignoreLogicalConnections, final int hackingSpeed) {
        super(ignoreLogicalConnections, hackingSpeed);
    }

    private int dfsHacking(final Cluster cluster, final On node, int hackCount, On lastNode) {
    	
    	int noUnHackedElements = 0;
    	for (On clusterNode : cluster.getHasEntities()) {
    		if (!clusterNode.isIsHacked())
    			noUnHackedElements ++;
    	}
    	if (noUnHackedElements < hackCount)
    		hackCount = noUnHackedElements;
    	
    	
        if (!node.isIsHacked()) {
            node.setIsHacked(true);
            hackCount --;
        }
        
        if (hackCount <= 0) {
            return 0;
        }
        
        final var stack = new ArrayDeque<>(this.getConnected(cluster, node));
        while (!stack.isEmpty()) {
            final var newNode = stack.pop();
            if (lastNode != null && newNode.getOwner().getName().equals(lastNode.getOwner().getName())) {
            	continue;
            }
            hackCount = this.dfsHacking(cluster, newNode, hackCount, node);
            if (hackCount <= 0) {
                break;
            }
        }
        
        return hackCount;
    }

    @Override
    public void hackNextNode(final On rootNodeState) {
        this.dfsHacking(rootNodeState.getBelongsToCluster(), rootNodeState, this.getHackingSpeed(), null);
    }

}
