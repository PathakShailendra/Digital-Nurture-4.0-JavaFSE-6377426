package week1;

public class ImplementationWithoutISP {
    public interface Animal {
        void walk();
        void fly();
        void swim();
    }

    static class Dog implements Animal {
        public void walk() {
            System.out.println("Dog is walking...");
        }

        public void fly() {
            // ❌ Dogs can't fly!
            throw new UnsupportedOperationException("Dog can't fly!");
        }

        public void swim() {
            System.out.println("Dog is swimming...");
        }
    }


        public static void main(String[] args) {
            Animal dog = new Dog();
            dog.walk();
            dog.swim();
            dog.fly(); // ❌ Runtime error!
        }



}
