package c_operational.observer_demo.numbers;

public class Gg {
    public static void main(String[] args) {
        new Subject();
        int sumMain = add(5, 2);
        System.out.println(sumMain);
    }

    public static int add(Integer a, Integer b) {
        Integer multipler = a*b;
        Integer sum = (a + b) * multipler;
        return sum;
    }
}
