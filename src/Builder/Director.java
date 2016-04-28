package Builder;
/**
 * Created by Asus on 02.03.2016.
 */
public class Director {
    ParcelBuilder builder;
    void setBuilder(ParcelBuilder b){
        builder = b;
    }

    Parcel BuildParcel(){
        builder.createParcel();
        builder.buildWeight();
        builder.buildSender();
        builder.buildDestination();
        builder.buildPrice();
        Parcel parcel = builder.getParcel();
        return parcel;
    }
}
