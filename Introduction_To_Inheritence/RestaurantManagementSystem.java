package Introduction_To_Inheritence;

interface Worker {
    void performDuties();
}

class Persons {
    String name;
    int id;
}

class Chef extends Person implements Worker {
    public void performDuties() {
        System.out.println("Cooking");
    }
}

class Waiter extends Person implements Worker {
    public void performDuties() {
        System.out.println("Serving");
    }
}

public class RestaurantManagementSystem {
    public static void main(String[] args) {
        Worker w1 = new Chef();
        Worker w2 = new Waiter();
        w1.performDuties();
        w2.performDuties();
    }
}
