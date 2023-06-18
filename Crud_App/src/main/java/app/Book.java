package app;

public class Book {
    private int id;
    private String title;
    private String author;
    private int qty;
    private float price;
    private int eBookAvail;

    public Book(int id, String title, String author, int qty, float price, int eBookAvail) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.qty = qty;
        this.price = price;
        this.eBookAvail = eBookAvail;
    }

    public Book(String title, String author, int qty, float price, int eBookAvail) {
        this.title = title;
        this.author = author;
        this.qty = qty;
        this.price = price;
        this.eBookAvail = eBookAvail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int isEBookAvail() {
        return eBookAvail;
    }

    public void setEBookAvail(int eBookAvail) {
        this.eBookAvail = eBookAvail;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", qty=" + qty +
                ", price=" + price +
                ", eBookAvail=" + eBookAvail +
                '}';
    }
}
