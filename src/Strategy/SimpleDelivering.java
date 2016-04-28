package Strategy;

/**
 * Created by Asus on 28.04.2016.
 */
public class SimpleDelivering implements Delivering {
    @Override
    public void toDeliver() {
        System.out.println("Обрано просту доставку. Ціна 5 грн.");
    }
}
