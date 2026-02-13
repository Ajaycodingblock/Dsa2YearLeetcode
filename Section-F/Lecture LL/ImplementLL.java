class Node {
int data;
Node next;
Node(int val)
{
    data = val;
    next = null;
}    
}

class Linkedlist
{

Node head;

void display()
{
    Node temp =  head ;
    while(temp!=null)
    {
        System.out.println(temp.data  + ">> ");
        temp =  temp.next;
    }
}
void insertAtHead(int data)
{
    Node newnode =  new Node(data);
    if(head ==  null)
    {
        head =  newnode;
        return;
    }
    newnode.next  = head;
    head =  newnode;

}

void insertAtTail(int data)
{
    Node newnode = new Node(data);
    if(head==null) {
        head = newnode;
        return;
    }
    Node temp = head;
    while (temp.next!= null) {
        temp = temp.next;
    }
    temp.next= newnode;
}

void deleteAtHead()
{

if(head==null){
    System.out.println("list is empty");
    return;
}
head=head.next;


}

void deleteAtTail()
{
if(head  == null)
{
    System.out.println("List is Empty");
    return ;
}

if(head.next == null)
{
    head =  null;
    return ;
}
Node temp =  head;


while(temp.next.next!=null)
{
    temp = temp.next;
}
// 10 20 30 40 

temp.next =  null;



}
}


public class ImplementLL {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node h2 =  new  Node(20);
        Node h3 =  new Node(30);
        head.next = h2;
        h2.next =  h3;
        


        // head -> h2 -> h3
        // System.out.println(head.data);
        // System.out.println(head.next);
        // System.out.println(head);
    }
}
