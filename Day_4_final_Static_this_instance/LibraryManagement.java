package Day_4_final_Static_this_instance;

class Book {
    static String libraryName = "Central Library";

    final String isbn;
    String title;
    String author;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    void displayDetails() {
        if (this instanceof Book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Book b1 = new Book("Java Fundamentals", "Akshat", "IEOACJ9");
        b1.displayDetails();
        Book.displayLibraryName();
    }
}