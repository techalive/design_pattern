package c_operational.mediator_demo;

/**
 * Created by Technician on 2019-01-17.
 */
public interface ChatMediator {

    void sendMessage(String msg, User user);

    void addUser(User user);
}
