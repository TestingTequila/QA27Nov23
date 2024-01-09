package Session24;

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

    @Override
    public  void sunRoof()
    {
        System.out.println("BMW -- sunRoof");
    }

}
