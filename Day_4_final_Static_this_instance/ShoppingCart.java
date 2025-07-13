package Day_4_final_Static_this_instance;


class Product {
    static double discount = 10.0;

    final String productID;
    String productName;
    double price;
    int quantity;

    Product(String productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Updated Discount: " + discount + "%");
    }

    void displayDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Name: " + productName);
            System.out.println("Price: ₹" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
        }
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        Product p1 = new Product("P001", "Laptop", 50000, 1);
        p1.displayDetails();
        Product.updateDiscount(15.0);
    }
}
