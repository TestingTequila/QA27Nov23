package Session22.AbstractConcept;

public class ExecutingInheritance {
    public static void main(String[] args) {
        A a = new A();
        a.addition(12, 4);// a+b


        B b = new B();
        b.addition(12, 4); // a*a+b*b


        C c = new C();
        c.addition(12, 4); // 3*a+3*b


        D d = new D();
        d.addition(12, 4);// 4*a+4*b

        //Base b1 = new Base(); Cannot crete object of an abstract class

    }
}
