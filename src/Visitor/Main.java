package Visitor;

/**
 * Created by Asus on 17.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Office office = new PostOffice();
        Visitor client = new Client();
        Visitor worker = new Worker();

        office.accept(client);
        office.accept(worker);
    }
}
