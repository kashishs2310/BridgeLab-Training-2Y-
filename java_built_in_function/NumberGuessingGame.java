import java.util.*;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Think of a number between 1 and 100...");
        int low = 1, high = 100;
        String feedback;

        while (true) {
            int guess = generateGuess(low, high);
            System.out.println("Is your number " + guess + "? (Type 'high', 'low', or 'correct')");
            feedback = sc.next().toLowerCase();

            if (feedback.equals("correct")) {
                System.out.println("Yay! The computer guessed your number!");
                break;
            } else if (feedback.equals("high")) {
                high = guess - 1;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            } else {
                System.out.println("Invalid input! Please type 'high', 'low', or 'correct'.");
            }
        }
        sc.close();
    }

    static int generateGuess(int low, int high) {
        return (low + high) / 2;
    }
}
