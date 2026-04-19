import java.util.*;
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


// insert at beginning 
class Singly
{
    Node head=null;

    void insertAtBeginning(int data)
    {
        Node newNode=new Node(data);

        if(head==null)
        {
            head=newNode;
        }else
        {
            newNode.next=head;
            head=newNode;
        }

        
    }

    //display function

    void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data+"->");
        }
        System.out.println("NULL");
    }
}

public class Main1
{
    public static void main(String[] args)
    {
        Singly list=new Singly();
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);
    list.display();
    }
}
