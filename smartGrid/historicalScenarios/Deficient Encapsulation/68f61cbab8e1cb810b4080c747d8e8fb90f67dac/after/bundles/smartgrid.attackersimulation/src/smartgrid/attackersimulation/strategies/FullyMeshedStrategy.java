package smartgrid.attackersimulation.strategies;

import java.util.ArrayDeque;
import java.util.stream.Collectors;

import output.On;

public class FullyMeshedStrategy extends SingleStepAttackStrategies {

    public FullyMeshedStrategy(final int hackingSpeed) {
        super(true, hackingSpeed);
    }

    /**
     * hack every Node in the the given Cluster without respecting logical Connections
     *
     * @param rootNodeState
     *            state of rootNode
     */
    @Override
    public void hackNextNode(final On rootNodeState) {
        final var cluster = rootNodeState.getBelongsToCluster();
        final var entities = cluster.getHasEntities().stream().unordered().filter(e -> !e.isIsHacked())
                .collect(Collectors.toCollection(ArrayDeque::new));
        int hackCounter = 0;
        while (!entities.isEmpty() && this.checkMaxHackingOperations(hackCounter)) {
            final var node = entities.pop();
            node.setIsHacked(true);
            hackCounter++;
        }
    }

}
