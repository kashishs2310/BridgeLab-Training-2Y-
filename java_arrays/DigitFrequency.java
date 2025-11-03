import java.util.Scanner;

public class DigitFrequency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input the number
        System.out.print("Enter a positive number: ");
        long number = sc.nextLong();

        if (number < 0) {
            System.out.println("Invalid input. Number must be positive.");
            sc.close();
            return;
        }

        // Step 2: Count digits and store digits in an array
        int[] digits = new int[20]; // maximum digits assumed = 20
        int index = 0;
        long temp = number;

        while (temp != 0) {
            digits[index] = (int) (temp % 10); // get last digit
            temp /= 10; // remove last digit
            index++;
        }

        // Step 3: Find frequency of each digit
        int[] frequency = new int[10]; // index 0-9 for digits 0-9

        for (int i = 0; i < index; i++) {
            frequency[digits[i]]++;
        }

        // Step 4: Display frequency of each digit
        System.out.println("Digit\tFrequency");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + "\t" + frequency[i]);
            }
        }

        sc.close();
    }
}
