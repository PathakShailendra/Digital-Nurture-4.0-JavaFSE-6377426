package week1;

public class ImplementationWithDIP {
    public interface InputDevice {
        void input();
    }

    static class Keyboard implements InputDevice {
        public void input() {
            System.out.println("Keyboard input received.");
        }
    }

    static class Mouse implements InputDevice {
        public void input() {
            System.out.println("Mouse input received.");
        }
    }

    static class Computer {
        private InputDevice device;

        // Constructor injection (dependency injection)
        public Computer(InputDevice device) {
            this.device = device;
        }

        public void useInputDevice() {
            device.input();
        }
    }


        public static void main(String[] args) {
            InputDevice keyboard = new Keyboard();
            InputDevice mouse = new Mouse();

            Computer pc1 = new Computer(keyboard);
            Computer pc2 = new Computer(mouse);

            pc1.useInputDevice(); // Keyboard input received.
            pc2.useInputDevice(); // Mouse input received.
        }
    
}
