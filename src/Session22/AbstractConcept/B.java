package Session22.AbstractConcept;

public class B extends  Base
{
    public void subtraction(int a, int b)
    {
        int diff=a-b;
        System.out.println("Subtraction: " + diff);
    }

    @Override
    public void addition(int a, int b) {
        int sum=a*a+b*b;
        System.out.println("Addition by B: " + sum);
    }
}
