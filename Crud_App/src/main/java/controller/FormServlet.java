package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/form")
public class FormServlet extends HttpServlet {
    public void init() { }
    public void doGet(HttpServletRequest req, HttpServletResponse res) {
        try {
            String title = req.getParameter("title");
            System.out.println(title);
            RequestDispatcher dispatcher = req.getRequestDispatcher("view/form.jsp");
            dispatcher.forward(req, res);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
