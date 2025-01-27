abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public int getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println("ID: " + itemId + ", Title: " + title + ", Author: " + author);
    }
}

// Subclasses: Book, Magazine, DVD
class Book extends LibraryItem {
    public Book(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; // 14 days
    }
}

class Magazine extends LibraryItem {
    public Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // 7 days
    }
}

class DVD extends LibraryItem {
    public DVD(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3; // 3 days
    }
}

// Interface: Reservable
interface Reservable {
    void reserveItem();

    boolean checkAvailability();
}

// Main Method to Demonstrate Polymorphism
public class LibraryManagementDemo {
    public static void main(String[] args) {
        LibraryItem item1 = new Book(101, "jungle book", "rudyard kipling");
        LibraryItem item2 = new Magazine(102, "Time India", "Time India Corp.");
        LibraryItem item3 = new DVD(103, "Inception", "Christopher Nolan");

        LibraryItem[] items = {item1, item2, item3};

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
        }
    }
}