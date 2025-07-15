package Day5_SubmissionEncapPolyInterAndAbstract;

interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String name, double price, int quantity) {
        this.itemName = name;
        this.price = price;
        this.quantity = quantity;
    }

    public abstract double calculateTotalPrice();

    public String getItemDetails() {
        return itemName + " ₹" + price + "x " + quantity;
    }

    public double getPrice() {
         return price; 
    }
    public int getQuantity() {
         return quantity; 
    }
    public String getItemName() {
         return itemName; 
    }
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    public double applyDiscount() {
        return calculateTotalPrice() * 0.1;
    }

    public String getDiscountDetails() {
        return "10% off on Veg";
    }
}

class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    public double calculateTotalPrice() {
        return getPrice() * getQuantity() + 20;
    }

    public double applyDiscount() {
        return calculateTotalPrice() * 0.05;
    }

    public String getDiscountDetails() {
        return "5% off on Non-Veg";
    }
}

public class FoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem[] items = {
            new VegItem("Paneer Roll", 120, 2),
            new NonVegItem("Chicken Biryani", 200, 1)
        };

        for (FoodItem item : items) {
            System.out.println(item.getItemDetails());
            System.out.println("Total Price: ₹" + item.calculateTotalPrice());
            if (item instanceof Discountable) {
                System.out.println("Discount: ₹" + ((Discountable) item).applyDiscount());
            }
        }
    }
}
