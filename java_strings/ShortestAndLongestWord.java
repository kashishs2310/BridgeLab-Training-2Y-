import java.util.Scanner;

public class ShortestAndLongestWord {

    // Method to find length of a string without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // reached end of string
        }
        return count;
    }

    // Method to split text into words manually (without split())
    public static String[] customSplit(String text) {
        int length = findLength(text);
        int spaceCount = 0;

        // Count spaces to know how many words
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

        // Last word
        words[index] = text.substring(start, length);

        return words;
    }

    // Method to create a 2D array: word + its length
    public static String[][] wordsWithLengths(String[] words) {
        String[][] wordData = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            int len = findLength(words[i]);
            wordData[i][0] = words[i];
            wordData[i][1] = String.valueOf(len);
        }
        return wordData;
    }

    // Method to find shortest and longest words
    public static String[] findShortestAndLongest(String[][] wordData) {
        int shortestLen = Integer.parseInt(wordData[0][1]);
        int longestLen = Integer.parseInt(wordData[0][1]);
        String shortestWord = wordData[0][0];
        String longestWord = wordData[0][0];

        for (int i = 1; i < wordData.length; i++) {
            int len = Integer.parseInt(wordData[i][1]);

            if (len < shortestLen) {
                shortestLen = len;
                shortestWord = wordData[i][0];
            }

            if (len > longestLen) {
                longestLen = len;
                longestWord = wordData[i][0];
            }
        }

        // return as [shortestWord, longestWord]
        return new String[]{shortestWord, longestWord};
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        // Split text
        String[] words = customSplit(text);

        // Create 2D word-length array
        String[][] wordData = wordsWithLengths(words);

        // Display words and their lengths
        System.out.println("\nWord\t\tLength");
        System.out.println("----------------------");
        for (String[] data : wordData) {
            int len = Integer.parseInt(data[1]);
            System.out.println(data[0] + "\t\t" + len);
        }

        // Find shortest and longest words
        String[] result = findShortestAndLongest(wordData);

        System.out.println("\nShortest word: " + result[0]);
        System.out.println("Longest word: " + result[1]);

        sc.close();
    }
}
