package c_operational.observer_demo.numbers;

/**
 * Created by Technician on 2019-01-17.
 */
class OctObserver extends Observer {
    OctObserver(Subject subject) {
        this.subject = subject;
        this.subject.add( this );
    }

    public void update() {
        System.out.print(" " + Integer.toOctalString(subject.getState()));
    }
}
