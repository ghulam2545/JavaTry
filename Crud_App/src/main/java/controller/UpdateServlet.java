package controller;

import app.Book;
import app.DataAccess;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/edit")
public class UpdateServlet extends HttpServlet {
    public void init() {}
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.setAttribute("title", "my title");
        req.setAttribute("author", "my author");
        RequestDispatcher dispatcher = req.getRequestDispatcher("view/form.jsp");
        dispatcher.forward(req, res);
        int id = Integer.parseInt(req.getParameter("id"));

        DataAccess da = new DataAccess();
        Book oldBook = da.getSingleBook(id);
        System.out.println(id);
    }
}
