package Session20;

public class EmpSalary2
{
   private String empName;
    private int empSalary;

    public String getEmpName()
    {
        String name = null;
        if(empName.equals("Kerrie"))
        {
            System.out.println(empName+ " - is not an employee of this Company");
             name = null;
        }
        else {
            name= empName;
        }

        return name;
    }

    public int getEmpSalary() {
        if(empSalary>10000)
        {
            System.out.println("Invalid Salary - Please Check...");
            return 0;
        }
        else {
            return empSalary;
        }
    }

   public EmpSalary2(String empName, int empSalary)
   {
       this.empName=empName;
       this.empSalary=empSalary;
   }


    public  void creditSalary()
    {
        System.out.println("Pay " + getEmpName() + " a Salary of $" + getEmpSalary() );

    }

}
