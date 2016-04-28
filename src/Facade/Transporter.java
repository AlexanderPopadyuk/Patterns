package Facade;

import java.util.List;

/**
 * Created by Asus on 31.03.2016.
 */
public class Transporter {
    List<Parcel> cargo;
    public void go(Office workday) {
        if (workday.isEndet()) {
            cargo = workday.getList();
            System.out.println("Машину завантажено");
            System.out.println("Машина виїхала");
        } else {
            System.out.println("Відправка відбудеться при закінченні робочого дня");
        }
    }
}
