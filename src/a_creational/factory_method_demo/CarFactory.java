package a_creational.factory_method_demo;

public class CarFactory {
    public Car getCar(String type, String engine, String bodyType, String brand) {

        if ("Family".equalsIgnoreCase(type)) return new FamilyVehicle(engine, bodyType, brand);
        else if ("Utility".equalsIgnoreCase(type)) return new UtilityVehicle(engine, bodyType, brand);

        return null;
    }
}
