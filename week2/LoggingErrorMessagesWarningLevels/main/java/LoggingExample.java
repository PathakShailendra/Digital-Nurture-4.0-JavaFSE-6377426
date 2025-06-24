import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {

    private static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {
        logger.info("📘 INFO: Application started");

        try {
            simulateWork();
        } catch (Exception e) {
            logger.error("❌ ERROR: Exception occurred - {}", e.getMessage());
        }

        logger.warn("⚠️ WARNING: Application is using default configuration");
        logger.debug("🐞 DEBUG: Memory usage is under threshold");
        logger.info("📘 INFO: Application finished successfully");
    }

    public static void simulateWork() throws Exception {
        logger.debug("🐞 DEBUG: Inside simulateWork()");
        int result = 10 / 0; // This will cause exception
    }
}
