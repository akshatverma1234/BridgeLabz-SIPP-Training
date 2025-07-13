package ObjectOrientedDesign;

import java.util.*;

class Patient {
    String name;

    Patient(String name) {
        this.name = name;
    }
}

class Doctor {
    String name;

    Doctor(String name) {
        this.name = name;
    }

    void consult(Patient p) {
        System.out.println("Dr. " + name + " is consulting " + p.name);
    }
}

class Hospital {
    List<Doctor> doctors = new ArrayList<>();
    List<Patient> patients = new ArrayList<>();
}

public class HospitalDocAndPatient {
    public static void main(String[] args) {
        Doctor d1 = new Doctor("Aman");
        Doctor d2 = new Doctor("Karan");

        Patient p1 = new Patient("Akshat");
        Patient p2 = new Patient("Rahul");

        d1.consult(p1);
        d2.consult(p1);
        d1.consult(p2);
    }
}
