import java.util.*;
//passing arguments but no return

/*   class A
{

    void sum( int z)
    {
        System.out.println(z);
    }
}

public class function 
{
     public static void main(String[] args)
      {
        Scanner r=new Scanner(System.in);
        int x=r.nextInt();
        int y=r.nextInt();
        int z=x+y;
        A s=new A();
        s.sum(z);
     }
        */
     
    
// }

         // passing argument and return sum
         class A
         {
             int sum(int x, int y)
             {
                
                 int z= x+y;
                 return z;
                
                
                
             }
         }
         public class function
         {
            public static void main(String[] args)
             {
                   A s=new A();
                   int z=s.sum(10,20);
                 System.out.println(z);

            }
         }



