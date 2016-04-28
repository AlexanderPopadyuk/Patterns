package Decorator;

public class Main {

    public static void main(String[] args) {
        Client client = new VIPClientDecorator(new SaleForClientDecorator(new StandartClient()));
        client.makeOrder();
    }
}
