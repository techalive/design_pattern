package b_structural.facade_demo.office;

import java.util.Comparator;

public class Boss {
    public static void main(String[] args) {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        coffeeMaker.GetHotChocolate();

        Computer computer = new Computer();
        computer.payInvoices();
        computer.getCalendar();

        Phone phone = new Phone();
        phone.arrangeMeeting("15:00");
        phone.orderDinner();


    }
}
