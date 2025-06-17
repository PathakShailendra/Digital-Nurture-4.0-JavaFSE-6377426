package week1;

public class ImplementationWithOCP {
    public interface Payment {
        void pay();
    }

    static class CreditCardPayment implements Payment {
        public void pay() {
            System.out.println("Processing Credit Card Payment...");
        }
    }

    static class DebitCardPayment implements Payment {
        public void pay() {
            System.out.println("Processing Debit Card Payment...");
        }
    }

    
    static class UpiPayment implements Payment {
        public void pay() {
            System.out.println("Processing UPI Payment...");
        }
    }

    static class PaymentProcessor {

        public void makePayment(Payment payment) {
            payment.pay();
        }
    }


        public static void main(String[] args) {

            PaymentProcessor processor = new PaymentProcessor();

            Payment credit = new CreditCardPayment();
            Payment debit = new DebitCardPayment();
            Payment upi = new UpiPayment();

            processor.makePayment(credit);
            processor.makePayment(debit);
            processor.makePayment(upi);
        }


}
