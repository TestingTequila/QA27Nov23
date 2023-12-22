package Session17;

public class ExecutingMethods {
    public static void main(String[] args) {

//        MethodWithReturnType mwrt = new MethodWithReturnType();
//        //int total =mwrt.addition1(12, 8); // void --> 20
//
//        int total1=mwrt.addition2(12, 8); // int --> 20
//        System.out.println(total1*5);

//        MethodWithReturnType mwtrt = new MethodWithReturnType();
//        if(mwtrt.isPresent("Jason"))
//        {
//            System.out.println("Student is present");
//        }
//        else
//        {
//            System.out.println("Student is absent");
//        }

        // Whatever be your salary, we are going to provide $1000 as Christmas bonus
//        MethodWithReturnType mwirt =new MethodWithReturnType();
//        double salaryWithBonus=mwirt.calculateSalary("Jason" ,5000, 1500);
//
//        System.out.println("Salary of the employee with Bonus is : $" + (salaryWithBonus+1000));

        EmployeeIdCard myEmp = new EmployeeIdCard();
        String name= myEmp.empName("Bill", "Fletcher");
        System.out.println("Name of Employee on ID Card should be : " + (name + " MEDMA"));


    }
}
