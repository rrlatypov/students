package filtres;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;

        Object isLogin = String.valueOf(req.getSession().getAttribute("isLogin"));
        if (isLogin == null) {
            resp.sendRedirect("/login");
        }else{
            filterChain.doFilter(req, resp);
        }
    }

    @Override
    public void destroy() {

    }
}
