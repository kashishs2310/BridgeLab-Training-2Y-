import java.util.Scanner;

public class StringLengthFinder {

    // Method to find string length without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) { // infinite loop
                text.charAt(count); // will throw exception when index is out of range
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception caught when we reach the end of the string
        }
        return count;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next(); // Taking input without spaces

        // Calling user-defined method
        int customLength = findLength(input);

        // Using built-in method
        int builtInLength = input.length();

        System.out.println("\nLength using custom method: " + customLength);
        System.out.println("Length using built-in method: " + builtInLength);

        sc.close();
    }
}
