import java.util.*;
public class array2d
{
    public static void main(String[] args)
     {
        Scanner r=new Scanner(System.in);
          int arr[][]=new int [3][3];
        
        //for input 
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
               arr[i][j]=r.nextInt();
            }
        }

        //for display array 
        /* 
        System.out.println("display arrays: ");
         for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
               System.err.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        */

        
        // by using string type

        for(int i=0;i<3;i++)
          System.out.println(Arrays.toString(arr[i]));
        r.close();
    }
}
