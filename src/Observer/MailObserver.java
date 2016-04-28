package Observer;

/**
 * Created by Asus on 26.04.2016.
 */
public class MailObserver implements Observer {
    @Override
    public void handlerEvent(String status, String address) {
        System.out.println("Нова інформація про посилку: Статус-" + status + " адреса-" + address);
    }
}
