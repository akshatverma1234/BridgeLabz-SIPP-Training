package Day5_SubmissionEncapPolyInterAndAbstract;

interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String id, String title, String author) {
        this.itemId = id;
        this.title = title;
        this.author = author;
    }

    public abstract int getLoanDuration();

    public String getItemDetails() {
        return itemId + ": " + title + " by " + author;
    }
}

class Book extends LibraryItem implements Reservable {
    public Book(String id, String title, String author) {
        super(id, title, author);
    }

    public int getLoanDuration() {
        return 14;
    }

    public void reserveItem() { }

    public boolean checkAvailability() {
        return true;
    }
}

class Magazine extends LibraryItem implements Reservable {
    public Magazine(String id, String title, String author) {
        super(id, title, author);
    }

    public int getLoanDuration() {
        return 7;
    }

    public void reserveItem() { }

    public boolean checkAvailability() {
        return false;
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        LibraryItem item1 = new Book("S01", "Java Concept", "Akshat");
        LibraryItem item2 = new Magazine("U01", "Full Stack", "Aman");

        LibraryItem[] items = { item1, item2 };

        for (LibraryItem item : items) {
            System.out.println(item.getItemDetails());
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
        }
    }
}
