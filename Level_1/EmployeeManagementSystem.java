class Employee{
    private static String companyName = "Capgemini";

    private final int id;
    private String name;
    private String designation;
    private static int countEmployee = 0;

    Employee(int id , String name , String designation){
        this.id = id;
        this.name = name;
        this.designation = designation;
        countEmployee++;
    }

    public static void printCompanyName(){
        System.out.println("Company name is : " + companyName);
    }

    public void printInstanceOfClass(){
        if(this instanceof Employee){
            System.out.println("Employee id : " + id);
            System.out.println("Employee name : " + name);
            System.out.println("Employee designation : " + designation);
        }else{
            System.out.println("It is not instance of Employee class ");
        }
    }

    public static void printNumberOfEmployee(){
        System.out.println("Number of employee is : " + countEmployee);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {

        Employee.printCompanyName();
        System.out.println();

        Employee employee1 = new Employee(101,"Puspendra" , "Analyst");
        employee1.printInstanceOfClass();
        Employee.printNumberOfEmployee();

        System.out.println();

        Employee employee2 = new Employee(102,"Abhishek", "Assistant Manager");
        employee2.printInstanceOfClass();
        Employee.printNumberOfEmployee();
    }
}