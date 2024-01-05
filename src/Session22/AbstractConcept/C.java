package Session22.AbstractConcept;

public class C extends Base
{
    public void multiplication(int a, int b)
    {
        int product=a*b;
        System.out.println("Subtraction: " + product);
    }

    @Override
    public void addition(int a, int b) {
        int sum =3*a+3*b;
        System.out.println("Addition by C: " + sum);
    }
}
