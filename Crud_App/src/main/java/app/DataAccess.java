package app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DataAccess {
    /**
     * Working..........
     * 1. connect to database
     * 2. perform query
     * 3. disconnect to database
     */

    public Book getSingleBook(int id) {
        Book book = null;
        String query = "SELECT * FROM book WHERE id = ?";

        try {
            Connection conn = SqlConnector.connect();
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet res = ps.executeQuery();

            if (res.next()) {
                String title = res.getString("title");
                String author = res.getString("author");
                int qty = res.getInt("qty");
                float price = res.getFloat("price");
                int ebook = res.getInt("ebook");

                book = new Book(id, title, author, qty, price, ebook);
            }

            ps.close();
            res.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        SqlConnector.disconnect();
        return book;
    }

    public List<Book> getAllBook() {
        List<Book> bookList = new ArrayList<>();
        Book book = null;
        String query = "SELECT * FROM book";


        try {
            Connection conn = SqlConnector.connect();
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet res = ps.executeQuery();

            while (res.next()) {
                int id = res.getInt("id");
                String title = res.getString("title");
                String author = res.getString("author");
                int qty = res.getInt("qty");
                float price = res.getFloat("price");
                int ebook = res.getInt("ebook");

                book = new Book(id, title, author, qty, price, ebook);
                bookList.add(book);
            }

            ps.close();
            res.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        SqlConnector.disconnect();
        return bookList;
    }

    public boolean insertBook(Book book) {
        String query = "INSERT INTO book(title, author, qty, price, ebook) VALUES(?, ?, ?, ?, ?)";

        try {
            Connection conn = SqlConnector.connect();
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, book.getTitle());
            ps.setString(2, book.getAuthor());
            ps.setInt(3, book.getQty());
            ps.setFloat(4, book.getPrice());
            ps.setInt(5, book.isEBookAvail());

            boolean ans = ps.executeUpdate() > 0;

            ps.close();
            SqlConnector.disconnect();
            return ans;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        SqlConnector.disconnect();
        return false;
    }
    public boolean deleteBook(int id) {
        String query = "DELETE FROM book where id = ?";

        try {
            Connection conn = SqlConnector.connect();
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, id);

            boolean ans = ps.executeUpdate() > 0;

            ps.close();
            SqlConnector.disconnect();
            return ans;
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        SqlConnector.disconnect();
        return false;
    }

    public boolean updateBook(Book book) {
        String query = "UPDATE book SET title=?, author=?, qty=?, price=?, ebook=? WHERE id = ?";

        try {
            Connection conn = SqlConnector.connect();
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, book.getTitle());
            ps.setString(2, book.getAuthor());
            ps.setInt(3, book.getQty());
            ps.setFloat(4, book.getPrice());
            ps.setInt(5, book.isEBookAvail());
            ps.setInt(6, book.getId());

            boolean ans = ps.executeUpdate() > 0;
            SqlConnector.disconnect();
            return ans;
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        SqlConnector.disconnect();
        return false;
    }
}
