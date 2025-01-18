public class Course {
    // Instance variables
    private String courseName;
    private int duration; 
    private double fee;

    // Class variable (shared across all instances)
    private static String instituteName = "TIT";

    // Constructor to initialize course details
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: " + fee);
        System.out.println("Institute Name: " + instituteName);
    }

    // Class method to update the institute name
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    public static void main(String[] args) {
        // Creating course objects
        Course course1 = new Course("Java Programming", 12, 5000);
        Course course2 = new Course("Web Development", 16, 6999);

        // Display course details before updating the institute name
        System.out.println("Before updating institute name:");
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();
        System.out.println();

        // Update the institute name
        Course.updateInstituteName("LNCT");

        // Display course details after updating the institute name
        System.out.println("After updating institute name:");
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();
    }
}