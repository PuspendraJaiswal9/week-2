class Book {
    public String title;
    public String author;
    public float price;

    // Default constructor
    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0f;
    }

    // Parameterized constructor
    public Book(String title, String author, float price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public static void main(String[] args) {
        // Using the default constructor
        Book defaultBook = new Book();
        System.out.println("Default Book:");
        System.out.println("Title: " + defaultBook.title);
        System.out.println("Author: " + defaultBook.author);
        System.out.println("Price: " + defaultBook.price);

        // Using the parameterized constructor
        Book customBook = new Book("Marvel comics", "Stan lee", 2000);
        System.out.println("Custom Book:");
        System.out.println("Title: " + customBook.title);
        System.out.println("Author: " + customBook.author);
        System.out.println("Price: " + customBook.price);
    }
}