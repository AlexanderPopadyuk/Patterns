package Strategy;

/**
 * Created by Asus on 28.04.2016.
 */
public class Main {
    public static void main(String[] args) {
        Delivering quick = new QuickDelivering();
        Delivering simple = new SimpleDelivering();
        StrategyClient client = new StrategyClient();
        client.setDelivering(quick);
        client.performDeliver();
        StrategyClient client2 = new StrategyClient();
        client2.setDelivering(simple);
        client2.performDeliver();
    }
}
