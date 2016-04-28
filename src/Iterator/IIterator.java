package Iterator;

/**
 * Created by Asus on 14.04.2016.
 */
public interface IIterator {
    Object first();
    Object next();
    boolean hasMoreElements();
    Object getCurrentElement();
}
