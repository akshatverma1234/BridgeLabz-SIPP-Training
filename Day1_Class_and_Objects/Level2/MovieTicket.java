package Day6_Class_and_Objects.Level2;

import java.util.*;

public class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;

    public MovieTicket(String movieName) {
        this.movieName = movieName;
    }

    public void bookTicket(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Total Cost: " + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String movie = sc.nextLine();
        String seat = sc.nextLine();
        double price = sc.nextDouble();
        MovieTicket ticket = new MovieTicket(movie);
        ticket.bookTicket(seat, price);
        ticket.displayDetails();
    }
}
