package week1;

public class ImplementationWithoutLSP {
    static class Bird {
        public void fly() {
            System.out.println("Bird is flying...");
        }
    }

    static class Ostrich extends Bird {
        @Override
        public void fly() {
            // Ostriches can't fly!
            throw new UnsupportedOperationException("Ostrich can't fly!");
        }
    }


        public static void main(String[] args) {
            Bird genericBird = new Bird();
            genericBird.fly(); // ✅ Works fine

            Bird ostrich = new Ostrich();
            ostrich.fly(); // ❌ Runtime exception: breaks LSP!
        }


}
