import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        // Check if natural number
        if (number <= 0) {
            System.out.println("Error: Please enter a natural number (greater than 0).");
            return; // exit program
        }

        // Create arrays for odd and even numbers
        int[] even = new int[number / 2 + 1];
        int[] odd = new int[number / 2 + 1];

        // Index variables
        int evenIndex = 0;
        int oddIndex = 0;

        // Separate odd and even numbers
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                even[evenIndex] = i;
                evenIndex++;
            } else {
                odd[oddIndex] = i;
                oddIndex++;
            }
        }

        // Print odd numbers array
        System.out.print("Odd Numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }
        System.out.println();

        // Print even numbers array
        System.out.print("Even Numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
