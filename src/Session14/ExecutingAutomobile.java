package Session14;

public class ExecutingAutomobile {
    public static void main(String[] args) {
        //NameOfTHeClassWhoseCopy/ObjectYouWantToCreate aliasName = new NameOfTHeClassWhoseCopy/ObjectYouWantToCreate();
        Automobile car = new Automobile();
        car.brandName = "Mercedes";
        car.enginePower = 760;
        car.numberOfWheels = 4;
        car.isAutomatic = true;
        car.fuelType = "Petrol";


        Automobile truck =new Automobile();
        truck.brandName="Tata";
        truck.enginePower=2056;
        truck.numberOfWheels=10;
        truck.isAutomatic=false;
        truck.fuelType="Diesel";

        Automobile bus =new Automobile();
        bus.brandName="Audi";
        bus.enginePower=1115;
        bus.numberOfWheels=8;
        bus.isAutomatic=true;
        bus.fuelType="Electric";
    }
}
