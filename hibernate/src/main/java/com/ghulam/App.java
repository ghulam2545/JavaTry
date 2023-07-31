package com.ghulam;

import com.ghulam.enums.Gender;
import com.ghulam.models.Address;
import com.ghulam.models.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main( String[] args ) {
        Address address = new Address("Malkamchervu", "Ranga Reddy", "India", 500021);

        Employee emp = new Employee("EG22", "Kevin", "Brown", Gender.MALE, "brown121@gmail.com", 1122334455L, address);

        Configuration con = new Configuration();
        con.configure().addAnnotatedClass(Employee.class);
        SessionFactory factory = con.buildSessionFactory();

        Session session = factory.openSession();
        Transaction txt = session.beginTransaction();

        /**
         * CRUD Ops via hibernate
         */
//         saving an employee to database
//         session.save(emp);

//         getting an employee from database
//         var res = session.get(Employee.class, "EG22");
//         System.out.println(res);

//        update info into database
//        var res = session.load(Employee.class, "EG22");
//        res.setEmail("kevin101@gmail.com");
//        session.update(res);

//        delete an employee from database
//        var res = session.get(Employee.class, "EG22");
//        session.delete(res);

        /**
         * Relationships using hibernate and two tables
         */
        txt.commit();
        session.close();
    }
}
