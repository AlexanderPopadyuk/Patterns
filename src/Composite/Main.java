public class Main {

    public static void main(String[] args) {
        //Composite
        Order smartphones = new SmartphonesOrder();
        Order headphones = new HeadphonesOrder();
        Composite composite = new Composite();
        composite.addComponent(smartphones);
        composite.addComponent(headphones);
        composite.toDeliver();
    }
}
