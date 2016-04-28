package Adapter;
/**
 * Created by Asus on 10.03.2016.
 */
public class HeavyAdapterFromLight extends LightTransporting implements HeavyTransporting {
    @Override
    public void doTransportation() {
        doLightTransportation();
    }
}
