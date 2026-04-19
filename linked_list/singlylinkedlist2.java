
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

 public class singlylinkedlist2
 {
    
       Node head=null;
       Node tail=null;
       
       void insertAtEnd(int val)

       {
         Node temp=head;
        Node newNode=new Node(val);
        if(head!=null)
        {
          temp=head;
          while(temp.next!=null)
          {
            temp=temp.next;
          }
             temp.next=newNode;
       }else
       {
            
           head=newNode;

       }
    }

    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) 
    {
          singlylinkedlist2 s=new singlylinkedlist2();
             s.insertAtEnd(10);
             s.insertAtEnd(20);
             s.insertAtEnd(30);

             s.display();
    }
}

