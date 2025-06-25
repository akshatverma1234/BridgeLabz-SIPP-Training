package Day2_Constructor_Instance_Class_and_Methods.Level1;

import java.util.*;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display() {
        System.out.println(title + " by " + author + " - ₹" + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book b1 = new Book();

        System.out.print("Enter book title: ");
        String title = sc.nextLine();
        System.out.print("Enter author: ");
        String author = sc.nextLine();
        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        Book b2 = new Book(title, author, price);

        b1.display();
        b2.display();
    }
}
