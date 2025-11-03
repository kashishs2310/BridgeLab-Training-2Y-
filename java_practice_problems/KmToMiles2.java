import java.util.Scanner;

public class KmToMiles2 {
    public static void main(String[] args) {
        double km, miles;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        km = input.nextDouble();

        miles = km / 1.6;  // Since 1 mile = 1.6 km

        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
    }
}
