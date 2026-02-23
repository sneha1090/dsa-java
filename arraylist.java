
import java.util.ArrayList;
import java.util.Scanner;

public class arraylist
 {
    
    public static void main(String[] args)
     {

         
         //we can add element in list
         ArrayList <Integer>li =new ArrayList<>();  //syntax
            /* 
            li.add(10);
            li.add(40);
            li.add(60);
            li.add(80);
            li.add(20);

            //list print 
            System.err.println(li);

            //update
            li.set(2,90);
            System.out.println("update list: "+ li);

            //remove element 

            System.out.println(li.remove(4));
             System.out.println("after removing: "+ li);

              */

             //BY USING SCANNER INPUT
             Scanner r=new Scanner(System.in);
                 for(int i=0;i<4;i++)
                li.add(r.nextInt());                     //for adding element
              System.out.println(li);
                 r.close();
     } 
}
