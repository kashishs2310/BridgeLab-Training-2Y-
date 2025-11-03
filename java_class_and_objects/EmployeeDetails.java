// Program to Display Employee Details

import java.util.Scanner;

class Employee {
    // Attributes
    String name;
    int id;
    double salary;

    // Method to input employee details
    void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();
        System.out.print("Enter Employee ID: ");
        id = sc.nextInt();
        System.out.print("Enter Employee Salary: ");
        salary = sc.nextDouble();
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: ₹" + salary);
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Employee emp = new Employee();   // Create object
        emp.getDetails();                // Take input
        emp.displayDetails();            // Display details
    }
}
