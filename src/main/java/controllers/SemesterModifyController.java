package controllers;

import database.DBManager;
import entity.Discipline;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (name = "SemesterModifyController", urlPatterns = "/semester-modify")
public class SemesterModifyController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        req.setAttribute("isCreate", "0");
        req.setAttribute("currentPage", "semester-modify.jsp");
        req.getRequestDispatcher("WEB-INF/jsp/semester-modify.jsp").forward(req, resp);

    }
}
