import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        int a = input.nextInt();

        System.out.print("Enter value of b: ");
        int b = input.nextInt();

        System.out.print("Enter value of c: ");
        int c = input.nextInt();

        // Integer operations considering operator precedence
        int result1 = a + b * c;   // Multiplication first, then addition
        int result2 = a * b + c;   // Multiplication first, then addition
        int result3 = c + a / b;   // Division first, then addition
        int result4 = a % b + c;   // Modulus first, then addition

        System.out.println("The results of Int Operations are " +
                           result1 + ", " + result2 + ", " + result3 + ", and " + result4);
    }
}
