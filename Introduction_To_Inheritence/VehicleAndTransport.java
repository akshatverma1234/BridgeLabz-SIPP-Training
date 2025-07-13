package Introduction_To_Inheritence;

class Vehicle {
    int maxSpeed;
    String fuelType;
    void displayInfo() {
        System.out.println(maxSpeed + " " + fuelType);
    }
}

class Car extends Vehicle {
    int seatCapacity;
}

class Truck extends Vehicle {
    int loadCapacity;
}

class Motorcycle extends Vehicle {
    boolean hasCarrier;
}

public class VehicleAndTransport {
    public static void main(String[] args) {	
        Vehicle v1 = new Car();
        v1.maxSpeed = 120;
        v1.fuelType = "Petrol";
        v1.displayInfo();

        Vehicle v2 = new Truck();
        v2.maxSpeed = 100;
        v2.fuelType = "Diesel";
        v2.displayInfo();
    }
}
