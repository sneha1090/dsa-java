import java.util.*;

public class arraylistMaxandRev
{
    public static void main(String[] args)
     {
        Scanner r =new Scanner(System.in);
        ArrayList<Integer> li=new ArrayList<>();
        for(int i=0;i<4;i++)
        li.add(r.nextInt());
           System.out.println("overall list: "+ li);

/* 

        // find max element in list
        int largest = li.get(0);   // first element

        for(int i = 1; i < li.size(); i++)
        {
            if(li.get(i) > largest)
            {
                largest = li.get(i);
            }
        }

        System.out.println("Maximum element: " + largest);


    */
      //find reverse 
       for(int i=li.size()-1;i>=0;i--)
       {
            System.out.println("after reversing :" +li.get(i));
       }


        r.close();
        
     }
}