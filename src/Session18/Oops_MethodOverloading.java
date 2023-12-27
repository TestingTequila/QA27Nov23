package Session18;

public class Oops_MethodOverloading {
    public void addition(int a, int b, double c) // addition-int, int
    {
        int sum = a + b;
        System.out.println(sum);
    }

    private void addition(int a, double b, double c) // addition-int, int
    {
        double sum = a + b+c;
        System.out.println(sum);
    }

    public int addition(int a, int b) // addition-int, int
    {
        int sum = a + b;
        System.out.println(sum);
        return sum;
    }

    public void addition(double a, int b) // addition- double, int
    {
        double sum = a + b;
        System.out.println(sum);
    }

    public void addition(int a, double b) // addition- double, int
    {
        double sum = a + b;
        System.out.println(sum);
    }

    public void addition(double a, double b) // addition- double, double
    {
        double sum = a + b;
        System.out.println(sum);
    }

    public  void addition(int a, int b, int c)
    {
        System.out.println(a+b+c);
    }

    public  void addition(int a, int b, float c)
    {
        System.out.println(a+b+c);
    }

    public  void addition(float a, int b, int c)
    {
        System.out.println(a+b+c);
    }

    public  void addition(double a, double b, double c)
    {
        System.out.println(a+b+c);
    }

    public void addition()
    {
        int i=9;
        int j=0;
        System.out.println(i/j);
    }
}
