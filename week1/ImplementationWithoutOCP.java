package week1;

public class ImplementationWithoutOCP {
    // This class violates OCP because every new payment type
    // requires modifying this class.

    static class PaymentProcessor {

        public void processPayment(String type) {
            if (type.equalsIgnoreCase("credit")) {
                System.out.println("Processing credit card payment...");
            } else if (type.equalsIgnoreCase("debit")) {
                System.out.println("Processing debit card payment...");
            } else if (type.equalsIgnoreCase("upi")) {
                System.out.println("Processing UPI payment...");
            }
        }
    }

    

        public static void main(String[] args) {
            PaymentProcessor processor = new PaymentProcessor();

            // Simulate different payment methods
            processor.processPayment("credit");
            processor.processPayment("debit");
            processor.processPayment("upi");

            // What if we now want to add 'wallet' or 'netbanking'?
            // We'd have to go modify the PaymentProcessor class again!
        }
    

}
