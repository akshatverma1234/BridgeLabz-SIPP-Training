package Day2_Constructor_Instance_Class_and_Methods.Level1;

import java.util.*;

public class BookSecond {
    private String title;
    private String author;
    private double price;
    private boolean available;

    public BookSecond(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed: " + title);
        } else {
            System.out.println("Sorry, already borrowed.");
        }
    }

    public void displayStatus() {
        System.out.println(title + " by " + author + " - ₹" + price + " | " + (available ? "Available" : "Not Available"));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter book title: ");
        String title = sc.nextLine();
        System.out.print("Enter author: ");
        String author = sc.nextLine();
        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        BookSecond book = new BookSecond(title, author, price);
        book.displayStatus();
        book.borrowBook();
        book.displayStatus();
        book.borrowBook();
    }
}
