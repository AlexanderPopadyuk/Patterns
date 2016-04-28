package Mediator;

/**
 * Created by Asus on 19.04.2016.
 */
public class Post implements User {
    InformingService info;
    String address;

    public Post(InformingService info) {
        this.info = info;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void sendNotice(String message){
        info.sendNotice(message, address);
    }

    @Override
    public void getNotice(String message) {
        System.out.println("Отримано повідомлення від клієнта: " + message);
    }
}
