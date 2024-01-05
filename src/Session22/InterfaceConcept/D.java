package Session22.InterfaceConcept;

public class D implements Base
{
    @Override
    public void addition(int a, int b) {
        System.out.println("Addition by D: " +(4*a+b));
    }

    @Override
    public void subtraction(int a, int b) {
        System.out.println("Subtraction by D: " +(4*a-b));
    }

    @Override
    public void multiplication(int a, int b) {
        System.out.println("Multiplication by D: " +(4*a*b));
    }

    @Override
    public void division(int a, int b) {
        System.out.println("Division by D: " +(4*a/b));
    }

}
