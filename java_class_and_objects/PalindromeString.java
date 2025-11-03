// Program to Check Palindrome String

import java.util.Scanner;

class PalindromeChecker {
    // Attribute
    String text;

    // Method to input text
    void getText() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        text = sc.nextLine();
    }

    // Method to check if the text is a palindrome
    boolean isPalindrome() {
        String cleanedText = text.replaceAll("\\s+", "").toLowerCase(); // ignore spaces and case
        int left = 0, right = cleanedText.length() - 1;

        while (left < right) {
            if (cleanedText.charAt(left) != cleanedText.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Method to display result
    void displayResult() {
        if (isPalindrome()) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
    }
}

public class PalindromeString {
    public static void main(String[] args) {
        PalindromeChecker checker = new PalindromeChecker();

        checker.getText();       // Input string
        checker.displayResult(); // Display result
    }
}
