import java.util.Scanner;

public class AnagramCheck {

    // Method to check if two strings are anagrams
    public static boolean isAnagram(String text1, String text2) {

        // Remove spaces and convert to lowercase for uniform comparison
        text1 = text1.replaceAll("\\s+", "").toLowerCase();
        text2 = text2.replaceAll("\\s+", "").toLowerCase();

        // Step 1: Check if lengths are equal
        if (text1.length() != text2.length()) {
            return false;
        }

        // Step 2: Create frequency arrays for both strings (256 ASCII characters)
        int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        // Step 3: Count character frequency for text1
        for (int i = 0; i < text1.length(); i++) {
            freq1[text1.charAt(i)]++;
        }

        // Step 4: Count character frequency for text2
        for (int i = 0; i < text2.length(); i++) {
            freq2[text2.charAt(i)]++;
        }

        // Step 5: Compare the frequency arrays
        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        // If all frequencies match, it’s an anagram
        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first text: ");
        String text1 = sc.nextLine();

        System.out.print("Enter second text: ");
        String text2 = sc.nextLine();

        boolean result = isAnagram(text1, text2);

        System.out.println("\nResult:");
        System.out.println("---------------------------------");
        if (result) {
            System.out.println("✅ The texts are Anagrams.");
        } else {
            System.out.println("❌ The texts are NOT Anagrams.");
        }
        System.out.println("---------------------------------");

        sc.close();
    }
}
