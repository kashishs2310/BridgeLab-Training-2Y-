import java.util.Scanner;

public class PalindromeCheck {

    // Logic 1: Iterative comparison
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive comparison
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end)
            return true;
        if (text.charAt(start) != text.charAt(end))
            return false;
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Helper method to reverse a string using charAt()
    public static char[] reverseString(String text) {
        char[] reversed = new char[text.length()];
        int index = 0;
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed[index++] = text.charAt(i);
        }
        return reversed;
    }

    // Logic 3: Character array comparison
    public static boolean isPalindromeCharArray(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseString(text);

        for (int i = 0; i < text.length(); i++) {
            if (original[i] != reversed[i])
                return false;
        }
        return true;
    }

    // Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = sc.nextLine().replaceAll("\\s+", "").toLowerCase(); // Ignore spaces and case

        System.out.println("\nChecking Palindrome using different logics...");

        boolean result1 = isPalindromeIterative(text);
        boolean result2 = isPalindromeRecursive(text, 0, text.length() - 1);
        boolean result3 = isPalindromeCharArray(text);

        System.out.println("\nResult Summary:");
        System.out.println("-------------------------------");
        System.out.println("Logic 1 (Iterative)     : " + (result1 ? "Palindrome" : "Not Palindrome"));
        System.out.println("Logic 2 (Recursive)     : " + (result2 ? "Palindrome" : "Not Palindrome"));
        System.out.println("Logic 3 (Char Array)    : " + (result3 ? "Palindrome" : "Not Palindrome"));
        System.out.println("-------------------------------");

        sc.close();
    }
}
