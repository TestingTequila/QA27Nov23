package Session21;

public class ExecutingEmployee2
{
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.getInfo(emp); // Call by Reference
        emp.name="Tanya";
        emp.age=24;
        System.out.println("Name: "+emp.name+ " and age: " + emp.age);
        int total =emp.add(12,8); // call by value
        System.out.println("Total: " + total);
    }
}
