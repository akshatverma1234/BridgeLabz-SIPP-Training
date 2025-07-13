package Day2_Constructor_Instance_Class_and_Methods.Level2;

import java.util.*;

public class Course {
    private String courseName;
    private int duration;
    private double fee;
    private static String instituteName = "Default Institute";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " months, Fee: ₹" + fee + ", Institute: " + instituteName);
    }

    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        updateInstituteName(sc.nextLine());
        Course c1 = new Course(sc.nextLine(), sc.nextInt(), sc.nextDouble()); sc.nextLine();
        Course c2 = new Course(sc.nextLine(), sc.nextInt(), sc.nextDouble());

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
