package Command;

/**
 * Created by Asus on 17.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        Client client = new Client(new SendService(post), new GiveService(post));
        client.sendParcel();
        client.giveParcel();
    }
}
