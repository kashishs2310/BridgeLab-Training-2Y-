import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    // Method to generate StringIndexOutOfBoundsException (unhandled)
    public static void generateException(String text) {
        // Accessing an invalid index to generate the exception
        System.out.println("Character at index 10: " + text.charAt(10));
    }

    // Method to handle StringIndexOutOfBoundsException using try-catch
    public static void handleException(String text) {
        try {
            // Accessing invalid index
            System.out.println("Character at index 10: " + text.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("⚠️ Caught StringIndexOutOfBoundsException: " + e.getMessage());
            System.out.println("You tried to access an index beyond the string length!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.next();

        System.out.println("\n=== Demonstrating StringIndexOutOfBoundsException ===");
        // Call the method that generates the exception (unhandled)
        try {
            generateException(text);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }

        System.out.println("\n=== Handling StringIndexOutOfBoundsException using try-catch ===");
        // Call the method that handles the exception properly
        handleException(text);

        sc.close();
    }
}
