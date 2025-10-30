import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        int greatestFactor = 1;  // initialize

        if (number <= 1) {
            System.out.println("Please enter an integer greater than 1.");
        } else {
            // Loop from number-1 down to 1
            for (int i = number - 1; i >= 1; i--) {
                if (number % i == 0) {
                    greatestFactor = i;  // store factor
                    break;  // stop after finding the greatest one
                }
            }

            System.out.println("The greatest factor of " + number + " besides itself is " + greatestFactor);
        }

        sc.close();
    }
}
