class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void updateSalary(double newSalary) {
        this.salary = newSalary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    String role;

    Manager(int employeeID, String department, double salary, String role) {
        super(employeeID, department, salary);
        this.role = role;
    }

    void displayManagerDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Role: " + role);
        System.out.println("Salary: " + getSalary());
    }

    public static void main(String[] args) {
        Manager m = new Manager(201, "IT", 75000, "Project Manager");
        m.displayManagerDetails();
        m.updateSalary(85000);
        System.out.println("Updated Salary: " + m.getSalary());
    }
}
