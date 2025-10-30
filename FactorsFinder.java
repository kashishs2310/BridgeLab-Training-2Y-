import java.util.Scanner;

public class FactorsFinder {

    // Method to print factors
    public static void printFactors(int number) {
        System.out.println("Factors of " + number + " are:");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Validate input
        if (number > 0) {
            printFactors(number);
        } else {
            System.out.println("Please enter a positive integer!");
        }

        sc.close();
    }
}
