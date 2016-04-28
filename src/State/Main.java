package State;

/**
 * Created by Asus on 19.04.2016.
 */
public class Main {
    public static void main(String[] args) {
        State reg = new Registration();
        Parcel parcel = new Parcel();
        parcel.setState(reg);
        for (int i = 0; i < 9; i++) {
            parcel.info();
            parcel.nextState();
        }
    }
}
