import java.util.Scanner;
public class array1 {
    public static void main(String[] args) {
    
    Scanner r=new Scanner(System.in);
       int[] a=new int[5];
    System.out.println("pls enter ur array:");
    for(int i=0;i<5;i++)
     {
         a[i]=r.nextInt();
     }
    // System.out.println("display array:");
    // for(int i=0;i<5;i++)
    // {

    //     System.out.println(a[i]);
        
    // }

    //by using for-each loop 
    for(int num:a)
        {
           System.out.println(num);

        }
    
    r.close();

        



    }
}