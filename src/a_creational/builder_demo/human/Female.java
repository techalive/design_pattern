package a_creational.builder_demo.human;

// TODO: Zadanie - zrób klasę Female wraz z jej builderem! Sprawdź w BuilderMain.java, czy wszystko działa!
// TIP: Będzie wyglądać niemal identycznie jak klasa Male
public class Female implements Human {
    //wymagane parametry
    private String NAME;
    private String AGE;

    //parametry opcjonalne
    private boolean didCommitSin;
    private boolean worshipsGod;
    private String clothes;

    public String getSEX() {
        return this.getClass().getSimpleName();
    }

    public String getNAME() {
        return NAME;
    }

    public String getAGE() {
        return AGE;
    }

    public boolean isSinner() {
        return didCommitSin;
    }

    public boolean isWorshipper() {
        return worshipsGod;
    }

    @Override
    public String getClothes() {
        return clothes;
    }

    private Female(FemaleBuilder builder) {
        this.NAME = builder.NAME;
        this.AGE = builder.AGE;
        this.didCommitSin = builder.didCommitSin;
        this.worshipsGod = builder.worshipsGod;
        this.clothes  = builder.clothes;
    }

    static class FemaleBuilder implements HumanBuilder{
        // wymagane parametry
        private String NAME;
        private String AGE;

        // parametry opcjonalne
        private boolean didCommitSin;
        private boolean worshipsGod;
        private String clothes;

        public FemaleBuilder(String name, String age) {
            this.NAME = name;
            this.AGE = age;
            clothes = "she is naked";
        }

        public FemaleBuilder isWorshipper(boolean worshipsGod) {
            this.worshipsGod = worshipsGod;
            return this;
        }

        public FemaleBuilder isSinner(boolean didCommitSin) {
            this.didCommitSin = didCommitSin;
            return this;
        }

        @Override
        public HumanBuilder dressUp() {
            this.clothes = "dress";
            return this;
        }

        public Human build() {
            return new Female(this);
        }
    }
}
