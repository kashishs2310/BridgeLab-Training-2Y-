// Program to Track Inventory of Items

import java.util.Scanner;

class Item {
    // Attributes
    int itemCode;
    String itemName;
    double price;

    // Method to input item details
    void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Item Code: ");
        itemCode = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Item Name: ");
        itemName = sc.nextLine();
        System.out.print("Enter Item Price: ");
        price = sc.nextDouble();
    }

    // Method to calculate total cost
    double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    // Method to display item details
    void displayDetails(int quantity) {
        System.out.println("\n--- Item Details ---");
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per item: ₹" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: ₹" + calculateTotalCost(quantity));
    }
}

public class InventoryTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Item item = new Item();

        item.getDetails(); // Input item info

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        item.displayDetails(quantity); // Display details with total cost
    }
}
