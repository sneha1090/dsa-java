class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data=data;
        this.next=null;
        this.prev=null;

    }
}

class doublylinkedlist
{
    Node head=null;
    //insert at beginning 

    void insertAtBeginning( int val)
    {
    Node newNode=new Node(val);
        if(head!=null)
        {
                newNode.next=head;
                  head.prev=newNode;
                
        }
           head=newNode;
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
         System.out.println("null");
    }

    
}
public class Main
{
public static void main(String[] args)
{
    doublylinkedlist dll=new doublylinkedlist();
    dll.insertAtBeginning(10);
    dll.insertAtBeginning(40);

    dll.display();
}
}