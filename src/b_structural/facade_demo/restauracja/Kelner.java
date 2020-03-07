package b_structural.facade_demo.restauracja;

import java.util.Scanner;

/**
 * Created by Technician on 2019-01-16.
 */
public class Kelner {

    public void przyniesPiwo(){
        Scanner reader = new Scanner(System.in); // tworzymy skaner na wpisy uzytkownika
        System.out.println("\"male\" czy \"duze\"?");
        String rozmiar = reader.nextLine(); // skanujemy odpowiedz
        reader.close(); // zamykamy skaner kiedy skonczylismy

        Bar bar = new Bar();
        System.out.println("Prosze, " + bar.dajPiwo(rozmiar));
    }

    public void podajMenuVege(){
        System.out.println("Menu vege to: " + new VegeMenu().dajMenu());
    }

    public void podajMenuMiesne(){
        System.out.println("Menu miesne to: " + MeatMenu.getMenu());
    }

    public void rachunekProsze(){
        KasaFiskalna kasa = new KasaFiskalna();
        System.out.println("Nalezy się " + kasa.dajRachunek());
    }
}
