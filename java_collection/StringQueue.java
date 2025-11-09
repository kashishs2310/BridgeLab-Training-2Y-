import java.util.*;

public class StringQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherry");

        System.out.println("Queue: " + queue);
        System.out.println("Peek (front): " + queue.peek());
        System.out.println("Removed: " + queue.remove());
        System.out.println("Queue after removal: " + queue);
    }
}
