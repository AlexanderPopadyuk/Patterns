package Decorator;
/**
 * Created by Asus on 17.03.2016.
 */
public class VIPClientDecorator extends ClientsDecorator{

    public VIPClientDecorator(Client component) {
        super(component);
    }

    @Override
    public void makeOrder() {
        super.makeOrder();
        System.out.println("Отримано VIP статус!");
    }
}
