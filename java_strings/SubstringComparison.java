import java.util.Scanner;

public class SubstringComparison {

    // Method to create substring manually using charAt()
    public static String createSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
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

        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        // Create substring using charAt() method
        String manualSubstring = createSubstring(text, start, end);

        // Create substring using built-in substring() method
        String builtinSubstring = text.substring(start, end);

        // Compare both substrings
        boolean areEqual = compareStrings(manualSubstring, builtinSubstring);

        // Display results
        System.out.println("\nSubstring using charAt(): " + manualSubstring);
        System.out.println("Substring using built-in substring(): " + builtinSubstring);

        if (areEqual)
            System.out.println("✅ Both substrings are equal.");
        else
            System.out.println("❌ Substrings are not equal.");

        sc.close();
    }
}
