package Abstract_factory;
/**
 * Created by Asus on 10.03.2016.
 */


public class FordTransporterFactory implements TransporterFactory {

    @Override
    public TransporterType getTransporter() {
        if (Math.random()*2>1) {
            return new FordHeavyTransporter();
        } else {
            return new FordLightTransporter();
        }
    }
}
