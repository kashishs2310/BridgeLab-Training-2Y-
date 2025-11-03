import java.util.Scanner;

public class UppercaseComparison {

    // Method to manually convert text to uppercase using charAt()
    public static String convertToUpper(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // Check if the character is lowercase (between 'a' and 'z')
            if (ch >= 'a' && ch <= 'z') {
                // Convert to uppercase by subtracting 32
                result.append((char) (ch - 32));
            } else {
                // Keep the character as it is
                result.append(ch);
            }
        }
        return result.toString();
    }

    // Method to compare two strings character by character
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take complete text input
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        // Convert to uppercase using user-defined method
        String manualUpper = convertToUpper(text);

        // Convert to uppercase using built-in method
        String builtInUpper = text.toUpperCase();

        // Compare both results
        boolean areEqual = compareStrings(manualUpper, builtInUpper);

        // Display results
        System.out.println("\nManual Uppercase Conversion: " + manualUpper);
        System.out.println("Built-in toUpperCase() Conversion: " + builtInUpper);

        if (areEqual)
            System.out.println("Both conversions produce the same result.");
        else
            System.out.println("The conversions differ.");

        sc.close();
    }
}
