package Day2_Constructor_Instance_Class_and_Methods.Level1;

import java.util.*;

public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalCost() {
        double ratePerDay = 1000;
        return rentalDays * ratePerDay;
    }

    public void displayRental() {
        System.out.println(customerName + " rented " + carModel + " for " + rentalDays + " day(s). Total: ₹" + calculateTotalCost());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = sc.nextLine();
        System.out.print("Enter car model: ");
        String model = sc.nextLine();
        System.out.print("Enter rental days: ");
        int days = sc.nextInt();

        CarRental rental = new CarRental(name, model, days);
        rental.displayRental();
    }
}
