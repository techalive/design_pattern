package a_creational.singleton_demo;

public class LazySingleton implements Singleton {

    private static LazySingleton instance = null; // domyślnie instancja jest nullem

    private LazySingleton() {
        // Ten fragment istnieje tylko po to, by LazySingleton nie inicjalizował się od razu
    }

    public static LazySingleton getInstance() { //dopiero wywołanie tej metody inicjalizuje singletona
        if (instance == null) {
            System.out.println("Tworzę");
            instance = new LazySingleton(); // to jest miejsce faktycznej inicjalizacji w metodzie
        }
        System.out.println("zwracam");
        return instance; // jeśli już był inicjalizowany, to po prostu zwraca starą instancję
    }

    public void webConnection() {
        System.out.println("connected to web");
    }
}
