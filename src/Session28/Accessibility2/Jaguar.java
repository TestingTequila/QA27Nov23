package Session28.Accessibility2;

import Session28.Accessibility.Car;

public class Jaguar extends Car
{
    public static void main(String[] args) {
        Jaguar jg = new Jaguar();
        System.out.println(jg.name); // public
        System.out.println(jg.color);// protected
    }
}
