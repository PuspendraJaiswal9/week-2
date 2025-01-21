class Product{
    private static float discount;

    private final int productID;
    private String productName;
    private static float price;
    private int quantity;

    Product(int productID,String productName , float price,int quantity){
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public static void updateDiscount(float discount){
        Product.discount = discount;
    }

    public static float calculateDiscount(){
        Product.updateDiscount(10.4f);
        return (price*discount)/100;
    }

    public void printProductDetails(){
        System.out.println("Product ID is : " + productID);
        System.out.println("Product Name is : " + productName);
        System.out.println("Product price is : " + price);
        System.out.println("Product quantity is : " + quantity);
        System.out.println("Product discount % : " + discount );
        float discountedAmount = price - calculateDiscount();
        System.out.println("Amount after reducing discount is : " + discountedAmount);
        System.out.println("Total amount of products : " + (quantity*discountedAmount));
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        System.out.println("Product 1");
        Product product1 = new Product(101,"Spoon" , 199,5);
        if(product1 instanceof Product){
            product1.printProductDetails();
        }else{
            System.out.println("product1 is not instance of Product class ");
        }

        System.out.println("Product 2");
        Product.updateDiscount(14.5f);
        Product product2 = new Product(102,"Book" , 189,5);
        if(product2 instanceof Product){
            product2.printProductDetails();
        }else{
            System.out.println("product2 is not instance of Product class ");
        }
    }
}