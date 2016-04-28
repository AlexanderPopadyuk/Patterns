package Flyweight;
/**
 * Created by Asus on 21.03.2016.
 */
public class ConcreteOrderToLviv extends AbstractOrder {

    public ConcreteOrderToLviv() {
        this.destination = "Доставка до Львову";
    }

    @Override
    public void register() {
        System.out.println("Зареєстроване замовлення для доставки в Львів");
    }
}
