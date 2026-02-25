
sealed class Person permits Employee, Student
{
    void show()
    {
        System.out.println("I am learner");
    }
}

final class Employee extends Person
{
    void show()
    {
        System.out.println("I am Employee");
    }
}

final class Student extends Person
{
    void show()
    {
        System.out.println("I am Student");
    }
}

public class Sealed
{
    public static void main(String[] args)
    {
        Employee e = new Employee();
        Student s = new Student();

        e.show();
        s.show();
    }
}
    

