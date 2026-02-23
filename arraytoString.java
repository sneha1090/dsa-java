import java.util.*;
public class arraytoString 
{
    public static void main(String[] args)
     {
         Scanner r=new Scanner(System.in);
         int arr[]=new int[5];

         //for inpurt array
         for(int i=0;i<5;i++)
         {
            arr[i]=r.nextInt();
         }

         //for display array in form of string
         
            System.out.println("show array in form of string :" +Arrays.toString(arr));
        r.close();
    }
    

}
