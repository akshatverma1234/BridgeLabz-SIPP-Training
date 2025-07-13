package Day2_Constructor_Instance_Class_and_Methods.Level1;

import java.util.*;

public class Circle {
    private double radius;

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void displayArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area: " + area);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Circle c1 = new Circle();

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        Circle c2 = new Circle(r);

        c1.displayArea();
        c2.displayArea();
    }
}
