import java.util.Scanner;

public class LeapYearCheck {

    // Method to check Leap Year
    public static boolean isLeapYear(int year) {
        // Leap year rule: divisible by 4 and not 100, or divisible by 400
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a year (>=1582): ");
        int year = sc.nextInt();

        // Check validity
        if (year < 1582) {
            System.out.println("This program only works for year >= 1582 (Gregorian calendar).");
        } else {
            // Use method to check
            if (isLeapYear(year)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }
        }
    }
}
