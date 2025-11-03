import java.util.Scanner;

public class ReverseString {

    // Method to reverse a string using charAt()
    public static String reverse(String text) {
        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }

        return reversed;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String reversedText = reverse(text);

        System.out.println("Reversed string: " + reversedText);

        sc.close();
    }
}
