package Day_4_final_Static_this_instance;

class Vehicle {
    static double registrationFee = 1000.0;

    final String registrationNumber;
    String ownerName;
    String vehicleType;

    Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
        System.out.println("Updated Fee: ₹" + registrationFee);
    }

    void displayDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Registration No: " + registrationNumber);
            System.out.println("Owner: " + ownerName);
            System.out.println("Type: " + vehicleType);
        }
    }
}

public class VehicleRegistration {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("UP80AB1234", "Akshat", "Scooter");
        v1.displayDetails();
        Vehicle.updateRegistrationFee(600);
    }
}

