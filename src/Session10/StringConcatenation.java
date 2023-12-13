package Session10;

public class StringConcatenation
{
    public static void main(String[] args)
    {
       // non-primitive data types - String
       String statement="My name in Anthony";
       String name= "Ashish";
//        System.out.println(statement);
//        System.out.println(name);

        // String Concatenation

        String x = "Hello";
        String y ="World";

        int a = 100;
        int b =200;

        System.out.println(x); // Hello
        System.out.println(y); // World

        System.out.println(x+y); //HelloWorld

        System.out.println(a); //100
        System.out.println(b); //200

        System.out.println(x+a); // Hello100
        System.out.println(a+x); // 100Hello

        System.out.println(a+b+x+y); //300HelloWorld
        System.out.println(x+y+a+b); //HelloWorld100200

        System.out.println(a+x+b+y); //100Hello200World

        System.out.println(x+y+(a+b)); // HelloWorld300

        System.out.println(a+b+x+y+a+b);//300HelloWorld100200
        System.out.println(a+b+b+x+(a+b+20)); //500Hello320
        System.out.println(a+b+b+x+a+b+20);   //500Hello10020020




    }
}
