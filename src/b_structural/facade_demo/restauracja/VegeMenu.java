package b_structural.facade_demo.restauracja;

import java.util.ArrayList;

public class VegeMenu {
    public ArrayList<String> dajMenu() {
        String pozycja1 = "kapusta z grochem";
        String pozycja2 = "sojowe kotlety";
        String pozycja3 = "golabki z kasza";
        ArrayList<String> vegeMenu = new ArrayList<>();
        vegeMenu.add(pozycja1);
        vegeMenu.add(pozycja2);
        vegeMenu.add(pozycja3);
        return vegeMenu;
    }
}
