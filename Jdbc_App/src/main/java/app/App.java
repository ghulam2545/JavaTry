package app;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World");

        String fname = "Abdul";
        String lname = "Aakhir";
        int age = 21;
        String contact = "1020304050";
        String city = "Mau";

        boolean b = DataAccess.insertEmp(new Employee(fname, lname, age, contact, city));
        System.out.println(b);
    }
}
