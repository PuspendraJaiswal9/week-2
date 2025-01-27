import java.util.*;

// Abstract Class: Employee
abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Base Salary: " + baseSalary);
    }
}

// Subclass: FullTimeEmployee
class FullTimeEmployee extends Employee {
    private double fixedSalary;

    public FullTimeEmployee(int employeeId, String name, double baseSalary, double fixedSalary) {
        super(employeeId, name, baseSalary);
        this.fixedSalary = fixedSalary;
    }

    @Override
    public double calculateSalary() {
        return fixedSalary;
    }
}

// Subclass: PartTimeEmployee
class PartTimeEmployee extends Employee {
    private int workHours;
    private double hourlyRate;

    public PartTimeEmployee(int employeeId, String name, double baseSalary, int workHours, double hourlyRate) {
        super(employeeId, name, baseSalary);
        this.workHours = workHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return workHours * hourlyRate;
    }
}

// Interface: Department
interface Department {
    void assignDepartment(String departmentName);

    String getDepartmentDetails();
}

// Main Method to Demonstrate Polymorphism
public class EmployeeManagementDemo {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee(1, "ayan", 50000, 80000);
        Employee emp2 = new PartTimeEmployee(2, "vivek", 20000, 20, 50);

        emp1.displayDetails();
        System.out.println("Salary: " + emp1.calculateSalary());

        emp2.displayDetails();
        System.out.println("Salary: " + emp2.calculateSalary());
    }
}