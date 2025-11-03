import java.util.Scanner;

public class SubstringOccurrences {

    // Method to count occurrences of a substring
    public static int countOccurrences(String text, String sub) {
        int count = 0;

        for (int i = 0; i <= text.length() - sub.length(); i++) {
            boolean match = true;

            // Compare characters one by one
            for (int j = 0; j < sub.length(); j++) {
                if (text.charAt(i + j) != sub.charAt(j)) {
                    match = false;
                    break;
                }
            }

            if (match) {
                count++;
            }
        }

        return count;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String text = sc.nextLine();

        System.out.print("Enter the substring to search: ");
        String sub = sc.nextLine();

        int occurrences = countOccurrences(text, sub);
        System.out.println("The substring \"" + sub + "\" occurs " + occurrences + " times.");

        sc.close();
    }
}
