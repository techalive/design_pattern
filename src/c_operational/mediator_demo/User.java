package c_operational.mediator_demo;

/**
 * Created by Technician on 2019-01-17.
 */
public abstract class User {
    ChatMediator mediator;
    String name;

    User(ChatMediator med, String name){
        this.mediator=med;
        this.name=name;
    }

    public abstract void send(String msg);

    public abstract void receive(String msg);
}
