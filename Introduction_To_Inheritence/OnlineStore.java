package Introduction_To_Inheritence;

class Order {
    String orderId;
    String orderDate;
}

class ShippedOrder extends Order {
    String trackingNumber;
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;
    String getOrderStatus() {
        return "Delivered";
    }
}

public class OnlineStore {
    public static void main(String[] args) {
        DeliveredOrder d = new DeliveredOrder();
        d.orderId = "abc123";
        d.orderDate = "2025-10-21";
        d.trackingNumber = "TTMA987";
        d.deliveryDate = "2025-07-02";
        System.out.println(d.getOrderStatus());
    }
}
