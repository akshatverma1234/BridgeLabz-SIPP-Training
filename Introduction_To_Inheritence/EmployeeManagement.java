package Introduction_To_Inheritence;

class Employee {
    String name;
    int id;
    double salary;
    
    void displayDetails() {
        System.out.println(name + " " + id + " " + salary);
    }
}

class Manager extends Employee {
    int teamSize;
}

class Developer extends Employee {
    String programmingLanguage;
}

class Intern extends Employee {
    String college;
}

public class EmployeeManagement{
    public static void main(String[] args) {
        Manager m = new Manager();
        m.name = "Akshat";
        m.id = 200;
        m.salary = 50000;
        m.teamSize = 8;
        m.displayDetails();

        Developer d = new Developer();
        d.name = "Vedansh";
        d.id = 110;
        d.salary = 6000;
        d.programmingLanguage = "Python";
        d.displayDetails();
    }
}
