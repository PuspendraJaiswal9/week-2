interface Refuelable {
    void refuel();  // Every class implementing this interface must define a refuel method
}

// Base class for vehicles with common attributes
class Vehicle {
    String model;   // Model of the vehicle
    int maxSpeed;   // Maximum speed of the vehicle

    // Constructor to initialize the vehicle model and max speed
    Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
}

// Electric vehicle class, inheriting from Vehicle
class ElectricVehicle extends Vehicle {
    // Constructor to initialize electric vehicle model and max speed
    ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);  // Call to the superclass (Vehicle) constructor
    }

    // Method to simulate charging the electric vehicle
    void charge() {
        System.out.println(model + " is charging.");
        System.out.println("Max speed of this model: " + maxSpeed);
    }
}

// Petrol vehicle class, inheriting from Vehicle and implementing Refuelable
class PetrolVehicle extends Vehicle implements Refuelable {
    // Constructor to initialize petrol vehicle model and max speed
    PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);  // Call to the superclass (Vehicle) constructor
    }

    // Implement the refuel method from the Refuelable interface
    public void refuel() {
        System.out.println(model + " is refueling with petrol.");
        System.out.println("Max speed of this model: " + maxSpeed);
    }
}

// Main class to test the vehicle system
public class VehicleManager {
    public static void main(String[] args) {
        // Create an ElectricVehicle object
        ElectricVehicle electricCar = new ElectricVehicle("Tesla", 150);

        // Create a PetrolVehicle object
        PetrolVehicle petrolCar = new PetrolVehicle("Honda", 120);

        // Simulate charging the electric car
        electricCar.charge();

        // Simulate refueling the petrol car
        petrolCar.refuel();
    }
}