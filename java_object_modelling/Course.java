import java.util.ArrayList;

class Course {
    String courseName;

    Course(String courseName) {
        this.courseName = courseName;
    }
}

class Student {
    String name;
    ArrayList<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void enrollCourse(Course course) {
        courses.add(course);
        System.out.println(name + " enrolled in " + course.courseName);
    }

    void viewCourses() {
        System.out.println("Courses of " + name + ":");
        for (Course c : courses) {
            System.out.println("- " + c.courseName);
        }
        System.out.println();
    }
}

class School {
    String schoolName;
    ArrayList<Student> students = new ArrayList<>();

    School(String schoolName) {
        this.schoolName = schoolName;
    }

    void addStudent(Student student) {
        students.add(student);
    }

    void displaySchoolDetails() {
        System.out.println("School: " + schoolName);
        for (Student s : students) {
            s.viewCourses();
        }
    }

    public static void main(String[] args) {
        School school = new School("GLA International School");

        Student s1 = new Student("Kashish");
        Student s2 = new Student("Rohan");

        Course c1 = new Course("Mathematics");
        Course c2 = new Course("Science");
        Course c3 = new Course("History");

        s1.enrollCourse(c1);
        s1.enrollCourse(c3);
        s2.enrollCourse(c2);

        school.addStudent(s1);
        school.addStudent(s2);

        school.displaySchoolDetails();
    }
}
