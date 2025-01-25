class Device {
    // Attributes common to all devices
    protected String deviceId;    // Unique identifier for the device
    protected String status;      // Status of the device (e.g., Online, Offline)

    // Constructor to initialize device details
    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Method to display device status
    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);  // Display the device ID
        System.out.println("Status: " + status);      // Display the device status
    }
}

// Subclass: Thermostat (extends Device)
class Thermostat extends Device {
    // Additional attribute specific to Thermostat
    int temperatureSetting;    // Temperature setting of the thermostat

    // Constructor to initialize Thermostat details along with the common Device attributes
    public Thermostat(String deviceId, String status, int temperatureSetting) {
        // Call the superclass constructor to set common attributes
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting; // Set specific Thermostat attribute
    }

    // Override the displayStatus() method to include thermostat-specific information
    @Override
    public void displayStatus() {
        super.displayStatus();  // Call the superclass method to display common attributes
        // Display the specific temperature setting of the Thermostat
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

// Main class: SmartHomeDevice (entry point)
public class SmartHomeDevice {
    public static void main(String[] args) {
        // Create a Thermostat object with specific details
        Thermostat thermostat = new Thermostat("T12345", "Online", 22);

        // Display the status of the Thermostat
        System.out.println("Thermostat Status:");
        thermostat.displayStatus();  // Call the overridden method to display full status
    }
}