package app;

public class Employee {
    private int id;
    private String fname;
    private String lname;
    private int age;
    private String contact;
    private String city;

    public Employee() {
        super();
    }

    public Employee(String fname, String lname, int age, String contact, String city) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.contact = contact;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee [ " +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", age=" + age +
                ", contact='" + contact + '\'' +
                ", city='" + city + '\'' +
                " ]";
    }
}
