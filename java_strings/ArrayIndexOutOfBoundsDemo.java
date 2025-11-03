import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    // Method to generate ArrayIndexOutOfBoundsException (unhandled)
    public static void generateException(String[] names) {
        // Accessing an index larger than the array length
        System.out.println("Accessing element at index 5: " + names[5]);
    }

    // Method to handle ArrayIndexOutOfBoundsException using try-catch
    public static void handleException(String[] names) {
        try {
            // This will generate ArrayIndexOutOfBoundsException
            System.out.println("Accessing element at index 5: " + names[5]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
            System.out.println("You tried to access an index beyond the array length.");
        } 
        catch (RuntimeException e) {
            System.out.println("Caught a RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for array size and names
        System.out.print("Enter the number of names: ");
        int size = sc.nextInt();
        String[] names = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.next();
        }

        System.out.println("\n=== Demonstrating ArrayIndexOutOfBoundsException ===");
        // Call the method that generates the exception (unhandled)
        try {
            generateException(names);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }

        System.out.println("\n=== Handling ArrayIndexOutOfBoundsException using try-catch ===");
        // Call the method that handles the exception properly
        handleException(names);

        sc.close();
    }
}
