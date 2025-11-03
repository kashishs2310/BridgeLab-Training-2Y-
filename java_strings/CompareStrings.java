import java.util.Scanner;

public class CompareStrings {

    // Method to compare two strings using charAt()
    static boolean compareUsingCharAt(String str1, String str2) {
        // If lengths differ, strings are not equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Compare each character one by one
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true; // All characters matched
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for two strings
        System.out.print("Enter first string: ");
        String str1 = sc.next();

        System.out.print("Enter second string: ");
        String str2 = sc.next();

        // Compare using custom method
        boolean resultCharAt = compareUsingCharAt(str1, str2);

        // Compare using built-in equals() method
        boolean resultEquals = str1.equals(str2);

        // Display results
        System.out.println("\nResult using charAt(): " + resultCharAt);
        System.out.println("Result using equals(): " + resultEquals);

        // Check if both methods gave the same result
        if (resultCharAt == resultEquals) {
            System.out.println("✅ Both methods give the same result!");
        } else {
            System.out.println("❌ Results are different!");
        }

        sc.close();
    }
}
