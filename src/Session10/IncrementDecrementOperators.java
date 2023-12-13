package Session10;

public class IncrementDecrementOperators
{
    public static void main(String[] args)
    {
        int m =200;
        int n = m++;

        System.out.println(--m);
        System.out.println(n);
        System.out.println(m++);
        System.out.println(m);
        System.out.println(m--); //201
        System.out.println(m); //200

        System.out.println(--n);
        System.out.println(n);
        System.out.println(++m);


    }
}
