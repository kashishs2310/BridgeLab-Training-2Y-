import java.util.Scanner;

public class ReplaceWord {
    
    // Method to replace a word in a sentence
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        return sentence.replaceAll("\\b" + oldWord + "\\b", newWord);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input sentence and words
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        System.out.print("Enter the word to replace: ");
        String oldWord = sc.next();

        System.out.print("Enter the new word: ");
        String newWord = sc.next();

        // Call the replace method
        String result = replaceWord(sentence, oldWord, newWord);

        // Display result
        System.out.println("Modified Sentence: " + result);

        sc.close();
    }
}
