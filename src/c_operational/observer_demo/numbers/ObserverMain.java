package c_operational.observer_demo.numbers;

import java.util.Scanner;

/**
 * Created by Technician on 2019-01-17.
 */
public class ObserverMain {
    public static void main( String[] args ) {
        Subject sub = new Subject();
        // klient określa liczbę i typ Observerów
        new HexObserver(sub);
        new OctObserver(sub);
        new BinObserver(sub);
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("\nWpisz liczbę: ");
            sub.setState(scan.nextInt());
        }
    }
}
