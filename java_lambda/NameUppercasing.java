import java.util.*;
import java.util.stream.Collectors;

public class NameUppercasing {
    public static void main(String[] args) {
        List<String> employees = Arrays.asList("Alicia", "Xander", "Blair", "Henry");

        List<String> upperNames = employees.stream()
                                           .map(String::toUpperCase)
                                           .collect(Collectors.toList());

        upperNames.forEach(System.out::println);
    }
}
