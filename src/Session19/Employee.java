package Session19;

public class Employee
{
    // Default Constructor
   public Employee()
   {
         System.out.println("This is default constructor provided by Java Compiler");
   }

    public Employee(int i)
    {
        System.out.println("This is my constructor with value:" + i);
    }

    public Employee(int age, String name)
    {
        System.out.println("This is my constructor with value:" + name + " and age as :" + age);
    }

}
