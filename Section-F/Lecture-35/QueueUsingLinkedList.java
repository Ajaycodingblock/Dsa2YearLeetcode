class QueueUsingLinkedList {

    // Node structure
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node front = null; // points to first element
    Node rear = null;  // points to last element
    int size = 0;      // to track size of queue

    // ================= ENQUEUE =================
    void enqueue(int val) {
        Node newNode = new Node(val);

        // If queue is empty
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode; // link new node at end
            rear = newNode;      // update rear
        }

        size++; // increase size
        System.out.println(val + " inserted");
    }

    // ================= DEQUEUE =================
    int dequeue() {

        // If queue is empty
        if (front == null) {
            System.out.println("Queue is Empty");
            return -1;
        }

        int val = front.data;
        front = front.next; // move front

        // If queue becomes empty
        if (front == null) {
            rear = null;
        }

        size--; // decrease size
        return val;
    }

    // ================= SIZE =================
    int getSize() {
        return size;
    }

    // ================= DISPLAY =================
    void display() {

        if (front == null) {
            System.out.println("Queue is Empty");
            return;
        }

        Node temp = front;

        System.out.print("Queue: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // ================= MAIN =================
    public static void main(String[] args) {

        QueueUsingLinkedList q = new QueueUsingLinkedList();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        System.out.println("Dequeued: " + q.dequeue());

        q.display();

        System.out.println("Size: " + q.getSize());
    }
}