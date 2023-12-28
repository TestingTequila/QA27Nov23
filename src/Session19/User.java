package Session19;

public class User
{
    public User(String name, int age, String email, String password, long phone)
    {
        this.name=name;
        this.age=age;
        this.email=email;
        this.password=password;
        this.phone=phone;
    }

    public  User(String name, int age, long phone)
    {
        this.name=name;
        this.age=age;
        this.phone=phone;
    }

    public  User(String name, String email, String password, String price)
    {
        this.name=name;
        this.email=email;
        this.password=password;
        User.price=price;
    }
    String name;
    int age;
    String email;
    String password;
    long phone;

    static String price;


}
