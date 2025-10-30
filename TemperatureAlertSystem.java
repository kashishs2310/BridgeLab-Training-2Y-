import java.util.function.Predicate;

public class TemperatureAlertSystem {
    public static void main(String[] args) {

        // Step 1: Define the threshold
        double threshold = 35.0;

        // Step 2: Create Predicate to check if temperature crosses threshold
        Predicate<Double> isHighTemp = temp -> temp > threshold;

        // Step 3: Test with different temperatures
        double[] readings = {30.5, 34.9, 36.2, 40.0, 28.7};

        // Step 4: Evaluate and alert
        for (double temp : readings) {
            if (isHighTemp.test(temp)) {
                System.out.println("Alert! Temperature " + temp + "°C crossed threshold of " + threshold + "°C");
            } else {
                System.out.println("Temperature " + temp + "°C is within safe range.");
            }
        }
    }
}
