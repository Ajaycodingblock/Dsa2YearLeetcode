 class Node {

int data;
Node next;

Node(int val)
{
    data = val;
    next = null;
}    
}
public class ImplementLL {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node h2 =  new  Node(20);
        Node h3 =  new Node(30);
        head.next = h2;
        h2.next =  h3;

        Node temp =  head;

        while(temp !=null)
        {
            System.out.print(temp.data + ">> ");
            temp = temp.next;
        }


        // head -> h2 -> h3
        // System.out.println(head.data);
        // System.out.println(head.next);
        // System.out.println(head);
    }
}
