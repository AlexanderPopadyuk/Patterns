package Mediator;

/**
 * Created by Asus on 19.04.2016.
 */
public class Client implements User {
    InformingService info;
    String number;

    public Client(InformingService info) {
        this.info = info;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void sendNotice(String message){
        info.sendNotice(message, number);
    }

    @Override
    public void getNotice(String message) {
        System.out.println("Отримано сповіщення: " + message);
    }
}
