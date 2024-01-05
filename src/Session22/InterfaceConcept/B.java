package Session22.InterfaceConcept;

public class B implements Base {

    @Override
    public void addition(int a, int b) {
        System.out.println("Addition by B: " + (2 * a + b));
    }

    @Override
    public void subtraction(int a, int b) {
        System.out.println("Subtraction by B: " + (2 * a - b));
    }

    @Override
    public void multiplication(int a, int b) {
        System.out.println("Multiplication by B: " + (2 * a * b));
    }

    @Override
    public void division(int a, int b) {
        System.out.println("Division by B: " + (2 * a / b));
    }
}
