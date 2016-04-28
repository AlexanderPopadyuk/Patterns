package Observer;

/**
 * Created by Asus on 26.04.2016.
 */
public class Main {
    public static void main(String[] args) {
        Parcel parcel = new Parcel();
        parcel.addObserver(new MailObserver());
        parcel.setParameters("Зареєстрована на відділенні", "м.Чернівці");
    }
}
