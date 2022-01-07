package controllers;

import database.DBManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (name = "LoginController", urlPatterns = "/login")
public class LoginController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("currentPage", "login.jsp");
        req.getRequestDispatcher ("WEB-INF/jsp/template.jsp"). forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("username");
        String password = req.getParameter("password");
        String role = req.getParameter("role");

        boolean isExistUser = DBManager.isExistUser(login, password, role);
        if (isExistUser){
            req.getSession().setAttribute("isLogin", "1");
            req.getSession().setAttribute("idRole", role);
            resp.sendRedirect("/home");
        }else{
            req.setAttribute("message", "1");
            req.setAttribute("currentPage", "login.jsp");
            req.getRequestDispatcher ("WEB-INF/jsp/template.jsp"). forward(req, resp);
        }


    }
}
