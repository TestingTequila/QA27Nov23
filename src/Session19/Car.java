package Session19;

public class Car
{
    public Car(String carName, String color, double price, boolean isAutomatic)
    {
        this.carName=carName;
        this.color=color;
        this.price=price;
        this.isAutomatic=isAutomatic;
    }

    public Car(String carName, String color)
    {
        this.carName=carName;
        this.color=color;
    }

    public Car(String carName, String color, double price)
    {
        this.carName=carName;
        this.color=color;
        this.price=price;
    }
    String carName;
    String color;
    double price;
    boolean isAutomatic;


}
