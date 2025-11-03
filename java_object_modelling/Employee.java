import java.util.ArrayList;

class Employee {
    String name;
    String role;

    Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    void displayEmployee() {
        System.out.println("Employee: " + name + " | Role: " + role);
    }
}

class Department {
    String deptName;
    ArrayList<Employee> employees = new ArrayList<>();

    Department(String deptName) {
        this.deptName = deptName;
    }

    void addEmployee(Employee e) {
        employees.add(e);
    }

    void displayDepartment() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees) {
            e.displayEmployee();
        }
    }
}

class Company {
    String companyName;
    ArrayList<Department> departments = new ArrayList<>();

    Company(String companyName) {
        this.companyName = companyName;
    }

    void addDepartment(Department d) {
        departments.add(d);
    }

    void displayCompanyStructure() {
        System.out.println("Company: " + companyName);
        for (Department d : departments) {
            d.displayDepartment();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Company c = new Company("TechNova Pvt. Ltd.");

        Department d1 = new Department("IT");
        Department d2 = new Department("HR");

        d1.addEmployee(new Employee("Kashish", "Software Engineer"));
        d1.addEmployee(new Employee("Aman", "Tester"));
        d2.addEmployee(new Employee("Riya", "HR Executive"));

        c.addDepartment(d1);
        c.addDepartment(d2);

        c.displayCompanyStructure();

        // When Company is deleted, departments and employees are also deleted (composition)
        c = null;
        System.gc(); // explicitly suggest garbage collection
        System.out.println("Company deleted. Departments & Employees no longer exist.");
    }
}
