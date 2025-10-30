import java.util.Scanner;

public class SmallestLargest {

    // Method to find smallest and largest of 3 numbers
    public static void findSmallestAndLargest(int a, int b, int c) {
        int smallest, largest;

        // Find smallest
        if (a <= b && a <= c) {
            smallest = a;
        } else if (b <= a && b <= c) {
            smallest = b;
        } else {
            smallest = c;
        }

        // Find largest
        if (a >= b && a >= c) {
            largest = a;
        } else if (b >= a && b >= c) {
            largest = b;
        } else {
            largest = c;
        }

        // Display results
        System.out.println("Smallest number is: " + smallest);
        System.out.println("Largest number is: " + largest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        // Call method
        findSmallestAndLargest(num1, num2, num3);

        sc.close();
    }
}
