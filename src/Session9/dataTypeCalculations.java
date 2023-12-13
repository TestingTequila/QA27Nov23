package Session9;

public class dataTypeCalculations
{
    public static void main(String[] args) {

        //10
        byte b1=10;
        byte b11=12;

        int sum =b1+b11; //137
        System.out.println(sum);

        float f1= (float) 12.33; // 4 byte
        System.out.println(f1);

        double d2= 123.34453455;
        System.out.println(d2);

        double d=f1+d2;
        System.out.println(d);

        int i1 = 123;
        int i2 =31;
        int add = i1+i2;
        System.out.println(add);

        float f11 = (float) 123.34;
        float f12 = 125.765f;
        float floatSum=f11+f12;
        System.out.println(floatSum);

        //char =2 bytes [16 bits]
        char c1='a'; //[a-z]
        System.out.println(c1); //a [97]

        char c11= 'b';
        System.out.println(c11); // b [98]

        System.out.println(c1+c11); // 195

//        char c2='1'; //[1-9]
//        System.out.println(c2);
//
        char c3 = 'A'; //[A-Z] [65+97]
        System.out.println(c3);

        System.out.println(c3+c1); //[65+97]
//
//        char c4='$'; //[! to +]
//        System.out.println(c4);

          char u1= 'a';//97
          char u2='b'; //98

        System.out.println((int)u1);
        System.out.println((int)u2);

        System.out.println((int)u1+(int)u2);
        System.out.println(u1+3);//a, 97
        System.out.println((int)'A');
        System.out.println(u1+'A'); //97+65

        System.out.println(u1+""+u2);

        //boolean - true/false [~1 bit]
        boolean bl= true;
        System.out.println(bl);

        boolean bln=false;
        System.out.println(bln);

        System.out.println(u1+""+u2);//ab

        //range
        // memory
        // mathematical
    }
}
