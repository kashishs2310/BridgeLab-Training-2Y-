import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check if student can vote
    public boolean canStudentVote(int age) {
        if (age < 0) {
            // Invalid age
            return false;
        } else if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentVoteChecker checker = new StudentVoteChecker();

        int[] ages = new int[10];  // array to hold ages of 10 students

        // Take user input for 10 students
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }

        System.out.println("\nVoting Eligibility Results:");
        // Check and display result
        for (int i = 0; i < ages.length; i++) {
            boolean canVote = checker.canStudentVote(ages[i]);
            if (canVote) {
                System.out.println("Student " + (i + 1) + " (Age: " + ages[i] + ") can vote ✅");
            } else {
                System.out.println("Student " + (i + 1) + " (Age: " + ages[i] + ") cannot vote ❌");
            }
        }

        scanner.close();
    }
}
