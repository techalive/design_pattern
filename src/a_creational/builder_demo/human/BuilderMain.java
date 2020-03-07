package a_creational.builder_demo.human;

public class BuilderMain {

    public static void main(String[] args) {
        //Uzywamy Buildera zeby dostac nowy obiekt, zawsze z dobrym stanem i potrzebnymi parametrami
        //Dla obiektów prostych lepsza jest metoda wytwórcza (factory method)
        Human adas = new Male.MaleBuilder("Adam", "28")
                .dressUp()
                .isSinner(false)
                .isWorshipper(true)
                .build();

        System.out.println(adas.getSEX());
        System.out.println(adas.getNAME());
        System.out.println(adas.getAGE() + " years old");
        System.out.println("is a sinner - " + adas.isSinner());
        System.out.println("is a worshipper - " + adas.isWorshipper());
        System.out.println("clothes: " + adas.getClothes());
        System.out.println();

        //TO DO: stwórz za pomocą buildera kobietę
        Human ewcia = null;

        System.out.println(ewcia.getSEX());
        System.out.println(ewcia.getNAME());
        System.out.println(ewcia.getAGE() + " years old");
        System.out.println("is a sinner - " + ewcia.isSinner());
        System.out.println("is a worshipper - " + ewcia.isWorshipper());
        System.out.println("clothes: " + ewcia.getClothes());
        System.out.println();
    }
}
