import java.util.Scanner;

public class CharArrayComparison {

    // Method to return all characters from a string (without using toCharArray)
    public static char[] getCharacters(String text) {
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }
        return chars;
    }

    // Method to compare two character arrays
    public static boolean compareArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length)
            return false;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // Get characters using user-defined method
        char[] userDefinedArray = getCharacters(text);

        // Get characters using built-in toCharArray() method
        char[] builtinArray = text.toCharArray();

        // Compare the two arrays
        boolean areEqual = compareArrays(userDefinedArray, builtinArray);

        // Display the results
        System.out.print("\nCharacters using user-defined method: ");
        for (char c : userDefinedArray) {
            System.out.print(c + " ");
        }

        System.out.print("\nCharacters using built-in toCharArray(): ");
        for (char c : builtinArray) {
            System.out.print(c + " ");
        }

        System.out.println();

        if (areEqual)
            System.out.println("✅ Both character arrays are equal.");
        else
            System.out.println("❌ Character arrays are not equal.");

        sc.close();
    }
}
