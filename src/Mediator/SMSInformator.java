package Mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Asus on 19.04.2016.
 */
public class SMSInformator implements InformingService {
    Post admin;
    List<Client> clients = new ArrayList<>();

    public void setAdmin(Post admin) {
        this.admin = admin;
    }

    public void addClient(Client client) {
        clients.add(client);
    }

    @Override
    public void sendNotice(String message, String id) {
        for (int i = 0; i < clients.size(); i++) {
            clients.get(i).getNotice(message + " " + id);
        }

    }
}
