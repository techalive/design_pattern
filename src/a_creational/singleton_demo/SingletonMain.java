package a_creational.singleton_demo;

/**
 * Created by Technician on 2019-01-18.
 */
//public class SingletonMain {

//    public static void main(String[] args) {
//        Singleton tmp = new LazySingleton(); // czemu nie działa?
//        tmp.webConnection();
//    }
//}


public class SingletonMain {

    public static void main(String[] args) {
        Singleton tmp = LazySingleton.getInstance(); // tworzymy instancję
        tmp.webConnection();

        Singleton lazey2 = LazySingleton.getInstance();
        lazey2.webConnection();

        Singleton eager = EagerSingleton.getInstance();
        System.out.println(eager.hashCode());
        eager.webConnection();

        Singleton eager2 = EagerSingleton.getInstance();
        System.out.println(eager2.hashCode());
        eager2.webConnection();

        Singleton enumSingleton = EnumSingleton.INSTANCE;
        enumSingleton.webConnection();
    }
}
