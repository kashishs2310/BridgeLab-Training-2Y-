import java.util.Scanner;

public class ChocolateDistribution {

    // Method to find quotient (each child's share) and remainder (remaining chocolates)
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;   // chocolates each child gets
        int remainder = number % divisor;  // leftover chocolates
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the total number of chocolates: ");
        int numberOfChocolates = sc.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = sc.nextInt();

        // Check divisor
        if (numberOfChildren == 0) {
            System.out.println("Number of children cannot be zero!");
        } else {
            // Calculate distribution
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

            // Display result
            System.out.println("Each child gets " + result[0] + " chocolates.");
            System.out.println("Remaining chocolates: " + result[1]);
        }

        sc.close();
    }
}
