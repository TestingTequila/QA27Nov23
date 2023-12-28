package Session19;

public class ExecutingUsers
{
    public static void main(String[] args) {
        User u1 = new User("Jason", 30, "jason@janbask.com","test@1234", 43543534 );

        System.out.println(u1.name);
        System.out.println(u1.age);
        System.out.println(u1.email);
        System.out.println(u1.password);
        System.out.println(u1.phone);


        System.out.println("======================KERRIE=========================");
        User u2 = new User("Kerrie",26, "kerrie@janbask.com","test@4321" ,6575676567l );
        System.out.println(u2.name);
        System.out.println(u2.age);
        System.out.println(u2.email);
        System.out.println(u2.password);
        System.out.println(u2.phone);

        System.out.println("===================BEN============================");
        User u3 = new User("Ben", 23, 5676575656l);
        System.out.println(u3.name);
        System.out.println(u3.age);
        System.out.println(u3.phone);
        System.out.println(u3.email);
        System.out.println(u3.password);

        System.out.println("===================MARY============================");
        User u4 = new User("Mary", "mary@janbask.com", "test@1111", "5464465");
        System.out.println(u4.name);
        System.out.println(u4.email);
        System.out.println(u4.password);
        System.out.println(u4.age);// 0
        System.out.println(u4.phone);// 0
        System.out.println(User.price);




    }
}
