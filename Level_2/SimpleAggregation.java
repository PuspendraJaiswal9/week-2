import java.util.ArrayList;

// Book Class
class Book {
    String title;
    String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Display book details
    public void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

// Library Class
class Library {
    String name;
    ArrayList<Book> books;

    // Constructor
    public Library(String name) {
        this.name = name;
        books = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Display books in the library
    public void displayBooks() {
        System.out.println("Books in " + name + ":");
        for (Book book : books) {
            book.displayBook();
        }
    }
}

// Main Class
public class SimpleAggregation {
    public static void main(String[] args) {
        // Create books
        Book book1 = new Book("The Alchemist", "Paulo Coelho");
        Book book2 = new Book("Harry Potter", "J.K. Rowling");

        // Create a library
        Library library = new Library("Central Library");

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);

        // Display library books
        library.displayBooks();
    }
}