package controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (name = "SemesterCreateController", urlPatterns = "/semester-create")
public class SemesterCreateController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("isCreate", "1");
        req.setAttribute("currentPage", "semester-create.jsp");
        req.getRequestDispatcher("WEB-INF/jsp/semester-create.jsp").forward(req, resp);

    }
}
