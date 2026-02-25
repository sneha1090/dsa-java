
 record employee(int id,String name, int salary)
 {

 }
  public class Record
  {
    public static void main(String[] args)
     {
         employee e=new employee( 1,"sneha",2000);
          System.out.println(e.id());
          System.out.println(e.name());
          System.out.println(e.salary());
           
          System.err.println("final records: "+e.toString());
    }
  }
