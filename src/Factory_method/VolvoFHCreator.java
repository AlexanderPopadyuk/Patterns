package Factory_method;
/**
 * Created by Asus on 03.03.2016.
 */
public class VolvoFHCreator implements Creator {
    @Override
    public Automobile createAutomobile() {
        return new VolvoFHAutomobile();
    }
}
