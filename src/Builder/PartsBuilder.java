package Builder;
/**
 * Created by Asus on 02.03.2016.
 */
public class PartsBuilder extends ParcelBuilder {

    @Override
    void buildWeight() {
        parcel.setWeight(50.0);
    }

    @Override
    void buildSender() {
        parcel.setSender("IvanovOA");
    }

    @Override
    void buildDestination() {
        parcel.setDestination("Kyiv");
    }

    @Override
    void buildPrice() {
        parcel.setPrice(150.0);
    }
}
