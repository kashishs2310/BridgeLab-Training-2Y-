import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the base number (positive integer): ");
        int number = sc.nextInt();

        System.out.print("Enter the power (positive integer): ");
        int power = sc.nextInt();

        // Validate input
        if (number < 0 || power < 0) {
            System.out.println("Invalid input! Please enter positive integers only.");
        } else {
            int result = 1;

            // Loop to calculate power
            for (int i = 1; i <= power; i++) {
                result *= number;
            }

            // Print result
            System.out.println(number + " raised to the power " + power + " is: " + result);
        }

        sc.close();
    }
}
