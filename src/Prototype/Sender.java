package Prototype;
/**
 * Created by Asus on 18.02.2016.
 */
public class Sender {
    private int id;
    private String Name;
    private String Surname;

    public Sender(int id, String name, String surname) {
        this.id = id;
        this.Name = name;
        this.Surname = surname;
    }

    public Delivery makeDelivery(int id, String name, String from, String to, double price){
        return new Delivery(id, this, name, from, to, price);
    }

    public Delivery repeatDelivery(Delivery delivery) throws CloneNotSupportedException {
        return (Delivery) delivery.clone();
    }

}
