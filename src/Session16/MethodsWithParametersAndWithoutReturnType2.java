package Session16;

public class MethodsWithParametersAndWithoutReturnType2
{
    // WAP to perform addition of two numbers

    int x;
    int y;

    public  void addition(int x,int y )
    {
        int sum = x+y;
        System.out.println("ADDITION: "+sum);
    }

    public  void abc(int x,int y )
    {
        this.x=x;
        this.y=y;
        System.out.println("X : " + x);
        System.out.println("X : " + y);
    }


}
