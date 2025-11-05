import java.util.Scanner;

public class MultiplesBelow100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a positive integer less than 100: ");
        int number = sc.nextInt();

        if (number > 0 && number < 100) {
            int counter = 1;  // start with 1

            System.out.println("Multiples of " + number + " below 100 are:");

            while (counter * number < 100) {
                System.out.print((counter * number) + " ");
                counter++;
            }
        } else {
            System.out.println("Invalid input! Please enter a positive integer less than 100.");
        }

        sc.close();
    }
}
