import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking two strings as input
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        // Convert both strings to lowercase to ignore case sensitivity
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Remove all spaces
        str1 = str1.replaceAll("\\s", "");
        str2 = str2.replaceAll("\\s", "");

        // Check if lengths are equal
        if (str1.length() != str2.length()) {
            System.out.println("The strings are not anagrams.");
        } else {
            // Convert strings to character arrays
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();

            // Sort both arrays
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            // Compare sorted arrays
            if (Arrays.equals(arr1, arr2)) {
                System.out.println("The strings are anagrams of each other.");
            } else {
                System.out.println("The strings are not anagrams.");
            }
        }

        sc.close();
    }
}
