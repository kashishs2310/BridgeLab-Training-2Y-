import java.util.Scanner;

public class RemoveCharacter {

    // Method to remove all occurrences of a specific character
    public static String removeCharacter(String text, char ch) {
        String result = "";

        // Loop through each character and skip the one to remove
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ch) {
                result += text.charAt(i);
            }
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        System.out.print("Enter the character to remove: ");
        char ch = sc.next().charAt(0);

        String modified = removeCharacter(text, ch);

        System.out.println("Modified String: " + modified);

        sc.close();
    }
}
