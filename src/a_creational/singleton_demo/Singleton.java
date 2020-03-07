package a_creational.singleton_demo;

/**
 * Created by Technician on 2019-01-16.
 */
public class Singleton {

    // przypadek "lazy"
    private static Singleton instance = null; // domyślnie instancja jest nullem

    private Singleton() {
        // Ten fragment istnieje tylko po to, by Singleton nie inicjalizował się od razu
    }

    public static Singleton getInstance() { //dopiero wywołanie tej metody inicjalizuje singletona
        if (instance == null) {
            instance = new Singleton(); // to jest miejsce faktycznej inicjalizacji w metodzie
        }
        return instance; // jeśli już był inicjalizowany, to po prostu zwraca starą instancję
    }

    protected void webConnection() {
        System.out.println("connected to web");
    }
}
