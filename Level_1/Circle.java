 class Circle {
    public double radius;

    // Default constructor
    public Circle() {
        this(1.0); // Calls the parameterized constructor with a default value of 1.0
    }

    // Parameterized constructor to initialize radius with user-provided value
    public Circle(double radius) {
        this.radius = radius;
    }
    public static void main(String[] args) {
        // Using the default constructor
        Circle defaultCircle = new Circle();
        System.out.println("Default Circle:");
        System.out.println("Radius: " + defaultCircle.radius);

        // Using the parameterized constructor
        Circle customCircle = new Circle(5.0);
        System.out.println("Custom Circle:");
        System.out.println("Radius: " + customCircle.radius);
    }
}