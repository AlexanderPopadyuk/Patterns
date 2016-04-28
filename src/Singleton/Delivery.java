package Singleton;
/**
 * Created by Asus on 23.02.2016.
 */
public class Delivery implements Cloneable {
    private int id;
    private Sender sender;
    private String Name;
    private String statringAddress;
    private String destinationAddress;
    private double Prise;

    public Delivery(int id, Sender sender, String name, String statringAddress, String destinationAddress, double prise) {
        this.id = id;
        this.sender = sender;
        this.Name = name;
        this.statringAddress = statringAddress;
        this.destinationAddress = destinationAddress;
        this.Prise = prise;
    }

    public int getId() {
        return id;
    }

    public Sender getSender() {
        return sender;
    }

    public String getName() {
        return Name;
    }

    public String getStatringAddress() {
        return statringAddress;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public double getPrise() {
        return Prise;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
