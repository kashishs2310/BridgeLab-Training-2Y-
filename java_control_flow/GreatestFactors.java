import java.util.Scanner;

public class GreatestFactors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        int greatestFactor = 1; // Initialize with 1 (smallest factor)

        // Loop backwards from number-1 down to 1
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break; // Found the greatest factor, no need to check further
            }
        }

        // Display the greatest factor
        System.out.println("Greatest factor of " + number + " (excluding itself) is: " + greatestFactor);

        sc.close();
    }
}
