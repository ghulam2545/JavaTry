package controller;

import app.Book;
import app.DataAccess;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.PrintWriter;

@WebServlet("/add")
public class AddServlet extends HttpServlet {
    public void init() {}
    public void doPost(HttpServletRequest req, HttpServletResponse res) {
        try {
            String title = req.getParameter("title");
            String author = req.getParameter("author");
            int qty = Integer.parseInt(req.getParameter("qty"));
            float price = Float.parseFloat(req.getParameter("price"));
            int choice = (req.getParameter("choice").equals("yes")) ? 1 : 0;

            Book book = new Book(title, author, qty, price, choice);
            DataAccess da = new DataAccess();
            boolean ans = da.insertBook(book);

            res.sendRedirect("list");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
