package State;

/**
 * Created by Asus on 19.04.2016.
 */
public class Delivered implements State {
    @Override
    public void info() {
        System.out.println("Посилку доставлено до місця призначення");
    }
}
