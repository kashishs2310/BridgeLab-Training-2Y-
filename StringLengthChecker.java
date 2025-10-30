import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {

        // Step 1: Define character limit
        int charLimit = 50;

        // Step 2: Create Function to calculate string length
        Function<String, Integer> getLength = message -> message.length();

        // Step 3: Test messages
        String msg1 = "Hello, how are you?";
        String msg2 = "This is a very long message that exceeds the character limit!";

        // Step 4: Apply the function
        int len1 = getLength.apply(msg1);
        int len2 = getLength.apply(msg2);

        // Step 5: Display results
        System.out.println("Message 1 length: " + len1);
        if (len1 > charLimit) {
            System.out.println(" Message 1 exceeds the character limit!");
        } else {
            System.out.println(" Message 1 is within limit.");
        }

        System.out.println("\nMessage 2 length: " + len2);
        if (len2 > charLimit) {
            System.out.println(" Message 2 exceeds the character limit!");
        } else {
            System.out.println(" Message 2 is within limit.");
        }
    }
}
