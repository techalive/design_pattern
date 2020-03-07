package a_creational.builder_demo.human;

public interface HumanBuilder {
    HumanBuilder isWorshipper(boolean worshipsGod);
    HumanBuilder isSinner(boolean didCommitSin);
    HumanBuilder dressUp();
    Human build();
}
