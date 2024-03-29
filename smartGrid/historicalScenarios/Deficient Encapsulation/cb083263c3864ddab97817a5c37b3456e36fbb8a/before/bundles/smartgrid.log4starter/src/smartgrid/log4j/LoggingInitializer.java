package smartgrid.log4j;

import java.net.URL;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public final class LoggingInitializer {

    private static final Logger LOG = Logger.getLogger(LoggingInitializer.class);
    private static boolean isInitialized = false;

    private LoggingInitializer() {
    }

    public static synchronized void initialize() {
        if (!isInitialized) {
            final URL url = LoggingInitializer.class.getResource("/log4j/log4j.properties");
            PropertyConfigurator.configure(url);
            LOG.debug("Log4j Logger initialized");
            isInitialized = true;
        }
    }
}
