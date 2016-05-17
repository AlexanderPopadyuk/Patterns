package Visitor;

/**
 * Created by Asus on 17.05.2016.
 */
public class PostOffice implements Office {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
