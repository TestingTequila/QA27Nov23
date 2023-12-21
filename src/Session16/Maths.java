package Session16;

public class Maths
{
    // WAP to print the full name of the person

    String fName;
    String lName;
    // method

    public  void empFullName(String fName, String lName)
    {
        this.fName=fName;
        this.lName=lName;
        String fullName=fName + " " + lName;
        System.out.println(fullName);
    }

    public  void empSalary(double salary)
    {
        System.out.println("Emp Name:" + this.fName + " " + this.lName + " AND SALARY: " + salary);
    }

    public  void sSN()
    {
        System.out.println(" Generate SSN for name :" + this.fName + " " + this.lName);
    }


}
