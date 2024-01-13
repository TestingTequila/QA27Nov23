package Session28.Accessibility;

public class Car
{
    public String name;
    private int price;
    protected String color;
    String seller;

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.name);
        System.out.println(car.price);
        System.out.println(car.color);
        System.out.println(car.seller);
    }
}
