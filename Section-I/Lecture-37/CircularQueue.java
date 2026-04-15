class CircularQueue {

    int arr[];
    int front, rear, size, capacity;

    // Constructor
    CircularQueue(int cap) {
        capacity = cap;
        arr = new int[cap];
        front = 0;
        size = 0;
        rear = cap - 1; // important for circular logic
    }

    // ================= ENQUEUE =================
    void enqueue(int x) {

        // Check if queue is full
        if (size == capacity) {
            System.out.println("Queue Overflow");
            return;
        }

        // Circular increment of rear
        rear = (rear + 1) % capacity;

        arr[rear] = x;
        size++;

        System.out.println(x + " inserted");
    }

    // ================= DEQUEUE =================
    int dequeue() {

        // Check if queue is empty
        if (size == 0) {
            System.out.println("Queue Underflow");
            return -1;
        }

        int val = arr[front];

        // Circular increment of front
        front = (front + 1) % capacity;

        size--;
        return val;
    }

    // ================= GET FRONT =================
    int getFront() {
        if (size == 0) return -1;
        return arr[front];
    }

    // ================= GET REAR =================
    int getRear() {
        if (size == 0) return -1;
        return arr[rear];
    }

    // ================= DISPLAY =================
    void display() {

        if (size == 0) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.print("Queue: ");

        // Traverse circularly
        for (int i = 0; i < size; i++) {
            System.out.print(arr[(front + i) % capacity] + " ");
        }

        System.out.println();
    }

    // ================= MAIN =================
    public static void main(String[] args) {

        CircularQueue q = new CircularQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        q.display();

        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Front: " + q.getFront());
        System.out.println("Rear: " + q.getRear());

        q.enqueue(50);
        q.enqueue(60); // shows circular behavior

        q.display();
    }
}