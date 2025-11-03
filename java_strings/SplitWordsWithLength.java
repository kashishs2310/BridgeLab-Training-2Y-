import java.util.Scanner;

public class SplitWordsWithLength {

    // Method to find length of the string without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // end of string reached
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

        int wordCount = spaceCount + 1;
        String[] words = new String[wordCount];

        int start = 0;
        int index = 0;

        // Extract words manually
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                words[index] = text.substring(start, i);
                index++;
                start = i + 1;
            }
        }
        words[index] = text.substring(start, length); // last word
        return words;
    }

    // Method to create 2D array with word and its corresponding length
    public static String[][] wordsWithLengths(String[] words) {
        String[][] wordData = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            int len = findLength(words[i]);
            wordData[i][0] = words[i];
            wordData[i][1] = String.valueOf(len); // convert int to String
        }
        return wordData;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        // Split text into words
        String[] words = customSplit(text);

        // Create 2D array with word and its length
        String[][] result = wordsWithLengths(words);

        // Display result in table format
        System.out.println("\nWord\t\tLength");
        System.out.println("----------------------");
        for (int i = 0; i < result.length; i++) {
            int len = Integer.parseInt(result[i][1]); // convert String to int
            System.out.println(result[i][0] + "\t\t" + len);
        }

        sc.close();
    }
}
