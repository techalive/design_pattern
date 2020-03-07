package c_operational.observer_demo.numbers;

/**
 * Created by Technician on 2019-01-17.
 */
class HexObserver extends Observer {
    public HexObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    public void update() {
        System.out.print(" " + Integer.toHexString(subject.getState()));
    }
}
