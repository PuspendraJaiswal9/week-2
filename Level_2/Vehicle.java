public class Vehicle {
    // Instance variables
    private String ownerName;
    private String vehicleType;

    // Class variable 
    private static double registrationFee = 50000.00; 

    // Constructor to initialize vehicle details
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    // Class method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        if (newFee > 0) {
            registrationFee = newFee;
        } else {
            System.out.println("Registration fee must be positive!");
        }
    }

    public static void main(String[] args) {
        // Creating Vehicle objects
        Vehicle vehicle1 = new Vehicle("Puspendra Jaiswal", "Car");
        Vehicle vehicle2 = new Vehicle("Sonu Jaiswal", "Bike");

        // Display vehicle details before updating the registration fee
        System.out.println("Before updating registration fee:");
        vehicle1.displayVehicleDetails();
        System.out.println();
        vehicle2.displayVehicleDetails();
        System.out.println();

        // Update the registration fee
        Vehicle.updateRegistrationFee(60000.00);

        // Display vehicle details after updating the registration fee
        System.out.println("After updating registration fee:");
        vehicle1.displayVehicleDetails();
        System.out.println();
        vehicle2.displayVehicleDetails();
    }
}