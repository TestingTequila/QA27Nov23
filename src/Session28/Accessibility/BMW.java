package Session28.Accessibility;

public class BMW
{
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.name);//public
        System.out.println(car.color);//protected
        System.out.println(car.seller);//default
    }
}
