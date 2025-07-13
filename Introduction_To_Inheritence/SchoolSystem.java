package Introduction_To_Inheritence;

class Person {
    String name;
    int age;
}

class Teacher extends Person {
    String subject;
    void displayRole() {
        System.out.println("Teacher");
    }
}

class Student extends Person {
    String grade;
    void displayRole() {
        System.out.println("Student");
    }
}

class Staff extends Person {
    String department;
    void displayRole() {
        System.out.println("Staff");
    }
}

public class SchoolSystem{
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.name = "Akshat";
        t.displayRole();

        Student s = new Student();
        s.name = "Vedansh";
        s.displayRole();
    }
}
