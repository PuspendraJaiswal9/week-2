public class Employee {
    public int employeeID;        
    protected String department;  
    private double salary;        

    // Constructor to initialize Employee details
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Method to modify the salary 
    public void updateSalary(double salary) {
        if (salary > 0) { 
            this.salary = salary;
            System.out.println("Salary updated successfully.");
        } else {
            System.out.println("Invalid salary. Please enter a positive value.");
        }
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        // Create an Employee object
        Employee employee = new Employee(101, "HR", 70000.0);

        // Display initial employee details
        employee.displayDetails();

        // Update salary
        employee.updateSalary(75000.0);

        employee.displayDetails();
    }
}