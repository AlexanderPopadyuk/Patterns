package Memento;

/**
 * Created by Asus on 26.04.2016.
 */
public class Save {
    private final int standartPrice;
    private final int vipPrice;

    public Save(int vipPrice, int standartPrice) {
        this.vipPrice = vipPrice;
        this.standartPrice = standartPrice;
    }

    public int getStandartPrice() {
        return standartPrice;
    }

    public int getVipPrice() {
        return vipPrice;
    }
}
