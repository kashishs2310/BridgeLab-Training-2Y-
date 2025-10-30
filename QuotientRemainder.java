import java.util.Scanner;

public class QuotientRemainder {

    // Method to find remainder and quotient
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;

        // Store quotient and remainder in an array
        return new int[]{remainder, quotient};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();

        // Check divisor is not zero
        if (divisor == 0) {
            System.out.println("Divisor cannot be zero!");
        } else {
            // Call method
            int[] result = findRemainderAndQuotient(number, divisor);

            // Display result
            System.out.println("Quotient = " + result[1]);
            System.out.println("Remainder = " + result[0]);
        }

        sc.close();
    }
}
