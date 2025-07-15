package Day5_SubmissionEncapPolyInterAndAbstract;

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    public Patient(String id, String name, int age) {
        this.patientId = id;
        this.name = name;
        this.age = age;
    }

    public abstract double calculateBill();

    public String getPatientDetails() {
        return patientId + ": " + name + ", Age: " + age;
    }
}

class InPatient extends Patient implements MedicalRecord {
    public InPatient(String id, String name, int age) {
        super(id, name, age);
    }

    public double calculateBill() {
        return 5000;
    }

    public void addRecord(String record) { }

    public void viewRecords() { }
}

class OutPatient extends Patient implements MedicalRecord {
    public OutPatient(String id, String name, int age) {
        super(id, name, age);
    }

    public double calculateBill() {
        return 1000;
    }

    public void addRecord(String record) { }

    public void viewRecords() { }
}

public class HospitalSystem {
    public static void main(String[] args) {
        Patient[] patients = {
            new InPatient("T01", "Akshat", 23),
            new OutPatient("T02", "Aman", 22)
        };

        for (Patient p : patients) {
            System.out.println(p.getPatientDetails());
            System.out.println("Bill: ₹" + p.calculateBill());
           
        }
    }
}
