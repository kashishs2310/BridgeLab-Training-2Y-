import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        String input = getInput();
        if (isPalindrome(input))
            System.out.println("It is a palindrome.");
        else
            System.out.println("It is not a palindrome.");
    }

    static String getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        return sc.nextLine().toLowerCase().replaceAll("\\s+", "");
    }

    static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}
