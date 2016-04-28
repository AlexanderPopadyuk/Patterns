package Adapter;
public class Main {

    public static void main(String[] args) {
        HeavyTransporting transporting = new HeavyAdapterFromLight();
        transporting.doTransportation();
    }
}
