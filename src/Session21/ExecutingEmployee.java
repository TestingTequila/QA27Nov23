package Session21;

public class ExecutingEmployee
{
    public static void main(String[] args) {
        EmployeeDetails ed = new EmployeeDetails("Jason", 28);
        //System.out.println("Name: " + ed.name + " and age : " + ed.age +" City: "+ ed.city);

        EmployeeDetails epd = new EmployeeDetails(4534534.45, "Manager");
        System.out.println("Designation: " + epd.designation + " and Salary is: " + epd.salary + " Name: " + epd.name + " Age: " + epd.age + " City:" + epd.city);
    }
}
