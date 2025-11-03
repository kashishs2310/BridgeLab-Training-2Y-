import java.util.Scanner;

public class MostFrequentCharacter {

    // Method to find the most frequent character
    public static char findMostFrequentChar(String text) {
        int[] freq = new int[256]; // For all ASCII characters

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            freq[c]++;
        }

        int maxFreq = 0;
        char mostFrequent = ' ';

        // Find the character with the highest frequency
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (freq[c] > maxFreq) {
                maxFreq = freq[c];
                mostFrequent = c;
            }
        }

        return mostFrequent;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char result = findMostFrequentChar(text);

        System.out.println("Most Frequent Character: '" + result + "'");

        sc.close();
    }
}
