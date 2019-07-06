package pl.coderslab.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;
import java.util.Optional;

import static pl.coderslab.commons.Parsers.intParameterParser;

@WebServlet(name = "Exe1", urlPatterns = "/receiver")
public class Exe1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("mail");
        Optional<Integer> optionalId = intParameterParser(request.getParameter("id"));
        if (name != null && email != null && optionalId.isPresent()) {
            Writer writer = response.getWriter();
            writer.write(email);
            writer.write(name);
            writer.write(optionalId.get());
        } else {
            response.setStatus(400);
        }
    }
}
