package Memento;

/**
 * Created by Asus on 26.04.2016.
 */
public class Pricing {
    private int standartPrice;
    private int vipPrice;

    public void setStandartPrice(int standartPrice) {
        this.standartPrice = standartPrice;
    }

    public void setVipPrice(int vipPrice) {
        this.vipPrice = vipPrice;
    }
    public void load(Save save) {
        standartPrice = save.getStandartPrice();
        vipPrice = save.getVipPrice();
    }
    public Save save() {
        return new Save(vipPrice, standartPrice);
    }

    @Override
    public String toString() {
        return "Ціни: " +
                "стандартна=" + standartPrice + "грн" +
                ", ціна дял VIP клієнтів=" + vipPrice + "грн";
    }
}
