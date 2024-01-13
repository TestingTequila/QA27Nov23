package Session28.Accessibility;

public class Audi extends Car
{
    public static void main(String[] args) {
        Audi au = new Audi();
        System.out.println(au.name); //public
        System.out.println(au.color);// protected
        System.out.println(au.seller);// default

    }
}
