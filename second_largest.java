import java.util.Scanner;

public class second_largest
 {
    public static void main(String[] args)
     {
        
        int a[]=new int[5];
        Scanner r=new Scanner(System.in);
        System.out.println("enter an array");
        for(int i=0;i<5;i++)
        {
           a[i]=r.nextInt();
        }

        System.out.println("display an array");
        for(int i=0;i<5;i++)
        {
           System.out.println(a[i]+ " ");
        }
             int largest=a[0];
             int second=a[0];

        System.out.println("second largest start code");
         for (int i=0; i<5;i++)
             {
            if (a[i]>largest)
            {
                second= largest;
                largest = a[i];
            } else if (a[i] >second&& a[i] != largest) 
            {
                second= a[i];
            }

            }
            System.out.println("Second Largest Element: " + second);

                r.close();
        }
    
        

        




    }
    
