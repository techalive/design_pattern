package a_creational.singleton_demo;

public enum EnumSingleton implements Singleton {
    INSTANCE;

    public void webConnection() {
        System.out.println("connected to web");
    }

}
