class Book {
    protected String title;           // Title of the book
    protected int publicationYear;    // Year the book was published

    // Constructor to initialize book details
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
}

// Subclass representing an Author that extends Book
class Author extends Book {
    private String name;   // Name of the author
    private String bio;    // Brief biography of the author
    private int age;       // Age of the author

    // Constructor to initialize author details along with the book details
    public Author(String title, int publicationYear, String name, String bio, int age) {
        super(title, publicationYear); // Call the constructor of the Book class
        this.name = name;
        this.bio = bio;
        this.age = age;
    }

    // Method to display book and author information
    public void displayInfo() {
        System.out.println("Book Information:");
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
        System.out.println("Author Age: " + age);
        System.out.println();
    }
}

// Main class to demonstrate single-level inheritance
public class LibraryManagement {
    public static void main(String[] args) {
        // Create an Author object with book and author details
        Author author = new Author("Marvel Comics", 2008, "Stan Lee", "Marvel Comics Writer", 75);

        // Display the details of the book and its author
        author.displayInfo();
    }
}