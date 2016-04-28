package Flyweight;
public class Main {

    public static void main(String[] args) {
        //Flyweight - Пристосуванець
        OrderSystem factory = OrderSystem.getInstance();
        AbstractOrder order = factory.getOrder("to Kyiv");
        order.register();
    }
}
