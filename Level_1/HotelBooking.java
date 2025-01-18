public class HotelBooking {
    public String guestName;
    public String roomType;
    public int nights;

    // Default constructor
    public HotelBooking() {
        this.guestName = "Unknown Guest";
        this.roomType = "Standard";
        this.nights = 1;
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBooking(HotelBooking copy) {
        this.guestName = copy.guestName;
        this.roomType = copy.roomType;
        this.nights = copy.nights;
    }
    public static void main(String[] args) {
        // Using the default constructor
        HotelBooking defaultBooking = new HotelBooking();
        System.out.println("Default Booking:");
        System.out.println("Guest Name: " + defaultBooking.guestName);
        System.out.println("Room Type: " + defaultBooking.roomType);
        System.out.println("Nights: " + defaultBooking.nights);

        // Using the parameterized constructor
        HotelBooking customBooking = new HotelBooking("Alice Johnson", "Deluxe", 3);
        System.out.println("Custom Booking:");
        System.out.println("Guest Name: " + customBooking.guestName);
        System.out.println("Room Type: " + customBooking.roomType);
        System.out.println("Nights: " + customBooking.nights);

        // Using the copy constructor
        HotelBooking copiedBooking = new HotelBooking(customBooking);
        System.out.println("Copied Booking:");
        System.out.println("Guest Name: " + copiedBooking.guestName);
        System.out.println("Room Type: " + copiedBooking.roomType);
        System.out.println("Nights: " + copiedBooking.nights);
    }
}