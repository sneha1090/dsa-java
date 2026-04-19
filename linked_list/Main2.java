
class Node
{
   int data;
   Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;

    }
}

 //insert at end

  class singlyLinkedList
 {
   Node head=null;
    void insertAtEnd(int data)
   {

    Node newNode=new Node(data);
       if(head==null)
       {
        head=newNode;
        return;
       }
       Node temp=head;
       while(temp.next!=null)
       {
        temp=temp.next;
       }
       temp.next=newNode;
       
   }


//display

void display()
{
      Node temp=head;
    while(temp!=null)
    {
        System.out.print(temp.data+" ->");
         temp=temp.next;
    }
    System.out.println("NULL");
}
 }





public class Main2{
     public static void main(String [] args)
     {
         singlyLinkedList list=new singlyLinkedList();
         list.insertAtEnd(10);
         list.insertAtEnd(30);
         list.insertAtEnd(50);

         list.display();
     }
}
