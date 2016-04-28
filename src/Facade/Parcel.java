package Facade;
/**
 * Created by Asus on 31.03.2016.
 */
public class Parcel {
    public double weight;

    public Parcel(double weight) {
        this.weight = weight;
        System.out.println("Зареєстровано посилку вагою: " + weight + "КГ");
    }
}
