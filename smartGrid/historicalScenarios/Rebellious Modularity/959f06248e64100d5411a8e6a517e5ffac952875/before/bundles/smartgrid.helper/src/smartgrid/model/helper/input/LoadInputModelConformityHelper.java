package smartgrid.model.helper.input;

import java.util.ArrayList;
import java.util.List;

import input.EntityState;
import input.PowerState;
import input.ScenarioState;
import graph.NetworkEntity;
import graph.PowerGridNode;
import topo.SmartGridTopology;

public class LoadInputModelConformityHelper {

    public static boolean checkInputModelConformitySimple(final ScenarioState state, final SmartGridTopology current) {
        if (state.getScenario() == null) {
            return true;
        }
        return state.getScenario().getName().equals(current.getName());
    }

    public static boolean checkInputModelConformity(final ScenarioState state, final SmartGridTopology current) {

        final boolean simpleConform = checkInputModelConformitySimple(state, current);

        if (simpleConform) {
            //Misha: there seems to be a bug here:
//            boolean powerStatesConform = compareAndCountPowerStates(state.getPowerStates(), current.getContainsPGN());
//            boolean entityStatesConform = compareAndCountEntityStates(state.getEntityStates(), current.getContainsNE());
//            return powerStatesConform && entityStatesConform;

            return updated(state,current);
        }

        return false;
    }

    @SuppressWarnings("unused")
	private static boolean compareAndCountEntityStates(final List<EntityState> states, final List<NetworkEntity> entities) {
        boolean result = true;

        final List<EntityState> noZombies = getListWithoutZombies(states);

        if (noZombies.size() == entities.size()) {
            for (final NetworkEntity entity : entities) {
                boolean found = false;
                for (final EntityState state : noZombies) {
                    if (state.getOwner().getId() == entity.getId()) {
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    result = false;
                }
            }
        } else {
            result = false;
        }

        return result;
    }

    private static List<EntityState> getListWithoutZombies(final List<EntityState> states) {
        final List<EntityState> noZombies = new ArrayList<>();

        for (final EntityState state : states) {
            if (state.getOwner() != null) {
                noZombies.add(state);
            }
        }

        return noZombies;
    }

    @SuppressWarnings("unused")
	private static boolean compareAndCountPowerStates(final List<PowerState> states, final List<PowerGridNode> current) {
        boolean result = true;

        final List<PowerState> noZombies = getListWithoutZombiesPower(states);

        if (noZombies.size() == current.size()) {
            for (final PowerGridNode node : current) {
                boolean found = false;
                for (final PowerState state : noZombies) {
                    if (state.getOwner().getId() == node.getId()) {
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    result = false;
                }
            }
        } else {
            result = false;
        }

        return result;
    }

    private static List<PowerState> getListWithoutZombiesPower(final List<PowerState> states) {
        final List<PowerState> noZombies = new ArrayList<>();

        for (final PowerState state : states) {
            if (state.getOwner() != null) {
                noZombies.add(state);
            }
        }

        return noZombies;
    }
    
    private static boolean updated(ScenarioState scenarioState, SmartGridTopology topology) {
        //SmartGridTopology topology = (SmartGridTopology) diagramContainer.getTarget();
        if (topology.getContainsNE().size() == scenarioState.getEntityStates().size()){ 
            for (NetworkEntity networkEntity : topology.getContainsNE()) {
                String id = networkEntity.getName();
                boolean found = false;
                for (EntityState state : scenarioState.getEntityStates()) {
                    String ownerId = state.getOwner().getName();
                    if (ownerId.equals(id)) {
                        found = true;
                        break;
                    }
                }
                if (!found)
                    return false;
            }
            for (EntityState state : scenarioState.getEntityStates()) {
                String id = state.getOwner().getName();
                boolean found = false;
                for (NetworkEntity networkEntity : topology.getContainsNE()) {
                    String ownerId = networkEntity.getName();
                    if (ownerId.equals(id)) {
                        found = true;
                        break;
                    }
                }
                if (!found)
                    return false;
            }
        } else {
            return false;
        }
        
        if (topology.getContainsPGN().size() == scenarioState.getPowerStates().size()){
            for (PowerGridNode powerGridNode : topology.getContainsPGN()) {
                String id = powerGridNode.getName();
                boolean found = false;
                for (PowerState state : scenarioState.getPowerStates()) {
                    String ownerId = state.getOwner().getName();
                    if (ownerId.equals(id)) {
                        found = true;
                        break;
                    }
                }
                if (!found)
                    return false;
            }
            for (PowerState state : scenarioState.getPowerStates()) {
                String id = state.getOwner().getName();
                boolean found = false;
                for (PowerGridNode powerGridNode : topology.getContainsPGN()) {
                    String ownerId = powerGridNode.getName();
                    if (ownerId.equals(id)) {
                        found = true;
                        break;
                    }
                }
                if (!found)
                    return false;
            }
        } else {
            return false;
        }
        return true;
    }
}
