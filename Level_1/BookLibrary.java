class BookLibrary {
    // Attributes
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    // Constructor
    public BookLibrary(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    // Method to borrow a book
    public boolean borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have successfully borrowed the book: " + title);
            return true;
        } else {
            System.out.println("Sorry, the book " + title + "' is currently unavailable.");
            return false;
        }
    }

    // Method to return a book
    public void returnBook() {
        isAvailable = true;
        System.out.println("You have successfully returned the book: " + title);
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available")); 
    }

    public static void main(String[] args) {
        // Creating a book object
        BookLibrary book1 = new BookLibrary("Java Programming", "Puspendra ", 700, true);

        // Displaying book details
        book1.displayDetails();

        // Borrowing the book
        book1.borrowBook();

        // Trying to borrow the book again
        book1.borrowBook();

        // Returning the book
        book1.returnBook();

        // Displaying book details again
        book1.displayDetails();
    }
}