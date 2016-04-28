/**
 * Created by Asus on 21.03.2016.
 */
public class HeadphonesOrder implements Order {
    @Override
    public void toDeliver() {
        System.out.println("Зареєстровано замовлення на доставку партії наушників.");
    }
}
