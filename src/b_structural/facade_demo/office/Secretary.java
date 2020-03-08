package b_structural.facade_demo.office;

public class Secretary {
    void preparetHotChocolate() {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        coffeeMaker.GetHotChocolate();
    }

    void payInvoices() {
        Computer computer = new Computer();
        computer.payInvoices();
    }

    void getCalendar() {
        Computer computer = new Computer();
        computer.getCalendar();
    }

    void arrangeMeeting(String time) {
        Phone phone = new Phone();
        phone.arrangeMeeting(time);
    }

    void orderDinner() {
        Phone phone = new Phone();
        phone.orderDinner();
    }

}
