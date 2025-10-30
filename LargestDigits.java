import java.util.Scanner;

public class LargestDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int maxDigit = 10;  // maximum array size
        int[] digits = new int[maxDigit];
        int index = 0;

        // Step 2: Extract digits
        while (number != 0) {
            int digit = number % 10;
            number = number / 10;

            digits[index] = digit;
            index++;

            if (index == maxDigit) {
                System.out.println("Maximum digit storage reached (10 digits).");
                break;
            }
        }

        // Step 3: Find largest and second largest
        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Step 4: Display results
        System.out.println("\nDigits stored in array:");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }

        System.out.println("\nLargest digit = " + largest);

        if (secondLargest != -1) {
            System.out.println("Second largest digit = " + secondLargest);
        } else {
            System.out.println("Second largest digit not found (all digits are same).");
        }

        sc.close();
    }
}
