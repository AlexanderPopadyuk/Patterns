package Factory_method;
public class Main {
    public static void main(String[] args) {
        Creator creator = new FordConnectCreator();
        Automobile automobile = creator.createAutomobile();
        automobile.transportation();
    }
}
