package ObjectOrientedDesign;
import java.util.*;

class Course {
    String name;
    List<Student> students = new ArrayList<>();

    Course(String name) {
        this.name = name;
    }

    void addStudent(Student s) {
        students.add(s);
    }

    void showStudents() {
        System.out.println("Students in course: " + name);
        for (Student s : students) {
            System.out.println("  " + s.name);
        }
    }
}

class Student {
    String name;
    List<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void enroll(Course c) {
        courses.add(c);
        c.addStudent(this);
    }

    void viewCourses() {
        System.out.println(name + " enrolled in:");
        for (Course c : courses) {
            System.out.println("  " + c.name);
        }
    }
}

class School {
    String schoolName;
    List<Student> students = new ArrayList<>();

    School(String name) {
        this.schoolName = name;
    }

    void addStudent(Student s) {
        students.add(s);
    }
}

public class SchoolAndStudents {
    public static void main(String[] args) {
        School school = new School("ABC Public School");

        Student s1 = new Student("Akshat");
        Student s2 = new Student("Riya");

        Course math = new Course("Math");
        Course sci = new Course("Science");

        s1.enroll(math);
        s1.enroll(sci);
        s2.enroll(math);

        school.addStudent(s1);
        school.addStudent(s2);

        s1.viewCourses();
        s2.viewCourses();
        math.showStudents();
    }
}
