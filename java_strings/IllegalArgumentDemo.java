import java.util.Scanner;

public class IllegalArgumentDemo {

    // Method to generate IllegalArgumentException (unhandled)
    public static void generateException(String text) {
        // Start index greater than end index → causes IllegalArgumentException
        System.out.println("Substring: " + text.substring(5, 2));
    }

    // Method to handle IllegalArgumentException using try-catch
    public static void handleException(String text) {
        try {
            // This will generate IllegalArgumentException
            System.out.println("Substring: " + text.substring(5, 2));
        } 
        catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
            System.out.println("Start index cannot be greater than end index.");
        } 
        catch (RuntimeException e) {
            System.out.println("Caught a RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.next();

        System.out.println("\n=== Demonstrating IllegalArgumentException ===");
        // Call method that generates the exception (unhandled)
        try {
            generateException(text);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }

        System.out.println("\n=== Handling IllegalArgumentException using try-catch ===");
        // Call method that handles the exception properly
        handleException(text);

        sc.close();
    }
}
