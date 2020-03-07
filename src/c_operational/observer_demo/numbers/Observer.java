package c_operational.observer_demo.numbers;

/**
 * Created by Technician on 2019-01-17.
 */
abstract class Observer {
    Subject subject;
    public abstract void update();
}
