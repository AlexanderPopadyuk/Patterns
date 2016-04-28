package Flyweight;
/**
 * Created by Asus on 21.03.2016.
 */
public class ConcreteOrderToKyiv extends AbstractOrder {

    public ConcreteOrderToKyiv() {
        this.destination = "Доставка до Києва";
    }

    @Override
    public void register() {
        System.out.println("Зареєстроване замовлення для доставки в Київ");
    }
}
