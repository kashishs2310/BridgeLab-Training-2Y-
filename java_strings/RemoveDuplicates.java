import java.util.Scanner;

public class RemoveDuplicates {

    // Method to remove duplicate characters
    public static String removeDuplicates(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check if character is already in result
            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String modifiedText = removeDuplicates(text);
        System.out.println("String after removing duplicates: " + modifiedText);

        sc.close();
    }
}
