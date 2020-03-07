package c_operational.mediator_demo;

/**
 * Created by Technician on 2019-01-17.
 */
public class UserImpl extends User {

    UserImpl(ChatMediator med, String name) {
        super(med, name);
    }

    @Override
    public void send(String msg){
        System.out.println(this.name+": WYSYŁAM WIADOMOŚĆ= "+msg);
        mediator.sendMessage(msg, this);
    }
    @Override
    public void receive(String msg) {
        System.out.println(this.name+": ODBIERAM WIADOMOŚĆ: "+msg);
    }

}
