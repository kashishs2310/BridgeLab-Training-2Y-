// Program to Compute Area and Circumference of a Circle

import java.util.Scanner;

class Circle {
    // Attribute
    double radius;

    // Method to input radius
    void getRadius() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        radius = sc.nextDouble();
    }

    // Method to calculate area
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display area and circumference
    void displayDetails() {
        System.out.println("\n--- Circle Details ---");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }
}

public class CircleDetails {
    public static void main(String[] args) {
        Circle c = new Circle();    // Create object
        c.getRadius();              // Take input
        c.displayDetails();         // Display results
    }
}
