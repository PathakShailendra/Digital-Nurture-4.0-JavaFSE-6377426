import org.junit.jupiter.api.*;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

class FileLoggerTest {

    private FileLogger logger;
    private File logFile;

    @BeforeEach
    void setUp() {
        logger = new FileLogger();
        logFile = new File(logger.getLogFilePath());
        System.out.println("Setting up logger...");
    }

    @AfterEach
    void tearDown() {
        if (logFile.exists()) {
            boolean deleted = logFile.delete();
            System.out.println("Cleaning up log file: " + (deleted ? "Deleted ✅" : "Failed ❌"));
        }
    }

    @Test
    void testLoggingToFile() throws IOException {
        // Act
        logger.log("JUnit teardown test");

        // Assert
        assertTrue(logFile.exists());
        BufferedReader reader = new BufferedReader(new FileReader(logFile));
        String line = reader.readLine();
        assertEquals("JUnit teardown test", line);
        reader.close();
    }

    @Test
    void testMultipleLogs() throws IOException {
        // Act
        logger.log("Line 1");
        logger.log("Line 2");

        // Assert
        BufferedReader reader = new BufferedReader(new FileReader(logFile));
        assertEquals("Line 1", reader.readLine());
        assertEquals("Line 2", reader.readLine());
        reader.close();
    }
}
