import java.util.ArrayList;
import java.util.List;

// Subject Class
class Subject {
    private final String subjectName;
    private int marks;

    // Constructor
    public Subject(String subjectName, int marks) {
        this.subjectName = subjectName;
        this.marks = marks;
    }

    // Getters
    public String getName() {
        return subjectName;
    }

    public int getMarks() {
        return marks;
    }
}

// Student Class
class Student {
    private final String name;
    private String id;
    private List<Subject> subjects; // Aggregation: Student has multiple subjects

    // Constructor
    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        this.subjects = new ArrayList<>();
    }

    // Method to add a subject
    public void addSubject(String subjectName, int marks) {
        subjects.add(new Subject(subjectName, marks));
    }

    // Getters
    public String getName() {
        return name;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }
}

// GradeCalculator Class
class GradeCalculator {
    // Method to calculate grade for a student
    public String calculateGrade(Student student) {
        List<Subject> subjects = student.getSubjects();
        int totalMarks = 0;

        // Calculate total marks
        for (Subject subject : subjects) {
            totalMarks += subject.getMarks();
        }

        // Calculate average marks
        double average = totalMarks / (double) subjects.size();

        // Determine grade based on average
        if (average >= 90) {
            return "A";
        } else if (average >= 75) {
            return "B";
        } else if (average >= 50) {
            return "C";
        } else {
            return "F";
        }
    }
}

// Main Class
public class SchoolResult {
    public static void main(String[] args) {
        // Create a student
        Student student = new Student("John", "S001");

        // Add subjects and marks
        student.addSubject("Maths", 90);
        student.addSubject("Science", 85);

        // Display student details
        System.out.println("Student Name: " + student.getName());
        System.out.println("Subjects and Marks:");
        for (Subject subject : student.getSubjects()) {
            System.out.println(" - " + subject.getName() + ": " + subject.getMarks());
        }

        // Calculate and display the grade
        GradeCalculator gradeCalculator = new GradeCalculator();
        String grade = gradeCalculator.calculateGrade(student);
        System.out.println("Grade: " + grade);
    }
}