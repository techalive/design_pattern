package b_structural.facade_demo.restauracja;

/**
 * Created by Technician on 2019-01-16.
 */
public class Klient {

    public static void main(String[] args) {
        //Uzywamy fasady zeby ukryc przed klientem istnienie wielu skomplikowanych systemow
        Kelner kelner = new Kelner();
        kelner.przyniesPiwo();
        kelner.podajMenuVege();
        kelner.podajMenuMiesne();
        kelner.rachunekProsze();
    }
}
