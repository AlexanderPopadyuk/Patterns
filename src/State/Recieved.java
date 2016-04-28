package State;

/**
 * Created by Asus on 19.04.2016.
 */
public class Recieved implements State {
    @Override
    public void info() {
        System.out.println("Посилка передана отримувачу");
    }
}
