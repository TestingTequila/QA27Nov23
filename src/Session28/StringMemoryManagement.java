package Session28;

public class StringMemoryManagement
{
    public static void main(String[] args) {
        //String literals
//        String str = "Selenium";
//        String str1= "Selenium";
//        String str2= "selenium";
//        System.out.println("======Using double equal==================");
//        System.out.println(str==str1);// true
//        System.out.println(str==str2);// false
//        System.out.println(str1==str2);// false
//
//        System.out.println("======Using equals method==================");
//        System.out.println(str.equals(str1));// true
//        System.out.println(str.equals(str2));// false
//        System.out.println(str1.equals(str2));// false

        //Using new keyword
        String s1 = new String("testing");//2
        String s2 = new String("testing");//1
        String s3="testing";//0
        String s4="testing";//0

//        System.out.println(s3==s4);// true
//        System.out.println(s3.equals(s4));// true

//        System.out.println(s1==s2);// false
//        System.out.println(s1.equals(s2));// true
//
//        Test t = new Test();
//        System.out.println(t.s1.equals(t.s2));

//        System.out.println(s1==s3);
//        System.out.println(s1.equals(s3));

        String s5 ="Testing";
        s5=null;
//        System.out.println(s5.length());
        String s6= "Testing";

        String s11 = new String("Test");//2
        String s22 = new String("Test");//1
        System.out.println(s11==s22);
        s11=s22;
        System.out.println(s11==s22);
        System.out.println(s11.equals(s22));


    }
}
