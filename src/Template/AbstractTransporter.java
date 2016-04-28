package Template;

/**
 * Created by Asus on 14.04.2016.
 */
public abstract class AbstractTransporter {
    void templateMethod() {
        System.out.println("Mercedes Atego");
        System.out.println("Вантажопідйомність: 11000 кг.");
        different();
    }
    abstract void different();
}
