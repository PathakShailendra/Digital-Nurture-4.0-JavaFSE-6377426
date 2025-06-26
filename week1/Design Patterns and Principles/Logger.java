package week1;

public class Logger {
    private static Logger instance; //  Step 1: static reference

    private Logger() {              // Step 2: private constructor
        System.out.println("Logger initialized...");
    }

    public static Logger getInstance() {  //  Step 3: public getter
        if (instance == null) {
            instance = new Logger();      // Lazy initialization
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("[LOG] " + message);
    }

    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("This is the first message.");

        Logger logger2 = Logger.getInstance();
        logger2.log("This is the second message.");

        if (logger1 == logger2) {
            System.out.println("Singleton works: Both instances are the same.");
        } else {
            System.out.println("Singleton failed: Instances are different.");
        }
    }
}
