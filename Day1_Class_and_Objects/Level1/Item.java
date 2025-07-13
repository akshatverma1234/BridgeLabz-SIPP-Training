package Day6_Class_and_Objects.Level1;

import java.util.*;

public class Item {
    private int itemCode;
    private String itemName;
    private double price;

    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int code = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        double price = sc.nextDouble();
        int quantity = sc.nextInt();
        Item item = new Item(code, name, price);
        item.displayDetails();
        System.out.println("Total Cost: " + item.calculateTotalCost(quantity));
    }
}
