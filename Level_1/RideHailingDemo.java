// Abstract Class: Vehicle
abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId + ", Driver: " + driverName + ", Rate per KM: " + ratePerKm);
    }
}

// Subclasses: Car, Bike, Auto
class Car extends Vehicle {
    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }
}

class Bike extends Vehicle {
    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }
}

class Auto extends Vehicle {
    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }
}

// Interface: GPS
interface GPS {
    String getCurrentLocation();

    void updateLocation(String newLocation);
}

// Main Method to Demonstrate Polymorphism
public class RideHailingDemo {
    public static void main(String[] args) {
        Vehicle v1 = new Car("C101", "ayan", 10.0);
        Vehicle v2 = new Bike("B202", "vivek", 5.0);
        Vehicle v3 = new Auto("A303", "kanak", 7.0);

        Vehicle[] vehicles = {v1, v2, v3};

        double distance = 15; // Example distance in kilometers
        for (Vehicle v : vehicles) {
            v.getVehicleDetails();
            System.out.println("Fare for " + distance + " KM: " + v.calculateFare(distance));
        }
    }
}