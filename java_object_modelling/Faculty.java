import java.util.ArrayList;

class Faculty {
    String name;

    Faculty(String name) {
        this.name = name;
    }

    void displayFaculty() {
        System.out.println("Faculty: " + name);
    }
}

class Department {
    String deptName;

    Department(String deptName) {
        this.deptName = deptName;
    }

    void displayDepartment() {
        System.out.println("Department: " + deptName);
    }
}

class University {
    String uniName;
    ArrayList<Department> departments = new ArrayList<>();
    ArrayList<Faculty> faculties = new ArrayList<>();

    University(String uniName) {
        this.uniName = uniName;
    }

    void addDepartment(Department d) {
        departments.add(d);
    }

    void addFaculty(Faculty f) {
        faculties.add(f);
    }

    void displayUniversityInfo() {
        System.out.println("University: " + uniName);
        System.out.println("Departments:");
        for (Department d : departments) d.displayDepartment();
        System.out.println("\nFaculties:");
        for (Faculty f : faculties) f.displayFaculty();
        System.out.println();
    }

    public static void main(String[] args) {
        University u = new University("Oxford University");

        Department d1 = new Department("Computer Science");
        Department d2 = new Department("Psychology");
        Faculty f1 = new Faculty("Dr. Kashish Singh");
        Faculty f2 = new Faculty("Prof. Arjun Patel");

        u.addDepartment(d1);
        u.addDepartment(d2);
        u.addFaculty(f1);
        u.addFaculty(f2);

        u.displayUniversityInfo();

        // When university is deleted, departments are gone (composition)
        u = null;
        System.gc();
        System.out.println("University deleted. Departments no longer exist.");
    }
}
