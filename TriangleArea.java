import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base of the triangle in cm: ");
        double base = input.nextDouble();

        System.out.print("Enter height of the triangle in cm: ");
        double height = input.nextDouble();

        // Area in square centimeters
        double areaCm2 = 0.5 * base * height;

        // 1 inch = 2.54 cm → 1 sq inch = (2.54 * 2.54) sq cm
        double areaIn2 = areaCm2 / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq in is " + String.format("%.2f", areaIn2) +
                           " and sq cm is " + String.format("%.2f", areaCm2));
    }
}
