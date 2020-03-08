package a_creational.factory_method_demo;

/**
 * Created by Technician on 2019-01-16.
 */
public class SportCar extends Car {
    // TODO Stworzcie swoja fabryke samochodow sportowych na podstawie FamilyVehicle.java i UtilityVehicle.java!
    // TIP: Nie zapomnijcie o typie samochodu! Pobieramy nazwe klasy a z niej prosta nazwe.
    private String type;
    private String engine;
    private String bodyType;
    private String brand;

    public SportCar(String engine, String bodyType, String brand) {
        this.type = this.getClass().getSimpleName();
        this.engine = engine;
        this.bodyType = bodyType;
        this.brand = brand;
    }

    @Override
    public String getType() { return this.type; }

    @Override
    public String getEngine() {
        return this.engine;
    }

    @Override
    public String getBodyType() {
        return this.bodyType;
    }

    @Override
    public String getBrand() {
        return this.brand;
    }
}
