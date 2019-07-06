package pl.coderslab.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet(name = "Exe5_cookieDecision", urlPatterns = "/cookieDecision")
public class Exe5_cookieDecision extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String decision = request.getParameter("decision");
        Cookie cookie;
        if (decision != null && decision.equals("true")) {
            cookie = new Cookie("cookieDecision", "true");

        } else {
            cookie = new Cookie("cookieDecision", "false");
        }
        cookie.setMaxAge(86400);
        response.addCookie(cookie);
        response.sendRedirect("homepage");
    }

}
