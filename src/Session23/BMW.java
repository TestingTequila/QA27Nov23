package Session23;

public class BMW extends Car
{
    @Override
    public  void start()
    {
        System.out.println("BMW---start");
    }

    public  void autoParking()
    {
        System.out.println("BMW---autoParking");
    }

    @Override
    public  void autoPilotMode()
    {
        System.out.println("BMW --- AutoPilot");
    }
}
