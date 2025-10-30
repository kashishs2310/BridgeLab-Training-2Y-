import java.util.Scanner;

public class SumOfNaturalNumbersFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        if (n > 0) {  // Check for natural number
            // Using for loop
            int sumFor = 0;
            for (int i = 1; i <= n; i++) {
                sumFor += i;
            }

            // Using formula
            int sumFormula = n * (n + 1) / 2;

            System.out.println("Sum using for loop: " + sumFor);
            System.out.println("Sum using formula: " + sumFormula);

            if (sumFor == sumFormula) {
                System.out.println("Both computations are correct and equal.");
            } else {
                System.out.println("There is a mismatch in the computations.");
            }
        } else {
            System.out.println("The number " + n + " is not a natural number.");
        }
    }
}
