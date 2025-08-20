interface Rentable {
    void rent();
}

abstract class Vehicle implements Rentable {
    String model;
    double pricePerDay;

    Vehicle(String model, double pricePerDay) {
        this.model = model;
        this.pricePerDay = pricePerDay;
    }
}

class Car extends Vehicle {
    Car(String model, double pricePerDay) {
        super(model, pricePerDay);
    }

    void rent() {
        print("Car rented: " + model);
    }
}

class Bike extends Vehicle {
    Bike(String model, double pricePerDay) {
        super(model, pricePerDay);
    }

    void rent() {
        print("Bike rented: " + model);
    }
}

class VehicleFactory {
    static Vehicle createVehicle(String type, String model, double price) {
        if (type.equals("Car")) return new Car(model, price);
        if (type.equals("Bike")) return new Bike(model, price);
        return null;
    }
}
