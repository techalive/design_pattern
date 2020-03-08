package a_creational.singleton_demo;

public class EagerSingleton implements Singleton {

    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {}

    public static EagerSingleton getInstance() {
        return instance;
    }

    public void webConnection() {
        System.out.println("connected to web");
    }
}
