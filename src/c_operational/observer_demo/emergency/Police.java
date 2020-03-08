package c_operational.observer_demo.emergency;

public class Police implements Observer {
    public void call(String message) {
        System.out.println("Police received: " + message);
    }

    @Override
    public void notify(String state) {
        call(state);
    }

    public Police(Observable accidentRegister) {
        accidentRegister.subscribe(this);
    }
}
