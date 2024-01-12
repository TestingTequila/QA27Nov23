package Session27.StackMemory;

public class Application
{
    public void m1()
    {
        System.out.println("m1 method");
        m2();
    }

    public void m2()
    {
        System.out.println("m2 method");
        m3();
    }

    public void m3()
    {
        System.out.println("m3 method");
        m1();
    }

}
