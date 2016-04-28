package Observer;

/**
 * Created by Asus on 26.04.2016.
 */
public interface Observed {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
