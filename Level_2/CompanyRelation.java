import java.util.ArrayList;
import java.util.List;

// Employee Class
class Employee {
    private String name;

    // Constructor
    public Employee(String name) {
        this.name = name;
    }

    // Getter for employee name
    public String getName() {
        return name;
    }
}

// Department Class
class Department {
    private String name;
    private List<Employee> employees; // List of employees in the department

    // Constructor
    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    // Add an employee to the department
    public void addEmployee(String employeeName) {
        Employee employee = new Employee(employeeName);
        employees.add(employee);
    }

    // Display department details
    public void displayDepartmentDetails() {
        System.out.println("Department: " + name);
        System.out.println("Employees:");
        for (Employee employee : employees) {
            System.out.println(" - " + employee.getName());
        }
    }

    // Clear employees when the department is deleted
    public void clearEmployees() {
        employees.clear();
    }
}

// Company Class
class Company {
    private String name;
    private List<Department> departments; // List of departments in the company

    // Constructor
    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    // Add a department to the company
    public void addDepartment(String departmentName) {
        Department department = new Department(departmentName);
        departments.add(department);
    }

    // Add an employee to a specific department
    public void addEmployeeToDepartment(String departmentName, String employeeName) {
        for (Department department : departments) {
            if (departmentName.equals(departmentName)) {
                department.addEmployee(employeeName);
                return;
            }
        }
        System.out.println("Department " + departmentName + " not found in the company.");
    }

    // Display company details
    public void displayCompanyDetails() {
        System.out.println("Company: " + name);
        for (Department department : departments) {
            department.displayDepartmentDetails();
        }
    }

    // Delete the company and its associated departments and employees
    public void deleteCompany() {
        System.out.println("Deleting company: " + name);
        for (Department department : departments) {
            department.clearEmployees(); // Clear all employees in the department
        }
        departments.clear(); // Clear all departments
        System.out.println("Company and all its departments and employees deleted.");
    }
}

public class CompanyRelation {
    public static void main(String[] args) {
        // Create a company
        Company company = new Company("TechCorp");

        // Add departments to the company
        company.addDepartment("Engineering");
        company.addDepartment("Human Resources");

        // Add employees to departments
        company.addEmployeeToDepartment("Engineering", "Alice");
        company.addEmployeeToDepartment("Engineering", "Bob");
        company.addEmployeeToDepartment("Human Resources", "Eve");

        // Display company details
        company.displayCompanyDetails();

        // Delete the company
        company.deleteCompany();
    }
}