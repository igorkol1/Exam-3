package pl.coderslab.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

@WebServlet(name = "Exe3_regex", urlPatterns = "/regex")
public class Exe3_regex extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String parameter = request.getParameter("param1");
        Writer writer = response.getWriter();
        if (parameter != null) {
            if (parameter.matches("(?:([^:/?#]+):)?(?://([^/?#]*))?([^?#]*\\.(?:jpg|gif|png))(?:\\?([^#]*))?(?:#(.*))?")) {
                String redirectAddres = "https://www.google.pl/#q=" + parameter;
                response.sendRedirect(redirectAddres);

            } else {
                writer.write("Inccorect parameter");
            }
        } else {
            request.getRequestDispatcher("/jspFiles/regex.jsp").forward(request, response);
        }
    }
}
