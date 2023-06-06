package app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataAccess {
    public static boolean insertEmp(Employee emp) {
        try {
            // jdbc connection
            Connection conn = SqlConnector.makeConnection();

            String query = "INSERT INTO Employee(fname, lname, age, contact, city) VALUES(?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);

            // set values of params
            ps.setString(1, emp.getFname());
            ps.setString(2, emp.getLname());
            ps.setInt(3, emp.getAge());
            ps.setString(4, emp.getContact());
            ps.setString(5, emp.getCity());

            ps.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean deleteEmp(int id) {
        try {
            // jdbc connection
            Connection conn = SqlConnector.makeConnection();

            String query = "DELETE FROM Employee WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(query);

            // set values of params
            ps.setInt(1, id);

            ps.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void listEmp() {
        try {
            // jdbc connection
            Connection conn = SqlConnector.makeConnection();

            String query = "SELECT * FROM Employee";
            Statement st = conn.createStatement();

            ResultSet res = st.executeQuery(query);

            while(res.next()) {
                int id = res.getInt(1);
                String fname = res.getString(2);
                String lname = res.getString(3);
                int age = res.getInt(4);
                String contact = res.getString(5);
                String city = res.getString(6);

                System.out.println(id + " " + fname + " " + lname + " " + age + " " + contact + " " + city);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
