package c_operational.observer_demo.emergency;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {

    private List<Observer> observers = new ArrayList<>();

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    protected void notifyAll(String state) {
        for (Observer obs: observers) {
            obs.notify(state);
        }
    }
}
