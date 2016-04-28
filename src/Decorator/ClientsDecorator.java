package Decorator;
/**
 * Created by Asus on 17.03.2016.
 */
public abstract class ClientsDecorator implements Client {
    Client component;

    public ClientsDecorator(Client component) {
        this.component = component;
    }

    @Override
    public void makeOrder() {
        component.makeOrder();
    }
}
