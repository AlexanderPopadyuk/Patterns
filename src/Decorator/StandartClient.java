package Decorator;
/**
 * Created by Asus on 17.03.2016.
 */
public class StandartClient implements Client {
    @Override
    public void makeOrder() {
        System.out.println("Оформлене нове замовлення.");
    }
}
