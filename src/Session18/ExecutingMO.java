package Session18;

public class ExecutingMO
{
    public static void main(String[] args) {
        System.out.println("This will be executed");
        Oops_MethodOverloading mo = new Oops_MethodOverloading();
        mo.addition(12.45, 78.78, 56.67);
        mo.addition(12,56);

        MethodOverloadingExamples_Search search = new MethodOverloadingExamples_Search();
        search.search("Samsung", 1200);
        search.search(1278.45);
        search.search(1234.00, 1800.45);
        ExecutingMO emo = new ExecutingMO();
        emo.main("Ashish", "Programming");
        main("Ashish", 6);

    }

    public static void main(String args) {
        System.out.println("Ashish is my trainer");
    }

    public static void main(String args, int i) {
        System.out.println("I love Java");

    }

    public void main(String i, String j) {
        System.out.println(i +"I love Java" + j);
    }
}
