package Introduction_To_Inheritence;

class Course {
    String courseName;
    int duration;
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;
}

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;
}

public class EducationalCourse {
    public static void main(String[] args) {
        PaidOnlineCourse p = new PaidOnlineCourse();
        p.courseName = "Full Stack Developer";
        p.duration = 80;
        p.platform = "Udemy";
        p.isRecorded = true;
        p.fee = 799.0;
        p.discount = 20.0;
        System.out.println(p.courseName + " " + p.platform + " " + p.fee);
    }
}
