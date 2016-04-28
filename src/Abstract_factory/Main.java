package Abstract_factory;

/**
 * Created by Asus on 28.04.2016.
 */
public class Main {
    public static void main(String[] args) {
        TransporterFactory fordTransporterFactory = new FordTransporterFactory();
        fordTransporterFactory.getTransporter().makeTransporting();
        TransporterFactory mercedesTransporterFactory = new MercedesTransporterFactory();
        mercedesTransporterFactory.getTransporter().makeTransporting();
    }
}
