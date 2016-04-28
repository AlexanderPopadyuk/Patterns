public class Client {

    public static void main(String[] args) {

        User user1 = new User("admin", "asdef", true);
        ManagementProxy proxy1 = new ManagementProxy(user1);
        proxy1.doAction();

        User user2 = new User("agfbfd", "asdef", false);
        ManagementProxy proxy2 = new ManagementProxy(user2);
        proxy2.doAction();

    }
}
