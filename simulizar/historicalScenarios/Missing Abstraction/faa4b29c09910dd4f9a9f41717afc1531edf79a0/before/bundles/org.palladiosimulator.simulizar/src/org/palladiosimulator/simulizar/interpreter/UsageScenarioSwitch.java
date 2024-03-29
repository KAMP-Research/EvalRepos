package org.palladiosimulator.simulizar.interpreter;

import org.apache.log4j.Logger;
import softwarerepository.OperationSignature;
import behaviour.usage.AbstractUserAction;
import behaviour.usage.Branch;
import behaviour.usage.BranchTransition;
import behaviour.usage.Delay;
import softwareusage.EntryLevelSystemCall;
import behaviour.usage.Loop;
import behaviour.usage.ScenarioBehaviour;
import org.palladiosimulator.pcm.usagemodel.Start;
import softwareusage.UsageScenario;
import org.palladiosimulator.pcm.usagemodel.util.UsagemodelSwitch;
import org.palladiosimulator.simulizar.exceptions.PCMModelInterpreterException;
import org.palladiosimulator.simulizar.interpreter.listener.EventType;
import org.palladiosimulator.simulizar.interpreter.listener.ModelElementPassedEvent;
import org.palladiosimulator.simulizar.utils.SimulatedStackHelper;
import org.palladiosimulator.simulizar.utils.TransitionDeterminer;

import de.uka.ipd.sdq.simucomframework.variables.StackContext;

/**
 * Switch for Usage Scenario in Usage Model
 *
 * @author Joachim Meyer
 *
 * @param <T>
 *            return type of switch methods.
 */

public class UsageScenarioSwitch<T> extends UsagemodelSwitch<T> {

    protected static final Logger LOGGER = Logger.getLogger(UsageScenarioSwitch.class.getName());

    private final InterpreterDefaultContext context;
    private final TransitionDeterminer transitionDeterminer;

    /**
     * Constructor
     *
     * @param modelInterpreter
     *            the corresponding pcm model interpreter holding this switch..
     */
    public UsageScenarioSwitch(final InterpreterDefaultContext context) {
        this.context = context;
        this.transitionDeterminer = new TransitionDeterminer(context);
    }

    /**
     * @see org.palladiosimulator.pcm.usagemodel.util.UsagemodelSwitch#caseBranch(behaviour.usage.Branch)
     */
    @Override
    public T caseBranch(final Branch object) {
        // determine branch transition
        final BranchTransition branchTransition = this.transitionDeterminer
                .determineBranchTransition(object.getBranchTransitions_Branch());

        // interpret scenario behaviour of branch transition
        this.doSwitch(branchTransition.getBranchedBehaviour_BranchTransition());

        return super.caseBranch(object);
    }

