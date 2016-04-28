package Memento;

/**
 * Created by Asus on 26.04.2016.
 */
public class Main {
    public static void main(String[] args) {
        Pricing pricing = new Pricing();
        pricing.setStandartPrice(5);
        pricing.setVipPrice(4);
        System.out.println(pricing);
        File file = new File();
        file.setSave(pricing.save());
        pricing.setStandartPrice(6);
        pricing.setVipPrice(5);
        System.out.println(pricing);
        pricing.load(file.getSave());
        System.out.println(pricing);
    }
}
