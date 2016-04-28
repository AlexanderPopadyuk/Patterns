package State;

/**
 * Created by Asus on 19.04.2016.
 */
public class Stored implements State {
    @Override
    public void info() {
        System.out.println("Інформація про посилку зберігається в БД.");
    }
}
