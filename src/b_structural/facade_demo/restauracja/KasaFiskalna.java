package b_structural.facade_demo.restauracja;

import java.util.Random;

public class KasaFiskalna {
    public String dajRachunek() {
        Random random = new Random();
        return  random.nextInt(100) + "." + random.nextInt(99) + " PLN";
    }
}
