import java.util.Scanner;

public class BMICalculator {
    
    // Method to calculate BMI
    public static double calculateBMI(double weightKg, double heightCm) {
        double heightM = heightCm / 100.0; // convert cm to meters
        return weightKg / (heightM * heightM);
    }

    // Method to determine weight status
    public static String determineStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal weight";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input for number of persons
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        // Step 2: Create arrays for weight, height, BMI, and status
        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        // Step 3: Take input for weight and height
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.print("  Enter weight (kg): ");
            weight[i] = sc.nextDouble();
            System.out.print("  Enter height (cm): ");
            height[i] = sc.nextDouble();
        }

        // Step 4: Calculate BMI and determine status
        for (int i = 0; i < n; i++) {
            bmi[i] = calculateBMI(weight[i], height[i]);
            status[i] = determineStatus(bmi[i]);
        }

        // Step 5: Display the details
        System.out.println("\nHeight (cm)\tWeight (kg)\tBMI\t\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f\t\t%.2f\t\t%.2f\t%s\n", height[i], weight[i], bmi[i], status[i]);
        }

        sc.close();
    }
}
