class Course {
    String courseName; // Name of the course
    int duration; // Duration of the course in hours

    // Constructor to initialize course details
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Displays course details
    public void displayCourseInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
    }
}

// Represents an online course, extending the basic course
class OnlineCourse extends Course {
    String platform; // Platform where the course is hosted
    boolean isRecorded; // Whether the course is recorded or live

    // Constructor to initialize online course details
    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration); // Call the parent class constructor
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    // Displays online course details
    public void displayCourseInfo() {
        super.displayCourseInfo(); // Call the parent class method
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

// Represents a paid online course, extending the online course
class PaidOnlineCourse extends OnlineCourse {
    double fee; // Fee for the course
    double discount; // Discount percentage on the course fee

    // Constructor to initialize paid online course details
    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded); // Call the parent class constructor
        this.fee = fee;
        this.discount = discount;
    }

    // Displays paid online course details
    public void displayCourseInfo() {
        super.displayCourseInfo(); // Call the parent class method
        System.out.println("Fee: " + fee);
        System.out.println("Discount: " + discount + "%");
        // Calculate and display the final price after discount
        double finalPrice = fee - (fee * discount / 100);
        System.out.println("Final Price after discount: " + finalPrice);
    }
}

public class EducationalCourseHierarchy {
    public static void main(String[] args) {
        // Create a basic course
        Course course = new Course("Introduction to Java", 30);
        // Create an online course
        OnlineCourse onlineCourse = new OnlineCourse("Advanced Python Programming", 40, "Unacademy", true);
        // Create a paid online course
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Mastering Data Science", 50, "GoogleLearn", false, 20000, 10);

        // Display information for each type of course
        System.out.println("\nCourse Information (Basic):");
        course.displayCourseInfo();

        System.out.println("\nOnline Course Information:");
        onlineCourse.displayCourseInfo();

        System.out.println("\nPaid Online Course Information:");
        paidCourse.displayCourseInfo();
    }
}