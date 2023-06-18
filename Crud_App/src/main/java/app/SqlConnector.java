package app;

import java.sql.Connection;
import java.sql.DriverManager;

public class SqlConnector {
    public static Connection conn;
    public static Connection connect()  {
        try {
            // load driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // create connection
            String url = "jdbc:mysql://localhost:3306/bookstore";
            String username = "root";
            String password = "ghulam"; // may be sensitive info
            conn = DriverManager.getConnection(url, username, password);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return conn;
    }

    public static void disconnect() {
        try {
            if(conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
