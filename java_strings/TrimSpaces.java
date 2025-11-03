import java.util.Scanner;

public class TrimSpaces {
    
    // Method to find start and end index after trimming spaces using charAt()
    static int[] findTrimPoints(String text) {
        int start = 0, end = -1;
        boolean charFound = false;

        // Find the first non-space character
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                start = i;
                charFound = true;
                break;
            }
        }

        // If all characters are spaces
        if (!charFound) {
            return new int[]{0, -1};
        }

        // Find the last non-space character
        for (int i = text.length() - 1; i >= 0; i--) {
            if (text.charAt(i) != ' ') {
                end = i;
                break;
            }
        }

        return new int[]{start, end};
    }

    // Method to create substring using charAt()
    static String createSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    // Method to compare two strings using charAt()
    static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text with spaces: ");
        String text = sc.nextLine();

        // Find trim points
        int[] trimPoints = findTrimPoints(text);

        String trimmedCustom = "";
        if (trimPoints[1] >= trimPoints[0]) {
            trimmedCustom = createSubstring(text, trimPoints[0], trimPoints[1]);
        }

        // Built-in trim() method
        String trimmedBuiltIn = text.trim();

        // Compare both results
        boolean isSame = compareStrings(trimmedCustom, trimmedBuiltIn);

        // Display results
        System.out.println("\nOriginal Text: '" + text + "'");
        System.out.println("Custom Trimmed Text: '" + trimmedCustom + "'");
        System.out.println("Built-in Trimmed Text: '" + trimmedBuiltIn + "'");
        System.out.println("Both Results Match: " + isSame);
    }
}
