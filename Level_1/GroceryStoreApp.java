import java.util.ArrayList;
import java.util.List;

// Product Class
class Product {
    private String name;
    private double quantity; // Quantity in kg or liters
    private double pricePerUnit;

    // Constructor
    public Product(String name, double quantity, double pricePerUnit) {
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }
}

// Customer Class
class Customer {
    private String name;
    private List<Product> products; // Composition: Customer owns Products

    // Constructor
    public Customer(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    // Add a product
    public void addProduct(String name, double quantity, double pricePerUnit) {
        products.add(new Product(name, quantity, pricePerUnit));
    }

    // Getters
    public String getName() {
        return name;
    }

    public List<Product> getProducts() {
        return products;
    }
}

// BillGenerator Class
class BillGenerator {
    // Method to calculate the total bill for a customer
    public double generateBill(Customer customer) {
        double total = 0.0;

        // Sum up the cost of all products
        for (Product product : customer.getProducts()) {
            total += product.getQuantity() * product.getPricePerUnit();
        }

        return total;
    }
}

// Main Class
public class GroceryStoreApp {
    public static void main(String[] args) {
        // Create a customer
        Customer customer = new Customer("Alice");

        // Add products to the customer
        customer.addProduct("Apples", 2.0, 3.0); // 2 kg at $3 per kg
        customer.addProduct("Milk", 1.0, 2.0);   // 1 liter at $2 per liter

        // Display customer details
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Products Purchased:");
        for (Product product : customer.getProducts()) {
            System.out.println(" - " + product.getName() + ": " + product.getQuantity() + " @ $" + product.getPricePerUnit() + " each");
        }

        // Generate and display the total bill
        BillGenerator billGenerator = new BillGenerator();
        double totalBill = billGenerator.generateBill(customer);
        System.out.println("Total Bill: $" + totalBill);
    }
}