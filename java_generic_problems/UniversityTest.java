import java.util.*;

abstract class CourseType {
    String name;
    CourseType(String name) { this.name = name; }
    public String toString() { return name; }
}

class ExamCourse extends CourseType { ExamCourse(String name) { super(name); } }
class AssignmentCourse extends CourseType { AssignmentCourse(String name) { super(name); } }
class ResearchCourse extends CourseType { ResearchCourse(String name) { super(name); } }

class Course<T extends CourseType> {
    private T course;
    Course(T course) { this.course = course; }
    public T getCourse() { return course; }
}

class University {
    public static void showCourses(List<? extends CourseType> courses) {
        for (CourseType c : courses)
            System.out.println("Course: " + c);
    }
}

public class UniversityTest {
    public static void main(String[] args) {
        List<ExamCourse> exams = Arrays.asList(new ExamCourse("Math Exam"), new ExamCourse("Physics Exam"));
        University.showCourses(exams);
    }
}
