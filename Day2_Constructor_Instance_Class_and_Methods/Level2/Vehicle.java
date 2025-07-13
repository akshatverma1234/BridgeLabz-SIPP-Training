package Day2_Constructor_Instance_Class_and_Methods.Level2;

import java.util.*;

public class Vehicle {
    private String ownerName;
    private String vehicleType;
    private static double registrationFee = 5000;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + ", Vehicle Type: " + vehicleType + ", Fee: ₹" + registrationFee);
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        updateRegistrationFee(sc.nextDouble()); sc.nextLine();
        Vehicle v1 = new Vehicle(sc.nextLine(), sc.nextLine());
        Vehicle v2 = new Vehicle(sc.nextLine(), sc.nextLine());

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
