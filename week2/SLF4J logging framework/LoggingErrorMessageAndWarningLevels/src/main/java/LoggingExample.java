import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {

    // Creating logger instance
    private static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {

        logger.error("This is an error message — something went seriously wrong!");
        logger.warn("This is a warning — be cautious!");
        logger.info("Info message to confirm everything is okay.");
        logger.debug("Debug message for developer-level details (only visible if debug level is enabled).");

        System.out.println("✅ Logging complete! Check your console.");
    }
}
