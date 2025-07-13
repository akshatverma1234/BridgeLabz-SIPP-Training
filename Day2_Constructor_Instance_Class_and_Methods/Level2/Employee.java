package Day2_Constructor_Instance_Class_and_Methods.Level2;

import java.util.*;

class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    public void display() {
        System.out.println("ID: " + employeeID);
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager m = new Manager();
        m.employeeID = sc.nextInt(); sc.nextLine();
        m.department = sc.nextLine();
        m.setSalary(sc.nextDouble());
        m.display();
        System.out.println("Salary: ₹" + m.getSalary());
    }
}
