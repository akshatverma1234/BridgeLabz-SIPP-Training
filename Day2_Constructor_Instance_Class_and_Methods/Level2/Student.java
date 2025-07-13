package Day2_Constructor_Instance_Class_and_Methods.Level2;

import java.util.*;

class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public void setCGPA(double cgpa) {
        this.CGPA = cgpa;
    }

    public double getCGPA() {
        return CGPA;
    }
}

class PostgraduateStudent extends Student {
    public void display() {
        System.out.println("Roll: " + rollNumber);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PostgraduateStudent pg = new PostgraduateStudent();
        pg.rollNumber = sc.nextInt(); sc.nextLine();
        pg.name = sc.nextLine();
        pg.setCGPA(sc.nextDouble());

        pg.display();
        System.out.println("CGPA: " + pg.getCGPA());
    }
}
