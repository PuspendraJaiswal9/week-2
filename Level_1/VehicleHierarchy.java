class Vehicle {
    protected int maxSpeed;   // Maximum speed of the vehicle
    protected String fuelType; // Fuel type of the vehicle

    // Constructor to initialize vehicle details
    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    // Method to display vehicle info (to be overridden by subclasses)
    public void displayInfo() {}
}

// Subclass representing a Car
class Car extends Vehicle {
    private int maxCapacity; // Maximum seating capacity
    private String carName;  // Name of the car

    // Constructor to initialize car details
    public Car(int maxSpeed, String fuelType, int maxCapacity, String carName) {
        super(maxSpeed, fuelType); // Call the parent class constructor
        this.maxCapacity = maxCapacity;
        this.carName = carName;
    }

    // Overrides displayInfo to display car-specific details
    public void displayInfo() {
        System.out.println("Car details:");
        System.out.println("Car company name: " + carName);
        System.out.println("Maximum speed: " + maxSpeed);
        System.out.println("Fuel type: " + fuelType);
        System.out.println("Maximum seating capacity: " + maxCapacity);
        System.out.println();
    }
}

// Subclass representing a Truck
class Truck extends Vehicle {
    private String truckName; // Name of the truck
    private int tyreCount;    // Number of tires

    // Constructor to initialize truck details
    public Truck(int maxSpeed, String fuelType, String truckName, int tyreCount) {
        super(maxSpeed, fuelType); // Call the parent class constructor
        this.truckName = truckName;
        this.tyreCount = tyreCount;
    }

    // Overrides displayInfo to display truck-specific details
    public void displayInfo() {
        System.out.println("Truck information:");
        System.out.println("Truck company name: " + truckName);
        System.out.println("Maximum speed: " + maxSpeed);
        System.out.println("Fuel type: " + fuelType);
        System.out.println("Number of tires: " + tyreCount);
        System.out.println();
    }
}

// Subclass representing a Motorcycle
class MotorCycle extends Vehicle {
    private int mileage;   // Mileage of the bike
    private String bikeName; // Name of the bike

    // Constructor to initialize motorcycle details
    public MotorCycle(int maxSpeed, String fuelType, int mileage, String bikeName) {
        super(maxSpeed, fuelType); // Call the parent class constructor
        this.mileage = mileage;
        this.bikeName = bikeName;
    }

    // Overrides displayInfo to display motorcycle-specific details
    public void displayInfo() {
        System.out.println("Bike information:");
        System.out.println("Bike company name: " + bikeName);
        System.out.println("Maximum speed: " + maxSpeed);
        System.out.println("Fuel type: " + fuelType);
        System.out.println("Mileage: " + mileage);
        System.out.println();
    }
}

// Main class to demonstrate the vehicle hierarchy
public class VehicleHierarchy {
    public static void main(String[] args) {
        // Create and display details of a Car
        Car car = new Car(200, "CNG", 4, "Mahindra Thar");
        car.displayInfo();

        // Create and display details of a Truck
        Truck truck = new Truck(180, "Diesel", "Tata", 14);
        truck.displayInfo();

        // Create and display details of a Motorcycle
        MotorCycle bike = new MotorCycle(200, "Petrol", 50, "Hero");
        bike.displayInfo();
    }
}