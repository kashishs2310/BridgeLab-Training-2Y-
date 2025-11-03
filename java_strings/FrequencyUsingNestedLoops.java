import java.util.Scanner;

public class FrequencyUsingNestedLoops {

    // Method to find frequency of characters using nested loops
    public static String[] findFrequency(String text) {
        char[] chars = text.toCharArray();   // Convert text to character array
        int[] freq = new int[chars.length];  // Array to store frequency of each char

        // Outer loop to iterate over each character
        for (int i = 0; i < chars.length; i++) {
            freq[i] = 1; // Initialize frequency to 1
            if (chars[i] == '0') continue; // Skip already counted characters

            // Inner loop to find duplicates
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;      // Increment frequency
                    chars[j] = '0'; // Mark duplicate as counted
                }
            }
        }

        // Create a 1D String array to store character and frequency
        String[] result = new String[chars.length];
        int index = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0' && chars[i] != ' ') { // Skip duplicates and spaces
                result[index] = chars[i] + " = " + freq[i];
                index++;
            }
        }

        // Create an array of correct size
        String[] finalResult = new String[index];
        for (int i = 0; i < index; i++) {
            finalResult[i] = result[i];
        }

        return finalResult;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[] frequency = findFrequency(text);

        System.out.println("\nCharacter Frequency:");
        for (String entry : frequency) {
            System.out.println(entry);
        }

        sc.close();
    }
}
