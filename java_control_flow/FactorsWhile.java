import java.util.Scanner;

public class FactorsWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check if number is positive
        if (number <= 0) {
            System.out.println("Please enter a positive integer!");
        } else {
            System.out.println("Factors of " + number + " are:");

            int i = 1;  // counter variable

            // While loop to find factors
            while (i <= number) {
                if (number % i == 0) {
                    System.out.println(i);
                }
                i++;  // increment counter
            }
        }

        sc.close();
    }
}
