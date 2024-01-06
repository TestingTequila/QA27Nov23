package Session23;

public class ExecutingCar
{
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();
        car.refuel();
        car.autoPilotMode();


        System.out.println("=============================================");

        BMW bmw = new BMW();
        bmw.start(); // overridden
        bmw.autoParking(); // individual
        bmw.stop(); // inherited
        bmw.refuel(); // inherited
        bmw.autoPilotMode();

        System.out.println("====================TOP CASTING========================");
        // Top Casting Concept
       //[start,stop,refuel]    [start, autoParking]
                     Car car1=new BMW();
                     car1.start();
                     car1.refuel();
                     car1.stop();
                     car1.autoPilotMode();

                     // DownCasting

        //BMW bmw1 = (BMW)new Car(); // DownCasting is not possible in Java at compile time


    }
}
