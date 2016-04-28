import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Asus on 21.03.2016.
 */
public class Composite implements Order{
    public String client;
    private List<Order> components = new ArrayList<>();
    @Override
    public void toDeliver() {
        for(Order component: components) {
            component.toDeliver();
        }
    }
    public void addComponent(Order order){
        components.add(order);
    }
    public void removeComponent(Order order){
        components.remove(order);
    }
}
