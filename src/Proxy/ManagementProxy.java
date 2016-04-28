/**
 * Created by Asus on 17.03.2016.
 */
public class ManagementProxy implements IManagement {
    private IManagement management;
    private User user;

    public ManagementProxy(User user) {
        this.user = user;
    }

    @Override
    public void doAction() {
        if (user.isAdmin()){
            management = new Management();
            management.doAction();
        } else {
            System.out.println("Ви не маєте права на здійснення операції");
        }
    }
}
