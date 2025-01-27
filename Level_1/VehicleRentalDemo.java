abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public abstract double calculateRentalCost(int days);
}

// Subclasses: Car, Bike, Truck
class Car extends Vehicle {
    public Car(String vehicleNumber, String type, double rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * 50; // Rate per day
    }
}

class Bike extends Vehicle {
    public Bike(String vehicleNumber, String type, double rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * 20; // Rate per day
    }
}

class Truck extends Vehicle {
    public Truck(String vehicleNumber, String type, double rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * 100; // Rate per day
    }
}

// Interface: Insurable
interface Insurable {
    double calculateInsurance();

    String getInsuranceDetails();
}

// Main Method to Demonstrate Polymorphism
public class VehicleRentalDemo {
    public static void main(String[] args) {
        Vehicle v1 = new Car("C123", "Car", 50);
        Vehicle v2 = new Bike("B456", "Bike", 20);
        Vehicle v3 = new Truck("T789", "Truck", 100);

        Vehicle[] vehicles = {v1, v2, v3};

        for (Vehicle v : vehicles) {
            System.out.println("Vehicle: " + v.getType() + ", Rental Cost: " + v.calculateRentalCost(5));
        }
    }
}