package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Asus on 26.04.2016.
 */
public class Parcel implements Observed {
    String status;
    String address;

    List<Observer> observers = new ArrayList<>();

    public void setParameters(String status, String address) {
        this.status = status;
        this.address = address;
        notifyObservers();
    }

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer o: observers) {
            o.handlerEvent(status, address);
        }
    }
}
