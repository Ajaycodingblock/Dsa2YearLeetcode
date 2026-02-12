class Node
{
int data;
Node next;
Node(int data)
{
   this. data =  data;
    this. next =  null; 
}
}

class LinkedList
{
    Node head;


  void display()
  { 
    Node temp  =  head;

    while(temp != null)
{
    System.out.print(temp.data +  ">> ");
    temp = temp.next;
}
  }

  void insertAtHead(int data)
  {
Node newnode =  new Node(data);

if(head== null)
{
    head =  newnode;
    return;
}
// 40 // 10 20 30    40
      newnode.next =  head;
      head  =  newnode ;
  }

  void insertAtTail(int data)
  {

Node newnode =  new Node(data);

if(head ==  null)
{
    head =  newnode;
    return;
}

Node temp = head ;

while(temp.next!= null)
{
    temp = temp.next;
}
temp.next= newnode;



}






}




public class LLiImplement {
    public static void main(String[] args) {
        
    Node head =  new Node(10);
    Node h1 =  new Node (20 );
    Node h2 =  new Node (30);
    System.out.println(head.data);
    System.out.println(head.next);
    System.out.println(h1);
    head.next =  h1;
    h1.next = h2;






    }
}