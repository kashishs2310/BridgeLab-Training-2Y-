import java.util.Scanner;

public class BMICalculator2D {
    
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
        int number = sc.nextInt();

        // Step 2: Create 2D array to store weight, height, and BMI
        double[][] personData = new double[number][3]; // column 0: weight, 1: height, 2: BMI
        String[] weightStatus = new String[number];

        // Step 3: Take input for weight and height
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) + ":");

            // Input weight
            while (true) {
                System.out.print("  Enter weight (kg): ");
                double weight = sc.nextDouble();
                if (weight > 0) {
                    personData[i][0] = weight;
                    break;
                } else {
                    System.out.println("  Weight must be positive. Try again.");
                }
            }

            // Input height
            while (true) {
                System.out.print("  Enter height (cm): ");
                double height = sc.nextDouble();
                if (height > 0) {
                    personData[i][1] = height;
                    break;
                } else {
                    System.out.println("  Height must be positive. Try again.");
                }
            }

            // Calculate BMI and store in 2D array
            personData[i][2] = calculateBMI(personData[i][0], personData[i][1]);
            // Determine weight status
            weightStatus[i] = determineStatus(personData[i][2]);
        }

        // Step 4: Display results
        System.out.println("\nWeight (kg)\tHeight (cm)\tBMI\t\tStatus");
        for (int i = 0; i < number; i++) {
            System.out.printf("%.2f\t\t%.2f\t\t%.2f\t%s\n",
                    personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        sc.close();
    }
}
