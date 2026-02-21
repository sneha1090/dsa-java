

 class A
 {
    void swap (int a,int b)
    {
              int temp=a;
                  a=b;
                 b=temp;
        System.out.println("After Swapping");
        System.out.println(a);
        System.out.println(b);
    }
 }
public class swapping
 {
    public static void main(String[] args) 
    {
        A s=new A();
        s.swap(10,20);
        

    }
}
