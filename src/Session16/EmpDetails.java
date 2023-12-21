package Session16;

public class EmpDetails
{
    int x; //20
    int y;//30
    public  void addition(int x , int y)
    {
        this.x=x;
        this.y=y;
        int sum = x+y;
        System.out.println("ADDITION: " + sum);
    }

    public  void multiplication2()
    {
        double product =(this.x * this.y)+10;
        System.out.println("Multiplication :" + product);
    }

    public  void multiplication1()
    {
        double product =(this.x * this.y)+10;
        System.out.println("Multiplication :" + product);
    }

    public  void calculateSalary(String empName, double salary)
    {
        int tax=30;// Local Variable
        System.out.println("Pay, " + empName + " a Salary of " + (salary-salary*tax/100) );
    }
}
