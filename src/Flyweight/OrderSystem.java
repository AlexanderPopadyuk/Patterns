package Flyweight;
/**
 * Created by Asus on 21.03.2016.
 */
import java.util.HashMap;
import java.util.Map;

public class OrderSystem {

    private static OrderSystem instance;
    private Map<String, AbstractOrder> pool;

    public OrderSystem() {
        this.pool = new HashMap<>();
    }

    public static OrderSystem getInstance(){
        if (instance == null){
            instance = new OrderSystem();
        }
        return instance;
    }

    public AbstractOrder getOrder(String key) {
        if (pool.containsKey(key)){
            return pool.get(key);
        } else {
            AbstractOrder Order;
            if (key.equalsIgnoreCase("to Kyiv")){
                return new ConcreteOrderToKyiv();
            } else if (key.equalsIgnoreCase("to Lviv")){
                return new ConcreteOrderToLviv();
            } else return null;
        }
    }

}
