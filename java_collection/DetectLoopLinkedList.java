class DetectLoopLinkedList {
    Node head;

    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) head = newNode;
        else {
            Node temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newNode;
        }
    }

    boolean detectLoop() {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        DetectLoopLinkedList list = new DetectLoopLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);

        // Create a loop for testing
        list.head.next.next.next = list.head;

        if (list.detectLoop())
            System.out.println("Loop detected!");
        else
            System.out.println("No loop found.");
    }
}
