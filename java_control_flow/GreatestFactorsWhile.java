import java.util.Scanner;

public class GreatestFactorsWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        int greatestFactor = 1; // initialize with 1
        int counter = number - 1; // start from one less than the number

        // Loop until counter >= 1
        while (counter >= 1) {
            if (number % counter == 0) {
                greatestFactor = counter;
                break; // greatest factor found
            }
            counter--;
        }

        // Print result
        System.out.println("Greatest factor of " + number + " (excluding itself) is: " + greatestFactor);

        sc.close();
    }
}
