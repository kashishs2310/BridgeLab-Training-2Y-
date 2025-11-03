import java.util.Scanner;

public class FizzBuzzProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check if natural number
        if (number <= 0) {
            System.out.println("Error: Enter a natural number (greater than 0).");
            return; // Exit program
        }

        // Create a String array to store results
        String[] results = new String[number + 1];  // +1 to include index = number

        // FizzBuzz logic
        for (int i = 0; i <= number; i++) {
            if (i == 0) {
                results[i] = "0";  // Special case for 0
            } else if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0) {
                results[i] = "Buzz";
            } else {
                results[i] = String.valueOf(i);
            }
        }

        // Print the results
        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }

        sc.close();
    }
}
