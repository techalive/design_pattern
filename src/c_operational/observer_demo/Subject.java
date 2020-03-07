package c_operational.observer_demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Technician on 2019-01-17.
 */
class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    void add(Observer o) {
        observers.add(o);
    }

    int getState() {
        return state;
    }

    void setState(int value) {
        this.state = value;
        execute();
    }

    private void execute() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
