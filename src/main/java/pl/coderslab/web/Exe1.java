package pl.coderslab.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

import static pl.coderslab.commons.Parsers.intParameterParser;

@WebServlet(name = "Exe1", urlPatterns = "/receiver")
public class Exe1 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("mail");
        Optional<Integer> optionalId = intParameterParser(request.getParameter("id"));
        if (name != null && email != null && optionalId.isPresent()) {
            request.setAttribute("name", name);
            request.setAttribute("email", email);
            request.setAttribute("id", optionalId.get());
            request.getRequestDispatcher("/jspFiles/coder.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("/jspFiles/form.jsp").forward(request, response);
        }
    }
}