    /**
     * @see org.palladiosimulator.pcm.usagemodel.util.UsagemodelSwitch#caseDelay(behaviour.usage.Delay)
     */
    @Override
    public T caseDelay(final Delay object) {
        // determine delay
        final double delay = StackContext.evaluateStatic(object.getTimeSpecification_Delay().getSpecification(),
                Double.class);
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("Start delay " + delay + " @ simulation time "
                    + this.context.getModel().getSimulationControl().getCurrentSimulationTime());
        }
        // hold simulation process
        this.context.getThread().hold(delay);
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("Continue user @ simulation time "
                    + this.context.getModel().getSimulationControl().getCurrentSimulationTime());
        }
        return super.caseDelay(object);
    }

    /**
     * @see org.palladiosimulator.pcm.usagemodel.util.UsagemodelSwitch#caseEntryLevelSystemCall(softwareusage.EntryLevelSystemCall)
     */
    @Override
    public T caseEntryLevelSystemCall(final EntryLevelSystemCall entryLevelSystemCall) {
        final RepositoryComponentSwitch providedDelegationSwitch = new RepositoryComponentSwitch(this.context,
                RepositoryComponentSwitch.SYSTEM_ASSEMBLY_CONTEXT,
                entryLevelSystemCall.getOperationSignature__EntryLevelSystemCall(),
                entryLevelSystemCall.getProvidedRole_EntryLevelSystemCall());

        this.context.getRuntimeState().getEventNotificationHelper()
                .firePassedEvent(new ModelElementPassedEvent<EntryLevelSystemCall>(entryLevelSystemCall,
                        EventType.BEGIN, this.context));

        // FIXME We stick to single model elements here even though several would be needed to
        // uniquely identify the measuring point of interest (system + role + signature) [Lehrig]
        this.context.getRuntimeState().getEventNotificationHelper()
                .firePassedEvent(new ModelElementPassedEvent<OperationSignature>(
                        entryLevelSystemCall.getOperationSignature__EntryLevelSystemCall(), EventType.BEGIN,
                        this.context));

        // create new stack frame for input parameter
        SimulatedStackHelper.createAndPushNewStackFrame(this.context.getStack(),
                entryLevelSystemCall.getInputParameterUsages_EntryLevelSystemCall());
        providedDelegationSwitch.doSwitch(entryLevelSystemCall.getProvidedRole_EntryLevelSystemCall());
        this.context.getStack().removeStackFrame();

        this.context.getRuntimeState().getEventNotificationHelper()
                .firePassedEvent(new ModelElementPassedEvent<EntryLevelSystemCall>(entryLevelSystemCall, EventType.END,
                        this.context));

        // FIXME We stick to single model elements here even though several would be needed to
        // uniquely identify the measuring point of interest (system + role + signature) [Lehrig]
        this.context.getRuntimeState().getEventNotificationHelper()
                .firePassedEvent(new ModelElementPassedEvent<OperationSignature>(
                        entryLevelSystemCall.getOperationSignature__EntryLevelSystemCall(), EventType.END,
                        this.context));

        return super.caseEntryLevelSystemCall(entryLevelSystemCall);
    }

    /**
     * @see org.palladiosimulator.pcm.usagemodel.util.UsagemodelSwitch#caseLoop(behaviour.usage.Loop)
     */
    @Override
    public T caseLoop(final Loop object) {
        // determine number of loops
        final int numberOfLoops = StackContext.evaluateStatic(object.getLoopIteration_Loop().getSpecification(),
                Integer.class);
        for (int i = 0; i < numberOfLoops; i++) {
            LOGGER.debug("Interpret loop number " + i);
            this.doSwitch(object.getBodyBehaviour_Loop());
            LOGGER.debug("Finished loop number " + i);

        }
        return super.caseLoop(object);
    }

    /**
     * @see org.palladiosimulator.pcm.usagemodel.util.UsagemodelSwitch#caseScenarioBehaviour(behaviour.usage.ScenarioBehaviour)
     */
    @Override
    public T caseScenarioBehaviour(final ScenarioBehaviour object) {
        // interpret start user action
        for (final AbstractUserAction abstractUserAction : object.getActions_ScenarioBehaviour()) {
            if (abstractUserAction instanceof Start) {
                this.doSwitch(abstractUserAction);
                break;
            }
        }

        return super.caseScenarioBehaviour(object);
    }

    // /**
    // * @see
    // org.palladiosimulator.pcm.usagemodel.util.UsagemodelSwitch#caseStart(org.palladiosimulator.pcm.usagemodel.Start)
    // */
    // @Override
    // public T caseStart(final Start object)
    // {
    // InterpreterLogger.debug(LOGGER, "Interpret Start: " + object);
    //
    // AbstractUserAction currentAction = object;
    //
    // InterpreterLogger.debug(LOGGER, "Follow action chain");
    // // follow action chain, beginning with start action
    // while ((currentAction = currentAction.getSuccessor()) != null)
    // {
    // this.doSwitch(currentAction);
    // }
    //
    // InterpreterLogger.debug(LOGGER, "Finished start: " + object);
    // return super.caseStart(object);
    // }

    /**
     * @see org.palladiosimulator.pcm.usagemodel.util.UsagemodelSwitch#caseAbstractUserAction(behaviour.usage.AbstractUserAction)
     */
    @Override
    public T caseAbstractUserAction(final AbstractUserAction object) {
        if (object.getSuccessor() != null) {
            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug("Interpret " + object.getSuccessor().eClass().getName() + ": " + object);
            }
            this.doSwitch(object.getSuccessor());
            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug("Finished Interpretation of " + object.getSuccessor().eClass().getName() + ": " + object);
            }
        }
        return super.caseAbstractUserAction(object);
    }

    /**
     * @see org.palladiosimulator.pcm.usagemodel.util.UsagemodelSwitch#caseUsageScenario(softwareusage.UsageScenario)
     */
    @Override
    public T caseUsageScenario(final UsageScenario usageScenario) {
        this.context.getRuntimeState().getEventNotificationHelper().firePassedEvent(
                new ModelElementPassedEvent<UsageScenario>(usageScenario, EventType.BEGIN, this.context));
        final int stacksize = this.context.getStack().size();
        this.doSwitch(usageScenario.getScenarioBehaviour_UsageScenario());
        if (this.context.getStack().size() != stacksize) {
            throw new PCMModelInterpreterException("Interpreter did not pop all pushed stackframes");
        }
        this.context.getRuntimeState().getEventNotificationHelper().firePassedEvent(
                new ModelElementPassedEvent<UsageScenario>(usageScenario, EventType.END, this.context));
        return super.caseUsageScenario(usageScenario);
    }
}
