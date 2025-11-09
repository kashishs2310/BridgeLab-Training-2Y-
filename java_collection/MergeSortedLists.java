class MergeSortedLists {
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

    static Node merge(Node a, Node b) {
        if (a == null) return b;
        if (b == null) return a;

        if (a.data < b.data) {
            a.next = merge(a.next, b);
            return a;
        } else {
            b.next = merge(a, b.next);
            return b;
        }
    }

    static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        MergeSortedLists l1 = new MergeSortedLists();
        MergeSortedLists l2 = new MergeSortedLists();
        l1.insert(1); l1.insert(3); l1.insert(5);
        l2.insert(2); l2.insert(4); l2.insert(6);

        Node merged = merge(l1.head, l2.head);
        print(merged);
    }
}
