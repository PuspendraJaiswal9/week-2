public class Student {
    public int rollNumber;       // Public member
    protected String name;       // Protected member
    private double CGPA;         // Private member

    // Constructor to initialize Student details
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Method to update CGPA 
    public void updateCGPA(double CGPA) {
        if (CGPA >= 0.0 && CGPA <= 10.0) { // Validate CGPA range
            this.CGPA = CGPA;
            System.out.println("CGPA updated successfully.");
        } else {
            System.out.println("Invalid CGPA. Please enter a value between 0.0 and 10.0.");
        }
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }

    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student(183, "Puspendra Jaiswal", 9.0);

        // Display initial student details
        student.displayStudentDetails();

        // Update CGPA
        student.updateCGPA(9.5);

        // Display updated student details
        student.displayStudentDetails();
    }
}