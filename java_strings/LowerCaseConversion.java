import java.util.Scanner;

public class LowerCaseConversion {

    // Method to manually convert string to lowercase using ASCII logic
    public static String convertToLowerCase(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // If uppercase (A–Z), convert to lowercase
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32); // Add 32 to convert uppercase to lowercase
            }
            result += ch;
        }
        return result;
    }

    // Method to compare two strings character by character
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        // Convert using built-in method
        String builtInLower = text.toLowerCase();

        // Convert using custom method
        String manualLower = convertToLowerCase(text);

        // Compare both results
        boolean isSame = compareStrings(builtInLower, manualLower);

        System.out.println("\nUsing built-in toLowerCase(): " + builtInLower);
        System.out.println("Using manual conversion:     " + manualLower);
        System.out.println("Are both strings same? " + isSame);

        sc.close();
    }
}
