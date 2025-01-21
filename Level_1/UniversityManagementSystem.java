class Student{
    private static String universityName = "RGPV";

    private String name;
    private final String enrollment;
    private char grade;

    private static int studentCount = 0;

    Student(String name ,String enrollment ,char grade){
        this.name = name;
        this.enrollment = enrollment;
        this.grade = grade;
        studentCount++;
    }
    public static void printNumberOfStudent(){
        System.out.println("Total number of student enrolled in university : " + studentCount);
    }

    public void printStudentDetails(){
        System.out.println("Student roll number is : " + enrollment);
        System.out.println("Student name is : " + name);
        System.out.println("Student grade is : " + grade);
    }

    public static void printUniversityName(){
        System.out.println("University name is : " + Student.universityName);
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {

        Student.printUniversityName();
        Student student1 = new Student("Vinay Chaurasia" , "0191CS211183",'A');
        if(student1 instanceof Student) {
            student1.printStudentDetails();
        }else{
            System.out.println("student1 is not instance of the class ");
        }

        System.out.println();
        Student student2 = new Student("Pushpendra jaiswal" , "0191CS211182",'A');
        if(student2 instanceof Student) {
            student2.printStudentDetails();
        }else{
            System.out.println("student1 is not instance of the class ");
        }

        System.out.println();
        Student student3 = new Student("Somya Sahu" , "0191CS211181",'A');
        if(student3 instanceof Student) {
            student3.printStudentDetails();
        }else{
            System.out.println("student1 is not instance of the class ");
        }

        Student.printNumberOfStudent();

    }
}