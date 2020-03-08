package a_creational.factory_method_demo;

public class FactoryMain {

    public static void main(String[] args) {

        CarFactory carFactory = new CarFactory();

        Car utility = carFactory.getCar("utility", "1.2 gas", "sedan", "toyota");
        Car family = carFactory.getCar("family", "1.4 TDI", "minivan", "mercedes");
        Car sport = carFactory.getCar("sport", "5.0 gas", "coupe", "Fiat 126p");

        System.out.println(utility.toString());
        System.out.println(family.toString());
        System.out.println(sport.toString());
    }
}