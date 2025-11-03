class Course {
    // Instance variables
    String courseName;
    int duration; // in months
    double fee;

    // Class variable
    static String instituteName = "Tech Institute";

    // Constructor
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method
    void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: ₹" + fee);
        System.out.println();
    }

    // Class method
    static void updateInstituteName(String newName) {
        instituteName = newName;
        System.out.println("Institute name updated to: " + instituteName);
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java Programming", 3, 5000);
        Course c2 = new Course("Cybersecurity", 6, 12000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        Course.updateInstituteName("Skill Academy");

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
