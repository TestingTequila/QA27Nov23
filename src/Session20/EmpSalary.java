package Session20;

public class EmpSalary
{
   private String empName;
    private int empSalary;

    public String getEmpName() {
        return empName;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    public void setEmpName(String empName) {
        if(empName.equals("Kerrie"))
        {
            System.out.println(empName +" -Not an employee of this company");
        }
        else
        {
            this.empName = empName;
        }

    }

    public void setEmpSalary(int empSalary) {
        if(empSalary>10000)
        {
            System.out.println("Invalid Salary Entry made - Please check....");
        }else
        {
            this.empSalary = empSalary;
        }
    }


    public  void creditSalary()
    {
        System.out.println("Pay " + getEmpName() + " a Salary of $" + getEmpSalary() );

    }

}
