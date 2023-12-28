package Session19;

public class ExecutingCar
{
    public static void main(String[] args) {
        Car c1 = new Car("Audi", "Red", 345345.56, true);
        System.out.println(c1.carName);
        System.out.println(c1.color);
        System.out.println(c1.price);
        System.out.println(c1.isAutomatic);

        Car c2 = new Car("BMW", "White");
        System.out.println(c2.carName);
        System.out.println(c2.color);

        Car c3 = new Car("Audi", "Red", 345345.56);
        System.out.println(c3.carName);
        System.out.println(c3.color);
        System.out.println(c3.price);
    }
}
