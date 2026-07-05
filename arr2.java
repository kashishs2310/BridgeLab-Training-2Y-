import java.util.Scanner;

class arr2 {
   public static void main(String[] args) {
      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      // Declare the 2D Array
      int[][] arr = new int[3][3];

      // Input the elements of the 2D Array
      System.out.println("Enter the elements of the 2D Array: ");
      for (int i = 0; i < 3; i++) {
         // for (int j = 0; j < 3; j++) { 
            arr[i][j] = input.nextInt();
         }
      }

      // Display the elements of the 2D Array and calculate the sum of the 
      // elements of the 2D Array
      int sum = 0;
      System.out.println("The elements of the 2D Array are: ");
      for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 3; j++) {
            System.out.print(arr[i][j] + " ");
            sum += arr[i][j];
         }
         System.out.println();
      }

      // Display the sum of the elements of the 2D Array
      System.out.println("The sum of the elements of the 2D Array is: " + sum);

      // Close the Scanner Object
      input.close();
   }
}

