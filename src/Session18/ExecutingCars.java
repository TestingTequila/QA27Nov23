package Session18;

public class ExecutingCars
{
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.name="BMW";
        c1.price=100000;
        c1.color="red";


        System.out.println("CAR_NAME, "+ c1.name + " CAR_PRICE, "+c1.price+ " CAR_COLOR, " +c1.color + " CAR_WHEELS, "+ Car.wheels);

        Car c2 = new Car();
        c2.name="audi";
        c2.price=120000;
        c2.color="White";
        System.out.println("CAR_NAME, "+ c2.name + "CAR_PRICE, "+c2.price+ "CAR_COLOR, " +c2.color + "CAR_WHEELS, "+ Car.wheels);

        Car c3 = new Car();
        c3.name="Jaguar";
        c3.price=45678;
        c3.color="Black";
        System.out.println("CAR_NAME, "+ c3.name + "CAR_PRICE, "+c3.price+ "CAR_COLOR, " +c3.color + "CAR_WHEELS, "+ Car.wheels);

        Car c4 = new Car();
        c4.name="RR";
        c4.price=546464;
        c4.color="Dark Red";
        System.out.println("CAR_NAME, "+ c4.name + "CAR_PRICE, "+c4.price+ "CAR_COLOR, " +c4.color + "CAR_WHEELS, "+ Car.wheels);

    }


}
