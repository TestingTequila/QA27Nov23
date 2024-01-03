package Session21;

public class Employee
{
    String name;
    int age;

    public int add(int a, int b)
    {
        System.out.println("sum of two integer numbers");
        int sum=a+b;
        return sum;
    }

    public  void getInfo(Employee em)
    {
       em.name="Gaurav";
       em.age=30;
    }


}
