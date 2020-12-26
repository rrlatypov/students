package controllers;

import database.DBManager;
import entity.Discipline;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet (name = "DisciplinesController", urlPatterns = "/disciplines")
public class DisciplinesController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList <Discipline> disciplines = DBManager.getAllActiveDiscipline();
        req.setAttribute("disciplines", disciplines);
        req.setAttribute("currentPage", "disciplines.jsp");
        req.getRequestDispatcher ("WEB-INF/jsp/template.jsp"). forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
       String ids = req.getParameter("deleteDiscHidden");
        String [] idsStr = ids.split(",");
        for (String id:idsStr){
            DBManager.deleteDiscip(id);
        }
        resp.sendRedirect("/disciplines");
    }
}
