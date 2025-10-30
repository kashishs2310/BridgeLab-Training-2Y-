import java.util.Scanner;

public class RocketCountdownFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the starting number for countdown: ");
        int start = input.nextInt();

        for (int counter = start; counter >= 1; counter--) {
            System.out.println(counter);
        }

        System.out.println("Liftoff!");
    }
}
