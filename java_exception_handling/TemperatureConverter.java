class InvalidTemperatureException extends Exception {
    public InvalidTemperatureException(String msg) { super(msg); }
}

public class TemperatureConverter {
    public static void main(String[] args) {
        double temp = -300;
        char unit = 'C';

        try {
            if ((unit == 'C' && temp < -273.15) || (unit == 'F' && temp < -459.67))
                throw new InvalidTemperatureException("Temperature below absolute zero is not possible!");

            if (unit == 'C') {
                double f = (temp * 9 / 5) + 32;
                System.out.println(temp + "°C = " + f + "°F");
            } else {
                double c = (temp - 32) * 5 / 9;
                System.out.println(temp + "°F = " + c + "°C");
            }
        } catch (InvalidTemperatureException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
