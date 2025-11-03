import java.util.Scanner;

public class CharacterFrequency {

    // Method to find frequency of characters in a string
    public static Object[][] findFrequency(String text) {
        int[] freq = new int[256]; // Array to store frequency of characters (ASCII)

        // Step 1: Count frequency using charAt()
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // Step 2: Count how many distinct characters are there
        int count = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0)
                count++;
        }

        // Step 3: Store characters and frequencies in a 2D array
        Object[][] result = new Object[count][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = (char) i; // Character
                result[index][1] = freq[i];  // Frequency
                index++;
            }
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        Object[][] frequencyTable = findFrequency(text);

        System.out.println("\nCharacter Frequency:");
        for (int i = 0; i < frequencyTable.length; i++) {
            System.out.println(frequencyTable[i][0] + " = " + frequencyTable[i][1]);
        }

        sc.close();
    }
}
