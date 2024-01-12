package Session27;

public abstract class A implements I{

    public A()
    {
        System.out.println("Calling Abstract Class A's Constructor");
    }

    public A(int i)
    {
        System.out.println("Calling Abstract Class A's Constructor: " + i);
    }
    public  void m1()
    {
        System.out.println("m1 method");
    }

    public  abstract void m2();
}
