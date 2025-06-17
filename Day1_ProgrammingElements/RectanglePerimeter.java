package Day1_ProgrammingElements;

import java.util.*;

public class RectanglePerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        double Length = sc.nextDouble();
        System.out.print("Enter width: ");
        double Width = sc.nextDouble();
        double Perimeter = 2 * (Length + Width);
        System.out.println("Perimeter of Rectangle: " + Perimeter);
    }
}
