package week1;

public class ImpmentationWithLSP {
    static abstract class Bird {
        public abstract void eat();
    }

    static abstract class FlyingBird extends Bird {
        public abstract void fly();
    }

    static class Sparrow extends FlyingBird {
        @Override
        public void eat() {
            System.out.println("Sparrow is eating...");
        }

        @Override
        public void fly() {
            System.out.println("Sparrow is flying...");
        }
    }

    static class Ostrich extends Bird {
        @Override
        public void eat() {
            System.out.println("Ostrich is eating...");
        }

        // No fly method needed — so LSP is not broken
    }


        public static void main(String[] args) {
            FlyingBird sparrow = new Sparrow();
            sparrow.eat();
            sparrow.fly(); // ✅ Fine

            Bird ostrich = new Ostrich();
            ostrich.eat(); // ✅ Also fine

            // ostrich.fly(); ❌ Compile-time error — no fly method = safer design
        }
    
}
