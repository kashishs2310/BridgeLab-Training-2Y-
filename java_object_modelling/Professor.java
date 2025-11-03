import java.util.ArrayList;

class Professor {
    String name;

    Professor(String name) {
        this.name = name;
    }

    void assignCourse(Course c) {
        System.out.println("Professor " + name + " assigned to teach " + c.courseName);
    }
}

class StudentU {
    String name;
    ArrayList<Course> courses = new ArrayList<>();

    StudentU(String name) {
        this.name = name;
    }

    void enrollCourse(Course c) {
        courses.add(c);
        System.out.println(name + " enrolled in " + c.courseName);
    }

    void viewCourses() {
        System.out.println(name + "'s Courses:");
        for (Course c : courses) {
            System.out.println("- " + c.courseName);
        }
        System.out.println();
    }
}

class Course {
    String courseName;

    Course(String courseName) {
        this.courseName = courseName;
    }
}

class UniversitySystem {
    public static void main(String[] args) {
        Professor p1 = new Professor("Dr. Sharma");
        Professor p2 = new Professor("Dr. Kashish");

        Course c1 = new Course("Data Structures");
        Course c2 = new Course("Cybersecurity");

        p1.assignCourse(c1);
        p2.assignCourse(c2);

        StudentU s1 = new StudentU("Aarav");
        StudentU s2 = new StudentU("Riya");

        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s2.enrollCourse(c2);

        s1.viewCourses();
        s2.viewCourses();
    }
}
