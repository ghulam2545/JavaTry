public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        LoL lol = new LoL(12, "ghulam");
        System.out.println(lol);
    }
}

class LoL {
    private int age;
    private String name;

    public LoL(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Hello, " + this.name + " you are " + this.age + ".";
    }
}