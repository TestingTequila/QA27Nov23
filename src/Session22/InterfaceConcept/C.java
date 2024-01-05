package Session22.InterfaceConcept;

public class C implements Base
{
    @Override
    public void addition(int a, int b) {
        System.out.println("Addition by C: " +(3*a+b));
    }

    @Override
    public void subtraction(int a, int b) {
        System.out.println("Subtraction by C: " +(3*a-b));
    }

    @Override
    public void multiplication(int a, int b) {
        System.out.println("Multiplication by C: " +(3*a*b));
    }

    @Override
    public void division(int a, int b) {
        System.out.println("Division by C: " +(3*a/b));
    }
}
