package Generics;

class Product<T> {
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDetails() {
        return "Product: " + name + ", Price: " + price + ", Category: " + category;
    }
}

class BookCategory {
    @Override
    public String toString() {
        return "Books";
    }
}

class ClothingCategory {
    @Override
    public String toString() {
        return "Clothing";
    }
}

public class DynamicOnlineMarketplace {
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double newPrice = product.getPrice() - (product.getPrice() * percentage / 100);
        product.setPrice(newPrice);
        System.out.println("Discount Applied. New Price: " + newPrice);
    }

    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("Java Programming", 500, new BookCategory());
        Product<ClothingCategory> shirt = new Product<>("T-Shirt", 300, new ClothingCategory());

        System.out.println(book.getDetails());
        applyDiscount(book, 10);

        System.out.println(shirt.getDetails());
        applyDiscount(shirt, 20);
    }
}
