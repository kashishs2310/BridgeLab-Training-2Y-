import java.util.Scanner;

public class NumberFormatDemo {

    // Method to generate NumberFormatException (unhandled)
    public static void generateException(String text) {
        // Try to convert a non-numeric string to an integer
        int number = Integer.parseInt(text);
        System.out.println("Converted number: " + number);
    }

    // Method to handle NumberFormatException using try-catch
    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted number: " + number);
        } 
        catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
            System.out.println("The entered text is not a valid number.");
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

        System.out.println("\n=== Demonstrating NumberFormatException ===");
        // Call the method that generates the exception (unhandled)
        try {
            generateException(text);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }

        System.out.println("\n=== Handling NumberFormatException using try-catch ===");
        // Call the method that handles the exception properly
        handleException(text);

        sc.close();
    }
}
