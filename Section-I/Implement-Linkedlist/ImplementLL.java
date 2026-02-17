// Node class → represents each element
class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}

// Linked list class
class Linkedlist {

    Node head;

    // ================= DISPLAY =================
    void display() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // ================= INSERT AT HEAD =================
    void insertAtHead(int data) {

        Node newnode = new Node(data);

        newnode.next = head;
        head = newnode;
    }

    // ================= INSERT AT TAIL =================
    void insertAtTail(int data) {

        Node newnode = new Node(data);

        if (head == null) {
            head = newnode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newnode;
    }

    // ================= INSERT AT POSITION =================
    void insertAtPosition(int pos, int data) {

        if (pos == 1) {
            insertAtHead(data);
            return;
        }

        Node newnode = new Node(data);
        Node temp = head;

        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }

        newnode.next = temp.next;
        temp.next = newnode;
    }

    // ================= DELETE AT HEAD =================
    void deleteAtHead() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        head = head.next;
    }

    // ================= DELETE AT TAIL =================
    void deleteAtTail() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
    }

    // ================= DELETE AT POSITION =================
    void deleteAtPosition(int pos) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (pos == 1) {
            deleteAtHead();
            return;
        }

        Node temp = head;

        for (int i = 1; i < pos - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Invalid position");
            return;
        }

        temp.next = temp.next.next;
    }
}

// ================= MAIN CLASS =================
public class ImplementLL {

    public static void main(String[] args) {

        Linkedlist list = new Linkedlist();

        System.out.println("Insert at tail:");
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.display();

        System.out.println("\nInsert at head:");
        list.insertAtHead(5);
        list.display();

        System.out.println("\nInsert 99 at position 3:");
        list.insertAtPosition(3, 99);
        list.display();

        System.out.println("\nDelete head:");
        list.deleteAtHead();
        list.display();

        System.out.println("\nDelete tail:");
        list.deleteAtTail();
        list.display();

        System.out.println("\nDelete position 2:");
        list.deleteAtPosition(2);
        list.display();
    }
}
