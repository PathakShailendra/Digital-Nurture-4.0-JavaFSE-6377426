package week1;

public class ImplementationWithISP {
    public interface Walkable {
        void walk();
    }

    public interface Flyable {
        void fly();
    }

    public interface Swimmable {
        void swim();
    }

    static class Dog implements Walkable, Swimmable {
        public void walk() {
            System.out.println("Dog is walking...");
        }

        public void swim() {
            System.out.println("Dog is swimming...");
        }
    }

    static class Bird implements Walkable, Flyable {
        public void walk() {
            System.out.println("Bird is walking...");
        }

        public void fly() {
            System.out.println("Bird is flying...");
        }
    }


        public static void main(String[] args) {
            Walkable dog = new Dog();
            dog.walk();

            Swimmable swimmingDog = new Dog();
            swimmingDog.swim();

            Flyable bird = new Bird();
            bird.fly();
        }

}
