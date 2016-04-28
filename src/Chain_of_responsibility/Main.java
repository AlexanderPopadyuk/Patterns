package Chain_of_responsibility;

/**
 * Created by Asus on 28.04.2016.
 */
public class Main {
    public static void main(String[] args) {
        Transporter light = new LightTransporter(3500);
        Transporter heavy = new HeavyTransporter(11000);
        light.setNext(heavy);

        light.loadCargo(2000);
        light.loadCargo(5000);
    }
}
