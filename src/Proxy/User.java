/**
 * Created by Asus on 17.03.2016.
 */
public class User {
    private String login;
    private String password;
    private boolean isAdmin;

    public User(String login, String password, boolean isAdmin) {
        this.login = login;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public String getPassword() {
        return password;
    }

    public String getLogin() {
        return login;
    }


}
