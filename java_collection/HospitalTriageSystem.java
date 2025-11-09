import java.util.*;

class Patient implements Comparable<Patient> {
    String name;
    int priority; // 1 = most urgent

    Patient(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public int compareTo(Patient other) {
        return Integer.compare(this.priority, other.priority);
    }

    public String toString() {
        return name + " (Priority " + priority + ")";
    }
}

public class HospitalTriageSystem {
    public static void main(String[] args) {
        PriorityQueue<Patient> queue = new PriorityQueue<>();

        queue.add(new Patient("John", 2));
        queue.add(new Patient("Alice", 1));
        queue.add(new Patient("Bob", 3));

        while (!queue.isEmpty()) {
            System.out.println("Treating: " + queue.poll());
        }
    }
}
