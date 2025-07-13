package Day2_Constructor_Instance_Class_and_Methods.Level2;

import java.util.*;

public class Product {
    private String productName;
    private double price;
    private static int totalProducts = 0;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    public void displayProductDetails() {
        System.out.println("Product: " + productName + ", Price: ₹" + price);
    }

    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product p1 = new Product(sc.nextLine(), sc.nextDouble()); sc.nextLine();
        Product p2 = new Product(sc.nextLine(), sc.nextDouble());

        p1.displayProductDetails();
        p2.displayProductDetails();
        Product.displayTotalProducts();
    }
}
