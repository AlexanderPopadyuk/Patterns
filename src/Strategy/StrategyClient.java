package Strategy;

/**
 * Created by Asus on 28.04.2016.
 */
public class StrategyClient {
    Delivering delivering;

    public void setDelivering(Delivering delivering) {
        this.delivering = delivering;
    }
    public void performDeliver() {
        delivering.toDeliver();
    }
}
