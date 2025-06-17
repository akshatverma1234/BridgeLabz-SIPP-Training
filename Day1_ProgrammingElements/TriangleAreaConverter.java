package Day1_ProgrammingElements;

import java.util.*;

public class TriangleAreaConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base in cm: ");
        double b = sc.nextDouble();
        System.out.print("Enter height in cm: ");
        double h = sc.nextDouble();

        double areaCm = 0.5 * b * h;
        double areaInch = areaCm / (2.54 * 2.54);
        System.out.println("The Area of the triangle in sq in is " + areaInch + " and sq cm is " + areaCm);
    }
}

