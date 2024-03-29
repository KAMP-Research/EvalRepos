package org.palladiosimulator.simulizar.reconfiguration.storydiagrams.exploration.jobs;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.net.URL;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.palladiosimulator.simulizar.reconfiguration.storydiagrams.exploration.partition.SDMResourceSetPartition;
import org.palladiosimulator.simulizar.runconfig.SimuLizarWorkflowConfiguration;

import de.uka.ipd.sdq.workflow.jobs.CleanupFailedException;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.SequentialBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;

/**
 * Job for loading all sdm models in a specific folder into the blackboard.
 * 
 * @author Joachim Meyer
 * @author Matthias Becker
 * 
 */
public class LoadSDMModelsIntoBlackboardJob extends SequentialBlackboardInteractingJob<MDSDBlackboard> {

    public static final String STORYDIAGRAMS_FILE_EXTENSION = ".sdm";

    public static final String SDM_MODEL_PARTITION_ID = "org.palladiosimulator.simulizar.reconfiguration.sdm";

    private final String path;

    private MDSDBlackboard blackboard;

    private static final Logger LOGGER = Logger.getLogger(LoadSDMModelsIntoBlackboardJob.class);

    /**
     * Constructor
     * 
     * @param configuration
     *            the SimuCom workflow configuration.
     */
    public LoadSDMModelsIntoBlackboardJob(final SimuLizarWorkflowConfiguration configuration) {
        this.path = configuration.getReconfigurationRulesFolder();
    }

    /**
     * @see de.uka.ipd.sdq.workflow.IJob#execute(org.eclipse.core.runtime.IProgressMonitor)
     */
    @Override
    public void execute(final IProgressMonitor monitor) throws JobFailedException, UserCanceledException {

        final SDMResourceSetPartition sdmPartition = new SDMResourceSetPartition();
        this.blackboard.addPartition(SDM_MODEL_PARTITION_ID, sdmPartition);

        if (this.path != null && !(this.path.equals(""))) {

            // add file protocol only if necessary
            String filePath = this.path;
            File folder = null;
            if (!this.path.startsWith("platform:")) {
                filePath = "file:///" + filePath;

                final URI pathToSDM = URI.createURI(filePath);
                folder = new File(pathToSDM.toFileString());
            } else {
                String folderString = "";
                try {
                    final URL pathURL = FileLocator.resolve(new URL(this.path));
                    folderString = pathURL.toExternalForm().replace("file:", "");
                    folder = new File(folderString);
                } catch (final IOException e) {
                    LOGGER.warn("Folder " + folderString + " cannot be accessed.", e);
                    return;
                }
            }

            if (!folder.exists()) {
                LOGGER.warn("Folder " + folder + " does not exist. No reconfiguration rules will be loaded.");
                return;
            }
            final File[] files = folder.listFiles(new FilenameFilter() {

                @Override
                public boolean accept(final File dir, final String name) {
                    return name.endsWith(STORYDIAGRAMS_FILE_EXTENSION);
                }
            });
            if (files != null && files.length > 0) {
                for (final File file : files) {
                    sdmPartition.loadModel(URI.createFileURI(file.getPath()));
                }
            } else {
                LOGGER.info("No SDM models found, SD reconfigurations disabled.");
            }
        }

    }

    /**
     * @see de.uka.ipd.sdq.workflow.IJob#getName()
     */
    @Override
    public String getName() {
        return "Perform SDM Models Load";
    }

    /**
     * @see de.uka.ipd.sdq.workflow.IJob#rollback(org.eclipse.core.runtime.IProgressMonitor)
     */
    @Override
    public void cleanup(final IProgressMonitor monitor) throws CleanupFailedException {

    }

    /**
     * @see de.uka.ipd.sdq.workflow.IBlackboardInteractingJob#setBlackboard(de.uka.ipd.sdq.workflow.Blackboard)
     */
    @Override
    public void setBlackboard(final MDSDBlackboard blackboard) {
        this.blackboard = blackboard;
    }

}