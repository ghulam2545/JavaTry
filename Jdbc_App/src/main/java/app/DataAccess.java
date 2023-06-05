package app;

import java.sql.Connection;
import java.sql.PreparedStatement;

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

    // TODO ::
    /*
    readEmp()
    deleteEmp()
    updateEmp()
    */
}
