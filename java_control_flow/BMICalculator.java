import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and populate array
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100.0; // convert cm to meters
            double bmi = weight / (heightM * heightM);
            data[i][2] = bmi;
        }
    }

    // Method to determine BMI status
    public static String[] determineBMIStatus(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi < 25) {
                status[i] = "Normal";
            } else if (bmi < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] teamData = new double[10][3]; // 10 members, 3 columns

        // Take input for weight and height
        for (int i = 0; i < teamData.length; i++) {
            System.out.print("Enter weight (kg) of member " + (i + 1) + ": ");
            teamData[i][0] = scanner.nextDouble();

            System.out.print("Enter height (cm) of member " + (i + 1) + ": ");
            teamData[i][1] = scanner.nextDouble();
        }

        // Calculate BMI
        calculateBMI(teamData);

        // Get BMI status
        String[] status = determineBMIStatus(teamData);

        // Display results
        System.out.println("\nTeam Members BMI Report:");
        System.out.println("Member\tWeight(kg)\tHeight(cm)\tBMI\t\tStatus");
        for (int i = 0; i < teamData.length; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s%n",
                    (i + 1), teamData[i][0], teamData[i][1], teamData[i][2], status[i]);
        }

        scanner.close();
    }
}
