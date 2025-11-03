import java.util.Scanner;

public class SplitStringDemo {

    // Method to find length of the string without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // End of string reached
        }
        return count;
    }

    // Method to split the text into words without using split()
    public static String[] customSplit(String text) {
        int length = findLength(text);
        int spaceCount = 0;

        // Count spaces to determine number of words
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        // Number of words = spaces + 1
        int wordCount = spaceCount + 1;
        String[] words = new String[wordCount];

        int start = 0;
        int wordIndex = 0;

        // Extract words manually
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                words[wordIndex] = text.substring(start, i);
                wordIndex++;
                start = i + 1;
            }
        }

        // Add the last word
        words[wordIndex] = text.substring(start, length);

        return words;
    }

    // Method to compare two string arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length)
            return false;

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i]))
                return false;
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        // Built-in split()
        String[] builtInSplit = text.split(" ");

        // User-defined split
        String[] customSplit = customSplit(text);

        // Compare results
        boolean isSame = compareArrays(builtInSplit, customSplit);

        // Display results
        System.out.println("\nWords using custom split():");
        for (String word : customSplit) {
            System.out.println(word);
        }

        System.out.println("\nWords using built-in split():");
        for (String word : builtInSplit) {
            System.out.println(word);
        }

        System.out.println("\nBoth methods produce the same result: " + isSame);

        sc.close();
    }
}
