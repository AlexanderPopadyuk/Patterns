package Iterator;

/**
 * Created by Asus on 14.04.2016.
 */
public class Main {
    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        IIterator iterator = invoice.getIterator();

        while (iterator.hasMoreElements()) {
            System.out.println((String)iterator.next());
        }
    }
}
