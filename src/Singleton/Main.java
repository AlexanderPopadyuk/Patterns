package Singleton;
import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        /*Connect instanceLink = Connect.getInstance();
        Connection connect = instanceLink.getConnector();
        System.out.println("Private post");

        try {
            if (!connect.isClosed()) {
                System.out.println("Connection to database seccessful!");
            }
            else {
                System.out.println("Connection to database is close!");
            }
        } catch (SQLException e) {
            System.out.println("Connection to database is close!");
        }*/

        System.out.println("Prototype pattern");
        Sender alex = new Sender(1,"Alex","McLane");
        Delivery first = alex.makeDelivery(1,"Phone case","Chernivtsi","Lviv",45.0);
        Delivery second = alex.repeatDelivery(first);
        System.out.println(first.getName());
        System.out.println(second.getName());

    }
}
