// Node -> 
// Data
// addresss -> Next
// int dummy[] = new int[] ;
// Node h1 =  new Node();
class Node
{
    int data;
    Node Next;
    Node (int data)
    {
        this.data =  data;
        this.Next = null;
    }
}

class Linkedlist
{
    int length =0 ;
    Node head;
   void display()
{
    Node temp= head;
    while(temp!=null){
        System.out.print(temp.data + ">> ");
        temp =temp.Next;

    }
}
void insertAtHead(int data)
{  
    Node newnode = new Node(data);
    if(head == null){
        head = newnode;
        length++;
        return ;
    }
    newnode.Next = head;
    head = newnode;
    length++;
}
void insertAtTail(int data)
{
    Node newnode = new Node(data); 
    if(head==null){
        head = newnode;
        length++;
        return;
    }
    Node temp = head;
    while(temp.Next != null){
        temp = temp.Next;

    }
    length++;
    temp.Next = newnode;

}
void DeleteAtHead()
{
    if(head == null){
        System.out.println("list is empty");
        length--;
        return;
    }
    length--;
    head = head.Next;
}
void DeleteAtTail()
{ 


    if(head == null){ 
        length--;
        System.out.println("listis empty"); 
        return; 
    } 
    if(head.Next == null){ 
        head = null; 
        length--;
        return;
     } 
     Node temp = head; 
     while(temp.Next.Next != null){  
        temp = temp.Next; 

     } 
     temp.Next = null; 
     length--;

}
int sizell()
{
return length;
}


}


public class ImplementLL {
    public static void main(String[] args) {
    Linkedlist list1 = new Linkedlist();
    list1.insertAtHead(10);
    list1.insertAtHead(20);
    list1.insertAtHead(30); 
    list1.insertAtHead(40); // 30  10 20
   
   
System.out.println(list1.sizell());
    
}

}