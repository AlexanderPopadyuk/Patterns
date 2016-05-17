package Visitor;

/**
 * Created by Asus on 17.05.2016.
 */
public class Worker implements Visitor {
    @Override
    public void visit(PostOffice postOffice) {
        System.out.println("Прийняти/видати посилку");
    }
}
