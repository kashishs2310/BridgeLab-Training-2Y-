import java.util.Scanner;

public class TwoDArrayToOneD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take rows and columns input
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Step 2: Create 2D array
        int[][] matrix = new int[rows][cols];

        // Step 3: Take input for matrix
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Step 4: Create 1D array of size rows*cols
        int[] array = new int[rows * cols];
        int index = 0;

        // Step 5: Copy elements using nested loop
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[index] = matrix[i][j];
                index++;
            }
        }

        // Step 6: Print 2D array
        System.out.println("\n2D Array (Matrix):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Step 7: Print 1D array
        System.out.println("\n1D Array after copying:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        sc.close();
    }
}
