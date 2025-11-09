import java.util.*;

class Order implements Comparable<Order> {
    String orderId;
    int priority; // 1 = most urgent (VIP orders)

    Order(String orderId, int priority) {
        this.orderId = orderId;
        this.priority = priority;
    }

    @Override
    public int compareTo(Order o) {
        return Integer.compare(this.priority, o.priority);
    }

    public String toString() {
        return "Order " + orderId + " (Priority " + priority + ")";
    }
}

public class ECommerceOrderSystem {
    public static void main(String[] args) {
        PriorityQueue<Order> orders = new PriorityQueue<>();

        orders.add(new Order("A101", 3));
        orders.add(new Order("B202", 1));
        orders.add(new Order("C303", 2));

        while (!orders.isEmpty()) {
            System.out.println("Processing: " + orders.poll());
        }
    }
}
