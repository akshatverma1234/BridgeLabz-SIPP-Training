package Day1_ProgrammingElements;

import java.util.*;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        double Principal = sc.nextDouble();
        System.out.print("Enter Rate: ");
        double Rate = sc.nextDouble();
        System.out.print("Enter Time: ");
        double Time = sc.nextDouble();
        double interest = (Principal * Rate * Time) / 100;
        System.out.println("Simple Interest: " + interest);
    }
}

