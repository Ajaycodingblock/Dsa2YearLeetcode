class Node
{
    int data ;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }

}



class Linkedlist
{
Node head ;
void display(){
    Node temp = head;
    while(temp != null ){
        System.out.print(temp.data + " >> ");
        temp = temp.next;
    }
}

void insertAtHead(int data)
{
    Node newnode = new Node (data);
    if(head == null){
        head = newnode;
        return;
    }
    newnode.next = head;
    head = newnode;

}

void insertAtTail(int data)
{
  Node newnode = new Node(data) ;
  if(head == null){
    head =newnode;
    return;
  }
  Node temp = head;
  while(temp.next != null){
    temp = temp.next;
  }
  temp.next = newnode;
}
 
void deleteAtHead()
{
    if(head == null)
    {
        System.out.println(x:"List is empty");
        return;
    }
    head = head.next;
}

void deleteAtTail()
{



    if(head ==null){
        System.out.println("listisempyt");
        return;


    }
    if(head.next == null){
        head = null;
        return;

    }
    Node temp = head;
    while(temp.next.next != null){
        temp = temp.next;

    }
    temp.next = null;

}

}
public class LLiImplement {
    public static void main(String[] args) {

        Linkedlist list1 = new Linkedlist();

          list1.insertAtHead(10);
          list1.insertAtHead(20);
          list1.insertAtTail(40);
          list1.deleteAtTail();
          list1.display();

          //



    

    }
}