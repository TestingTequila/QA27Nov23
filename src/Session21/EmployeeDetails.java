package Session21;

public class EmployeeDetails
{
    String name;
    int age;
    String city;
    double salary;
    String designation;

    public EmployeeDetails(String name, int age)
    {
           this("Pune");
           this.name= name;
           this.age=age;

    }

    public EmployeeDetails(String city)
    {
        this.city=city;
    }

    public EmployeeDetails(double salary, String designation)
    {
        this("Jason", 28);
        this.salary=salary;
        this.designation=designation;
    }

    public  void daysPresent()
    {

    }
}
