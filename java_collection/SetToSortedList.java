import java.util.*;

public class SetToSortedList {
    public static void main(String[] args) {
        Set<Integer> input = new HashSet<>(Arrays.asList(5, 3, 9, 1));

        // Convert to list and sort
        List<Integer> sorted = new ArrayList<>(input);
        Collections.sort(sorted);

        System.out.println("Input Set: " + input);
        System.out.println("Sorted List: " + sorted);
    }
}
