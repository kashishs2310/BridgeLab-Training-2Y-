// Program to Handle Mobile Phone Details

import java.util.Scanner;

class MobilePhone {
    // Attributes
    String brand;
    String model;
    double price;

    // Method to input mobile phone details
    void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Mobile Brand: ");
        brand = sc.nextLine();
        System.out.print("Enter Mobile Model: ");
        model = sc.nextLine();
        System.out.print("Enter Mobile Price: ");
        price = sc.nextDouble();
    }

    // Method to display mobile phone details
    void displayDetails() {
        System.out.println("\n--- Mobile Phone Details ---");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: ₹" + price);
    }
}

public class MobilePhoneDetails {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone();  // Create MobilePhone object

        phone.getDetails();      // Input details
        phone.displayDetails();  // Display details
    }
}
