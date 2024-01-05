package Session22.AbstractConcept;

public class D extends  Base
{

    public void division(int a, int b)
    {
        int divide=a/b;
        System.out.println("Subtraction: " + divide);
    }

    @Override
    public void addition(int a, int b) {
        int sum = 4*a+4*b;
        System.out.println("Addition by D: " + sum);
    }
}
