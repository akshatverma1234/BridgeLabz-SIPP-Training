package ObjectOrientedDesign;

import java.util.*;

class Professor {
    String name;

    Professor(String name) {
        this.name = name;
    }

    void assignCourse(Course c) {
        c.setProfessor(this);
    }
}

class Student {
    String name;
    List<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void enrollCourse(Course c) {
        courses.add(c);
        c.addStudent(this);
    }

    void viewCourses() {
        System.out.println(name + " enrolled in:");
        for (Course c : courses) {
            System.out.println("- " + c.name + " (Prof: " + c.professor.name + ")");
        }
    }
}

class Course {
    String name;
    Professor professor;
    List<Student> students = new ArrayList<>();

    Course(String name) {
        this.name = name;
    }

    void setProfessor(Professor p) {
        this.professor = p;
    }

    void addStudent(Student s) {
        students.add(s);
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Professor prof = new Professor("Dr. Verma");
        Course c1 = new Course("Cybersecurity");
        prof.assignCourse(c1);
        Student s1 = new Student("Akshat");
        s1.enrollCourse(c1);
        s1.viewCourses();
    }
}
