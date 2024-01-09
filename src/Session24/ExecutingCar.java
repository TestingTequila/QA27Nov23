package Session24;

public class ExecutingCar
{
    public static void main(String[] args) {



        System.out.println("====================================");
        Car car = new Car();
        car.start();
        car.stop();
        car.refuel();
        car.autoPilotMode();
        car.sunRoof();



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
                     car1.sunRoof();
        System.out.println("===================================================");

        Vehicle v = new Vehicle();
        v.sunRoof();

        Car c2 = new Car();
        c2.sunRoof();

        BMW bmw1 = new BMW();
        bmw1.sunRoof();

        //TopCasting

        Vehicle vh= new Car();
        vh.aIBreak(); // Vehicle AiBreak
        vh.selfDrive(); //Vehicle selfDriver
        vh.sunRoof(); // Car Sunroof

        Vehicle vh1 = new BMW();
        vh1.sunRoof();

        Car c3= new BMW();
        c3.sunRoof();

                     // DownCasting

        //BMW bmw1 = (BMW)new Car(); // DownCasting is not possible in Java at compile time


    }
}
