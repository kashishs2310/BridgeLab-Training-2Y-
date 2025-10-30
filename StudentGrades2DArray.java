import java.util.Scanner;

public class StudentGrades2DArray {

    // Method to calculate percentage for a student
    public static double calculatePercentage(double[] marks) {
        double sum = 0;
        for (double mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
    }

    // Method to determine grade based on percentage
    public static String determineGrade(double percentage) {
        if (percentage >= 90) return "A+";
        else if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else return "F";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input number of students
        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();

        // Step 2: Create 2D array to store marks: rows = students, columns = subjects (physics, chemistry, maths)
        double[][] marks = new double[numberOfStudents][3];
        double[] percentages = new double[numberOfStudents];
        String[] grades = new String[numberOfStudents];

        // Step 3: Input marks for each student
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Student " + (i + 1) + ":");

            for (int j = 0; j < 3; j++) {
                while (true) {
                    String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                    System.out.print("  Enter " + subject + " marks: ");
                    double mark = sc.nextDouble();
                    if (mark >= 0) {
                        marks[i][j] = mark;
                        break;
                    } else {
                        System.out.println("  Marks must be positive. Try again.");
                    }
                }
            }

            // Step 4: Calculate percentage and grade
            percentages[i] = calculatePercentage(marks[i]);
            grades[i] = determineGrade(percentages[i]);
        }

        // Step 5: Display results
        System.out.println("\nStudent\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("%d\t%.2f\t%.2f\t\t%.2f\t%.2f\t\t%s\n",
                    i + 1, marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }

        sc.close();
    }
}
