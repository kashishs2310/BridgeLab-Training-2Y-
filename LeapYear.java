import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take year input
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Check Gregorian calendar validity
        if (year < 1582) {
            System.out.println("The program works only for years >= 1582 (Gregorian Calendar).");
        } else {
            System.out.println("---- Using Multiple If-Else ----");

            // First approach: multiple if-else
            if (year % 400 == 0) {
                System.out.println(year + " is a Leap Year");
            } else if (year % 100 == 0) {
                System.out.println(year + " is NOT a Leap Year");
            } else if (year % 4 == 0) {
                System.out.println(year + " is a Leap Year");
            } else {
                System.out.println(year + " is NOT a Leap Year");
            }

            System.out.println("---- Using Single If with Logical Operators ----");

            // Second approach: single if with logical condition
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year");
            } else {
                System.out.println(year + " is NOT a Leap Year");
            }
        }

        sc.close();
    }
}
