import java.util.*;

abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public abstract double calculateDiscount();

    public void setPrice(double price) {
        this.price = price;
    }
}

// Subclasses: Electronics, Clothing, Groceries
class Electronics extends Product {
    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10; // 10% discount
    }
}

class Clothing extends Product {
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.20; // 20% discount
    }
}

class Groceries extends Product {
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05; // 5% discount
    }
}

// Interface: Taxable
interface Taxable {
    double calculateTax();

    String getTaxDetails();
}

// Main Method to Demonstrate Polymorphism
public class ECommerceDemo {
    public static void main(String[] args) {
        Product p1 = new Electronics(101, "Laptop", 1000);
        Product p2 = new Clothing(102, "T-Shirt", 50);
        Product p3 = new Groceries(103, "Milk", 5);

        Product[] products = {p1, p2, p3};

        for (Product p : products) {
            double finalPrice = p.getPrice() - p.calculateDiscount();
            System.out.println("Product: " + p.getName() + ", Final Price: " + finalPrice);
        }
    }
}