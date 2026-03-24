class node
{
    int data;
    node next;

    //constructor

    node(int data)
    {
        this.data=data;
        this.next=null;
    }
    
}
public class singlyLinkedList
{
    public static void main(String[] args)
     {
          node head=new node(10);
          node second=new node(20);
          node third=new node(30);
          node fourth=new node(40);

          //linking them
          head.next=second;
          second.next=third;
          third.next=fourth;

          //display 
          node temp=head;
          while(temp!=null)
          {
            System.out.print(temp.data+"->");
            temp=temp.next;
          }
          System.out.println("null");
    }
}