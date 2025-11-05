import java.util.Scanner;

public class HarshadNumberChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        int sum = 0;
        int temp = Math.abs(number); // handle negative numbers

        // Loop to calculate sum of digits
        while (temp != 0) {
            int digit = temp % 10;  // get last digit
            sum += digit;           // add digit to sum
            temp = temp / 10;       // remove last digit
        }

        // Check divisibility
        if (sum != 0 && number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is NOT a Harshad Number.");
        }

        sc.close();
    }
}
