package week1;

public class ImplementingTheSingletonPattern {
    static class Singleton {

        // Step 1: Create a private static instance
        private static Singleton instance;

        // Step 2: Private constructor (no other class can instantiate it)
        private Singleton() {
            System.out.println("Singleton instance created.");
        }

        // Step 3: Public static method to get the instance (lazy initialization)
        public static Singleton getInstance() {
            if (instance == null) {
                instance = new Singleton();
            }
            return instance;
        }

        public void showMessage() {
            System.out.println("Hello from Singleton!");
        }
    }


        public static void main(String[] args) {
            Singleton obj1 = Singleton.getInstance();
            Singleton obj2 = Singleton.getInstance();

            obj1.showMessage();

            // Prove that both references are same
            System.out.println(obj1 == obj2); // true
        }



}
