import java.util.Scanner;

public class FactorsWhileLoop {

    // Method to print factors using while loop
    public static void printFactors(int number) {
        int i = 1; // counter variable

        System.out.println("Factors of " + number + " are:");
        while (i <= number) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
            i++; // increment counter
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
