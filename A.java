import java.util.*;
public class A
{
    public static void main(String[] args) 
    {
        Scanner r=new Scanner(System.in);
        int s=r.nextInt();
        String x=r.next();
       switch(s)
       {
        case 1,3,5->System.out.println("monday");
                 
          case 4->{
                System.out.println("tuesday");
              switch(x)
                    {
            case "IT"->System.out.println("IT DEPARTMENT");
            case "sum"->System.out.println("sum is here");
            
            default->System.out.println("wrong choice");
                    }
                }
          
         
          default->System.out.println("not showing days");
           
    
       
        }
        r.close();
    }

    
           
    
}
