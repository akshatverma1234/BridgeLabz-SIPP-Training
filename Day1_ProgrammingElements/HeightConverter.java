package Day1_ProgrammingElements;

import java.util.*;

public class HeightConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height in cm: ");
        double cm = sc.nextDouble();
        double inch = cm / 2.54;
        double feet = inch / 12;
        System.out.println("Your Height in cm is " + cm + " while in feet is " + (int)feet + " and inches is " + (int)(inch % 12));
    }
}
