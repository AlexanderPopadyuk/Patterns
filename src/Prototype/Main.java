package Prototype;
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("Prototype pattern");
        Sender alex = new Sender(1,"Alex","McLane");
        Delivery first = alex.makeDelivery(1,"Phone case","Chernivtsi","Lviv",45.0);
        Delivery second = alex.repeatDelivery(first);
        System.out.println(second.getName());
    }
}
