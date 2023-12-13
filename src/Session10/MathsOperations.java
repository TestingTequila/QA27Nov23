package Session10;

public class MathsOperations {
    public static void main(String[] args) {
        System.out.println(10 / 2); //I/I = I
        System.out.println(9 / 2);  // I/I = I

        System.out.println(9.0 / 2); // D/I= D
        System.out.println(9 / 2.0); // I/D =D
        System.out.println(9.0 / 2.0); // D/D = D

        //System.out.println(9/0); // Rest of the code below this will not be executed as this gives us an exception

        System.out.println(9.0 / 0);   // I/0 = AE but
        System.out.println(3.4 / 0);   // D/0 = Infinity
        System.out.println(9.0 / 0.0);//ID/0.0 = Infinity
        System.out.println(9 / 0.0);  //ID/0.0 = Infinity


        //System.out.println(0/0); // AE
        System.out.println(0.0 / 0); // NaN
        System.out.println(0 / 0.0); //NaN
        System.out.println(0.0 / 0.0); //NaN

        System.out.println(100 / 0.0);

        System.out.println(10 % 2);//0
        System.out.println(9 % 2);  //1
        System.out.println(9.2 % 2); //1.1999999999999993


    }
}
