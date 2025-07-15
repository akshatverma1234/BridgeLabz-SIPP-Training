package Day5_SubmissionEncapPolyInterAndAbstract;

interface Department {
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}

abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: ₹" + baseSalary);
    }

    public int getEmployeeId() { 
        return employeeId;
    }
    public String getName() { 
        return name; 
    }
    public double getBaseSalary() {
         return baseSalary; 
    }
}

class FullTimeEmployee extends Employee implements Department {
    private String department;

    public FullTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

    public double calculateSalary() {
        return getBaseSalary();
    }

    public void assignDepartment(String deptName) {
        this.department = deptName;
    }

    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}

class PartTimeEmployee extends Employee implements Department {
    private int hoursWorked;
    private double hourlyRate;
    private String department;

    public PartTimeEmployee(int id, String name, double hourlyRate, int hoursWorked) {
        super(id, name, 0);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    public void assignDepartment(String deptName) {
        this.department = deptName;
    }

    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}

public class EmployeeSystemRunner {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(1, "Akshat", 30000);
        Employee e2 = new PartTimeEmployee(2, "Riya", 400, 20);

        Employee[] employees = { e1, e2 };

        for (Employee e : employees) {
            e.displayDetails();
            System.out.println("Calculated Salary: ₹" + e.calculateSalary());
            if (e instanceof Department) {
                ((Department) e).assignDepartment("Tech");
                System.out.println(((Department) e).getDepartmentDetails());
            }
        }
    }
}
