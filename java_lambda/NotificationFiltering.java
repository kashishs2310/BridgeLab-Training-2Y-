import java.util.*;
import java.util.function.Predicate;

class Alert {
    String message;
    String type; // "Critical", "Normal", "Low"

    Alert(String message, String type) {
        this.message = message;
        this.type = type;
    }

    public String toString() {
        return "[" + type + "] " + message;
    }
}

public class NotificationFiltering {
    public static void main(String[] args) {
        List<Alert> alerts = Arrays.asList(
                new Alert("Heart rate abnormal", "Critical"),
                new Alert("Appointment reminder", "Normal"),
                new Alert("Medication schedule", "Low")
        );

        Predicate<Alert> showOnlyCritical = alert -> alert.type.equalsIgnoreCase("Critical");

        System.out.println("Filtered Critical Alerts:");
        alerts.stream()
              .filter(showOnlyCritical)
              .forEach(System.out::println);
    }
}
