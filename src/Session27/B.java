package Session27;

public class B extends  A{

    public B()
    {
        System.out.println("Calling class B's Constructor");
    }

    public B(int i)
    {
        System.out.println("Calling class B's Constructor: " + i);
    }
    @Override
    public void m2() {
        System.out.println("Class B----overridden m2 method");
    }

    public void b1()
    {
        System.out.println("Class B ---b1 method");
    }

    @Override
    public void i1() {
        System.out.println("Class B ----i1 method from interface");
    }
}
