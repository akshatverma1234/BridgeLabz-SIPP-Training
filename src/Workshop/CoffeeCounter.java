package Workshop;

import java.util.*;
public class CoffeeCounter {
	static int CappuccinoPrice = 200;
	static int Latte = 100;
	static int Cortado = 300;
	static String Cappuccino;
	static int bill = 0;
	public static int totalBill(String coffeeType) {
		int gst = 1000*18/100;
	   switch (coffeeType) {
        case "Cappuccino":
        	System.out.print("Your total bill including GST is : ");
            return CappuccinoPrice + gst;
        case "Latte":
        	System.out.print("Your total bill including GST is : ");
            return Latte + gst;
        case "Cortado":
        	System.out.print("Your total bill including GST is : ");
            return Cortado + gst;
        default:
            return 0;
    }
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String coffeeType = sc.nextLine();
		switch(coffeeType) {
		case "Cappuccino":
			System.out.println("Cappuccino");
			break;
		case "Latte":
			System.out.println("Latte");
			break;
		case "Cortado":
			System.out.println("Cortado");
		}
		int bill = totalBill(coffeeType);
		System.out.println(bill);
	}
}
