public class Book {
    public String ISBN;          
    protected String title;      
    private String author;       

    // Constructor to initialize Book details
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Method to update author 
    public void updateAuthor(String author) {
        this.author = author;
        System.out.println("Author updated successfully.");
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    public static void main(String[] args) {
        // Create a Book object
        Book ebook = new Book("123-456-789", "Java Fundamentals", "James Gosling");

        // Display initial book details
        ebook.displayDetails();

        // Update author
        ebook.updateAuthor("Gosling");

        ebook.displayDetails();
    }
}