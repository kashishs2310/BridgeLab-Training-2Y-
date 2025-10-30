import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int tempNumber = number;

        // Step 2: Count the number of digits
        int count = 0;
        while (tempNumber != 0) {
            tempNumber /= 10;
            count++;
        }

        // Step 3: Store digits in array
        int[] digits = new int[count];
        tempNumber = number;
        for (int i = 0; i < count; i++) {
            digits[i] = tempNumber % 10;
            tempNumber /= 10;
        }

        // Step 4: Create array to store digits in reverse order (optional, here just for clarity)
        int[] reversedDigits = new int[count];
        for (int i = 0; i < count; i++) {
            reversedDigits[i] = digits[count - 1 - i];
        }

        // Step 5: Display the reversed number
        System.out.print("Reversed number digits: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]); // digits[i] already in reverse order
        }
        System.out.println();

        sc.close();
    }
}
