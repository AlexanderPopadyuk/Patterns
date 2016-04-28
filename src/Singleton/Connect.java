package Singleton;

import java.sql.*;

/**
 * Created by Asus on 15.02.2016.
 */

// Singleton using
public class Connect {
    // Make the private one class object
    private static Connect Instance = new Connect();

    private Connection Connector;
    private String URL;
    private String Login;
    private String Password;
    // Make the private class constructor
    private Connect(){
        URL = "jdbc:mysql://localhost:3306/private_post";
        Login = "root";
        Password = "MySQL";
        try {
            Connector = DriverManager.getConnection(URL, Login, Password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    // Make the public method getInstance
    public static Connect getInstance() {
        return Instance;
    }

    public Connection getConnector() {
        return this.Connector;
    }
}
