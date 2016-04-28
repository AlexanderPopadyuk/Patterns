package Facade;
/**
 * Created by Asus on 31.03.2016.
 */
public class Post {
    Parcel parcel = new Parcel(5.0);
    Office workday = new Office();
    Transporter transporter = new Transporter();

    public void postWork() {
        workday.addParcel(parcel);
        workday.end();
        transporter.go(workday);
    }
}
