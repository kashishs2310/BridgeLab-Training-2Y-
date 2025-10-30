import java.util.Scanner;

public class SumNaturalNumbersRecursive {

    // Recursive method to calculate sum of n natural numbers
    public static int sumRecursive(int n) {
        if (n == 1) {
            return 1;  // base case
        }
        return n + sumRecursive(n - 1);
    }

    // Formula method to calculate sum of n natural numbers
    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a positive integer n: ");
        int n = sc.nextInt();

        // Validate natural number
        if (n <= 0) {
            System.out.println("Please enter a positive natural number greater than 0.");
        } else {
            // Compute both sums
            int recursiveSum = sumRecursive(n);
            int formulaSum = sumFormula(n);

            // Display results
            System.out.println("Sum of first " + n + " natural numbers (Recursive) = " + recursiveSum);
            System.out.println("Sum of first " + n + " natural numbers (Formula)   = " + formulaSum);

            // Compare results
            if (recursiveSum == formulaSum) {
                System.out.println("✅ Both computations match. The result is correct.");
            } else {
                System.out.println("❌ Results do not match. Something went wrong.");
            }
        }

        sc.close();
    }
}
