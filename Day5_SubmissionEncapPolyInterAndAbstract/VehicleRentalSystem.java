package Day5_SubmissionEncapPolyInterAndAbstract;

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String number, String type, double rate) {
        this.vehicleNumber = number;
        this.type = type;
        this.rentalRate = rate;
    }

    public abstract double calculateRentalCost(int days);

    public double getRentalRate() { return rentalRate; }
    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
}

class Car extends Vehicle implements Insurable {
    public Car(String num, double rate) {
        super(num, "Car", rate);
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance() {
        return 1000;
    }

    public String getInsuranceDetails() {
        return "Car Insurance Basic";
    }
}

class Bike extends Vehicle implements Insurable {
    public Bike(String num, double rate) {
        super(num, "Bike", rate);
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance() {
        return 300;
    }

    public String getInsuranceDetails() {
        return "Bike Insurance Basic";
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car("UP80AC1234", 1500),
            new Bike("DL22YY2651", 500)
        };

        for (Vehicle v : vehicles) {
            System.out.println("Vehicle: " + v.getType());
            System.out.println("Rental (3 days): ₹" + v.calculateRentalCost(3));
            if (v instanceof Insurable) {
                System.out.println("Insurance: ₹" + ((Insurable) v).calculateInsurance());
            }
        }
    }
}
