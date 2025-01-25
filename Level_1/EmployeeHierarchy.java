// Base class representing a generic employee
class Employee {
    protected String name;  // Name of the employee
    protected int id;       // Employee ID
    protected float salary; // Employee salary

    // Constructor to initialize employee details
    public Employee(String name, int id, float salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details (to be overridden by subclasses)
    public void displayEmployeeDetails() {}
}

// Subclass representing a Manager
class Manager extends Employee {
    private int teamSize; // Number of team members managed by the Manager

    // Constructor to initialize manager details
    public Manager(String name, int id, float salary, int teamSize) {
        super(name, id, salary); // Call the parent class constructor
        this.teamSize = teamSize;
    }

    // Overrides displayEmployeeDetails to display manager-specific details
    public void displayEmployeeDetails() {
        System.out.println("Manager:");
        System.out.println("Employee name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee salary: " + salary);
        System.out.println("Team size: " + teamSize);
        System.out.println();
    }
}

// Subclass representing a Developer
class Developer extends Employee {
    private String programmingLanguage; // Primary programming language used by the Developer

    // Constructor to initialize developer details
    public Developer(String name, int id, float salary, String programmingLanguage) {
        super(name, id, salary); // Call the parent class constructor
        this.programmingLanguage = programmingLanguage;
    }

    // Overrides displayEmployeeDetails to display developer-specific details
    public void displayEmployeeDetails() {
        System.out.println("Developer:");
        System.out.println("Employee name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee salary: " + salary);
        System.out.println("Programming language: " + programmingLanguage);
        System.out.println();
    }
}

// Subclass representing an Intern
class Intern extends Employee {
    private String techStack; // Technology stack used by the Intern

    // Constructor to initialize intern details
    public Intern(String name, int id, float salary, String techStack) {
        super(name, id, salary); // Call the parent class constructor
        this.techStack = techStack;
    }

    // Overrides displayEmployeeDetails to display intern-specific details
    public void displayEmployeeDetails() {
        System.out.println("Intern:");
        System.out.println("Employee name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee salary: " + salary);
        System.out.println("Technology stack: " + techStack);
        System.out.println();
    }
}

// Main class to demonstrate the employee hierarchy
public class EmployeeHierarchy {
    public static void main(String[] args) {
        // Create and display details of a Manager
        Manager manager = new Manager("Rituraj", 101, 2000000f, 5);
        manager.displayEmployeeDetails();

        // Create and display details of a Developer
        Developer developer = new Developer("Rajat", 102, 200000f, "Java");
        developer.displayEmployeeDetails();

        // Create and display details of an Intern
        Intern intern = new Intern("Abbhishek", 103, 25000f, "Cloud service");
        intern.displayEmployeeDetails();
    }
}