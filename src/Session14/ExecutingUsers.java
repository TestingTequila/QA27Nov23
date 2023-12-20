package Session14;

public class ExecutingUsers
{
    public static void main(String[] args)
    {
         User u1 = new User();
         u1.name="Ravi";
         u1.age=25;
         u1.city="Perth";

         User u2=new User();
         u2.name="Anjali";
         u2.age=27;
         u2.city="LA";

        User u3 = new User();
        u3.name="Kareem";
        u3.age=30;
        u3.city="NY";

        System.out.println(u1.name +", " + u1.age + ", " + u1.city);
        System.out.println(u2.name +", " + u2.age + ", " + u2.city);
        System.out.println(u3.name +", " + u3.age + ", " + u3.city);

        System.out.println("===============================u1=u2=u3==================================");
        u1=u2=u3;
        System.out.println(u1.name +", " + u1.age + ", " + u1.city);
        System.out.println(u2.name +", " + u2.age + ", " + u2.city);
        System.out.println(u3.name +", " + u3.age + ", " + u3.city);

//        System.out.println("===============================u1=u2==================================");
//
//        u1=u2;  // u1 has broken its connection and started to point where u2 is pointing
//        System.out.println(u1.name +", " + u1.age + ", " + u1.city); // Anjali, 27, LA
//        System.out.println(u2.name +", " + u2.age + ", " + u2.city); // Anjali, 27, LA
//        System.out.println(u3.name +", " + u3.age + ", " + u3.city); // Kareem, 30, NY
//
//        System.out.println("===============================u2=u3==================================");
//
//        u2=u3; // u2 has broken its connection and started to point where u3 is pointing
//        System.out.println(u1.name +", " + u1.age + ", " + u1.city);// Anjali
//        System.out.println(u2.name +", " + u2.age + ", " + u2.city);// Kareem
//        System.out.println(u3.name +", " + u3.age + ", " + u3.city);// Kareem
//
//        System.out.println("===============================u3=u1==================================");
//        u3=u1; // u3 has broken its connection and started to point where u1 is pointing
//        System.out.println(u1.name +", " + u1.age + ", " + u1.city);// Anjali, 27, LA
//        System.out.println(u2.name +", " + u2.age + ", " + u2.city);// Kareem, 30, NY
//        System.out.println(u3.name +", " + u3.age + ", " + u3.city);// Anjali, 27, LA




    }
}
