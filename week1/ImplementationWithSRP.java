package week1;

public class ImplementationWithSRP {
    // ✅ Class 1: Only responsible for storing and managing employee data
    static class Employee {
        private String name;
        private int empId;

        // Constructor to initialize employee object
        public Employee(String name, int empId) {
            this.name = name;
            this.empId = empId;
        }

        // Returns employee details as a string
        public String getDetails() {
            return "Name: " + name + ", ID: " + empId;
        }
        

        // Getter for name (used by other classes like EmailService)
        public String getName() {
            return name;
        }
    }

    // ✅ Class 2: Responsible only for saving employee data to a file
    static class EmployeePersistence {

        // Simulates saving employee data to a file
        public void saveToFile(Employee emp) {
            // In real projects, actual file I/O would be done here
            System.out.println("Saving employee data to file: " + emp.getDetails());
        }
    }

    // ✅ Class 3: Responsible only for sending email notifications
    static class EmailService {

        // Simulates sending an email to the employee
        public void sendEmail(Employee emp) {
            // In real applications, email logic (SMTP etc.) goes here
            System.out.println("Sending email to: " + emp.getName());
        }
    }

    // ✅ Main class to integrate and test all SRP-compliant classes

        public static void main(String[] args) {

            // Creating an employee object
            Employee emp = new Employee("Shailendra", 101);

            // Responsibility 1: Displaying employee details
            System.out.println("Employee Info: " + emp.getDetails());

            // Responsibility 2: Saving employee data to file
            EmployeePersistence persistence = new EmployeePersistence();
            persistence.saveToFile(emp);

            // Responsibility 3: Sending email to employee
            EmailService emailService = new EmailService();
            emailService.sendEmail(emp);
        }

}
