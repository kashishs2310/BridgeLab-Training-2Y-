import java.util.Scanner;

public class FrequencyUsingUniqueChars {

    // Method to find unique characters in a string using charAt()
    public static char[] uniqueCharacters(String text) {
        int length = text.length();
        char[] temp = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;

            // Check if this character appeared before
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == ch) {
                    isUnique = false;
                    break;
                }
            }

            // If unique, store it
            if (isUnique) {
                temp[uniqueCount] = ch;
                uniqueCount++;
            }
        }

        // Create an array of correct size
        char[] unique = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            unique[i] = temp[i];
        }

        return unique;
    }

    // Method to find frequency of characters using unique characters
    public static String[][] findFrequency(String text) {
        int[] freq = new int[256]; // For ASCII characters

        // Count frequency using charAt()
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // Get unique characters
        char[] uniqueChars = uniqueCharacters(text);

        // Create 2D String array for character and frequency
        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);  // Character
            result[i][1] = String.valueOf(freq[uniqueChars[i]]); // Frequency
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[][] frequencyTable = findFrequency(text);

        System.out.println("\nCharacter Frequency:");
        for (int i = 0; i < frequencyTable.length; i++) {
            System.out.println(frequencyTable[i][0] + " = " + frequencyTable[i][1]);
        }

        sc.close();
    }
}
