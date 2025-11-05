import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        int count = 0;
        int temp = Math.abs(number); // Handle negative numbers

        // Loop until temp becomes 0
        if (temp == 0) {
            count = 1; // special case for 0
        } else {
            while (temp != 0) {
                temp = temp / 10; // remove last digit
                count++;           // increase count
            }
        }

        // Display the result
        System.out.println("Number of digits in " + number + " is: " + count);

        sc.close();
    }
}
