package controller;

import app.DataAccess;
import app.Book;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.util.List;


@WebServlet("/list")
public class ListServlet extends HttpServlet {
    public void init() {}

    public void doGet(HttpServletRequest req, HttpServletResponse res) {
        try {
            DataAccess da = new DataAccess();
            List<Book> bookList = da.getAllBook();
            req.setAttribute("bookList", bookList);
//            var ans = req.getAttribute("bookList");
//            for(var e:ans) System.out.println(e);

            RequestDispatcher dispatcher = req.getRequestDispatcher("view/list.jsp");
            dispatcher.forward(req, res);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
