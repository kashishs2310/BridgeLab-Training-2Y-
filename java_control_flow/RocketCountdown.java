import java.util.Scanner;

public class RocketCountdown {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the starting number for countdown: ");
        int counter = input.nextInt();

        while (counter >= 1) {
            System.out.println(counter);
            counter--;  // Decrement the counter
        }

        System.out.println("Liftoff!");
    }
}
