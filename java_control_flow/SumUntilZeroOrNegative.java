import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        double number;

        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            number = input.nextDouble();

            if (number <= 0) {  // Stop if 0 or negative
                break;
            }

            total += number;
        }

        System.out.println("The total sum of entered positive numbers is " + total);
    }
}
