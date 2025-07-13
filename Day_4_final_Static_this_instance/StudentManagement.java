package Day_4_final_Static_this_instance;


class Student {
    static String universityName = "Gla University";
    static int totalStudents = 0;

    final int rollNumber;
    String name;
    String grade;

    Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    void displayDetails() {
        if (this instanceof Student) {
            System.out.println("Roll No: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        }
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        Student s1 = new Student("Akshat", 02, "AH");
        s1.displayDetails();
        Student.displayTotalStudents();
    }
}
