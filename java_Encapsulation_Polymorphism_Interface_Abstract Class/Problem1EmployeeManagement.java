import java.util.*;

abstract class Employee {
    private String employeeId;
    private String name;
    private double baseSalary;

    public Employee(String employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }

    public void setName(String name) { this.name = name; }
    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.printf("ID: %s, Name: %s, BaseSalary: %.2f, FinalSalary: %.2f%n",
                employeeId, name, baseSalary, calculateSalary());
    }
}

interface Department {
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}

class FullTimeEmployee extends Employee implements Department {
    private String department;
    private double benefits; // monthly benefits

    public FullTimeEmployee(String id, String name, double baseSalary, double benefits) {
        super(id, name, baseSalary);
        this.benefits = benefits;
    }

    public double getBenefits() { return benefits; }
    public void setBenefits(double b) { this.benefits = b; }

    @Override
    public double calculateSalary() {
        // Example: full time gets base + benefits + 10% bonus
        return getBaseSalary() + benefits + 0.10 * getBaseSalary();
    }

    @Override
    public void assignDepartment(String deptName) { this.department = deptName; }

    @Override
    public String getDepartmentDetails() { return department == null ? "Unassigned" : department; }
}

class PartTimeEmployee extends Employee implements Department {
    private String department;
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String id, String name, double hourlyRate, int hoursWorked) {
        super(id, name, 0.0);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public int getHoursWorked() { return hoursWorked; }
    public void setHoursWorked(int h) { this.hoursWorked = h; }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public void assignDepartment(String deptName) { this.department = deptName; }

    @Override
    public String getDepartmentDetails() { return department == null ? "Unassigned" : department; }
}

public class Problem1EmployeeManagement {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        FullTimeEmployee f1 = new FullTimeEmployee("F001", "Alice", 50000, 3000);
        PartTimeEmployee p1 = new PartTimeEmployee("P001", "Bob", 200, 80);

        f1.assignDepartment("HR");
        p1.assignDepartment("Support");

        employees.add(f1);
        employees.add(p1);

        // Polymorphic processing
        for (Employee e : employees) {
            e.displayDetails();
            if (e instanceof Department) {
                System.out.println(" Department: " + ((Department)e).getDepartmentDetails());
            }
            System.out.println();
        }
    }
}
