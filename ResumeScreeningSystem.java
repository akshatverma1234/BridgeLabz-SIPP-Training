package Generics;

import java.util.ArrayList;
import java.util.List;

abstract class JobRole {
    abstract String getRoleName();
}

class SoftwareEngineer extends JobRole {
    public String getRoleName() {
        return "Software Engineer";
    }
}

class DataScientist extends JobRole {
    public String getRoleName() {
        return "Data Scientist";
    }
}

class Resume<T extends JobRole> {
    private String candidateName;
    private T role;

    public Resume(String candidateName, T role) {
        this.candidateName = candidateName;
        this.role = role;
    }

    public String getResumeDetails() {
        return "Candidate: " + candidateName + ", Role: " + role.getRoleName();
    }
}

public class ResumeScreeningSystem {
    public static void displayResumes(List<? extends JobRole> roles) {
        for (JobRole role : roles) {
            System.out.println("Role: " + role.getRoleName());
        }
    }
    public static void main(String[] args) {
        Resume<SoftwareEngineer> resume1 = new Resume<>("Akshat", new SoftwareEngineer());
        Resume<DataScientist> resume2 = new Resume<>("Ujjwal", new DataScientist());

        System.out.println(resume1.getResumeDetails());
        System.out.println(resume2.getResumeDetails());

        List<JobRole> jobRoles = new ArrayList<>();
        jobRoles.add(new SoftwareEngineer());
        jobRoles.add(new DataScientist());
        displayResumes(jobRoles);
    }
}
