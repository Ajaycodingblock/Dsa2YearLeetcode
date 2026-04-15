import java.util.*;

class QueueUsingStack {

    // Two stacks
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    // ================= ENQUEUE =================
    void enqueue(int val) {
        // Always push into s1
        s1.push(val);
        System.out.println(val + " inserted");
    }

    // ================= DEQUEUE =================
    int dequeue() {

        // If both stacks empty → queue empty
        if (s1.isEmpty() && s2.isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        // Transfer elements only if s2 is empty
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        // Pop from s2 (FIFO order)
        return s2.pop();
    }

    // ================= SIZE =================
    int getSize() {
        return s1.size() + s2.size();
    }

    // ================= DISPLAY =================
    void display() {

        if (s1.isEmpty() && s2.isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.print("Queue: ");

        // Print elements of s2 (front part)
        for (int i = s2.size() - 1; i >= 0; i--) {
            System.out.print(s2.get(i) + " ");
        }

        // Print elements of s1 (rear part)
        for (int i = 0; i < s1.size(); i++) {
            System.out.print(s1.get(i) + " ");
        }

        System.out.println();
    }

    // ================= MAIN =================
    public static void main(String[] args) {

        QueueUsingStack q = new QueueUsingStack();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        System.out.println("Dequeued: " + q.dequeue());

        q.display();

        System.out.println("Size: " + q.getSize());
    }
}