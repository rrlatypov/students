package controllers;

import database.DBManager;
import entity.Discipline;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DisciplineModifyController", urlPatterns = "/discipline-modify")
public class DisciplineModifyController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("modifyDiscHidden");
        Discipline discipline = DBManager.getDisciplineById(id);
        req.setAttribute("discipline", discipline);

        req.setAttribute("isCreate", "0");
        req.setAttribute("currentPage", "discipline-create.jsp");
        req.getRequestDispatcher("WEB-INF/jsp/discipline-create.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String discip = req.getParameter("newDiscip");
        String id = req.getParameter("idDiscip");

        DBManager.modifyDiscip(id, discip);
        resp.sendRedirect("/disciplines");


    }
}
