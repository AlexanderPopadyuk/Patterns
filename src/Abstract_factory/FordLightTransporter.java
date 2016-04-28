package Abstract_factory;
/**
 * Created by Asus on 10.03.2016.
 */
public class FordLightTransporter extends TransporterType {
    @Override
    public void makeTransporting() {
        System.out.println("Швидка доставка за допомогою Ford Connect");
    }
}
