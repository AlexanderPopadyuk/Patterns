package State;

/**
 * Created by Asus on 19.04.2016.
 */
public class Registration implements State {
    @Override
    public void info() {
        System.out.println("Посилку зареєстровано в системі. Очікується відправка.");
    }
}
