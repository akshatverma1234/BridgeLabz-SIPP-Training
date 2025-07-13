package ObjectOrientedDesign;

import java.util.*;

class Faculty {
    String name;

    Faculty(String name) {
        this.name = name;
    }
}

class Department {
    String name;

    Department(String name) {
        this.name = name;
    }
}

class University {
    String name;
    List<Department> departments = new ArrayList<>();

    University(String name) {
        this.name = name;
    }

    void addDepartment(Department d) {
        departments.add(d);
    }

    void showDetails() {
        System.out.println("University: " + name);
        for (Department d : departments) {
            System.out.println("Dept: " + d.name);
        }
    }
}

public class UniversityWithFacultiesAndDepartments {
    public static void main(String[] args) {
        University uni = new University("Gla University");
        uni.addDepartment(new Department("CSE"));
        uni.addDepartment(new Department("ECE"));

        Faculty f1 = new Faculty("Mr. Sharma");
        Faculty f2 = new Faculty("Prof. Verma");

        uni.showDetails();
        System.out.println("Independent Faculty: " + f1.name + ", " + f2.name);
    }
}
