import java.util.Scanner;

public class ArmstrongChecker {

    /**
     * Checks whether the given number is an Armstrong number (sum of cubes of digits).
     * Returns true if sum of cubes of digits equals the original number.
     */
    public static boolean isArmstrong(int number) {
        if (number < 0) {
            // negative numbers are not considered
            return false;
        }

        int originalNumber = number; // keep the original value for final comparison
        int sum = 0;                 // will hold sum of cubes of digits

        // loop until we've processed all digits
        while (originalNumber != 0) {
            int digit = originalNumber % 10;      // extract last digit
            sum += digit * digit * digit;         // add cube of the digit to sum
            originalNumber = originalNumber / 10; // remove last digit
        }

        // if sum of cubes equals the input number, it's an Armstrong number
        return sum == number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is NOT an Armstrong number.");
        }

        sc.close();
    }
}
