package controller;

import app.DataAccess;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
    public void init() {}
    public void doGet(HttpServletRequest req, HttpServletResponse res) {
        try {
            int id = Integer.parseInt(req.getParameter("id"));

            DataAccess da = new DataAccess();
            da.deleteBook(id);
            res.sendRedirect("list");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
