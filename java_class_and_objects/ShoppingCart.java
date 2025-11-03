// Program to Simulate a Shopping Cart

import java.util.Scanner;

class CartItem {
    // Attributes
    String itemName;
    double price;
    int quantity;

    // Method to add an item to the cart
    void addItem() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Item Name: ");
        itemName = sc.nextLine();
        System.out.print("Enter Item Price: ");
        price = sc.nextDouble();
        System.out.print("Enter Quantity: ");
        quantity = sc.nextInt();
        System.out.println("\nItem added to cart successfully!");
    }

    // Method to remove an item from the cart
    void removeItem() {
        itemName = null;
        price = 0;
        quantity = 0;
        System.out.println("\nItem removed from the cart.");
    }

    // Method to calculate and display total cost
    void displayTotalCost() {
        if (itemName == null || quantity == 0) {
            System.out.println("\nCart is empty!");
        } else {
            double total = price * quantity;
            System.out.println("\n--- Cart Details ---");
            System.out.println("Item Name: " + itemName);
            System.out.println("Price per Item: ₹" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Total Cost: ₹" + total);
        }
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CartItem cart = new CartItem();
        int choice;

        do {
            System.out.println("\n--- Shopping Cart Menu ---");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Display Total Cost");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    cart.addItem();
                    break;
                case 2:
                    cart.removeItem();
                    break;
                case 3:
                    cart.displayTotalCost();
                    break;
                case 4:
                    System.out.println("Thank you for shopping!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);
    }
}
