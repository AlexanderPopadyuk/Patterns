package State;

/**
 * Created by Asus on 19.04.2016.
 */
public class Parcel {
    State state;
    void setState(State state){
        this.state = state;
    }
    void nextState(){
        if (state instanceof Registration) {
            setState(new Transportation());
        } else if (state instanceof Transportation) {
            setState(new Delivered());
        } else if (state instanceof Delivered) {
            setState(new Recieved());
        } else if (state instanceof Recieved) {
            setState(new Stored());
        }
    }
    void info(){
        state.info();
    }
}
