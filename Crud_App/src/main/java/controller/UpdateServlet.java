package controller;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/edit")
public class UpdateServlet extends HttpServlet {
    public void init() {}
    public void doGet(HttpServletRequest req, HttpServletResponse res) {
        System.out.println("message from update servlet");
    }
}
