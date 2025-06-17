package week1;

public class ImplenmentationWithoutDIP {
    static class Keyboard {
        public void input() {
            System.out.println("Keyboard input received.");
        }
    }

    static class Computer {
        private Keyboard keyboard = new Keyboard(); // tightly coupled

        public void useInputDevice() {
            keyboard.input();
        }
    }


        public static void main(String[] args) {
            Computer pc = new Computer();
            pc.useInputDevice(); // Works only with Keyboard
        }

}
