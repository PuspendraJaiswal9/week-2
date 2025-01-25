class Order {
    String orderId; // Unique ID for the order
    String orderDate; // Date the order was placed

    // Constructor to initialize order details
    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Returns the status of the order
    public String getOrderStatus() {
        return "Order placed. Waiting for shipment.";
    }
}

// Represents an order that has been shipped
class ShippedOrder extends Order {
    String trackingNumber; // Tracking number for the shipped order

    // Constructor to initialize shipped order details
    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate); // Call the parent class constructor
        this.trackingNumber = trackingNumber;
    }

    // Returns the status of the shipped order
    public String getOrderStatus() {
        return "Order shipped. Tracking number: " + trackingNumber;
    }
}

// Represents an order that has been delivered
class DeliveredOrder extends ShippedOrder {
    String deliveryDate; // Date the order was delivered

    // Constructor to initialize delivered order details
    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber); // Call the parent class constructor
        this.deliveryDate = deliveryDate;
    }

    // Returns the status of the delivered order
    public String getOrderStatus() {
        return "Order delivered on " + deliveryDate + ". Tracking number: " + trackingNumber;
    }
}

public class OnlineRetailOrderManagement {
    public static void main(String[] args) {
        // Create a general order
        Order order = new Order("O12345", "2025-01-20");
        // Create a shipped order
        ShippedOrder shippedOrder = new ShippedOrder("O12346", "2025-01-18", "T1234");
        // Create a delivered order
        DeliveredOrder deliveredOrder = new DeliveredOrder("O12347", "2025-01-15", "T5678", "2025-01-22");

        // Print the status of each order
        System.out.println(order.getOrderStatus());
        System.out.println(shippedOrder.getOrderStatus());
        System.out.println(deliveredOrder.getOrderStatus());
    }
}