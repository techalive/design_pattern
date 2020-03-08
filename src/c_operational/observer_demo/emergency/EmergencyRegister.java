package c_operational.observer_demo.emergency;

//TO DO: implement as a subject
public class EmergencyRegister extends Observable {
    public void registerAccident(String accident) {
        notifyAll(accident);
    }
}
