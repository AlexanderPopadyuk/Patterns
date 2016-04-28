package Builder;
/**
 * Created by Asus on 02.03.2016.
 */
public class Parcel {
    public double weight;
    public String sender;
    public String destination;
    public double price;

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Parcel: weight = "+weight+"; sender = "+sender+"; destination = "+destination+"; price = "+price;
    }
}
