package Session19;

public class ExecutingEmployee
{
    public static void main(String[] args)
    {
         Employee emp = new Employee();// This will call the default constructor.
         Employee emp1 = new Employee(10);
         Employee emp2 = new Employee(44, "Jason");
    }
}
