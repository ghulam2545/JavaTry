package app;

import java.sql.Connection;
import java.sql.DriverManager;

public class SqlConnector {
    private static Connection conn;
    public static Connection makeConnection() {
        try {
            // load driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // create connection
            String url = "jdbc:mysql://localhost:3306/Jdbc_App";
            String username = "root";
            String password = "ghulam"; // may be sensitive info
            conn = DriverManager.getConnection(url, username, password);

        } catch(Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
