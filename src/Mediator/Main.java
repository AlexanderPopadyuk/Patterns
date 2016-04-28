package Mediator;

/**
 * Created by Asus on 19.04.2016.
 */
public class Main {

    public static void main(String[] args) {
        SMSInformator sms = new SMSInformator();
        Post post = new Post(sms); post.setAddress("PrivatePost");
        Client user1 = new Client(sms); user1.setNumber("4545432355846");
        Client user2 = new Client(sms); user2.setNumber("4435434846542");

        sms.setAdmin(post);
        sms.addClient(user1);
        sms.addClient(user2);

        post.sendNotice("Відбудеться зміна тарифів");
    }

}
