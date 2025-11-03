// Program to Simulate Student Report

import java.util.Scanner;

class Student {
    // Attributes
    String name;
    int rollNumber;
    double marks;
    char grade;

    // Method to input student details
    void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        name = sc.nextLine();
        System.out.print("Enter Roll Number: ");
        rollNumber = sc.nextInt();
        System.out.print("Enter Marks (out of 100): ");
        marks = sc.nextDouble();
    }

    // Method to calculate grade based on marks
    void calculateGrade() {
        if (marks >= 90)
            grade = 'A';
        else if (marks >= 75)
            grade = 'B';
        else if (marks >= 60)
            grade = 'C';
        else if (marks >= 45)
            grade = 'D';
        else
            grade = 'F';
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("\n--- Student Report ---");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}

public class StudentReport {
    public static void main(String[] args) {
        Student s = new Student();   // Create Student object

        s.getDetails();              // Input details
        s.calculateGrade();          // Compute grade
        s.displayDetails();          // Display report
    }
}
