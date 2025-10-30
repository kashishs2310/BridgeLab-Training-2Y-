import java.util.Scanner;

public class LargestDigitsDynamic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int maxDigit = 10;  // initial array size
        int[] digits = new int[maxDigit];
        int index = 0;

        // Step 2: Extract digits dynamically
        while (number != 0) {
            int digit = number % 10;
            number = number / 10;

            // Check if array is full → increase size
            if (index == maxDigit) {
                maxDigit += 10; // increase capacity by 10
                int[] temp = new int[maxDigit];
                
                // Copy old array into temp
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }
                
                digits = temp; // assign new array
            }

            digits[index] = digit;
            index++;
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
