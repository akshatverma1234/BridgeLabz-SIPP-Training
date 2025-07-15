package Day5_SubmissionEncapPolyInterAndAbstract;

interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}

abstract class RideVehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public RideVehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public abstract double calculateFare(double distance);

    public String getVehicleDetails() {
        return "Vehicle ID: " + vehicleId + ", Driver: " + driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }
}

class RideCar extends RideVehicle implements GPS {
    public RideCar(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    public String getCurrentLocation() {
        return "Car is at: Sector 18";
    }

    public void updateLocation(String location) {
    }
}

class RideBike extends RideVehicle implements GPS {
    public RideBike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 5;
    }

    public String getCurrentLocation() {
        return "Bike is at: Sector 45";
    }

    public void updateLocation(String location) {
    }
}

class RideAuto extends RideVehicle implements GPS {
    public RideAuto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 10;
    }

    public String getCurrentLocation() {
        return "Auto is at: ISBT";
    }

    public void updateLocation(String location) {
    }
}

public class RideHailingSystem{
    public static void main(String[] args) {
        RideVehicle[] rides = {
            new RideCar("CAR021", "Akshat", 30),
            new RideBike("BIKE021", "Aman", 8),
            new RideAuto("Scooter021", "Rahul", 6)
        };

        for (RideVehicle ride : rides) {
            System.out.println(ride.getVehicleDetails());
            System.out.println("Fare for 6 km: ₹" + ride.calculateFare(6));
            if (ride instanceof GPS) {
                System.out.println(((GPS) ride).getCurrentLocation());
            }
            
        }
    }
}
