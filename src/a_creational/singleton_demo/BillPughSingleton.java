package a_creational.singleton_demo;


public class BillPughSingleton implements Singleton {
    private BillPughSingleton(){}

    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }

    public void webConnection() {
        System.out.println("connected to web");
    }
}
