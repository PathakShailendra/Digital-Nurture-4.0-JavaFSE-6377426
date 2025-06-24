import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogger {
    private static final String LOG_FILE = "test-log.txt";

    public void log(String message) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(LOG_FILE, true))) {
            writer.write(message);
            writer.newLine();
        }
    }

    public String getLogFilePath() {
        return LOG_FILE;
    }
}
