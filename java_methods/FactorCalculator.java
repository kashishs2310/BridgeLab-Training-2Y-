import java.util.Scanner;

public class FactorCalculator {

    // Method to find factors and return as array
    public static int[] findFactors(int number) {
        int count = 0;

        // First loop to count number of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Initialize array
        int[] factors = new int[count];
        int index = 0;

        // Second loop to store factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Method to find sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }

    // Method to find product of factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }

    // Method to find sum of squares of factors
    public static double sumOfSquares(int[] factors) {
        double sumSq = 0;
        for (int f : factors) {
            sumSq += Math.pow(f, 2);
        }
        return sumSq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Get factors
        int[] factors = findFactors(number);

        // Display factors
        System.out.print("Factors of " + number + " are: ");
        for (int f : factors) {
            System.out.print(f + " ");
        }
        System.out.println();

        // Calculations
        int sum = sumOfFactors(factors);
        long product = productOfFactors(factors);
        double sumSq = sumOfSquares(factors);

        // Display results
        System.out.println("Sum of factors = " + sum);
        System.out.println("Product of factors = " + product);
        System.out.println("Sum of squares of factors = " + sumSq);

        sc.close();
    }
}
