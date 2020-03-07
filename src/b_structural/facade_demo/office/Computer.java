package b_structural.facade_demo.office;

public class Computer {
    public void payInvoices() {
        Bank bank = new Bank();
        bank.transferMoney(7498);
        bank.transferMoney(340);
        bank.transferMoney(20000);
        System.out.println("Invoices have been paid");
    }

    public void getCalendar() {
        System.out.println("Today's schedule: \n" +
                "11:00 - IT meeting \n" +
                 "13:00 - VR meeting");
    }
}
