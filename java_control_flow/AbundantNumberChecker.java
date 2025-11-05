import java.util.Scanner;

public class AbundantNumberChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user  
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer!");
            sc.close();
            return;
        }

        int sum = 0;

        // Find sum of divisors (excluding the number itself)
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // Check if sum of divisors is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is NOT an Abundant Number.");
        }

        sc.close();
    }
}
