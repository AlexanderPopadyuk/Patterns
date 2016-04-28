package Template;

/**
 * Created by Asus on 14.04.2016.
 */
public class FirstConcreteTransporter extends AbstractTransporter {
    @Override
    void different() {
        System.out.println("Маршрут: Чернівці-Львів-Чернівці");
    }
}
