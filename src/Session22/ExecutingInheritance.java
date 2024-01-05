package Session22;

public class ExecutingInheritance
{
    public static void main(String[] args) {
        A a = new A();
        a.addition(12,8);
        //a.num=20;

        B b = new B();
        b.subtraction(12,4);
        b.addition(12,8);
        //b.num=34;

        C c = new C();
        c.addition(12,4);
        c.subtraction(12,4);
        c.multiplication(12,4);
        //c.num=34;

        D d = new D();
        d.addition(12,4);
        d.subtraction(12,4);
        d.multiplication(12,4);
        d.division(12,4);
        //d.num=56;
    }
}
