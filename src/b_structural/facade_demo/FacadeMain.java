package b_structural.facade_demo;

/**
 * Created by Technician on 2019-01-16.
 */
public class FacadeMain {

    public static void main(String[] args) {
        //Uzywamy fasady zeby ukryc przed klientem istnienie wielu skomplikowanych systemow
        Kelner kelner = new Kelner();
        kelner.przyniesPiwo();
        kelner.podajMenuVege();
        kelner.podajMenuMiesne();
        kelner.rachunekProsze();
    }
}
