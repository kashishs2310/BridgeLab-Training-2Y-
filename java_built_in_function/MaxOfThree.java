import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        int a = getInput("Enter first number: ");
        int b = getInput("Enter second number: ");
        int c = getInput("Enter third number: ");
        System.out.println("Maximum number is: " + findMax(a, b, c));
    }

    static int getInput(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        return sc.nextInt();
    }

    static int findMax(int x, int y, int z) {
        return Math.max(x, Math.max(y, z));
    }
}
