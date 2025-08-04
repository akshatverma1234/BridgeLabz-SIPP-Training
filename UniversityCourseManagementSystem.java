package Generics;

import java.util.List;


abstract class CourseType {
    abstract String getEvaluationMethod();
}

class ExamCourse extends CourseType {
    public String getEvaluationMethod() {
        return "Exam Based";
    }
}

class AssignmentCourse extends CourseType {
    public String getEvaluationMethod() {
        return "Assignment Based";
    }
}

class Course<T extends CourseType> {
    private String courseName;
    private T type;

    public Course(String courseName, T type) {
        this.courseName = courseName;
        this.type = type;
    }

    public String getCourseDetails() {
        return "Course: " + courseName + ", Evaluation: " + type.getEvaluationMethod();
    }
}

public class UniversityCourseManagementSystem {
    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println("Course Type: " + course.getEvaluationMethod());
        }
    }

    public static void main(String[] args) {
        Course<ExamCourse> maths = new Course<>("Mathematics", new ExamCourse());
        Course<AssignmentCourse> cs = new Course<>("Computer Science", new AssignmentCourse());

        System.out.println(maths.getCourseDetails());
        System.out.println(cs.getCourseDetails());
    }
}
