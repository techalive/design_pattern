package a_creational.factory_method_demo;

/**
 * Created by Technician on 2019-01-16.
 */
public abstract class Car {

    public abstract String getType();
    public abstract String getEngine();
    public abstract String getBodyType();
    public abstract String getBrand();

    @Override
    public String toString() {
        return "Your " + getType() + " is: " + getEngine() + ", " + getBodyType() + ", " + getBrand() + ".";
    }
}
