package Session18;

public class Car
{
    String name;
    int price;
    String color;
    final static int wheels=4;

    public  void start()
    {
        Car.stop();
        System.out.println(Car.wheels);
        System.out.println(name);
        System.out.println(price);

    }

    public  static void stop()
    {
        Car cc = new Car();
        cc.start();
        cc.name="Honda";
        cc.price=34543;
        cc.color="Blue";
        System.out.println(wheels);
        //static int x=45; cant make local variable as static
    }
}
