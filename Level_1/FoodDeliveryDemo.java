abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println("Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity);
    }
}

// Subclasses: VegItem, NonVegItem
class VegItem extends FoodItem {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }
}

class NonVegItem extends FoodItem {
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity() + 10; // Additional non-veg charge
    }
}

// Interface: Discountable
interface Discountable {
    double applyDiscount();

    String getDiscountDetails();
}

// Main Method to Demonstrate Polymorphism
public class FoodDeliveryDemo {
    public static void main(String[] args) {
        FoodItem item1 = new VegItem("Paneer Curry", 200, 2);
        FoodItem item2 = new NonVegItem("Chicken Biryani", 300, 1);

        FoodItem[] items = {item1, item2};

        for (FoodItem item : items) {
            item.getItemDetails();
            System.out.println("Total Price: " + item.calculateTotalPrice());
        }
    }
}