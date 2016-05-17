package Command;

/**
 * Created by Asus on 17.05.2016.
 */
public class Client {
    Service send;
    Service give;

    public Client(Service send, Service give) {
        this.send = send;
        this.give = give;
    }

    public void sendParcel(){
        send.execute();
    }

    public void giveParcel(){
        give.execute();
    }
}
