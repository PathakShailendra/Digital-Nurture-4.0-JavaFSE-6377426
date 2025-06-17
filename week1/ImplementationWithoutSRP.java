package week1;

public class ImplementationWithoutSRP {
    // This class violates the Single Responsibility Principle (SRP)
    // because it handles more than one responsibility:
    // 1. Managing employee data
    // 2. Saving data to file
    // 3. Sending emails

    static class Employee {

        private String name;
        private int empId;

        // Constructor to initialize employee details
        public Employee(String name, int empId) {
            this.name = name;
            this.empId = empId;
        }

        // Responsibility 1: Get employee details
        public String getDetails() {
            return "Name: " + name + ", ID: " + empId;
        }

        // Responsibility 2: Save employee data to a file
        // This logic ideally should be in a separate class like 'EmployeePersistence'
        public void saveToFile() {
            System.out.println("Saving " + name + " to file...");
            // File writing logic would be implemented here
        }

        // Responsibility 3: Send email to the employee
        // This logic should be moved to a separate class like 'EmailService'
        public void sendEmail() {
            System.out.println("Sending email to " + name + "...");
            // Email sending logic would be implemented here
        }
    }

        public static void main(String[] args) {
            // Creating an Employee object
            Employee emp = new Employee("Shailendra", 101);

            // Printing employee details
            System.out.println(emp.getDetails());

            // Saving employee data to file (bad practice – should be external)
            emp.saveToFile();

            // Sending email to employee (again, bad practice – should be separated)
            emp.sendEmail();
        }

}
