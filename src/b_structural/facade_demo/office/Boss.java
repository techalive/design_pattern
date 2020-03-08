package b_structural.facade_demo.office;

import java.util.Comparator;

public class Boss {
    public static void main(String[] args) {

        Secretary secretary = new Secretary();

        secretary.payInvoices();
        secretary.getCalendar();
        secretary.arrangeMeeting("15:00");
        secretary.orderDinner();


    }
}
