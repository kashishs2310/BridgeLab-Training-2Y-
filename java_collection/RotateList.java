import java.util.*;

public class RotateList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        int rotateBy = 2;
        System.out.println("Original List: " + list);

        rotateList(list, rotateBy);
        System.out.println("Rotated List: " + list);
    }

    public static <T> void rotateList(List<T> list, int positions) {
        int size = list.size();
        positions %= size;
        List<T> rotated = new ArrayList<>();
        rotated.addAll(list.subList(positions, size));
        rotated.addAll(list.subList(0, positions));
        list.clear();
        list.addAll(rotated);
    }
}
