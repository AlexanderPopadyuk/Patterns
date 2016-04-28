package Bridge;
/**
 * Created by Asus on 31.03.2016.
 */
public class PostOffice implements IOffice {

    @Override
    public void getCapacity() {
        System.out.println("Прийом посилок до 50КГ");
    }
}
