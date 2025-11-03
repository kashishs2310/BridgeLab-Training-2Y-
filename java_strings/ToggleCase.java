import java.util.Scanner;

public class ToggleCase {

    // Method to toggle the case of each character
    public static String toggleCase(String text) {
        StringBuilder toggled = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // If uppercase, convert to lowercase
            if (ch >= 'A' && ch <= 'Z') {
                toggled.append((char) (ch + 32));
            }
            // If lowercase, convert to uppercase
            else if (ch >= 'a' && ch <= 'z') {
                toggled.append((char) (ch - 32));
            }
            // If not a letter, keep as is
            else {
                toggled.append(ch);
            }
        }

        return toggled.toString();
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String result = toggleCase(text);
        System.out.println("Toggled case string: " + result);

        sc.close();
    }
}
