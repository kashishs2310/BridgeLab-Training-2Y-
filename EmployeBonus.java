import java.util.Scanner;

public class EmployeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter years of service: ");
        int years = sc.nextInt();

        // Check if eligible for bonus
        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus Amount = " + bonus);
        } else {
            System.out.println("No bonus. Years of service must be more than 5.");
        }

        sc.close();
    }
}
