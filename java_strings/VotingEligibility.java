import java.util.*;

public class VotingEligibility {

    // Method to generate random 2-digit ages for n students
    static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            // Generate random 2-digit number (10 to 99)
            ages[i] = 10 + rand.nextInt(90);
        }
        return ages;
    }

    // Method to check voting eligibility and return 2D String array
    static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]); // Age as String

            if (ages[i] < 0) {
                result[i][1] = "False (Invalid Age)";
            } else if (ages[i] >= 18) {
                result[i][1] = "True (Can Vote)";
            } else {
                result[i][1] = "False (Cannot Vote)";
            }
        }

        return result;
    }

    // Method to display 2D array in tabular format
    static void displayTable(String[][] data) {
        System.out.println("\n--------------------------------------");
        System.out.println("Student\t|\tAge\t|\tCan Vote");
        System.out.println("--------------------------------------");

        for (int i = 0; i < data.length; i++) {
            System.out.println((i + 1) + "\t|\t" + data[i][0] + "\t|\t" + data[i][1]);
        }

        System.out.println("--------------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Generate random ages
        int[] ages = generateAges(n);

        // Check eligibility
        String[][] result = checkVotingEligibility(ages);

        // Display results
        displayTable(result);
    }
}
