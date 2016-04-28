package Decorator;
/**
 * Created by Asus on 17.03.2016.
 */
public class SaleForClientDecorator extends ClientsDecorator {

    public SaleForClientDecorator(Client component) {
        super(component);
    }

    @Override
    public void makeOrder() {
        super.makeOrder();
        System.out.println("Отримано знижку!");
    }
}
