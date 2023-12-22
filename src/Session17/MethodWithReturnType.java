package Session17;

public class MethodWithReturnType {

    public void addition1(int a, int b) {
        int sum = a + b;
        System.out.println("ADDITION: " + sum);
    }

    public int addition2(int a, int b) {
        int sum = a + b;
        System.out.println("ADDITION: " + sum);
        return sum;
    }

    public boolean isPresent(String studentName) {
        boolean flag;
        if (studentName == "Jason") {
            flag = true;
        } else {
            flag = false;
        }

        return flag;
    }

    public double calculateSalary(String empName, double basicSalary, double travelAllowance) {
        double totalSalary = basicSalary + travelAllowance;
        System.out.println("Salary of " +empName+ " without Bonus is : $" + totalSalary);
        return totalSalary;
    }
}
