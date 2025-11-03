// Program to Handle Book Details

import java.util.Scanner;

class Book {
    // Attributes
    String title;
    String author;
    double price;

    // Method to input book details
    void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Book Title: ");
        title = sc.nextLine();
        System.out.print("Enter Author Name: ");
        author = sc.nextLine();
        System.out.print("Enter Book Price: ");
        price = sc.nextDouble();
    }

    // Method to display book details
    void displayDetails() {
        System.out.println("\n--- Book Details ---");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
    }
}

public class BookDetails {
    public static void main(String[] args) {
        Book b = new Book();     // Create Book object
        b.getDetails();          // Input book info
        b.displayDetails();      // Display details
    }
}
