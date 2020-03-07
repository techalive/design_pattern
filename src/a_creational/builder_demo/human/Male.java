package a_creational.builder_demo.human;

public class Male implements Human {
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

    private Male(MaleBuilder builder) {
        this.NAME = builder.NAME;
        this.AGE = builder.AGE;
        this.didCommitSin = builder.didCommitSin;
        this.worshipsGod = builder.worshipsGod;
        this.clothes  = builder.clothes;
    }

    //Klasa Buildera służąca do tworzenia obiektu
    static class MaleBuilder implements HumanBuilder {

        // wymagane parametry
        private String NAME;
        private String AGE;

        // parametry opcjonalne
        private boolean didCommitSin;
        private boolean worshipsGod;
        private String clothes;

        public MaleBuilder(String name, String age) {
            this.NAME = name;
            this.AGE = age;
            clothes = "she is naked";
        }

        public MaleBuilder isWorshipper(boolean worshipsGod) {
            this.worshipsGod = worshipsGod;
            return this;
        }

        public MaleBuilder isSinner(boolean didCommitSin) {
            this.didCommitSin = didCommitSin;
            return this;
        }

        @Override
        public HumanBuilder dressUp() {
            this.clothes = "suit";
            return this;
        }

        public Human build() {
            return new Male(this);
        }

    }
}
