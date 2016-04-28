package Strategy;

/**
 * Created by Asus on 28.04.2016.
 */
public class QuickDelivering implements Delivering {
    @Override
    public void toDeliver() {
        System.out.println("Обрано швидку доставку. Ціна 10 грн.");
    }
}
