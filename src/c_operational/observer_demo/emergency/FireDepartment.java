package c_operational.observer_demo.emergency;

public class FireDepartment implements Observer {
    public void call(String message) {
        System.out.println("Fire department service received: " + message);
    }

    @Override
    public void notify(String state) {
        call(state);
    }

    public FireDepartment(Observable emergencyRegister) {
        emergencyRegister.subscribe(this);
    }
}
