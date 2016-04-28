package Abstract_factory;
/**
 * Created by Asus on 10.03.2016.
 */
public class MercedesHeavyTransporter extends TransporterType {
    @Override
    public void makeTransporting() {
        System.out.println("Велика доставка за допомогою Mercedes Actros");
    }
}
