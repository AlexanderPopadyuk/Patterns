package Facade;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Asus on 31.03.2016.
 */
public class Office {
    public boolean workDayEnd = false;
    public List<Parcel> list = new ArrayList<>();

    public void addParcel(Parcel parcel){
        list.add(parcel);
    }

    public List<Parcel> getList() {
        return list;
    }

    public boolean isEndet() {
        return workDayEnd;
    }
    public void start() {
        System.out.println("Робочий день розпочато");
        workDayEnd = false;
    }
    public void end() {
        System.out.println("Робочий день закінчено");
        workDayEnd = true;
    }
}
