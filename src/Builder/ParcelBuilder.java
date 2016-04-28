package Builder;
/**
 * Created by Asus on 02.03.2016.
 */
public abstract class ParcelBuilder {
    Parcel parcel;
    void createParcel(){
        parcel = new Parcel();
    }

    abstract void buildWeight();
    abstract void buildSender();
    abstract void buildDestination();
    abstract void buildPrice();

    public Parcel getParcel() {
        return parcel;
    }
}
