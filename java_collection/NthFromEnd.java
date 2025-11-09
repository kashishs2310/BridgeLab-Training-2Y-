import java.util.*;

public class NthFromEnd {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        int n = 2;

        String nthElement = findNthFromEnd(list, n);
        if (nthElement != null) {
            System.out.println("Nth (" + n + ") element from end: " + nthElement);
        } else {
            System.out.println("Invalid N");
        }
    }

    public static <T> T findNthFromEnd(LinkedList<T> list, int n) {
        Iterator<T> mainPtr = list.iterator();
        Iterator<T> refPtr = list.iterator();

        for (int i = 0; i < n; i++) {
            if (refPtr.hasNext()) refPtr.next();
            else return null;
        }

        while (refPtr.hasNext()) {
            mainPtr.next();
            refPtr.next();
        }

        return mainPtr.next();
    }
}
