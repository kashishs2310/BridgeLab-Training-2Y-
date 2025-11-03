import java.util.Scanner;

public class StoreArrayValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array of max 10 elements
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        // Infinite loop until break condition
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double input = sc.nextDouble();

            // Break if user enters 0 or negative
            if (input <= 0) {
                break;
            }

            // Break if array is full
            if (index == 10) {
                System.out.println("Array is full (max 10 numbers).");
                break;
            }

            // Store value in array
            numbers[index] = input;
            index++;
        }

        // Print all values and calculate total
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
            total += numbers[i];
        }

        // Print total
        System.out.println("\n\nSum of all numbers = " + total);

        sc.close();
    }
}
