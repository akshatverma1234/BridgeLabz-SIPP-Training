package ObjectOrientedDesign;

import java.util.*;

class Product {
    String name;

    Product(String name) {
        this.name = name;
    }
}

class Order {
    List<Product> products = new ArrayList<>();

    void addProduct(Product p) {
        products.add(p);
    }

    void showProducts() {
        System.out.println("Ordered Products:");
        for (Product p : products) {
            System.out.println("- " + p.name);
        }
    }
}

class Customer {
    String name;

    Customer(String name) {
        this.name = name;
    }

    void placeOrder(Order o) {
        System.out.println(name + " placed an order:");
        o.showProducts();
    }
}

public class EcommercePlatform{
    public static void main(String[] args) {
        Customer c1 = new Customer("Akshat");

        Product p1 = new Product("Laptop");
        Product p2 = new Product("Mouse");

        Order o = new Order();
        o.addProduct(p1);
        o.addProduct(p2);

        c1.placeOrder(o);
    }
}
