package Day2_Constructor_Instance_Class_and_Methods.Level1;

import java.util.*;

public class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    public HotelBooking() {
        this("Guest", "Standard", 1);
    }

    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    public void displayBooking() {
        System.out.println(guestName + " booked a " + roomType + " room for " + nights + " night(s).");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HotelBooking b1 = new HotelBooking();

        System.out.print("Enter guest name: ");
        String name = sc.nextLine();
        System.out.print("Enter room type: ");
        String room = sc.nextLine();
        System.out.print("Enter number of nights: ");
        int nights = sc.nextInt();

        HotelBooking b2 = new HotelBooking(name, room, nights);
        HotelBooking b3 = new HotelBooking(b2);

        b1.displayBooking();
        b2.displayBooking();
        b3.displayBooking();
    }
}
