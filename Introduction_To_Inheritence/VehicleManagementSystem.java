package Introduction_To_Inheritence;

interface Refuelable {
    void refuel();
}

class Vehicles {
    int maxSpeed;
    String model;
}

class ElectricVehicle extends Vehicles {
    void charge() {
        System.out.println("Charging");
    }
}

class PetrolVehicle extends Vehicles implements Refuelable {
    public void refuel() {
        System.out.println("Refueling");
    }
}

public class VehicleManagementSystem {
    public static void main(String[] args) {
        ElectricVehicle e = new ElectricVehicle();
        e.charge();
        PetrolVehicle p = new PetrolVehicle();
        p.refuel();
    }
}
